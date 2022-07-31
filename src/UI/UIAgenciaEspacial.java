package UI;

import Clases.AgenciaEspacial;
import Naves.NaveEspacial;
import util.Consola;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import static UI.UINaveEspacial.getListNaves;

public class UIAgenciaEspacial {

     public static void menuAgenciaEspacial(){
        ArrayList<AgenciaEspacial> listaAgencias = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int option = 0;
        boolean condition = true;

        while (condition){
            Consola.escribir("---SELECCIONE UNA OPCION---");
            Consola.escribir("[1]. Crear agencia");
            Consola.escribir("[2]. Listar agencias");
            Consola.escribir("[3]. Asignar Nave Espacial");
            Consola.escribir("[0]. Salir");
            Consola.escribir("---------------------------");
            Consola.escribirSinSaltar("Opcion: ");
            option = in.nextInt();

            switch (option) {
                case 1 -> {
                    String agencia = Consola.leer("Ingrese nombre de la Agencia");
                    AgenciaEspacial nuevaAgencia = crearAgencia(agencia);
                    listaAgencias.add(nuevaAgencia);

                    NaveEspacial nave = identificarNave(getListNaves());
                    nuevaAgencia.asignarNave(nave);

                    nuevaAgencia.listarNaves();
                }
                case 2 -> listarAgencias(listaAgencias);
                case 3 -> Consola.escribir("Asignar nave espacial");
                case 0 -> condition = false;
                default -> System.out.println("-- Opcion incorrecta !!--");
            }
        }

    }
    public static AgenciaEspacial crearAgencia(String nombre){
        return new AgenciaEspacial(nombre);
    }
    public static void listarAgencias(List<AgenciaEspacial> listaAgencias){
        if (listaAgencias.isEmpty()) {
            System.out.println("Aun no hay agencias creadas......");
        } else {
            for (AgenciaEspacial agencia : listaAgencias) {
                System.out.println(agencia);
            }
        }
    }

    public static NaveEspacial identificarNave(List<NaveEspacial> listNaves){
        String idNave = Consola.leer("ingrese id de la Nave");
        NaveEspacial naveEncontrada = null;
        Iterator<NaveEspacial> i = listNaves.iterator();
        while (i.hasNext() && naveEncontrada == null) {
            NaveEspacial nave = i.next();
            if (nave.getIdNave().equalsIgnoreCase(idNave)) {
                naveEncontrada = nave;
            }
        }
        return naveEncontrada;
    }


}
