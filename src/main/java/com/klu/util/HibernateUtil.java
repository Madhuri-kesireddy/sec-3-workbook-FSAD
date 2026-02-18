package com.klu.util;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> e212664d958e7acb6ddaabd89b9dc1d619ede427

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

<<<<<<< HEAD
    private static SessionFactory factory;

    static {
        factory = new Configuration().configure().buildSessionFactory();
    }
=======
    private static SessionFactory factory =
            new Configuration().configure().buildSessionFactory();
>>>>>>> e212664d958e7acb6ddaabd89b9dc1d619ede427

    public static SessionFactory getSessionFactory() {
        return factory;
    }
}
<<<<<<< HEAD
=======
=======
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class HibernateUtil {
	 private static SessionFactory factory =
	            new Configuration().configure().buildSessionFactory();

	    public static SessionFactory getSessionFactory() {
	        return factory;
	    }

}
>>>>>>> 30fea6b2cec53c1e7b520ebfa4da9d240990beb4
>>>>>>> e212664d958e7acb6ddaabd89b9dc1d619ede427
