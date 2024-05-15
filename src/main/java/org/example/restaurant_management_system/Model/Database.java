package org.example.restaurant_management_system.Model;

import com.almasb.fxgl.net.Connection;

import java.sql.DriverManager;

import static java.lang.Class.forName;

public class Database {

    public static Connection connectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/mydatabase", "root", "sudodatabase");
            return connect;
        }catch(Exception e){
            e.printStackTrace();
        }

        return null;
    }

}
