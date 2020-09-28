
public class Variables {

    public static void main(String args[]) {
        //Especificar tipo de dato , nombre de la variable, asignar valor
        //Camel case
        //Definimos la variable
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        //Al modificar la variable ya no se necesita especificar el tipo de dato
        miVariableEntera = 5;
        //atajo para imprimir -> escribir 'sout' y presionar tab
        System.out.println(miVariableEntera);
        //Cadenas tipo de dato(clase) -> String
        String miVariableCadena = "Saludos";
        //mostrar variables definitas ctrl + espacio
        System.out.println(miVariableCadena);
        //Ejercicio : cambiar valor a Adios e imprimir
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);
        //Java puede inferir el tipo de dato usando var a partir del jdk 10
        //Var infiere a partir de la literal(valor) de la variable
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);
        //Ejercicio crear variable tipo cadena 
        var miVariableCadena2 = "Nueva Cadena";
        //Atajo imprimir ultima variable usada + valor de la ultima variable
        //soutv + tab
        System.out.println("miVariableCadena2 = " + miVariableCadena2);

        //Reglas para definir una variable en JAVA
        //El primer caracter es minuscula y no usar acentos(solo letras a-z)
        //Otros caracteres permitidos para primir caracter : _ y $
        //Mas de una palabra a partir de la 2a se usa la primer letra mayuscula
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;
    }
}
