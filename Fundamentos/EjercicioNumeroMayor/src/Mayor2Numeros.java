/*
    Solicitar al usuario dos valores:

numero1 (int)

numero2 (int)

Se debe imprimir el mayor de los dos números (la salida debe ser identica a la que sigue):

Proporciona el numero1:
Proporciona el numero2:
El numero mayor es:
<numeroMayor>
Puedes utilizar el IDE de tu preferencia para codificar la solución y después pegar tu solución en esta herramienta.
*/
import java.util.Scanner;
public class Mayor2Numeros {
    public static void main(String args[]){
        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona el numero1:");
        var numero1 = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el numero2:");
        var numero2 = Integer.parseInt(consola.nextLine());
        System.out.println("El numero mayor es:");
        var resultado = (numero1 > numero2) ? numero1 : numero2;
        System.out.println(resultado);
    }
}
