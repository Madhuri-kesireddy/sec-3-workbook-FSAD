package com.klu.util;
<<<<<<< HEAD

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory factory =
            new Configuration().configure().buildSessionFactory();

    public static SessionFactory getSessionFactory() {
        return factory;
    }
}
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
