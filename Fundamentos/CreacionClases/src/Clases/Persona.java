//Una clase la declararemos dentro de un paquete en este caso Clases
package Clases;
/*
Una clase es una plantilla puede tener atributos y metodos
    * Atributos: caracteristicas
    * Metodos: que puede hacer
Clase: Persona
Atributos: Nombre, Apellido
Metodos: desplegar Informacion
*/
public class Persona {
    //Atributos de la clase
    String nombre;
    String apellido;
    
    //Metodos de la clase
    //public quiere decir que lo podemos usar dentro y fuera de la clase
    //void nos dice que no regresa ningun tipo de informacion
    public void desplegarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }
}
//Es recomendable que el main este fuera de las clases que creemos.
//Por eso crearemos otra clase para la prueba