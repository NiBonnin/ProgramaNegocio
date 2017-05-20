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
    private Session session; 
    private Transaction tx;  

    public int guardaCliente(Cliente cliente) throws HibernateException 
    { 
        int id = 0;  

        try 
        { 
            iniciaOperacion(); 
            id = (int) session.save(cliente); 
            tx.commit(); 
        } catch (HibernateException he) 
        { 
            manejaExcepcion(he); 
            throw he; 
        } finally 
        { 
            session.close(); 
        }  

        return id; 
    }  

    public void actualizaCliente(Cliente cliente) throws HibernateException 
    { 
        try 
        { 
            iniciaOperacion(); 
            session.update(cliente); 
            tx.commit(); 
        } catch (HibernateException he) 
        { 
            manejaExcepcion(he); 
            throw he; 
        } finally 
        { 
            session.close(); 
        } 
    }  

    public void eliminaCliente (Cliente cliente) throws HibernateException 
    { 
        try 
        { 
            iniciaOperacion(); 
            session.delete(cliente); 
            tx.commit(); 
        } catch (HibernateException he) 
        { 
            manejaExcepcion(he); 
            throw he; 
        } finally 
        { 
            session.close(); 
        } 
    }  

    public Cliente obtenContacto(int codCliente) throws HibernateException 
    { 
       Cliente cliente = null;  
        try 
        { 
            iniciaOperacion(); 
            cliente = (Cliente) session.get(Cliente.class, codCliente); 
        } finally 
        { 
            session.close(); 
        }  

        return cliente; 
    }  
    
    public List<Cliente> obtenListaContactos() throws HibernateException 
    { 
        List<Cliente> listaContactos = null;  

        try 
        { 
            iniciaOperacion(); 
            listaContactos = session.createQuery("from Cliente").list(); //tiene q ser el mismo nombre que tiene el cliente.hbm.xml    es case sensitive
        } finally 
        { 
            session.close(); 
        }  

        return listaContactos; 
    }  

    private void iniciaOperacion() throws HibernateException 
    { 
        session = HibernateUtil.getSessionFactory().openSession(); 
        tx = session.beginTransaction(); 
    }  

    private void manejaExcepcion(HibernateException he) throws HibernateException 
    { 
        tx.rollback(); 
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he); 
    } 
}
