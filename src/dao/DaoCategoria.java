/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Clases.Carrito;
import Clases.Categoria;
import idao.ICategoria;
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
public class DaoCategoria implements ICategoria {

    private Connection cnx;

    @Override
    public void createCategoria(Categoria a) {
        createCategoriaSQl(a);
    }

    @Override
    public Categoria readCategoria(String id) {
        Categoria a = ConsultarSQL(id);
        return a;
    }

    @Override
    public ArrayList<Categoria> readCategorias() {
        ArrayList<Categoria> categorias = null;
        categorias = leerDatosSQl();
        return categorias;
    }

    @Override
    public void updateCategoria(Categoria a, String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteCategoria(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Categoria readCategoria_nombre(String Nombre) {
        Categoria a = Consultar_NOMBRESQL(Nombre);
        return a;
    }

    private void createCategoriaSQl(Categoria a) {
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "INSERT INTO Categorias(Categoria) VALUES(?);";
        PreparedStatement ps;
        try {
            ps = cnx.prepareStatement(sql);
            ps.setString(1, a.getCategoria());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoVenta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private ArrayList<Categoria> leerDatosSQl() {
        ArrayList<Categoria> Carritos = new ArrayList();
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "SELECT * FROM Categorias  ";
        try {
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Categoria cat = new Categoria(rs.getInt("Id"), rs.getString("Categoria"));
                Carritos.add(cat);
            }

        } catch (Exception e) {
            System.out.println("error" + e);
        }

        return Carritos;
    }

    private void actualizarSQL(Categoria a, String id) {

        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "update Categoria set Categoria=? where Id =? ;";
        PreparedStatement ps;
        try {
            ps = cnx.prepareStatement(sql);
            ps.setString(1, a.getCategoria());
            ps.setString(2, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("error" + ex);
        }

    }

    private void EliminarSQL(String id) {
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "delete from Categoria where Id =" + id;
        Statement st;
        try {
            st = cnx.createStatement();
            int n = st.executeUpdate(sql);
            if (n >= 0) {
                System.out.println("se elimino el registro");
            }
        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        }

    }

    private Categoria ConsultarSQL(String id) {
        Categoria a = null;
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "select * from Categorias where Id=" + id;

        Statement st;
        try {
            st = cnx.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                a = new Categoria(rs.getInt("Id"), rs.getString("Categoria"));
            }

        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        }

        return a;
    }

    private Categoria Consultar_NOMBRESQL(String Nombre) {
        Categoria a = null;
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "SELECT * FROM categorias WHERE Categoria = ?";

        try {
            PreparedStatement ps = cnx.prepareStatement(sql);
            ps.setString(1, Nombre);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                a = new Categoria(rs.getInt("Id"), rs.getString("Categoria"));
            }

        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        }

        return a;
    }

}
