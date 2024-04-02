
package bank.management.system;

import java.sql.*;

public class Conn {
    //create connection
    Connection c;
    Statement s;
    public Conn()
    {
        try{
            //Register Driver
            //Class.forName(com.mysql.cj.jdbc.Driver);
            
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem" , "root" , "Shravan@252005");
            //create statement
            s = c.createStatement();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
