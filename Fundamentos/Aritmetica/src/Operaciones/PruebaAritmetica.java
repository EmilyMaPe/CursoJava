package Operaciones;

public class PruebaAritmetica {
    //Un metodo estatico no tiene acceso al operador this
    public static void main(String[] args) {
        //Crear instancia con el uso de contructor
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 2;
        aritmetica1.sumar();
        
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado desde clase de prueba = " + resultado);
        
        resultado = aritmetica1.sumarConArgumentos(5, 8);
        System.out.println("resultado usando argumentos = " + resultado);
        
        //Usando constructor vacio
        Aritmetica aritmetica2 = new Aritmetica();
        //Imprimir atributos de nuestra instancia
        System.out.println("aritmetica2 a: " + aritmetica2.a);
        System.out.println("aritmetica2 b: " + aritmetica2.b);
        
        //Usando constructor con argumentos
        Aritmetica aritmetica3 = new Aritmetica(5, 8);
        System.out.println("aritmetica3 a: " + aritmetica3.a);
        System.out.println("aritmetica3 b: " + aritmetica3.b);
        
    }
}
