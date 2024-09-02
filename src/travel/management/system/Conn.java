
package travel.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql:///travel_management_java", "root", "");
            s= c.createStatement();
            
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
