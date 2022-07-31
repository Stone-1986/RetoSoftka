package Naves;

import Clases.Proposito;
import Clases.TipoCombustible;

public class Lanzadera extends NaveEspacial{

    private int altura;
    private int capacidadCarga;


    public Lanzadera(String idNave, String nombre, int empuje, int peso, TipoCombustible combustible, Proposito proposito, int altura, int capacidadCarga) {
        super(idNave, nombre, empuje, peso, combustible, proposito);
        this.altura = altura;
        this.capacidadCarga = capacidadCarga;
    }


    @Override
    public void despegar(){
        System.out.println("1.Asignar Plataforma");
        System.out.println("2.Cargando combustible");
        System.out.println("3.Asegurar carga");
        System.out.println("4. Despegue");
    }

    @Override
    public String toString() {
        return  "\n-----------" +
                "\n<--Lanzadera-->" +
                "\nAltura: " + altura +
                "\nCapacidad de Carga:" + capacidadCarga +
                super.toString();
    }
}
