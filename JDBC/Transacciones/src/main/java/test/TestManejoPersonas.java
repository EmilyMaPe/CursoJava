package test;

import datos.Conexion;
import datos.PersonaDAO;
import domain.Persona;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestManejoPersonas {

    public static void main(String[] args) {
        //Esta variable tiene que ser inicializada fuera del blocque try
        //Para que podamos usarla en el rollback si es necesario
        Connection conexion = null;
        //Con este codigo ya tenemos la conexion fuera de la clase PersonaDAO
        try {
            conexion = Conexion.getConnection();
            //Necesitamos que la conexion no haga autocommit
            //Haremos commit manualmente al acabar toda la transaccion
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            //Si no mandamos una conexion en el constructor
            //Se hara commit despues de cada sentencia
            //Sin la posibilidad de hacer commit manualmente o rollback
            PersonaDAO personaDao = new PersonaDAO(conexion);
            personaDao.actualizar(new Persona(2, "Karla Alejandra", "Gomez",
                    "kgomez@email.com", "5512345678"));
            //Para generar el fallo y probar el rollback
            //Pondremos mas de 45 caracteres en el largo del apellido
//            personaDao.insertar(new Persona("Carlos", 
//                    "Ramirez1234567891012345678901234567890123456789012"));
            personaDao.insertar(new Persona("Carlos", 
                    "Ramirez"));

            //Si todo funciona se hara un commit
            conexion.commit();
            System.out.println("Se ha hecho el commit de la transaccion");
            //Debemos quitar excepciones de los metodos DML --> en PersonaDAO
            //De lo contrario no se arrojara la excepcion de nuestro main
            //Y no hara rollback
            //Al quitar las excepciones solo ponemos que puede
            //arrojar una excepcion
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace();
            }
        }
    }
}
