package com.francisco.connection;

import interfaces.PantallaPrincipal;
import java.sql.Connection;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {

        Configuration configuracion = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuracion.buildSessionFactory();
        Session session = sessionFactory.openSession();

        PantallaPrincipal newPantallaPrincipal = new PantallaPrincipal(session);

        if (session.isOpen()) {
            session.close();
            sessionFactory.close();
        }
    }

    private static Connection conexionBaseDeDatos() {

        String urlH2 = "jdbc:h2:/src/main/resources/proyectoORM";
        String username = "root";
        String password = "1234";
        System.out.println(urlH2);
        System.out.println("Iniciando conexion con el servidor");
        Connection newConnection = H2Connection.newInstance(urlH2, username, password);

        return newConnection;
    }
}
