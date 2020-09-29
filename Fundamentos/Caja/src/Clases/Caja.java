/*
        Se solicita crear una clase llamada Caja con las sig caracteristicas:
            * Debe tener 3 atributos de tipo entero(ancho, alto, profundo)
            * Debe tener 2 constructores, uno vacio y uno con 3 argumentos, 
                uno por cada atributo de la clase
            * Debe tener el metodo que calcule el volumen de la caja segun la 
                la formula volumen = ancho * alto * profundo
*/

package Clases;

public class Caja {
    int ancho, alto, profundo;
    public Caja(){
        
    }
    public Caja(int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    public int calcularArea(){
        return ancho * alto * profundo;
    }
}
