package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        //Uso de la palabra final en variables
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        //Una vez que se le asigna el valor ya no se puede modificar
        //miVariable = 5;
        //Variables marcadas como final no se pueden modificar
        //Persona.MI_CONSTANTE = 15;
        System.out.println("Mi constante:" + Persona.MI_CONSTANTE);
        
        final Persona persona1 = new Persona();
        //No se puede asignar una nueva referencia a la persona1
        //Ya que se marco como final
        //persona1 = new Persona();
        persona1.setNombre("Juan");
        System.out.println("persona1 nombre: " + persona1.getNombre());
        //Si podemos cambiar los atributos de una instancia marcada como final
        //Lo que no se puede hacer es asignar un nuevo objeto a la variable
        persona1.setNombre("Carlos");
        System.out.println("persona1 nombre: " + persona1.getNombre());
    }
}
