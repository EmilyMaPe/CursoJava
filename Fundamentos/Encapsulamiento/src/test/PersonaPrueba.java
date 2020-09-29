//Paquete test --> Clases de prueba
package test;
// importar todas las clases de un paquete:
//import paquete.*;
import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        //Objeto o instancia persona 1
        Persona persona1 = new Persona("Juan", 5000.00, false);
        System.out.println("persona1: " + persona1.toString());
        //persona.  --> Ya no podemos acceder directamente a los atributos
        //Ya que tiene un modificador de acceso privado
        //Para modificar tenemos que hacer uso del metodo set
        persona1.setNombre("Juan Carlos");
        //Para recibir un atributo lo hacemos con el metodo get
//        System.out.println("persona1 nombre con cambio:" + persona1.getNombre());
//        System.out.println("persona1 sueldo: " + persona1.getSueldo());
//        System.out.println("persona1 eliminado:" + persona1.isEliminado());
        //Si el metodo toString() esta definido en la clase no es necesario
        //ponerlo ya que se llamara de manera automatica cuando se llama a la 
        //instancia dentro de print o println
        System.out.println("persona1: " + persona1);
    }
}
