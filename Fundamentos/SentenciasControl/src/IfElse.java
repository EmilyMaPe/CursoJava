
public class IfElse {

    public static void main(String args[]) {
        //IF-ELSE
        var condicion = true;
        if (condicion) {
            System.out.println("Condicion verdadera");
        } else {
            System.out.println("Condicion falsa");
        }
        //Ejercicio identifica el numero
        var numero = 10;
        var numeroTexto = "Numero no encontrado";
        if (numero == 1) {
            numeroTexto = "Numero uno";
        } else if (numero == 2) {
            numeroTexto = "Numero dos";
        } else if (numero == 3) {
            numeroTexto = "Numero tres";
        } else if (numero == 4) {
            numeroTexto = "Numero cuatro";
        }
        System.out.println("numeroTexto = " + numeroTexto);
        //Ejercicio estaciones del año
        int mes = 10;
        var estacion = "Estacion desconocida";
        if(mes == 1 || mes == 2 || mes == 12){
            estacion = "Invierno";
        }else if (mes == 3 || mes == 4 || mes == 5){
            estacion = "Primavera";
        }else if (mes == 6 || mes == 7 || mes == 8){
            estacion = "Verano";
        }else if(mes == 9 || mes == 10 || mes == 11){
            estacion = "Otonio";
        }
        System.out.println("estacion = " + estacion);
    }
}
