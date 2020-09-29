/*
    El objetivo del ejercicio es crear un sistema de calificaciones, como sigue:
El usuario proporcionará un valor entre 0 y 10.
Si está entre 9 y 10: imprimir una A
Si está entre 8 y menor a 9: imprimir una B
Si está entre 7 y menor a 8: imprimir una C
Si está entre 6 y menor a 7: imprimir una D
Si está entre 0 y menor a 6: imprimir una F
cualquier otro valor debe imprimir: Valor desconocido

*/
import java.util.Scanner;
public class SistemaCalificaciones {
    public static void main(String args[]){
        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona un valor entre 0 y 10");
        var resultado = "Valor desconocido";
        var calificacion = Double.parseDouble(consola.nextLine());
        if(calificacion >= 9 && calificacion <= 10){
            resultado = "A";
        }else if (calificacion < 9 && calificacion >= 8){
            resultado = "B";
        }else if (calificacion < 8 && calificacion >= 7){
            resultado = "C";
        }else if (calificacion < 7 && calificacion >= 6){
            resultado = "D";
        }else if (calificacion < 6 && calificacion >= 0){
            resultado = "F";
        }
        System.out.println(resultado);
    }
}
