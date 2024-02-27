
package Clases;

import java.util.ArrayList;


public class Tickets {
    private int Id;
    private String Nombre;
    private String Correo;
    private float Total;
    

    public Tickets(int Id, String Nombre, String Correo, float Total) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Total = Total;
        
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public float getTotal() {
        return Total;
    }

    public void setTotal(float Total) {
        this.Total = Total;
    }

    @Override
    public String toString() {
        return "Tickets{" + "Id=" + Id + ", Nombre=" + Nombre + ", Correo=" + Correo + ", Total=" + Total + '}';
    }

    

    
    
    
    
}
