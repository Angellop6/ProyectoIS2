/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import idao.IProductos;//cambiar
import java.util.ArrayList;
import Clases.Productos;//cambiar
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.sql.ResultSet;



public class DaoProductos implements IProductos {
    private Connection cnx;

    @Override
    public void createProducto(Productos a) {
        createProductoSQl(a);
        
        
        
    }

    @Override
    public Productos readProducto(String id) {
        
        Productos p = ConsultarSQL(id);
        return p;
        
    }

    @Override
    public ArrayList<Productos> readProductos() {
        ArrayList<Productos> prods = leerDatosSQl();
        return prods;
        
    }

    @Override
    public void updateProducto(Productos a, String id) {
       actualizarSQL(a,id);
        
        
    }

    @Override
    public void deleteProducto(String id) {
        EliminarSQL(id);
        
    }

    private void createProductoSQl(Productos a) {
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "INSERT INTO Productos(Nombre,Marca,Cantidad,Color,Precio,Descripcion,Imagen,Oferta) VALUES(?,?,?,?,?,?,?,?);";
        PreparedStatement ps ;
        try {
            ps = cnx.prepareStatement(sql);
            ps.setString(1, a.getNombre());
            ps.setString(2, a.getMarca());
            ps.setInt(3, a.getCantidad());
            ps.setString(4, a.getColor());
            ps.setFloat(5, a.getPrecio());
            ps.setString(6, a.getDescripcion());
            ps.setBytes(7, a.getImagen());
            ps.setInt(8, a.getOferta());
            ps.executeUpdate();  
        } catch (SQLException ex) {
            Logger.getLogger(DaoProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
    
    private ArrayList<Productos> leerDatosSQl() {
        ArrayList<Productos> Productos = new ArrayList();
        
 
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "select * from Productos";
        try {
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                Productos Producto = new Productos( rs.getInt("Id"),rs.getString("Nombre"),rs.getString("Marca"),
                            rs.getInt("Cantidad"),rs.getString("Color"),rs.getFloat("Precio"),rs.getString("Descripcion"),rs.getBytes("Imagen")
                                ,rs.getInt("Oferta")); 
                Productos.add(Producto);
            }
            
        }catch(Exception e){}
        
        return Productos;
    }
    
    private void actualizarSQL(Productos a,String id) {
        
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "update Productos set Nombre=?,Marca=?,Cantidad=?,Color=?,Precio=?,Descripcion=?, Imagen=?, Oferta=? where Id = ? ;";
        PreparedStatement ps ;
        try {
            ps = cnx.prepareStatement(sql);
            ps.setString(1, a.getNombre());
            ps.setString(2, a.getMarca());
            ps.setInt(3, a.getCantidad());
            ps.setString(4, a.getColor());
            ps.setFloat(5, a.getPrecio());          
            ps.setString(6, a.getDescripcion());
            ps.setBytes(7, a.getImagen());
            ps.setInt(8, a.getOferta());
             ps.setString(9, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
        
    }
    
    private void EliminarSQL(String id) {
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "delete from Productos where Id =" + id;     
            Statement st;
        try {
            st = cnx.createStatement();
            int n = st.executeUpdate(sql);
            if(n>=0){
                System.out.println("se elimino el registro");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
    }
    
    private Productos ConsultarSQL(String id){
        Productos a = null ;
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "select * from Productos where Id=" + id;
        
            Statement st;
        try {
            st = cnx.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                a = new Productos( rs.getInt("Id"),rs.getString("Nombre"),rs.getString("Marca"),
                            rs.getInt("Cantidad"),rs.getString("Color"),rs.getFloat("Precio"),rs.getString("Descripcion"),rs.getBytes("Imagen")
                                ,rs.getInt("Oferta"));  
            } 
        } catch (SQLException ex) {
            Logger.getLogger(DaoProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return a;
    }
  
}
