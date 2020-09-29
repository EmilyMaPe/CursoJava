package test;

import domain.Persona;

public class PersonaPrueba {
    private int contador;
    
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        Persona persona2 = new Persona("Karla");
        //Para poder llamar metodos desde un metodo estatico
        //El metodo a llamar tiene que ser estatico
        Imprimir(persona1); 
        Imprimir(persona2);
        //Variable no estatica no puede usarse dentro de un contexto estatico
        //Ni puede hacerce uso de this en el contexto estatico
        //this.contador = 10;
    }
    public static void Imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
}
