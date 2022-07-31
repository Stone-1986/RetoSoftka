package Naves;

import Clases.Proposito;
import Clases.TipoCombustible;

public class NaveTripulada extends NaveEspacial{

    private int capacidadTripulantes;
    private int orbitaPlanetaria;

    public NaveTripulada(String idNave, String nombre, int empuje, int peso, TipoCombustible combustible,
                         Proposito proposito, int capacidadTripulantes, int orbitaPlanetaria) {
        super(idNave, nombre, empuje, peso, combustible, proposito);
        this.capacidadTripulantes = capacidadTripulantes;
        this.orbitaPlanetaria = orbitaPlanetaria;
    }

    @Override
    public void despegar(){
        System.out.println("1. Calibrar Instrumentos");
        System.out.println("2. Abrochar cinturones");
        System.out.println("3. Asegurar compuertas");
        System.out.println("4. Despegue");
    }

    @Override
    public String toString() {
        return "\n-----------" +
                "\n<--NaveTripulada-->" +
                "\nCapacidadTripulantes=" + capacidadTripulantes +
                "\nOrbitaPlanetaria=" + orbitaPlanetaria +
                super.toString();
    }
}
