package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.*;

public class TestManejoUsuarios {

    public static void main(String[] args) {
        //Creamos el objeto para realizar las sentencias DML
        UsuarioDAO usuarioDao = new UsuarioDAO();
        System.out.println("INSERTs");
        //INSERT
        usuarioDao.insertar(new Usuario("emily", "pass"));
        usuarioDao.insertar(new Usuario("erick", "pass1"));
        //SELECT
        System.out.println("SELECT");
        List<Usuario> usuarios = usuarioDao.seleccionar();
        usuarios.forEach(usuario ->{
            System.out.println("usuario = " + usuario);
        });
        //UPDATE
        System.out.println("UPDATE y SELECT");
        usuarioDao.actualizar(new Usuario(2,"erick", "cambiopass"));
        //SELECT
        usuarios = usuarioDao.seleccionar();
        usuarios.forEach(usuario ->{
            System.out.println("usuario = " + usuario);
        });
        //DELETE
        System.out.println("DELETE y SELECT");
        usuarioDao.eliminar(new Usuario(1));
        //SELECT
        usuarios = usuarioDao.seleccionar();
        usuarios.forEach(usuario ->{
            System.out.println("usuario = " + usuario);
        });
        
    }
}
