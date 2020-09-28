
import java.util.Scanner;

public class ClaseScanner {
    public static void main(String args[]){
        var usuario = "Carlos";
        System.out.println("usuario = " + usuario);
        //Obtener info del usuario
        System.out.println("Escribe tu nombre:");
        //importar Scanner
        //La variable consola se puede usar las veces que sean
        Scanner consola = new Scanner(System.in);
        //Leer una linea en la consola hasta que de enter
        var usuario1 = consola.nextLine();
        System.out.println("usuario1 = " + usuario1);
        System.out.println("Escribe el titulo: ");
        var titulo = consola.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario1);
    }
}
