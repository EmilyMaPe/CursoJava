
import java.util.Scanner;

public class DetalleLibro {
    public static void main(String args[]){
        //Crear Scanner
        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona el titulo:");
        //Leer el titulo
        var titulo = consola.nextLine();
        System.out.println("Proporciona el autor:");
        //Leer el autor
        var autor = consola.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
    }
}
