package Clases;

import Naves.NaveEspacial;

import java.util.ArrayList;
import java.util.Iterator;

public class AgenciaEspacial {
    private String nombreAgencia;
    private ArrayList<NaveEspacial> listDeNaves;

    public AgenciaEspacial(){
        this.listDeNaves = new ArrayList<>();
    }

    public AgenciaEspacial(String nombreAgencia) {
        this.nombreAgencia = nombreAgencia;
        this.listDeNaves = new ArrayList<>();
    }

    public void asignarNave(NaveEspacial nave) {
        this.listDeNaves.add(nave);
    }



    public NaveEspacial buscarNave(String idNave) {
        NaveEspacial naveEncontrada = null;
        Iterator<NaveEspacial> i = this.listDeNaves.iterator();
        while (i.hasNext() && naveEncontrada == null) {
            NaveEspacial nave = i.next();
            if (nave.getIdNave().equalsIgnoreCase(idNave)) {
                naveEncontrada = nave;
            }
        }
        return naveEncontrada;
    }

    public void listarNaves() {
        if (listDeNaves.isEmpty()) {
            System.out.println("Aun no hay naves");
        } else {
            for (NaveEspacial nave : listDeNaves) {
                System.out.println(nave);
            }
        }
    }

    @Override
    public String toString() {
           return "AgenciaEspacial: " + nombreAgencia +
               "\n<--Lista de Naves en operacion:-->" +
               "\n" + listDeNaves;
    }
}
