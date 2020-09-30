package domain;

public class Persona {

    //Los atributos privados no se heredan
    //Para que se hereden deben ser protected
    //Al usar insert code y encapsular atributos cambia a provate
    //Hay que regresarlo a protected para poder usar herencia
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;
    //Constructor vacio
    public Persona() {

    }
    //Constructor para inicializar nombre
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    //Constructor completo
    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona[nombre=").append(nombre);
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append(", direccion=").append(direccion);
        //Informacion de la clase object
        sb.append(",\n\t\t").append(super.toString());
        sb.append(']');
        return sb.toString();
    }

    
    
    
    

}
