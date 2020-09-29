
import java.util.Scanner;

/*
En el siguiente ejercicio se solicita calcular el área y el perímetro de un 
Rectángulo, para ello deberemos crear las siguientes variables:
alto (int)
ancho (int)
El usuario debe proporcionar los valores de largo y ancho, y después se debe
imprimir el resultado en el siguiente formato(no usar acentos y respetar los 
espacios, mayúsculas, minúsculas y saltos de línea):

Proporciona el alto:
Proporciona el ancho:
Area: <area>
Perimetro: <perimetro>

Las fórmulas para calcular el área y el perímetro de un Rectángulo son:
Área: alto * ancho
Perímetro: (alto + ancho) * 2
*/
public class Rectangulo {
    public static void main(String args[]){
        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona el alto:");
        int alto = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el ancho:");
        int ancho = Integer.parseInt(consola.nextLine());
        System.out.println("Area: " + (alto * ancho));
        System.out.println("Perimetro: " + ((alto + ancho) * 2));
    }
}
