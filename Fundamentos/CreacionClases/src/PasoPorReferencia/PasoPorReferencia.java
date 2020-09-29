package PasoPorReferencia;
//Usar clases de otro paquete
//import paquete,clase;
import Clases.Persona;
public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        //Para poder acceder a los atributos tenemos que poner public
        //en los atributos
        persona1.nombre = "Juan";
        System.out.println("persona1 nombre: " + persona1.nombre);
        //Persona1 guarda la referencia que almacena el objeto
        cambiarValor(persona1);
        System.out.println("persona1 cambio de nombre: " + persona1.nombre);
    }
    //persona recibira la referencia por lo que estaran apuntando al 
    //mismo objeto, por lo que los cambios se veran reflejados en persona1
    public static void cambiarValor(Persona persona){
        persona.nombre = "Karla";
    }
}
