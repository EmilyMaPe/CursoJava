package palabraThis;
public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Perez");
        System.out.println("persona = " + persona);
        System.out.println("persona nombre:" + persona.nombre);
        System.out.println("persona nombre:" + persona.apellido);
    }
}

class Persona{
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){
        //super(); //llamada al constructo de la clase Padre(Object)
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona: " + this);
        new Imprimir().imprimir(this);
    }
}
class Imprimir{
    public void imprimir(Persona persona){
        System.out.println("persona desde imprimir" + persona);
        //Aqui apunta a imprimir por lo que this aqui es una instancia Imprimir
        System.out.println("imprecion del objeto actual(this):" + this);
    }
}
