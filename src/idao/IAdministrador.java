/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package idao;

import java.util.ArrayList;
import Clases.Administrador;
import java.sql.SQLException;
/**
 *
 * @author luisf
 */
public interface IAdministrador {
    
    void createAdministrador(Administrador a);
    Administrador readAdministrador(String id);
    ArrayList<Administrador> readAdministrador();
    void updateAdministrador(Administrador a, String id);
    void deleteAdministrador(String id);
    Administrador readAdministradorCorreo(String Correo);
}
