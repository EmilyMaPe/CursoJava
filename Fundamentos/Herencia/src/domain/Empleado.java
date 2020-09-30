package domain;
//Herencia hay que especificar de que clase esta heredando atributos
//Esto se hace con la palabra reservada extends
//Todas las clases que no se especifican de que clase heredan
//heredan de la clase Object
public class Empleado extends Persona{
    //Si esta clase ya no va a tener subclases ya podemos usar private
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;


    public Empleado(String nombre, double sueldo) {
        //Los constructores no se heredan
        //Pero se puedo hacer uso con la palabra reservada super
        //Y los argumentos del constructor que queremos heredar
        super(nombre);
        this.idEmpleado = ++Empleado.contadorEmpleado;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado[idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        //Informacion de la clase Persona
        sb.append(",\n\t\t").append(super.toString());
        sb.append(']');
        return sb.toString();
    }
    
    
    
    
    
}
