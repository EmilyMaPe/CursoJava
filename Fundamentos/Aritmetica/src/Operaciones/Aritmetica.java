package Operaciones;

public class Aritmetica {
    //atributos
    int a; //Valor por default de int es 0
    int b;
    
    //Constructores
    //Un constructor tiene el mismo nombre de la clase
    //Solo se llama cuando se crea el objeto (con el uso de 'new')
    public Aritmetica(){
        System.out.println("Ejecuntando constructor");
    }
    
    //La sobrecarga de constructores es tener varios constructores
    //La diferencia de un constructor a otro son los argumentos que reciven
    //var no se puede usar para recibir argumentos en un metodo
    public Aritmetica(int a, int b){
        //Con ctrl click sobre una variable nos lleva a su definicion
        this.a = a;
        this.b = b;
        System.out.println("Constructor con argumentos");
    }
    
    //Metodo
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    public int sumarConRetorno(){
        return a + b;
    }
    //this hace referencia a los atributos de la clase
    public int sumarConArgumentos(int a, int b){
        this.a = a;
        this.b = b;
        //return a + b;
        return this.sumarConRetorno();
    }
}
