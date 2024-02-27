/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package idao;

import java.util.ArrayList;
import Clases.Venta;

/**
 *
 * @author luisf
 */
public interface IVenta {
    
    void createVenta(Venta a);
    Venta readVenta(String id);
    ArrayList<Venta> readVentas(String idtik);
    void updateVenta(Venta a, String id);
    void deleteVenta(String id);
    
}
