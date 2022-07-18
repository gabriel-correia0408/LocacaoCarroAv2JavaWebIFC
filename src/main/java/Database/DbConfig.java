package Database;


import Models.Carro;
import Models.Usuario;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DbConfig {
    private static final SessionFactory sessionFactory = buildSessionFactory();
    public static Session session;

    private static SessionFactory buildSessionFactory() {
        try {
            return new Configuration()
                    .setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver")
                    .setProperty("hibernate.connection.url","jdbc:mysql://localhost/pgm4?autoReconnect=true&useSSL=false")
                    .setProperty("hibernate.connection.username","root")
                    .setProperty("hibernate.connection.password","")
                    .setProperty("hibernate.jdbc.time_zone","UTC")
                    .setProperty("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect")
                    .setProperty("hibernate.show_sql","true")
                    .setProperty("hibernate.format_sql","false")
                    .setProperty("hibernate.hbm2ddl.auto","update")
                    .setProperty("hibernate.connection.autocommit","true")
                    .addAnnotatedClass(Carro.class)
                    .addAnnotatedClass(Usuario.class)
                    .buildSessionFactory();
        }
        catch (Throwable e) {
            e.printStackTrace();
            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static Session getSession() {
        if(session == null) {
            session = getSessionFactory().openSession();
        }
        return session;
    }

    public static void shutdown() {
        getSessionFactory().close();
    }
}