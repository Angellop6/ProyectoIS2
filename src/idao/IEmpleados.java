/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package idao;

import java.util.ArrayList;
import Clases.Empleados;
import java.sql.SQLException;

/**
 *
 * @author luisf
 */
public interface IEmpleados {
    
    void createEmpleado(Empleados a)throws SQLException;
    Empleados readEmpleado(String id)throws SQLException;
    ArrayList<Empleados> readEmpleados();
    void updateEmpleado(Empleados a, String id)throws SQLException;
    void deleteEmpleado(String id)throws SQLException;
    Empleados readEmpleadosCorreo(String Correo);
}
