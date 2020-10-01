package mx.EmilyMadrigal.ventas;

public class Orden {
    private int idOrden;
    private Producto productos[]; 
    private static int contadorOrdenes;
    private static final int MAX_PRODUCTOS = 10;
    private int contadorProductos;
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }
    
    public void agregarProducto(Producto producto){
        if(this.contadorProductos < Orden.MAX_PRODUCTOS){
            this.productos[this.contadorProductos++] = producto;
        }else{
            System.out.println("Se ha superado el maximo de productos: " +
                    Orden.MAX_PRODUCTOS);
        }
    }
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            total += this.productos[i].getPrecio();
        }
        return total;
    }
    public void mostrarOrden(){
        System.out.println("Id Orden: " + this.idOrden + 
                "\nTotal de la orden: $" + this.calcularTotal() + 
                "\nProductos de la orden: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println("\t"+ (int)(i+1) + ". " + this.productos[i]);
        }
    }
}
