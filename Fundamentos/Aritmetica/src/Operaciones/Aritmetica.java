package Operaciones;

public class Aritmetica {
    //atributos
    int a; //Valor por default de int es 0
    int b;
    
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
