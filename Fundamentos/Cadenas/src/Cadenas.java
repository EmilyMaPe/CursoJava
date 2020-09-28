public class Cadenas {
    public static void main(String args[]){
        //Concatenacion de Cadenas -> Union de cadenas con '+'
        var usuario = "Juan";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        //Para dar formato al codigo -> click derecho -> Format
        
        var i = 3;
        var j = 4;
        System.out.println(i + j); //Suma de numeros
        //izq a der hay primero numeros realiza una suma y luego concatenacion
        System.out.println(i + j + usuario);  
        //izq a der encuentra primero cadena todo lo demas lo toma como cadena
        System.out.println(usuario + i + j);
        //Podemos cambiar la salida con el uso de parentesis
        System.out.println(usuario + (i + j));
        
        //Caracteres especiales
        var nombre = "Karla";
        //Salto de linea '\n'
        System.out.println("Nueva linea: \n" + nombre);
        //Tabulador \t
        System.out.println("Tabulador: \t" + nombre);
        //Retroceso \b (regresa una posicion)
        System.out.println("Retroceso: \b\b" + nombre);
        //Comilla simple y doble \' \"
        System.out.println("Comilla simple: \'" + nombre + "\'");
        System.out.println("Comilla doble: \"" + nombre + "\"");
    }
}
