package Naves;

import Clases.Proposito;
import Clases.TipoCombustible;

public abstract class NaveEspacial {

   private String idNave;
   private String nombre;
   private int velocidad;
   private int empuje;
   private int peso;
   private TipoCombustible combustible;
   private Proposito proposito;

    public NaveEspacial(String idNave,String nombre, int empuje, int peso, TipoCombustible combustible, Proposito proposito){
        this.idNave = idNave;
        this.nombre = nombre;
        this.empuje = empuje;
        this.peso = peso;
        this.combustible = combustible;
        this.proposito = proposito;
    }

    public abstract void despegar();


    public String getIdNave() {
        return idNave;
    }

    @Override
    public String toString() {
        return  "\nNombre: " + nombre +
                "\nId_Nave: " + idNave +
                "\nVelocidad: " + velocidad +
                "\nEmpuje: " + empuje +
                "\nPeso: " + peso +
                "\nCombustible: " + combustible +
                "\nProposito: " + proposito;
    }
}
