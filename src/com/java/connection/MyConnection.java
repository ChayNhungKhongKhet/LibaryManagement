/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.connection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class MyConnection {
    
    private final String url = "jdbc:postgresql://localhost:5432/DocumentManagement";
    
    private final String user = "postgres";
    
    private final String password = "123456";
    public Connection getConnection() {
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("complete");
        } catch (SQLException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conn;
    }
    
    public static void main(String[] args) {
        Connection connn = new MyConnection().getConnection();
        
        
    }
}
