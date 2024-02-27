 package idao;

import java.util.ArrayList;
import Clases.Clientes;

/**
 *
 * @author luisf
 */
public interface IClientes {
    
    void createCliente(Clientes a);
    Clientes readCliente(String id);
    ArrayList<Clientes> readClientes();
    void updateCliente(Clientes a, String id);
    void deleteCliente(String id);
    Clientes readClienteCorreo(String Correo);
    
}
