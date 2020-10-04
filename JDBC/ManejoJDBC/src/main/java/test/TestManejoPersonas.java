package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.*;

public class TestManejoPersonas {
    public static void main(String[] args) {
        //Usaremos la clase DAO para ejecutar las sentencias sobre la clase entidad
        PersonaDAO personaDao = new PersonaDAO();
        
        
//        //Crear objeto de tipo persona
//        Persona personaNueva = new Persona("Carlos", "Esparza", 
//                "cesparza@mail.com", "5578945612");
//        //Insertar objeto en la base de datos
//        personaDao.insertar(personaNueva);
       
        //Modificar un objeto en la BD
//        Persona personaModificar = new Persona(6,"Juan Carlos", "Esparza",
//        "jcesparza@mail.com", "5578945612");
//        personaDao.actualizar(personaModificar);
        
        //ciclo for each para imprimir los objetos
////        for(Persona persona: personas){
////            System.out.println("persona = " + persona);
////        }
        //Eliminar persona
        Persona personaEliminar = new Persona(4);
        //personaDao.insertar(personaEliminar);
        personaDao.eliminar(personaEliminar);
        //Hay un bug que no carga la tabla actualizada en la primera corrida
        //Muestra las actualizaciones hasta la siguiente vez que se corre el codigo
        //Conversion de for each a funcion lambda
        List<Persona> personas = personaDao.seleccionar();
        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });
        
        //
    }
}
