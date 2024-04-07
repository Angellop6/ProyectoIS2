/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package idao;

import Clases.Categoria;
import java.util.ArrayList;

/**
 *
 * @author angel
 */
public interface ICategoria {
    void createCategoria(Categoria a);
    Categoria readCategoria(String id);
    ArrayList<Categoria> readCategorias(String idUsuario);
    void updateCategoria(Categoria a, String id);
    void deleteCategoria(String id);
    
    
}
