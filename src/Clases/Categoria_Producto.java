/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author angel
 */
public class Categoria_Producto {
   private int id_Producto;
   private int id_Catrgoria;

    public Categoria_Producto(int id_Producto, int id_Catrgoria) {
        this.id_Producto = id_Producto;
        this.id_Catrgoria = id_Catrgoria;
    }

    public int getId_Producto() {
        return id_Producto;
    }

    public void setId_Producto(int id_Producto) {
        this.id_Producto = id_Producto;
    }

    public int getId_Catrgoria() {
        return id_Catrgoria;
    }

    public void setId_Catrgoria(int id_Catrgoria) {
        this.id_Catrgoria = id_Catrgoria;
    }
    
   
   
}
