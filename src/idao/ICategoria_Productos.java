
package idao;

import java.util.ArrayList;
import Clases.Categoria_Producto;


public interface ICategoria_Productos {
    
    void createClase_P(Categoria_Producto a);
    Categoria_Producto readClase_P(String id);
    ArrayList<Categoria_Producto> readClase_Ps(int idProducto);
    ArrayList<Categoria_Producto> readClase_Producto(int idCategoria);
    void updateClase_P(Categoria_Producto a, String id);
    void deleteClase_P(String id);
    
    
}
