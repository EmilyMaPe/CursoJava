
public class Switch {

    public static void main(String args[]) {
        //Switch -> Bueno para la creacion de menus
        //Ejercicio Numero a texto
        var numero = 6;
        var numeroTexto = "Caso no encontrado";
        switch (numero) {
            case 1:
                numeroTexto = "Numero uno";
                break;
            case 2:
                numeroTexto = "Numero dos";
                break;
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                break;
        }
        System.out.println("numeroTexto = " + numeroTexto);
        //Ejercicio estaciones del año
        var mes = 10;
        var estacion = "Estacion desconocida";
        switch (mes) {
            case 1,2,12:
                estacion = "Invierno";
                break;
            case 3,4,5:
                estacion = "Primavera";
                break;
            case 6,7,8:
                estacion = "Verano";
                break;
            case 9,10,11:
                estacion = "Otonio";
                break;
        }
        System.out.println("estacion = " + estacion);
    }
}
