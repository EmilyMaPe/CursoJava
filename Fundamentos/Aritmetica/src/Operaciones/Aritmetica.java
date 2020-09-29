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
    public int sumarConArgumentos(int arg1, int arg2){
        a = arg1;
        b = arg2;
        //return a + b;
        return sumarConRetorno();
    }
}
