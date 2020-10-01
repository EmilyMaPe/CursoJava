package test;

public class TestArreglos {
    public static void main(String[] args) {
        //Variable de tipo arreglo --> tipo object -->
        //se usa new tipo[#elementos]
        //Los arreglos no pueden crecer dinamicamente
        int edades[] = new int[3];
        System.out.println("edades = " + edades);
        
        //Modificar elementos del arreglo accediendo a ellos
        //arreglo[indice a modificar]
        edades[0] = 10;
        edades[1] = 20;
        edades[2] = 30;
        System.out.println("edades 0 = " + edades[0]);
        System.out.println("edades 1 = " + edades[1]);
        System.out.println("edades 2 = " + edades[2]);
        
        //Recorrer areglo
        for(int i = 0; i < edades.length; i++){
            System.out.println("edades elemento " + i + ": " + edades[i]);
        }
        
        //Inicializar arreglo con valores --> Sintaxis resumida
        String frutas[] = {"Naranja", "Platano", "Uva"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("fruta " + i + ": " + frutas[i]);
        }
        
         
        
        
    }
}
