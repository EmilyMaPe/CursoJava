/*
    Crea una clase de prueba para crear un objeto de tipo caja que tenga como 
    valores: ancho = 3, alto = 2, profundo = 6 y que mande a imprimir el volumen
    de la caja segun los valores proporcionados anteriormente
 */
package Clases;

public class PruebaCaja {
    public static void main(String[] args) {
        Caja caja1 = new Caja(3,2,6);
        int volumen = caja1.calcularArea();
        System.out.println("volumen = " + volumen);
    }
}
