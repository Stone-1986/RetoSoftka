package Naves;

import Clases.Proposito;
import Clases.TipoCombustible;

public class Robot extends NaveEspacial{

    private String destino;

    public Robot(String idNave, String nombre, int empuje, int peso, TipoCombustible combustible, Proposito proposito, String destino) {
        super(idNave, nombre, empuje, peso, combustible, proposito);
        this.destino = destino;
    }
    @Override
    public void despegar(){
        System.out.println("1. Calibrar Instrumentos");
        System.out.println("2. Desplegar propulsores");
        System.out.println("3. Fijar Curso");
        System.out.println("4. Despegue");
    }
    @Override
    public String toString() {
        return "\n-----------" +
               "\n<--Robot-->" +
               "\nDestino='" + destino +
               super.toString();
    }
}
