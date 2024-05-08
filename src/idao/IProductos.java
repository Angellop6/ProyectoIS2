/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package idao;

import java.util.ArrayList;
import Clases.Productos;

/**
 *
 * @author luisf
 */
public interface IProductos {
    
    void createProducto(Productos a);
    Productos readProducto(String id);
    ArrayList<Productos> readProductos();
    void updateProducto(Productos a, String id);
    void deleteProducto(String id);
    void updateCantidad(int NewCant,String id);
    
}
