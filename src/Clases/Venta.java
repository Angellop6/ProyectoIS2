/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
    

/**
 *
 * @author Mayra
 */
public class Venta {
    
    private int Id;
    private int cantidad;
    private float total;
    private int idUsuario;
    private int idProducto;

    public Venta(int Id, int cantidad, float total, int idUsuario, int idProducto) {
        this.Id = Id;
        this.cantidad = cantidad;
        this.total = total;
        this.idUsuario = idUsuario;
        this.idProducto = idProducto;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public String toString() {
        return "Venta{" + "Id=" + Id + ", cantidad=" + cantidad + ", total=" + total + ", idUsuario=" + idUsuario + ", idProducto=" + idProducto + '}';
    }

    


    
    
    
     
    
}
