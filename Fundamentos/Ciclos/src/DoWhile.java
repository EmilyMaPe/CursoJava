public class DoWhile {
    public static void main(String args[]){
        var contador = 0;
        //Primero ejecuta y despues comprueba
        do{
            System.out.println("contador = " + contador);
            contador++;
        }while(contador < 0);
    }
}
