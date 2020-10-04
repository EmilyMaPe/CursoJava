package test;

import datos.Conexion;
import datos.UsuarioDAO;
import domain.Usuario;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestManejoUsuarios {

    public static void main(String[] args) {
        //Declaramos la conexion y la inicializamos con null
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            UsuarioDAO usuarioDao = new UsuarioDAO(conexion);
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }
            //Probar que funciona las transacciones y el rollback
//            usuarioDao.insertar(new Usuario("Emily", 
//                    "123456789541265452354*+5446123456dfgjkdieytd58444*"));
            var select = usuarioDao.seleccionar();
            System.out.println("select = " + select);
            System.out.println("Se ha hecho el commit");
            conexion.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Entro el rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace();
            }
        }
        
    }
}
