package operaciones;

public class Operaciones {
    //Al sobrecargar metodos al igual que constructores la diferencia sera
    //el numero de argumentos y/o el tipo de retorno
    public static int sumar(int a, int b){
        System.out.println("sumar(int a, int b)");
        return a + b;
    }
    //Puede variar unicamente el tipo de regreso
    public static double sumar(double a, double b){
        System.out.println("sumar(double a, double b)");
        return a + b;
    }
    //Como los metodos son estaticos no hay necesidad de crear el objeto
}
