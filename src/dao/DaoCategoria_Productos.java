/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.SQLException;
import Clases.Categoria_Producto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import idao.ICategoria_Productos;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class DaoCategoria_Productos implements ICategoria_Productos {

    private Connection cnx;
    
    @Override
    public void createClase_P(Categoria_Producto a) {
       createRelacionC_PSQl(a);
    }

    @Override
    public Categoria_Producto readClase_P(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Categoria_Producto> readClase_Ps(int idProducto) {
        ArrayList<Categoria_Producto> Cat_p = leerDatosSQl(idProducto);
        return Cat_p;
    }
    
    @Override
    public ArrayList<Categoria_Producto> readClase_Producto(int idCategoria) {
       ArrayList<Categoria_Producto> Cat_p = leerDatosSQl2(idCategoria);
        return Cat_p;
    }
    

    @Override
    public void updateClase_P(Categoria_Producto a, String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteClase_P(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private void createRelacionC_PSQl(Categoria_Producto a) {
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "INSERT INTO categoria_producto(IdCategoria,IdProductos) VALUES(?,?);";
        PreparedStatement ps;        
        try {
            ps = cnx.prepareStatement(sql);
            ps.setInt(1, a.getId_Catrgoria());
            ps.setInt(2, a.getId_Producto());
           
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("error" + ex );
        }

    }
    
    
    private ArrayList<Categoria_Producto> leerDatosSQl(int id_Producto) {
        ArrayList<Categoria_Producto> C_p = new ArrayList();
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "SELECT * FROM categoria_producto WHERE IdProductos = " + id_Producto ;
        try {
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                Categoria_Producto carro = new Categoria_Producto( rs.getInt("IdProductos"),rs.getInt("IdCategoria")); 
                C_p.add(carro);
            }
            
        }catch(Exception e){
            System.out.println("error"+ e);
        }
        
        return C_p;
    }
    
    
    private ArrayList<Categoria_Producto> leerDatosSQl2(int id_Producto) {
        ArrayList<Categoria_Producto> C_p = new ArrayList();
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "SELECT * FROM categoria_producto WHERE IdCategoria = " + id_Producto ;
        try {
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                Categoria_Producto carro = new Categoria_Producto( rs.getInt("IdProductos"),rs.getInt("IdCategoria")); 
                C_p.add(carro);
            }
            
        }catch(Exception e){
            System.out.println("error"+ e);
        }
        
        return C_p;
    }

    
    
    
}
