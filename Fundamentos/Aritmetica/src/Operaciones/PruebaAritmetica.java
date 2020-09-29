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
        
        //Definir variables locales
        //Var solo se puede usar con variables locales.No con atributos de clase
        var a = 10;
        var b = 2;
        miMetodo();
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
    //Para que pueda ser llamado por main tiene que ser static
    public static void miMetodo(){
        //La variable a creada enmain se destruye al finalizar el metodo
        //Por lo que no se pueden utilizar en otro metodo,
        //a = 10;
        System.out.println("Otro metodo");
    }
}
