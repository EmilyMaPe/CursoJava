//La primer linea deber ser el paquete
package test;
//Importar clase de utileria
//import mx.EmilyMadrigal.Utileria;
//Podemos hacer el import de la siguiente manera para usar directamente el metodo
//Para esto es importante la palabra static en el imoport
import static mx.EmilyMadrigal.Utileria.imprimir;
public class TestUtileria {
    public static void main(String[] args) {
        //Debido a que el metodo imprimir es estaico lo podemos usar
        //Sin crear un objeto de la clase Utileria
        //Utileria.imprimir("Hola");
        //import static
        //imprimir("Hola");
        //Podemos hacer uso del metodo sin import
        mx.EmilyMadrigal.Utileria.imprimir("Adios");
    }
}
