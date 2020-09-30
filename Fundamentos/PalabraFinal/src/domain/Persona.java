package domain;
//Uso de final en clases
//No pudimos extender la clase Empleado desde la clase Persona
public final class Persona {
    
    //Final static --> constante -->
    //Las constantes se identifican en mayuscula
    //Si es de mas de dos palabras se usa guion bajo para separarlas
    public final static  int MI_CONSTANTE = 1;
    
    private String nombre;
    
    //Uso de final en metodos
    public final void imprimir(){
        System.out.println("Metodo imprimir");
    }
    //Las clases hijas no pueden cambiar el comportamiento de este metodo

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}

