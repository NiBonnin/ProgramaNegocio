/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.sql.*;

/**
 *
 * @author Nico
 */
public class Conectar {
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String url = "jdbc:mysql://localhost:3306/basededatosnegocio";

    public static Connection getConnection() {
        Connection connection = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, "");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

        return connection;
    }          
 }
