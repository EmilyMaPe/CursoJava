package domain;

public class Persona {

    private int idPersona;
    private String nombre;
    //Contar cuantos objetos de tipo personas se han creado
    //Esta variable se asocia con la clase y no con el objeto
    //Si la variable no fuera static no guarda la continuidad de los valores
    //Cada que se crea un objeto la variable se reiniciaria
    private static int contadorPersonas;
    
    public Persona(String nombre) {
        this.nombre = nombre;
        //Incrementar el contador por cada objeto nuevo
        //No se usa el operador this para variables estaticas
        //En su lugar se usara el nombre de la clase
        Persona.contadorPersonas++;
        //Asignar el nuevo valor a la variable persona
        this.idPersona = Persona.contadorPersonas;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int aContadorPersonas) {
        contadorPersonas = aContadorPersonas;
    }
    //notacion -> estamos sobreescribiendo el metodo toString()
    @Override
    public String toString() {
        return "Persona[" + "idPersona=" + idPersona + 
                ", nombre=" + nombre + ']';
    }
    

}
