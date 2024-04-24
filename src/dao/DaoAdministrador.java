/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import idao.IAdministrador;//cambiar
import java.util.ArrayList;
import Clases.Administrador;//cambiar
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.sql.ResultSet;


/**
 *
 * @author luisf
 */
public class DaoAdministrador implements IAdministrador {
    private Connection cnx;

    @Override
    public void createAdministrador(Administrador a) {
        createGerenteSQl(a);
    }

    @Override
    public Administrador readAdministrador(String id){
        Administrador g = ConsultarSQL(id);
        return g;
        
        
        
    }

    @Override
    public ArrayList<Administrador> readAdministrador() {
       ArrayList<Administrador> a = leerDatosSQl();
        return a;
        
        
    }

    @Override
    public void updateAdministrador(Administrador a, String id) {
        actualizarSQL(a,id);
        
        
    }

    @Override
    public void deleteAdministrador(String id) {
        EliminarSQL(id);
    }
    
    @Override
    public Administrador readAdministradorCorreo(String Correo) {
        Administrador g =  BuscarCorreo(Correo);
        return g;
    }


    private void createGerenteSQl(Administrador a){
        try {
            Conexion con = new Conexion();
            cnx = con.getConexion();
            String sql = "INSERT INTO Administrador(Nombre,Edad,Direccion,Genero,Telefono,Salario,Correo,Contraseña) VALUES(?,?,?,?,?,?,?,?);";
            PreparedStatement ps ;
            ps = cnx.prepareStatement(sql);
            ps.setString(1, a.getNombre());
            ps.setInt(2, a.getEdad());
            ps.setString(3, a.getDireccion());
            ps.setString(4, a.getGenero());
            ps.setString(5, a.getTelefono());
            ps.setFloat(6, a.getSalario());
            ps.setString(7, a.getCorreo());
            ps.setString(8, a.getContraseña());   
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error "+ ex);
        }
    }
    
    private ArrayList<Administrador> leerDatosSQl() {
        ArrayList<Administrador> Administradores = new ArrayList();
        
 
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "select * from Administrador";
        
         
        try {
            Statement st = cnx.createStatement();
             ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                Administrador Gerente = new Administrador( rs.getInt("Id"),rs.getString("Nombre"),rs.getInt("Edad"),
                            rs.getString("Direccion"),rs.getString("Genero"),rs.getString("Telefono"),rs.getFloat("Salario"),rs.getString("Correo"),rs.getString("Contraseña")); 
                Administradores.add(Gerente);
            }
        } catch (SQLException ex) {
            System.out.println("error" + ex);
        }
           
            
        
        
        return Administradores;
    }
    
    private void actualizarSQL(Administrador a,String id) {
        
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "update Administrador set Nombre=?,Edad=?,Direccion=?,Genero=?,Telefono=?,Salario=?,Correo=?,Contraseña=? where Id = ? ;";
        PreparedStatement ps ;
        try {
            ps = cnx.prepareStatement(sql);
            ps.setString(1, a.getNombre());
        ps.setInt(2, a.getEdad());
        ps.setString(3, a.getDireccion());
        ps.setString(4, a.getGenero());
        ps.setString(5, a.getTelefono());
        ps.setFloat(6, a.getSalario());
        ps.setString(7, a.getCorreo());
        ps.setString(8, a.getContraseña());  
        ps.setString(9, id);
        ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("error"+ ex );
        }
        
        
        
    }
    
    private void EliminarSQL(String id) {
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "delete from Administrador where Id =" + id;     
            Statement st;
        try {
            st = cnx.createStatement();
            int n = st.executeUpdate(sql); 
            if(n>=0){
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
    private Administrador ConsultarSQL(String id){
        Administrador a = null ;
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "select * from Administrador where Id=" + id;
        
            Statement st;
        try {
            st = cnx.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                a = new Administrador( rs.getInt("Id"),rs.getString("Nombre"),rs.getInt("Edad"),
                            rs.getString("Direccion"),rs.getString("Genero"),rs.getString("Telefono"),rs.getFloat("Salario"),rs.getString("Correo"),rs.getString("Contraseña")); 
            } 
        } catch (SQLException ex) {
            Logger.getLogger(DaoAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return a;
    }
    
    private Administrador BuscarCorreo(String Correo){
         Correo = "\"" + Correo + "\"";
         Administrador a = null ;
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "select * from Administrador where Correo = " + Correo;
            Statement st;
        try {
            st = cnx.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                a = new Administrador( rs.getInt("Id"),rs.getString("Nombre"),rs.getInt("Edad"),
                            rs.getString("Direccion"),rs.getString("Genero"),rs.getString("Telefono"),rs.getFloat("Salario"),rs.getString("Correo"),rs.getString("Contraseña"));
            } 
        } catch (SQLException ex) {
            System.out.println("error" + ex );
        }
            
            
            
            
        return a;
     
     
     }

    
    
    
    
    
    
}
