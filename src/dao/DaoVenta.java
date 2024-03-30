/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import idao.IVenta;//cambiar
import java.util.ArrayList;
import Clases.Venta;//cambiar
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.sql.ResultSet;



public class DaoVenta implements IVenta {
    private Connection cnx;

    @Override
    public void createVenta(Venta a) {     
            createVentaSQl(a);
     
    }

    @Override
    public Venta readVenta(String id) {
       Venta v  =  ConsultarSQL(id);
        return v;
    }

    @Override
    public ArrayList<Venta> readVentas(String idtik) {
       ArrayList<Venta> v = leerDatosSQl(idtik);
       return v;
    }

    @Override
    public void updateVenta(Venta a, String id) {
        actualizarSQL(a,id);
    }

    @Override
    public void deleteVenta(String id) {
        EliminarSQL(id);
    }

    
    private void createVentaSQl(Venta a)  {
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "INSERT INTO Venta(Producto,Cantidad,Precio,Total,IdTicket) VALUES(?,?,?,?,?);";
        PreparedStatement ps ;
        try {
            ps = cnx.prepareStatement(sql);
            ps.setString(1, a.getProducto());
            ps.setInt(2, a.getCantidad());
            ps.setFloat(3, a.getPrecio());
            ps.setFloat(4, a.getTotal());
            ps.setInt(5, a.getIdTicket());
             ps.executeUpdate();   
        } catch (SQLException ex) {
            Logger.getLogger(DaoVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
       
    }
    
    private ArrayList<Venta> leerDatosSQl(String id) {
        ArrayList<Venta> Ventas = new ArrayList();
        
 
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "SELECT * FROM venta WHERE IdTicket =" + id ;
        try {
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                Venta Venta = new Venta( rs.getInt("Id"),rs.getString("Producto"),rs.getInt("Cantidad"),
                            rs.getFloat("Precio"),rs.getFloat("Total"),rs.getInt("IdTicket")); 
                Ventas.add(Venta);
            }
            
        }catch(Exception e){
            System.out.println("error"+ e);
        }
        
        return Ventas;
    }
    
    private void actualizarSQL(Venta a,String id) {
        
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "update Venta set Nombre=?,Correo=?,Total=? where Id = ? ;";
        PreparedStatement ps ;
        try {
            ps = cnx.prepareStatement(sql);
            ps.setString(1, a.getProducto());
            ps.setInt(2, a.getCantidad());
            ps.setFloat(3, a.getPrecio());
            ps.setFloat(4, a.getTotal());
            ps.setInt(5, a.getIdTicket());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("error"+ ex);
        }
        
        
        
    }
    
    private void EliminarSQL(String id) {
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "delete from Venta where Id =" + id;     
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
    
    private Venta ConsultarSQL(String id){
        Venta a = null ;
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "select * from Venta where Id=" + id;
        
            Statement st;
        try {
            st = cnx.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                a = new Venta( rs.getInt("Id"),rs.getString("Producto"),rs.getInt("Cantidad"),
                            rs.getFloat("Precio"),rs.getFloat("Total"),rs.getInt("IdTicket"));   
            } 
            
            
        } catch (SQLException ex) {
            System.out.println("Error"+ ex);
        }
            
        return a;
    }
    

    
    

    

    
    
    
    
    
}
