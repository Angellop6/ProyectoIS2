
package dao;

import Clases.Carrito;
import idao.ICarrito;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author angel
 */
public class DaoCarrito implements ICarrito{
    
     private Connection cnx;
    
    @Override
    public void createCarrito(Carrito a) {
        createCarritoSQl(a);
    }

    @Override
    public Carrito readCarrito(String id) {
        Carrito c = ConsultarSQL(id);
        return c;
    }

    @Override
    public ArrayList<Carrito> readCarritos(String idUsuario) {
        ArrayList<Carrito> c = leerDatosSQl(idUsuario);
        return c;
    }

    @Override
    public void updateCarrito(Carrito a, String id) {
         actualizarSQL(a ,id);
    }

    @Override
    public void deleteCarrito(String id) {
       EliminarSQL(id);
    }
    
    
    //------------------------------------logica y conecion a la tabla de Carrito--------------------
    
    
    private void createCarritoSQl(Carrito a)  {
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "INSERT INTO Carrito(Cantidad,Total,IdUsuario,IdProducto) VALUES(?,?,?,?);";
        PreparedStatement ps ;
        try {
            ps = cnx.prepareStatement(sql);
            ps.setInt(1, a.getCantidad());
            ps.setFloat(2, a.getTotal());
            ps.setInt(3, a.getIdUsuario());
            ps.setInt(4, a.getIdProducto());
             ps.executeUpdate();   
        } catch (SQLException ex) {
            Logger.getLogger(DaoVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
       
    }
    
    private ArrayList<Carrito> leerDatosSQl(String id) {
        ArrayList<Carrito> Carritos = new ArrayList();
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "SELECT * FROM Carrito WHERE IdUsuario = " + id ;
        try {
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                Carrito carro = new Carrito( rs.getInt("Id"),rs.getInt("Cantidad"),
                            rs.getFloat("Total"),rs.getInt("IdUsuario"), rs.getInt("IdProducto")); 
                Carritos.add(carro);
            }
            
        }catch(Exception e){
            System.out.println("error"+ e);
        }
        
        return Carritos;
    }
    
    private void actualizarSQL(Carrito a,String id) {
        
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "update Carrito set Cantidad=?,Total=?,IdUsuario=?,IdProducto=? where Id =? ;";
        PreparedStatement ps ;
        try {
            ps = cnx.prepareStatement(sql);
            ps.setInt(1, a.getCantidad());
            ps.setFloat(2, a.getTotal());
            ps.setInt(3, a.getIdUsuario());
            ps.setInt(4, a.getIdProducto());
            ps.setString(5, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("error"+ ex);
        }
        
        
        
    }
    
    private void EliminarSQL(String id) {
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "delete from Carrito where Id =" + id;     
            Statement st;
        try {
            st = cnx.createStatement();
            int n = st.executeUpdate(sql); 
            if(n>=0){
                System.out.println("se elimino el registro");
            }
        } catch (SQLException ex) {
            System.out.println("Error"+ex);
        }
            
    }
    
    private Carrito ConsultarSQL(String id){
        Carrito a = null ;
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "select * from Carrito where Id=" + id;
        
            Statement st;
        try {
            st = cnx.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                a = new Carrito( rs.getInt("Id"),rs.getInt("Cantidad"),
                            rs.getFloat("Total"),rs.getInt("IdUsuario"), rs.getInt("IdProducto"));   
            } 
            
            
        } catch (SQLException ex) {
            System.out.println("Error"+ ex);
        }
            
        return a;
    }
    
    
    
}
