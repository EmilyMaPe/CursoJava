package Operaciones;

public class PruebaAritmetica {
    //Un metodo estatico no tiene acceso al operador this
    public static void main(String[] args) {
        //Crear instancia
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 2;
        aritmetica1.sumar();
        
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado desde clase de prueba = " + resultado);
        
        resultado = aritmetica1.sumarConArgumentos(5, 8);
        System.out.println("resultado usando argumentos = " + resultado);
    }
}
