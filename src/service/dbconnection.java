/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Sreenil A
 */
public class dbconnection {
    
   public Connection getconnection()
   {
       Connection con;
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bus","root","");
           return con;
           
       }
       catch(Exception e)
       {
          System.err.println(e);
          return null;
       }
   }
    
}
