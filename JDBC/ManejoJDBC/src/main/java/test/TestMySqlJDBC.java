package test;

import java.sql.*;

public class TestMySqlJDBC {

    public static void main(String[] args) {
        //Cadena de conexion a MySQL
        //jdbc:mysql://localhost:3306/baseDatos?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true
        var url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
            //La siguiente linea solo es necesaria para trabajar con
            //aplicaciones web, para proyectos locales no es requerida
            //Class.forName(com.mysql.cj.jdbc.Driver);
            //Conectarnos a la base de datos
            //Connection conexion = Driver.getConnection(cadenaConexion, usuario, contraseña);
            Connection conexion = DriverManager.getConnection(url, "root", "esteesmipass");
            //La siguiente variable nos permitira crear sentencias de SQL
            Statement query = conexion.createStatement();
            //Query ejemplo
            var sql = "SELECT * FROM persona";
            //Ejecutar query con nuestra variable query
            ResultSet resultado = query.executeQuery(sql);
            //Iterar resultados mientras haya registros del query 
            //guardados en nuestra variable resultado
            while (resultado.next()) {
                //Podemos obtener la columna por indice o por nombre de la columna
                //Lo mas recomendable es que sea por nombre
                //Depende del tipo de dato el tipo de get
                //Enteros --> getInt
                System.out.print("Id Persona: " + resultado.getInt("id_persona"));
                //Cadenas o varchar --> getString
                System.out.print(" Nombre: " + resultado.getString("nombre"));
                System.out.print(" Apellido: " + resultado.getString("apellido"));
                System.out.print(" Email: " + resultado.getString("email"));
                System.out.print(" Telefono: " + resultado.getString("telefono"));
                System.out.println("");
            }
            //Es importante cerrar los objetos creados en orden inverso
            resultado.close();
            query.close();
            conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        //Esta exception es para la clase en caso de usar aplicaciones web
//        catch (ClassNotFoundExcepetion ex) {
//            ex.printStackTrace(System.out);
//        } 

        //
    }
}
