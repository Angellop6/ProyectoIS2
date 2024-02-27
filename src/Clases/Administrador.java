
package Clases;


public class Administrador {
    private int Id;
    private String Nombre;
    private int Edad;
    private String Direccion;
    private String Genero;
    private String Telefono ;
    private float Salario;
    private String Correo;
    private String Contraseña;

    public Administrador(int Id, String Nombre, int Edad, String Direccion, String Genero, String Telefono, float Salario, String Correo, String Contraseña) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Direccion = Direccion;
        this.Genero = Genero;
        this.Telefono = Telefono;
        this.Salario = Salario;
        this.Correo = Correo;
        this.Contraseña = Contraseña;
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

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float Salario) {
        this.Salario = Salario;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    @Override
    public String toString() {
        return "Gerente{" + "Id=" + Id + ", Nombre=" + Nombre + ", Edad=" + Edad + ", Direccion=" + Direccion + ", Genero=" + Genero + ", Telefono=" + Telefono + ", Salario=" + Salario + ", Correo=" + Correo + ", Contrase\u00f1a=" + Contraseña + '}';
    }

   
    
    
    
}
