public class Primitivos {
    public static void main(String args[]){
        /*
            tipos primitivos enteros: 
                byte 8 bits -128 a 127
                short 16 bits -32,768 32767
                int 32 bits --> El mas comun -2 a la 31 a (2 a la 31) -1
                long 64 bits   -2 a la 63 a (2 a la 63) - 1 
        */
        //Byte
        byte numeroByte = (byte)129; //Conversion de tipos
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte " + Byte.MAX_VALUE);
        //Short
        short numeroShort = (short)32768;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo short: " + Short.MAX_VALUE);
        //Enteros
        int numeroInt = (int)2147483648L; //Conversion a long con 'L' al final
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int: " + Integer.MAX_VALUE);
        //Long
        long numeroLong = (long)9223372036854775807L; 
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor minimo long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo long: " + Long.MAX_VALUE);
        /*
            tipos primitivos flotantes(decimal):
                float 32 bits 
                double 64 bits
        */
        //Float
        float numeroFloat = 3.4028235E38F;//literal flotante con 'F'
        System.out.println("numeroFloat = " + numeroFloat);
        numeroFloat = (float)3.4028236E38D; //literal double con 'D'
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor minimo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo float: " + Float.MAX_VALUE);
        //Double es el tipo mas grande en java
        double numeroDouble = 10; //double acepta numeros enteros
        System.out.println("numeroDouble = " + numeroDouble);
        numeroDouble = 1.7976931348623157E308D;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo double: " + Double.MAX_VALUE);
        /*
            tipo primitivo char 16 bits 
            caracteres unicode
        */
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);
        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);
        char carCharDecimal = 33;
        System.out.println("carCharDecimal = " + carCharDecimal);
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        //Trabajando con var
        var varChar1 = '\u0021';
        System.out.println("varChar1 = " + varChar1);
        var carCharDecimal2 = 33; //Literal de tipo entero
        System.out.println("carCharDecimal2 = " + carCharDecimal2);
        var varCharDecimal = (char)33; //Conversion de tipo a char
        System.out.println("varCharDecimal = " + varCharDecimal);
        var varCharSimbolo3 = '!';
        System.out.println("varCharSimbolo3 = " + varCharSimbolo3);  
        
        //Conversion de tipo char a entero
        int variableEnteraSimbolo = '!';
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);
        int letra = 'A';
        System.out.println("letra = " + letra);
        /*
            tipo primitivo booleano: true o false
        */
        boolean varBoolean = true; //bandera
        System.out.println("varBoolean = " + varBoolean);
        //varBoolean = false;
        //System.out.println("varBoolean = " + varBoolean);
        if(varBoolean){
            System.out.println("La bandera es verdadera");
        }else{
            System.out.println("La bandera es falsa");
        }
        
        //Ejercicio persona mayor de edad
        var edad = 30;
        //edad = 10;
        //var esAdulto = edad >=18;
        //if(esAdulto){
        if(edad >=18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
    }
}
