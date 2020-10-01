package mx.EmilyMadrigal.mundopc;

public class Orden {
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;
    
    public Orden(){
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
        this.idOrden = ++Orden.contadorOrdenes;        
    }
    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
            this.computadoras[this.contadorComputadoras++] = computadora;
        }
    }
    public void mostrarOrden(){
        System.out.println("Id Orden: #" + this.idOrden +
                "\nComputadoras de la orden:");
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println("\t" + (int)(i+1) + ". " + 
                    this.computadoras[i]);
        }
    }
}
