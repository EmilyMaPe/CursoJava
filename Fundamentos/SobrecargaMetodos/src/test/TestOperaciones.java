package test;

import operaciones.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {
        //Como los metodos que usaremos son estaticos podemos mandarlos
        //llamar directamente
        var resultado = Operaciones.sumar(5, 3);
        System.out.println("resultado = " + resultado);
        //La variables resultado ya no funciona por que es de tipo entero
        //resultado = Operaciones.sumar(2.0,3);
        var resultado2 = Operaciones.sumar(2.0,3D);
        System.out.println("resultado2 = " + resultado2);
        
        //Al tener un tipo de dato long no se puede asignar a un tipo int
        //por lo que se ejecutara el de tipo double
        var resultado3 = Operaciones.sumar(3, 5L);
        System.out.println("resultado3 = " + resultado3);
    }
}
