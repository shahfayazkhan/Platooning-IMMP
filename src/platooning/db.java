
package platooning;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class db {
    Connection conn = null;
    
    public static Connection connect(){
        try{
            Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("Jdbc:sqlite:Platoon_db.sqlite");
        return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return null;
    }
}
