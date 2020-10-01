package mx.EmilyMadrigal.mundopc;

public class Raton extends DispositivosEntrada{
    private final int idRaton;
    private static int contadorRatones;
    
    public Raton(String tipoEntrada,String marca){
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Raton[idRaton=").append(idRaton).append(", ");
        sb.append(super.toString());
        sb.append(']');
        return sb.toString();
    }
}
