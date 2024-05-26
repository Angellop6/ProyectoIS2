/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
    import java.sql.Connection;
    import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author Mayra
 */
class Conexion {
    public static final String URL ="jdbc:mysql://localhost:3306/Ecomoda";
    public static final String USER ="root";
    public static final String CLAVE ="";
    
    public Connection getConexion(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= (Connection) DriverManager.getConnection(URL, USER,CLAVE);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error en la conexion de base de ddatos");
            System.exit(0);
        }
        return con;
    
            
        
    
    } 
}
