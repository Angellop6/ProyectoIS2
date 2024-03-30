/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import idao.IClientes;
import java.util.ArrayList;
import Clases.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.sql.ResultSet;



public class DaoCliente implements IClientes {
    private Connection cnx;

    @Override
    public void createCliente(Clientes a) {
        try {
            createClienteSQl(a);
        } catch (SQLException ex) {
            System.out.println("error mano "+ ex);
        }
    }

    @Override
    public Clientes readCliente(String id) {
        Clientes a = null;
        try {
            a  = ConsultarSQL(id);
        } catch (SQLException ex) {
            System.out.println("error: "+ ex);
        }
        
        return a;
    }

    @Override    
    public ArrayList<Clientes> readClientes() {
        ArrayList<Clientes> clientes = new ArrayList();
        try {
            clientes = leerDatosSQl();
        } catch (SQLException ex) {
            System.out.println("error mano"+ ex);
        }
        
        return clientes;
    }

    @Override
    public void updateCliente(Clientes a, String id) {
        try {
            actualizarSQL(a,id);
        } catch (SQLException ex) {
            System.out.println("error; "+ex);
        }
        
        
    }

    @Override
    public void deleteCliente(String id) {
        try {
            EliminarSQL(id);
        } catch (SQLException ex) {
            System.out.println("error: "+ ex);
        }
    }
    
        @Override
    public Clientes readClienteCorreo(String Correo) {
        Clientes a = BuscarCorreo(Correo);
        return a;
    }
    
    private void createClienteSQl(Clientes a) throws SQLException{
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "INSERT INTO clientes(Nombre,Edad,Direccion,Genero,Telefono,Correo,Contraseña) VALUES(?,?,?,?,?,?,?);";
        PreparedStatement ps ;
        ps = cnx.prepareStatement(sql);
        ps.setString(1, a.getNombre());
        ps.setInt(2, a.getEdad());
        ps.setString(3, a.getDireccion());
        ps.setString(4, a.getGenero());
        ps.setString(5, a.getTelefono());
        ps.setString(6, a.getCorreo());
        ps.setString(7, a.getContraseña());
        ps.executeUpdate();   
        
//        Conexion con = new Conexion();
//        cnx = con.getConexion();
//        String sql = "INSERT INTO auto(Marca,Modelo,Color,Precio) VALUES(?,?,?,?);";
//        PreparedStatement ps ;
//        ps = cnx.prepareStatement(sql);
//        ps.setString(1, a.getMarca());
//        ps.setString(2, a.getModelo());
//        ps.setString(3, a.getColor());
//        ps.setFloat(4, a.getPrecio());
//        ps.executeUpdate();
    }
    
    private ArrayList<Clientes> leerDatosSQl() throws SQLException{
        ArrayList<Clientes> Clientes = new ArrayList();
        
 
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "select * from Clientes";
     
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                Clientes Cliente = new Clientes( rs.getInt("Id"),rs.getString("Nombre"),rs.getInt("Edad"),
                            rs.getString("Direccion"),rs.getString("Genero"),rs.getString("Telefono"),rs.getString("Correo"),rs.getString("Contraseña")); 
                Clientes.add(Cliente);
            }
            
        
        
        return Clientes;
    }
    
    private void actualizarSQL(Clientes a,String id) throws SQLException{
        
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "update Clientes set Nombre=?,Edad=?,Direccion=?,Genero=?,Telefono=?,Correo=?,Contraseña=? where Id = ? ;";
        PreparedStatement ps ;
        ps = cnx.prepareStatement(sql);
        ps.setString(1, a.getNombre());
        ps.setInt(2, a.getEdad());
        ps.setString(3, a.getDireccion());
        ps.setString(4, a.getGenero());
        ps.setString(5, a.getTelefono());
        ps.setString(6, a.getCorreo());
        ps.setString(7, a.getContraseña());  
        ps.setString(8, id);
        ps.executeUpdate();
        
        
    }
    
     private void EliminarSQL(String id) throws SQLException{
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "delete from Clientes where Id =" + id;     
            Statement st = cnx.createStatement();
            int n = st.executeUpdate(sql); 
            if(n>=0){
                System.out.println("se elimino el registro");
            }
    }
     
     private Clientes ConsultarSQL(String id)throws SQLException{
        Clientes a = null ;
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "select * from Clientes where Id=" + id;
        
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                a = new Clientes( rs.getInt("Id"),rs.getString("Nombre"),rs.getInt("Edad"),
                            rs.getString("Direccion"),rs.getString("Genero"),rs.getString("Telefono"),rs.getString("Correo"),rs.getString("Contraseña")); 
            } 
        return a;
    }

     private Clientes BuscarCorreo(String Correo){
         Correo = "\"" + Correo + "\"";
         Clientes a = null ;
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "select * from Clientes where Correo = " + Correo;
            Statement st;
        try {
            st = cnx.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                a = new Clientes( rs.getInt("Id"),rs.getString("Nombre"),rs.getInt("Edad"),
                            rs.getString("Direccion"),rs.getString("Genero"),rs.getString("Telefono"),rs.getString("Correo"),rs.getString("Contraseña")); 
            } 
        } catch (SQLException ex) {
            System.out.println("error" + ex );
        }
            
            
            
            
        return a;
     
     
     }
    
    
    
}
