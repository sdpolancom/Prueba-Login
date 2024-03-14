/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sindy
 */
public class Conectar {
    private static Connection conn;
    
    private static String driver ="com.mysql.cj.jdbc.Driver";
    private static String user ="root";
    private static String password ="12345678";
    private static String url ="jdbc:mysql://localhost:3306/relaciónentidad";

    public Conectar() {
        conn = null;
       try{
           Class.forName(driver);
           conn = DriverManager.getConnection(url, user, password);
           
            if(conn != null){
            System.out.println("conexion establecida");
            } 
           }catch (ClassNotFoundException | SQLException e){
               
            System.out.println("Error de conexion" + e);
        }    
    }
    
        public Connection getConnection(){
             return conn;
}

            public void desconectar () {
                conn = null;
                 if(conn == null){
            
            System.out.println("Conexion terminada");

    }
    }
}
