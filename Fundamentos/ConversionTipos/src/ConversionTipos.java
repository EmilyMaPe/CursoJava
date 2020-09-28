
import java.util.Scanner;

public class ConversionTipos {
    public static void main(String args[]){
        //Convertir tipo String a un tipo int
        //var edad = "20"; //String
        var edad = Integer.parseInt("20"); //int
        System.out.println("edad = " + (edad + 1));
        
        //Convertir tipo String a un tipo Double
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        //Ejercicio
        Scanner consola = new Scanner(System.in);
//        System.out.println("Proporciona tu edad:");
//        edad = Integer.parseInt(consola.nextLine());
//        System.out.println("edad = " + edad);
        
        //Convertit tipo int a un tipo String
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        //Recuperar un caracter de una cadena
        var caracter = "hola".charAt(0);
        System.out.println("caracter = " + caracter);
        
        System.out.println("Proporciona un caracter");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
        
    }
}
