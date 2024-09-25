package br.edu.aesp.jdbc.modelo;


import java.sql.*;

public class ConnectionFactory {

    public Connection getConnection() throws ClassNotFoundException {
        String sqliteurl = "jdbc:sqlite:C:\\Users\\freir\\Documents\\NetBeansProjects\\trabalho4\\bancodedados\\defT4.db";

        try {
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection(sqliteurl);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
