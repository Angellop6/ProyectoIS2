/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package idao;

import java.util.ArrayList;
import Clases.Carrito;


public interface ICarrito {
    
    void createCarrito(Carrito a);
    Carrito readCarrito(String id);
    ArrayList<Carrito> readCarritos(String idUsuario);
    void updateCarrito(Carrito a, String id);
    void deleteCarrito(String id);
    
}
