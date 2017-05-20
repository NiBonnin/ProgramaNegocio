/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprueba;

import java.io.File;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Clase de utilidad para obtener la sesion de hibernate.
 * 
 * @author Nico
 * 
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;

    static {
        try {
// Si no ponemos fichero, intenta cargar "/hibernate.cfg.xml" en el raiz
            sessionFactory = new AnnotationConfiguration().configure(
                    new File("hibernate.cfg.xml")).buildSessionFactory();
        } catch (Throwable ex) {
            // Log exception!
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return sessionFactory.openSession();
    }
}

