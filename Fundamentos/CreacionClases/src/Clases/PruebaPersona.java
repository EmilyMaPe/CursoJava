package Clases;

public class PruebaPersona {
    //psvm + tab
    public static void main(String[] args) {
        //Crear objetos
        //Un objeto es una variable del tipo de la clase
        //Clase nombreObjeto = new Clase(); la ultima parte es el constructor
        Persona persona1 = new Persona();
        //acceder a atributos con operador punto
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        //acceder a metodos con operador punto y parentesis al final
        persona1.desplegarInformacion();
        
        //Creamos un nuevo objeto
        //Un objeto se conoce como 'instancia' de clase
        Persona persona2 = new Persona();
        //Se imprime el paquete.clase@referenciaMemoriaObjeto
        System.out.println("persona2 = " + persona2);
        //Si no asignamos valores a los atributos se les asigna null por default
        persona2.desplegarInformacion();
        persona2.nombre = "Karla";
        persona2.apellido = "Lara";
        persona2.desplegarInformacion();
    }
}
