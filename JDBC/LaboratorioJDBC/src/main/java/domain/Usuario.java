package domain;

public class Usuario {
    //Atributos
    private int idUsuario;
    private String usuario;
    private String password;
    //Constructores
    public Usuario(){
        
    }
    //Si necesitamos eliminar un usuario nos basta con el id
    public Usuario(int idUsuario){
        this.idUsuario = idUsuario;
    }
    //Para insertar un registro no necesitamos el id
    public Usuario(String usuario, String password){
        this.usuario = usuario;
        this.password = password;
    }
    //Para modificar un registro necesitamos todos los atributos
    public Usuario(int idUsuario, String usuario, String password) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.password = password;
    }
    //Getters y Setters
    public int getIdUsuario() {
        return this.idUsuario;
    }
    public String getUsuario() {
        return this.usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    //Metodo toString()

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario{idUsuario=").append(idUsuario);
        sb.append(", usuario=").append(usuario);
        sb.append(", password=").append(password);
        sb.append('}');
        return sb.toString();
    }
}
