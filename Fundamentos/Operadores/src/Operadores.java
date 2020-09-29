public class Operadores {

    public static void main(String args[]) {
        System.out.println("\n******Operadores Aritmeticos");
        int a = 3, b = 2;
        //Suma
        var resultado = a + b;
        System.out.println("resultado suma = " + resultado);
        //resta
        resultado = a - b;
        System.out.println("resultado resta = " + resultado);
        //multiplicacion
        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);
        //Division para que sea division necesitas al menos un flotante o double
        var resultado2 = 3D / b;
        System.out.println("resultado division = " + resultado2);
        //Modulo: residuo de la division a / b
        resultado = a % b;
        System.out.println("resultado modulo= " + resultado);
        if (b % 2 == 0) {
            System.out.println("Es numero par");
        } else {
            System.out.println("Es numero impar");
        }

        System.out.println("\n*******Operadores de asignacion");
        // =
        int c = a + 5 - b;
        System.out.println("c = " + c);
        //a = a + 1 --> a+=1
        a *= 1;
        System.out.println("a = " + a);
        a += 3;
        System.out.println("a = " + a);
        //a -= 2 --> a = a - 2
        a -= 2;
        System.out.println("a = " + a);
        //a *= 2 --> a = a *2
        a *= 2;
        System.out.println("a = " + a);
        //a /= 1 --> a = a /1
        a /= 1;
        System.out.println("a = " + a);
        // a %= 2 --> a = a % 2
        a %= 2;
        System.out.println("a = " + a);

        System.out.println("\n****Operadores Unarios");
        a = 3;
        b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Negacion");
        var d = true;
        var e = !d;
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("Preincremento");
        var f = 3;
        var g = ++f;//Primero incrementa f y despues utiliza su valor
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("Postincremento");
        f = 5;
        g = f++; //Primero se asigna y despues se incrementa
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("predecremento");
        f = 4;
        g = --f;
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("postdecremento");
        f = 5;
        g = f--;
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("\n******Operadores relacionales");
        a = 3;
        b = 2;
        //Igualdad ==, a es igual a b? --> a == b
        d = (a == b);
        System.out.println("d = " + d);
        //Diferente a !=, a es diferente a b? --> a != b 
        d = (a != b);
        System.out.println("d = " + d);
        //Cadenas no se usa == o !=
        var cadena1 = "Hola";
        var cadena2 = "Hola";
        d = (cadena1 == cadena2); //Se compara referencias de objetos
        System.out.println("d = " + d);
        d = cadena1.equals(cadena2); //Compara contenido de las cadenas
        System.out.println("d = " + d);

        d = a >= b;
        System.out.println("d = " + d);
        System.out.println("*****Operadores Condicionales");
        //And y Or
        var x = 8;
        var valorMinimo = 0;
        var valorMaximo = 10;
        //AND --> && ambos tienen que cumplirse para ser verdadero
        //Verificar que x este en el rango de minimo a maximo
        d = x >= valorMinimo && x <= valorMaximo;
        if (d) {
            System.out.println("Dentro del rango");
        } else {
            System.out.println("Fuera de rango");
        }
        var vacaciones = true;
        var diaDescanso = false;
        //OR --> || una condicion se tiene que cumplir para ser verdadero
        if (vacaciones || diaDescanso) {
            System.out.println("Padre puede asistir al juego del hijo");
        } else {
            System.out.println("El padre esta ocupado");
        }
        System.out.println("****Operador Ternario");
        //Condicion ? true : false
        var operadorTernario = (1 > 2) ? "Verdad" : "Falso";
        System.out.println("operadorTernario = " + operadorTernario);
        var numero = 9;
        operadorTernario = (numero % 2 == 0) ? "Numero par" : "Numero impar";
        System.out.println("operadorTernario = " + operadorTernario);
        
        System.out.println("****Prioridad operadores");
         x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        var resultado1 = 4 + 5 * 6 / 3;//4 + ((5*6)/3)
        System.out.println("resultado = " + resultado1);//14
        
        resultado = (4 + 5) * 6 / 3;
        System.out.println("resultado = " + resultado1);
    }
}
