
package Clases;


public class Productos {
    private int Id;
    private String Nombre;
    private String Marca;
    private int Cantidad;
    private String Color;
    private double Precio;
    private String Descripcion;
    private byte[] Imagen;
    private int Oferta;

    public Productos(int Id, String Nombre, String Marca, int Cantidad, String Color, double Precio, String Descripcion, byte[] Imagen, int Oferta) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Marca = Marca;
        this.Cantidad = Cantidad;
        this.Color = Color;
        this.Precio = Precio;
        this.Descripcion = Descripcion;
        this.Imagen = Imagen;
        this.Oferta = Oferta;
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

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public byte[] getImagen() {
        return Imagen;
    }

    public void setImagen(byte[] Imagen) {
        this.Imagen = Imagen;
    }



    public int getOferta() {
        return Oferta;
    }

    public void setOferta(int Oferta) {
        this.Oferta = Oferta;
    }

    @Override
    public String toString() {
        return "Productos{" + "Id=" + Id + ", Nombre=" + Nombre + ", Marca=" + Marca + ", Cantidad=" + Cantidad + ", Color=" + Color + ", Precio=" + Precio + ", Descripcion=" + Descripcion + ", Imagen=" + Imagen + ", Oferta=" + Oferta + '}';
    }

    

   
    

   
    
    
}
