/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.List;

/**
 *
 * @author Nico
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        int idAEliminar = 2;
        ClienteDAO clienteDAO = new ClienteDAO(); 
        GenericDAO genericDAO = new GenericDAO();
        Cliente contactoRecuperado;

        //Creamos tes instancias de Contacto  (String nombre, String direccion, int codigoPostal, String telefono, String cuit)
        Cliente cliente1 = new Cliente("Pedro", "dr clark 385", 3260, "86484","15531"); 
        Cliente cliente2 = new Cliente("Manuel", "dr clark 385", 3260, "86484","15531"); 
        Cliente cliente3 = new Cliente("Martin", "dr clark 385", 3260, "86484","15531");
        Cliente cliente4 = new Cliente("Josecito", "dr clark 385", 3260, "86484","15531");

        //Guardamos las tres instancias, guardamos el id del contacto1 para usarlo posteriormente 
        idAEliminar = clienteDAO.guardaCliente(cliente1); 
        clienteDAO.guardaCliente(cliente2);
        clienteDAO.guardaCliente(cliente3);
        //Modificamos el contacto 2 y lo actualizamos         
        cliente2.setNombre("Nuevo Cliente 2");
        clienteDAO.actualizaCliente(cliente2);
        //genericDAO.save(cliente4);
        //Recuperamos el contacto1 de la base de datos 
        //contactoRecuperado = genericDAO.get(Cliente.class, idAEliminar);
        contactoRecuperado = clienteDAO.obtenContacto(idAEliminar);
        System.out.println("Recuperamos a " + contactoRecuperado.getNombre());

        //Eliminamos al contactoRecuperado (que es el contacto3)
        clienteDAO.eliminaCliente(contactoRecuperado);
        
        //Obtenemos la lista de contactos que quedan en la base de datos y la mostramos
        List<Cliente> listaContactos = clienteDAO.obtenListaContactos();
        System.out.println("Hay " + listaContactos.size() + " clientes en la base de datos");

        for(Cliente c : listaContactos)
        {System.out.println("-> " + c.getNombre());
        } 
    }     
}
