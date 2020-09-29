public class For {
    public static void main(String args[]){
        for(var contador = 0; contador < 3; contador++){
            System.out.println("contador = " + contador);
        }
        
        //Uso de Break y Continue
        //Break termina el ciclo si cumple una condicion
        System.out.println("***Break");
        for(var contador = 0; contador < 3; contador++){
            if(contador % 2 == 0){
                System.out.println("contador = " + contador);
                break;
            }
        }
        //Continue lo que resta del ciclo y sigue a la siguiente iteracion
        System.out.println("***Continue");
        for(var contador = 0; contador < 3; contador++){
            if(contador % 2 == 0){
                continue;
            }
            System.out.println("contador = " + contador);
        }
        /*
            Con el uso de etiquetas puedes romper ciclos anidados o indicar un 
        punto exacto
        se definen asi
        inicio:
        etiqueta:
        
        y se usan con continue y break
        continue etiqueta;
        break etiqueta;
        */
        
    }
}
