package datos;

import static datos.Conexion.*;
import domain.Usuario;
import java.sql.*;
import java.util.*;

public class UsuarioDAO {
    //Sentencias DML
    private static final String SQL_SELECT = "SELECT "
            + "id_usuario, usuario, password FROM usuario";
    private static final String SQL_INSERT = "INSERT INTO "
            + "usuario(usuario, password) VALUES(?,?);";
    private static final String SQL_UPDATE = "UPDATE usuario SET usuario = ?,"
            + " password = ? WHERE id_usuario = ?;";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE "
            + "id_usuario = ?;";

    //SELECT a la Base de Datos
    public List<Usuario> seleccionar(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = null;
        List<Usuario> usuarios = new ArrayList<>();
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            //Obtener datos del SELECT de cada registro
            while(rs.next()){
                int idUsuario = rs.getInt("id_usuario");
                String usuario1 = rs.getString("usuario");
                String password = rs.getString("password");
                usuario = new Usuario(idUsuario, usuario1, password);
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            try {
                //Cerrar conexiones abiertas
                close(rs);
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return usuarios;
    }
    //INSERT a la base de datos --> regresa el numero de registros hechos
    public int insertar(Usuario usuario){
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            //Preparar la sentencia
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            //INSERT en la Base de Datos y asignar el numero de registros hechos
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return registros;
    }
    //UPDATE a la Base de Datos
    public int actualizar(Usuario usuario){
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            //Preparar la sentencia con los datos
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            //Llave primaria del registro a modificar
            stmt.setInt(3, usuario.getIdUsuario());
            //UPDATE a la Base de Datos
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return registros;
    }
    //DELETE a la Base de Datos
    public int eliminar(Usuario usuario){
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn= getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            //Prepara la sentencia
            //Llave primaria del registro a eliminar
            stmt.setInt(1, usuario.getIdUsuario());
            //DELETE a la Base de Datos
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return registros;
    }
}
