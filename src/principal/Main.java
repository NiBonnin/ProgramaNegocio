/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author Nico
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        public class Main
{ 

        ClienteDAO clienteDAO = new ClienteDAO(); 
        Cliente contactoRecuperado = null;  
        long idAEliminar = 0;  

        //Creamos tes instancias de Contacto  (String nombre, String direccion, int codigoPostal, String telefono, String cuit)
        Cliente contacto1 = new Cliente("Pedro", "dr clark 385", 3260, "86484","15531"); 
        Cliente contacto2 = new Cliente("Manuel", "dr clark 385", 3260, "86484","15531"); 
        Cliente contacto3 = new Cliente("Martin", "dr clark 385", 3260, "86484","15531");  

        //Guardamos las tres instancias, guardamos el id del contacto1 para usarlo posteriormente 
        idAEliminar = contactosDAO.guardaContacto(contacto1); 
        contactosDAO.guardaContacto(contacto2); 
        contactosDAO.guardaContacto(contacto3);  

        //Modificamos el contacto 2 y lo actualizamos 
        contacto2.setNombre("Nuevo Contacto 2"); 
        contactosDAO.actualizaContacto(contacto2);  

        //Recuperamos el contacto1 de la base de datos 
        contactoRecuperado = contactosDAO.obtenContacto(idAEliminar); 
        System.out.println("Recuperamos a " + contactoRecuperado.getNombre());  

        //Eliminamos al contactoRecuperado (que es el contacto3) 
        contactosDAO.eliminaContacto(contactoRecuperado);  

        //Obtenemos la lista de contactos que quedan en la base de datos y la mostramos 
        List<Contacto> listaContactos = contactosDAO.obtenListaContactos();  
        System.out.println("Hay " + listaContactos.size() + "contactos en la base de datos");  

        for(Contacto c : listaContactos) 
        { 
            System.out.println("-> " + c.getNombre()); 
        } 
    } 
}
    }
    
}
