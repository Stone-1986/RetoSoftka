package UI;

import Clases.Proposito;
import Clases.TipoCombustible;
import Naves.Lanzadera;
import Naves.NaveEspacial;
import Naves.NaveTripulada;
import Naves.Robot;
import util.Consola;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class UINaveEspacial {

    private static final List<NaveEspacial> listNaves = new ArrayList<>();

    public static void menuNaveEspacial (){
        int option = 0;
        boolean condition = true;

        while (condition){
            Consola.escribir("---SELECCIONE UNA OPCION---");
            Consola.escribir("[1]. Crear Lanzador");
            Consola.escribir("[2]. Crear Robot");
            Consola.escribir("[3]. Crear Nave Tripulada");
            Consola.escribir("[4]. lista de naves");
            Consola.escribir("[0]. Salir");
            Consola.escribir("---------------------------");
            Consola.escribirSinSaltar("Opcion: ");
            option = Consola.leerEntero();

            switch (option){
                case 1, 2, 3 ->{
                   NaveEspacial nuevaNave = crearNaveEspacial(option);
                   listNaves.add(nuevaNave);
                   Consola.escribir("--NAVE ESPACIAL CREADA");
                   Consola.escribir(nuevaNave);
                }
                case 4 ->listarNaves(listNaves);
                case 0 -> condition = false;
                default -> System.out.println("-- Opcion incorrecta !!--");
            }
        }
    }

    public static List<NaveEspacial> getListNaves() {
        return listNaves;
    }

    public static NaveEspacial crearNaveEspacial(int option){

        NaveEspacial nuevaNave = null;
        Consola.escribir("---INFORMACION TECNICA---");
        String id = Consola.leer("idNave: ");
        String nombre = Consola.leer("Nombre Nave: ");
        int empuje = Consola.leerEntero("Empuje: ");
        int peso = Consola.leerEntero("Peso: ");
        TipoCombustible combustible = tipoCombustible();
        Proposito proposito = proposito();


        switch (option){
            case 1 -> {
                int altura = Consola.leerEntero("Altura: ");
                int capacidad = Consola.leerEntero("Capacidad de carga: ");
                Consola.escribir("---------------------------");
                nuevaNave = new Lanzadera(id, nombre, empuje, peso, combustible,proposito,altura,capacidad);
            }
            case 2 -> {
                String destino = Consola.leer("Destino: ");
                Consola.escribir("---------------------------");
                nuevaNave = new Robot(id, nombre, empuje, peso, combustible,proposito,destino);
            }
            case 3 -> {
                int tripulacion = Consola.leerEntero("Capacidad de Tripulantes: ");
                int orbita = Consola.leerEntero("Orbita: ");
                Consola.escribir("---------------------------");
                nuevaNave = new NaveTripulada(id, nombre, empuje, peso, combustible,proposito, tripulacion,orbita);
            }
        }
        return nuevaNave;
    }

    public static TipoCombustible tipoCombustible() {

        String combustible = Consola.leer("Tipo de combustible: ");
        TipoCombustible tipoCombustible = TipoCombustible.valueOf(combustible.toUpperCase(Locale.ROOT));
        TipoCombustible comb = null;

        switch (tipoCombustible) {
            case CELDAS -> comb = TipoCombustible.CELDAS;
            case QUEROSENO_H -> comb = TipoCombustible.QUEROSENO_H;
            case SOLIDO_N -> comb = TipoCombustible.SOLIDO_N;
            case MONOMETILHIDRICA -> comb = TipoCombustible.MONOMETILHIDRICA;
            case HIDRAZINA -> comb = TipoCombustible.HIDRAZINA;
        }
        return comb;
    }

    public static Proposito proposito(){
        String pro = Consola.leer("Proposito: ");
        Proposito proposito = Proposito.valueOf(pro.toUpperCase(Locale.ROOT));
        Proposito tipoProposito = null;
        switch (proposito){
            case LANZAR_CARGA -> tipoProposito = Proposito.LANZAR_CARGA;
            case VEHICULO_TRASFERENCIA -> tipoProposito = Proposito.VEHICULO_TRASFERENCIA;
            case EXPLORACION_REMOTA -> tipoProposito =  Proposito.EXPLORACION_REMOTA;
            case MISION_TRIPULADA -> tipoProposito =  Proposito.MISION_TRIPULADA;
            case LAB_CIENCIA_TRIPULADO -> tipoProposito = Proposito.LAB_CIENCIA_TRIPULADO;
            case MANTENIMIENTO -> tipoProposito = Proposito.MANTENIMIENTO;
        }
        return tipoProposito;
    }

    public static void listarNaves(List<NaveEspacial> listNaves){
        Consola.escribir("--LISTADO DE NAVES--");
         if (listNaves.isEmpty()) {
            System.out.println("Aun no hay naves");
        } else {
            for (NaveEspacial nave : listNaves) {
                System.out.println(nave);
            }
        }
    }

}
