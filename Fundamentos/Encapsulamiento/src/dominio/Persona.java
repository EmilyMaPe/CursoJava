//Paquete dominio --> Clases que resuelven el problema
package dominio;

public class Persona {
    //private --> Otras clases no pueden acceder ni modificar los atributos
    private String nombre;
    private double sueldo;
    private boolean eliminado;
    
    //Constructor
    public Persona(String nombre, double sueldo, boolean eliminado){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }
    //atajo --> Click derecho, insert code, getter 
    //Metodo get Nombre
    public String getNombre(){
        return this.nombre;
    }
    //Metodo Set Nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    //Metodo get Sueldo
    public double getSueldo(){
        return this.sueldo;
    }
    //Metodo Set Sueldo
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    //Metodo get Eliminado --> Para Boolean es is
    public boolean isEliminado(){
        return this.eliminado;
    }
    //Metodo Set Eliminado
    public void setNombre(boolean eliminado){
        this.eliminado = eliminado;
    }
    //toString
    //Imprimir el estado del objeto incluyendo cada uno de los atributos
    public String toString(){
        //NombreClase [ atributo: valor, ...]
        return "Persona[nombre: " + this.nombre +
                ", sueldo: " + this.sueldo +
                ", eliminado: " + this.eliminado + "]";
    }
    
    
}
