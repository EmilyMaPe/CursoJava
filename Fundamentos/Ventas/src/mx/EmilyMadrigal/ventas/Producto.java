package mx.EmilyMadrigal.ventas;

public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;
    
    private Producto(){
        
    }
    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
        this.idProducto = ++Producto.contadorProductos;
    }

    public int getIdProducto() {
        return this.idProducto;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto[idProducto=").append(idProducto);
        sb.append(", nombre=").append(nombre);
        sb.append(", precio=").append(precio);
        sb.append(']');
        return sb.toString();
    }
    
    
}
