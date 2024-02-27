/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import idao.IEmpleados;//cambiar
import java.util.ArrayList;
import Clases.Empleados;//cambiar
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
public class DaoEmpleados implements IEmpleados {

    private Connection cnx;

    @Override
    public void createEmpleado(Empleados a)  {
        createEmpleadoSQl(a);
    }

    @Override
    public Empleados readEmpleado(String id) {
        Empleados e = ConsultarSQL(id);
        return e;

    }

    @Override
    public ArrayList<Empleados> readEmpleados() {
        ArrayList<Empleados> Empleados = null;

        try {
            Empleados = leerDatosSQl();
        } catch (SQLException ex) {
            Logger.getLogger(DaoEmpleados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Empleados;

    }

    @Override
    public void updateEmpleado(Empleados a, String id)  {
        actualizarSQL(a, id);

    }

    @Override
    public void deleteEmpleado(String id)  {
        EliminarSQL(id);
    }

    @Override
    public Empleados readEmpleadosCorreo(String Correo) {
        Empleados e = BuscarCorreo(Correo);
        return e;
    }

    private void createEmpleadoSQl(Empleados a) {
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "INSERT INTO Empleados(Nombre,Edad,Direccion,Genero,Telefono,Salario,Correo,Contraseña) VALUES(?,?,?,?,?,?,?,?);";
        PreparedStatement ps;
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
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("error" + ex );
        }

    }

    private ArrayList<Empleados> leerDatosSQl() throws SQLException {
        ArrayList<Empleados> Empleados = new ArrayList();

        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "select * from Empleados";
        try {
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Empleados Empleado = new Empleados(rs.getInt("Id"), rs.getString("Nombre"), rs.getInt("Edad"),
                        rs.getString("Direccion"), rs.getString("Genero"), rs.getString("Telefono"), rs.getFloat("Salario"), rs.getString("Correo"), rs.getString("Contraseña"));
                Empleados.add(Empleado);
            }

        } catch (Exception e) {
        }

        return Empleados;
    }

    private void actualizarSQL(Empleados a, String id) {

        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "update Empleados set Nombre=?,Edad=?,Direccion=?,Genero=?,Telefono=?,Salario=?,Correo=?,Contraseña=? where Id = ? ;";
        PreparedStatement ps;
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
            Logger.getLogger(DaoEmpleados.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }

    private void EliminarSQL(String id)  {
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "delete from Empleados where Id =" + id;
        Statement st;
        try {
            st = cnx.createStatement();
            int n = st.executeUpdate(sql);
        if (n >= 0) {
            System.out.println("se elimino el registro");
        }
        } catch (SQLException ex) {
            System.out.println("error" + ex );
        }
        
    }

    private Empleados ConsultarSQL(String id)  {
        Empleados a = null;
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "select * from Empleados where Id=" + id;

        
        try {
           Statement st = cnx.createStatement();
           ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            a = new Empleados(rs.getInt("Id"), rs.getString("Nombre"), rs.getInt("Edad"),
                    rs.getString("Direccion"), rs.getString("Genero"), rs.getString("Telefono"), rs.getFloat("Salario"), rs.getString("Correo"), rs.getString("Contraseña"));
        }
        } catch (SQLException ex) {
            System.out.println("error "+ex);
        }
        
        return a;
    }

    private Empleados BuscarCorreo(String Correo) {
        Correo = "\"" + Correo + "\"";
        Empleados a = null;
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "select * from Empleados where Correo = " + Correo;
        Statement st;
        try {
            st = cnx.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                a = new Empleados(rs.getInt("Id"), rs.getString("Nombre"), rs.getInt("Edad"),
                        rs.getString("Direccion"), rs.getString("Genero"), rs.getString("Telefono"), rs.getFloat("Salario"), rs.getString("Correo"), rs.getString("Contraseña"));
            }
        } catch (SQLException ex) {
            System.out.println("error" + ex);
        }

        return a;

    }

}
