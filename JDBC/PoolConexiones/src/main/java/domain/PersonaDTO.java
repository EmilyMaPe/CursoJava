package domain;
//Esta clase representa un registro de la tabla persona de nuestra BD
//La usaremos para recuperar, insertar, modificar, eliminar y mostrar informacion
//A esta clase se le conoce como clase de entidad ya que tiene una
//representacion en BD
public class PersonaDTO {
    //Atributos y tipos de dato segun los tengamos en la BD
    //Recordemos que la nomenclatura en java no usa guion bajo
    private int idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    
    //Constructores de la clase
    public PersonaDTO() {
    }
    //Si necesitamos eliminar un registro nos basta con el idPersona
    public PersonaDTO(int idPersona) {
        this.idPersona = idPersona;
    }
    //Para insertar un nuevo Registro no necesitamos ingresar el idPersona
    public PersonaDTO(String nombre, String apellido, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }
    //Para modificar un registro necesitamos todos los atributos
    public PersonaDTO(int idPersona, String nombre, String apellido, String email, String telefono) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    public PersonaDTO(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    //Get and Set
    public int getIdPersona() {
        return this.idPersona;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefono() {
        return this.telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    //Metodo toString() para imprimir el estado del objeto
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona[idPersona=").append(idPersona);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", email=").append(email);
        sb.append(", telefono=").append(telefono);
        sb.append(']');
        return sb.toString();
    }
    
}
