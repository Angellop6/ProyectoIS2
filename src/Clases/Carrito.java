
package Clases;

public class Carrito {
    private int Id;
    private int cantidad;
    private float total;
    private int idUsuario;
    private int IdProducto;

    public Carrito(int Id, int cantidad, float total, int idUsuario, int IdProducto) {
        this.Id = Id;
        this.cantidad = cantidad;
        this.total = total;
        this.idUsuario = idUsuario;
        this.IdProducto = IdProducto;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    @Override
    public String toString() {
        return "Carrito{" + "Id=" + Id + ", cantidad=" + cantidad + ", total=" + total + ", idUsuario=" + idUsuario + ", IdProducto=" + IdProducto + '}';
    }

   

    

  
    
    
    
}
