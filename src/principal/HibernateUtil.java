/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory; 
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.service.ServiceRegistry;
/**
 *
 * @author Nico
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory = buildSessionFactory();
 
   private static SessionFactory buildSessionFactory()
   {
      try
      {
         if (sessionFactory == null)
         {
            Configuration configuration = new Configuration().configure(HibernateUtil.class.getResource("/hibernate.cfg.xml"));
            StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
            serviceRegistryBuilder.applySettings(configuration.getProperties());
            ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
         }
         return sessionFactory;
      } catch (Throwable ex)
      {
         System.err.println("Initial SessionFactory creation failed: " + ex);
         throw new ExceptionInInitializerError(ex);
      }
   }
 
   public static SessionFactory getSessionFactory()
   {
      return sessionFactory;
   }
 
   public static void shutdown()
   {
      getSessionFactory().close();
   }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
/*private static SessionFactory sessionFactory;
 public static synchronized void buildSessionFactory() {
 if (sessionFactory == null) {
   Configuration configuration = new Configuration();
          configuration.configure();
           configuration.setProperty("hibernate.current_session_context_class", "thread");
         ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
          sessionFactory = configuration.buildSessionFactory(serviceRegistry);
      }
    }
     public static void openSessionAndBindToThread() {
       Session session = sessionFactory.openSession(); 
       ThreadLocalSessionContext.bind(session);
     }

     public static SessionFactory getSessionFactory() {
         if (sessionFactory==null)  {
            buildSessionFactory();
        }
         return sessionFactory;
     }

     public static void closeSessionAndUnbindFromThread() {
         Session session = ThreadLocalSessionContext.unbind(sessionFactory);
         if (session!=null) {
            session.close();
        }
    }

     public static void closeSessionFactory() {
         if ((sessionFactory!=null) && (sessionFactory.isClosed()==false)) {
           sessionFactory.close();
        }
    }

    private static class ServiceRegistryBuilder {

        public ServiceRegistryBuilder() {
        }
    }
}
    
    
    
    */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /* private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {

			SessionFactory sessionFactory = new Configuration()
					.configure("/com/mkyong/persistence/hibernate.cfg.xml")
					.addResource("com/mkyong/common/Cliente.hbm.xml")
					.buildSessionFactory();

			return sessionFactory;

		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void shutdown() {
		// Close caches and connection pools
		getSessionFactory().close();
	}
    
    */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*private static final SessionFactory sessionFactory;   

    static 
    { 
        try 
        { 
            sessionFactory = new Configuration().configure().buildSessionFactory(); 
        } catch (HibernateException he) 
        { 
           System.err.println("Ocurrió un error en la inicialización de la SessionFactory: " + he); 
           throw new ExceptionInInitializerError(he); 
        } 
    }  

    public static SessionFactory getSessionFactory() 
    { 
        return sessionFactory; 
    } */
}
