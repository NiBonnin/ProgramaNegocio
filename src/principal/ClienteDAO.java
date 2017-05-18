/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Nico
 */
public class ClienteDAO {  
    private Session sesion; 
    private Transaction tx;  

    public long guardaContacto(Cliente contacto) throws HibernateException 
    { 
        long id = 0;  

        try 
        { 
            iniciaOperacion(); 
            id = (Long) sesion.save(contacto); 
            tx.commit(); 
        } catch (HibernateException he) 
        { 
            manejaExcepcion(he); 
            throw he; 
        } finally 
        { 
            sesion.close(); 
        }  

        return id; 
    }  

    public void actualizaContacto(Cliente contacto) throws HibernateException 
    { 
        try 
        { 
            iniciaOperacion(); 
            sesion.update(contacto); 
            tx.commit(); 
        } catch (HibernateException he) 
        { 
            manejaExcepcion(he); 
            throw he; 
        } finally 
        { 
            sesion.close(); 
        } 
    }  

    public void eliminaContacto(Cliente contacto) throws HibernateException 
    { 
        try 
        { 
            iniciaOperacion(); 
            sesion.delete(contacto); 
            tx.commit(); 
        } catch (HibernateException he) 
        { 
            manejaExcepcion(he); 
            throw he; 
        } finally 
        { 
            sesion.close(); 
        } 
    }  

    public Cliente obtenContacto(long idContacto) throws HibernateException 
    { 
        Cliente cliente = null;  
        try 
        { 
            iniciaOperacion(); 
            cliente = (Cliente) sesion.get(Cliente.class, idContacto); 
        } finally 
        { 
            sesion.close(); 
        }  

        return cliente; 
    }  

    public List<Cliente> obtenListaContactos() throws HibernateException 
    { 
        List<Cliente> listaContactos = null;  

        try 
        { 
            iniciaOperacion(); 
            listaContactos = sesion.createQuery("from Contacto").list(); 
        } finally 
        { 
            sesion.close(); 
        }  

        return listaContactos; 
    }  

    private void iniciaOperacion() throws HibernateException 
    { 
        sesion = HibernateUtil.getSessionFactory().openSession(); 
        tx = sesion.beginTransaction(); 
    }  

    private void manejaExcepcion(HibernateException he) throws HibernateException 
    { 
        tx.rollback(); 
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he); 
    } 
}
