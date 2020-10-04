package datos;
//Para cada clase de entidad tendremos una clase DAO
//Data Access Object
//importar todos los metodos estaticos de la clase Conexion --> close()

import static datos.Conexion.*;
import domain.Persona;
import java.sql.*;
import java.util.*;

//Estas clases realizan las operaciones de
//SELECT, UPDATE, DELETE
//Sobre la clase de entidad
public class PersonaDAO {

    //Conexion transaccional
    //Se realizara la conexion fuera de esta clase, ahora en cada metodo
    //se probara si existe esa conexion y si no existe entonces se creara
    private Connection conexionTransaccional;
    public PersonaDAO() {
    }

    public PersonaDAO(Connection conexionTransaxional) {
        this.conexionTransaccional = conexionTransaxional;
    }


    //Definir las sentencias de SQL
    //Es bueno probar las sentencias fuera de java para comprobar que sea correcta
    private static final String SQL_SELECT = "SELECT id_persona, nombre,"
            + "apellido, email, telefono FROM persona;";
    //Se coloca ? para cada parametro de VALUES
    private static final String SQL_INSERT = "INSERT INTO persona(nombre,"
            + "apellido, email, telefono) VALUES(?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?,"
            + "apellido = ?, email = ?, telefono = ? WHERE id_persona = ?;";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE  "
            + "id_persona = ?";
    

    //Metodo que va a regresar una lista de objetos de tipo persona
    public List<Persona> seleccionar() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<>();

        try {
            //Conectarnos a base de datos
            //Si existe la conexion transaccional entonces ese metodo
            //no debe cerrar la conexion ya que en caso de hacerlo 
            // estaria cerrando toda la transaccion
            conn = this.conexionTransaccional != null
                    ? this.conexionTransaccional : Conexion.getConnection();
            //Realizando un prepared statement
            stmt = conn.prepareStatement(SQL_SELECT);
            //Ejecutamos query
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idPersona = rs.getInt("id_persona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                //Debido a que vamos a llenar con todos los atributos
                //utilizaremos el contructor completo
                persona = new Persona(idPersona, nombre, apellido, email, telefono);
                personas.add(persona);
            }
        } finally {
            try {
                //Este bloque se ejecuta siempre al terminar un bloque try-catch
                //Cerramos todo lo que abrimos
                close(rs);
                close(stmt);
                //Aqui preguntaremos de donde obtuvimos la conexion 
                //Para saber si cerrar las conexiones o no
                if (this.conexionTransaccional == null) {
                    close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return personas;
    }

    //Va a regresar el numero de registros modificados
    public int insertar(Persona persona) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null
                    ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            //Vamos a definir los parametros
            //(?,?,?,?)
            //(1,2,3,4)
            //(nombre, apellido, email, telefono)
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            //Ejecutar query
            //Modificar estado de la base de datos
            //executeUpdate puede realizar 3 tipos de sentecias:
            //INSERT, UPDATE y DELETE
            registros = stmt.executeUpdate();
        }finally {
            try {
                close(stmt);
                if (this.conexionTransaccional == null) {
                    close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return registros;
    }

    public int actualizar(Persona persona) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null
                    ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            //Vamos a definir los parametros
            //(nombre, apellido, email, telefono, id_persona)
            //(1,2,3,4,5)
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            stmt.setInt(5, persona.getIdPersona());
            //Ejecutar query
            //Modificar estado de la base de datos
            //executeUpdate puede realizar 3 tipos de sentecias:
            //INSERT, UPDATE y DELETE
            registros = stmt.executeUpdate();
        } finally {
            try {
                close(stmt);
                if (this.conexionTransaccional == null) {
                    close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return registros;
    }

    public int eliminar(Persona persona) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null
                    ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, persona.getIdPersona());
            registros = stmt.executeUpdate();
        }finally {
            try {
                close(stmt);
                if (this.conexionTransaccional == null) {
                    close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return registros;
    }
}
