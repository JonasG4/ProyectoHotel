
package Conexion;
import java.sql.*;

import javax.swing.JOptionPane;


public class Conexion {

    Connection con= null;
    
    
    public Conexion(){
    try {
        
    con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\super\\OneDrive\\Escritorio\\Registro\\RegistroCliente.accdb");
    Statement st=con.createStatement();
    
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, "Conexión Errónea" + e);
    }
    
    }
    public Connection getConnection(){
    return con;
}
  
}
    
