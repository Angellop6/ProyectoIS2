/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import idao.ITickets;//cambiar
import java.util.ArrayList;
import Clases.Tickets;//cambiar
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.sql.ResultSet;



public class DaoTickets implements ITickets {
    private Connection cnx;

    @Override
    public void createTicket(Tickets a) {
       createTicketsSQl(a);
    }

    @Override
    public Tickets readTicket(String id) {
        Tickets t = ConsultarSQL(id);
        return t;
        
    }

    @Override
    public ArrayList<Tickets> readTickets() {
        ArrayList<Tickets> ts = leerDatosSQl();
        return ts;
        
    }

    @Override
    public void updateTicket(Tickets a, String id) {
        actualizarSQL(a,id);
        
    }

    @Override
    public void deleteTickets(String id) {
       EliminarSQL(id);    
    }

    private void createTicketsSQl(Tickets a) {
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "INSERT INTO Tickets(Nombre,Correo,Total) VALUES(?,?,?);";
        PreparedStatement ps ;
        try {
            ps = cnx.prepareStatement(sql);
            ps.setString(1, a.getNombre());
        ps.setString(2, a.getCorreo());
        ps.setFloat(3, a.getTotal());
        
        
        ps.executeUpdate(); 
        } catch (SQLException ex) {
            Logger.getLogger(DaoTickets.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }
    
    private ArrayList<Tickets> leerDatosSQl() {
        ArrayList<Tickets> Tickets = new ArrayList();
        
 
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "select * from Tickets";
        Statement st;
        try {
            st = cnx.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                Tickets Ticket = new Tickets( rs.getInt("Id"),rs.getString("Nombre"),rs.getString("Correo"),
                            rs.getFloat("Total")); 
                Tickets.add(Ticket);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoTickets.class.getName()).log(Level.SEVERE, null, ex);
        }       
        return Tickets;
    }
    
    private void actualizarSQL(Tickets a,String id) {
        
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "update Tickets set Nombre=?,Correo=?,Total=? where Id = ? ;";
        PreparedStatement ps ;
        try {
            ps = cnx.prepareStatement(sql);
            ps.setString(1, a.getNombre());
            ps.setString(2, a.getNombre());
            ps.setFloat(3, a.getTotal());  
            ps.setString(4, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoTickets.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    private void EliminarSQL(String id) {
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "delete from Tickets where Id =" + id;     
            Statement st;
        try {
            st = cnx.createStatement();
            int n = st.executeUpdate(sql); 
            if(n>=0){
                System.out.println("se elimino el registro");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoTickets.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
    private Tickets ConsultarSQL(String id){
        Tickets a = null ;
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "select * from Tickets where Id=" + id;   
            Statement st;
        try {
            st = cnx.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                a = new Tickets( rs.getInt("Id"),rs.getString("Nombre"),rs.getString("Correo"),
                            rs.getFloat("Total"));   
            } 
        } catch (SQLException ex) {
            Logger.getLogger(DaoTickets.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return a;
    }
    

    

    
    
    
    
    
}
