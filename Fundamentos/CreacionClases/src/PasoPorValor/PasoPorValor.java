package PasoPorValor;

public class PasoPorValor {
    public static void main(String[] args) {
        //Como es un metodo static los metodos que se llamen tiene que ser static
        var x = 10;
        System.out.println("x = " + x);
        //Se pasa una copia del valor de x no x como tal
        cambioValor(x);
        //Aun con el cambio de valor x se queda intacta
        System.out.println("x nuevo valor = " + x);
        
    }
    //El paso por valor es solo con tipos primitivos
    public static void cambioValor(int arg1){
        System.out.println("arg1 = " + arg1);
        //Solo modifica el valor de la varaible que recibe la copia de x
        arg1 = 15;
    }
}
