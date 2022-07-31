package UI;

import util.Consola;
import static UI.UIAgenciaEspacial.menuAgenciaEspacial;
import static UI.UINaveEspacial.menuNaveEspacial;

import java.util.Scanner;

public class UIMenu {

     public static void mostrarMenu(){
        int option = 0;
        boolean condition = true;

        while (condition){
            Consola.escribir("---SELECCIONE UNA OPCION---");
            Consola.escribir("[1]. Agencia Espacial");
            Consola.escribir("[2]. Naves espaciales");
            Consola.escribir("[0]. Salir");
            Consola.escribir("---------------------------");

            Consola.escribirSinSaltar("Opcion: ");
            option = Consola.leerEntero();

            switch (option) {
                case 1 -> menuAgenciaEspacial();
                case 2 -> menuNaveEspacial();
                case 0 -> condition = false;
                default -> System.out.println("-- Opcion incorrecta !!--");
            }
        }




    }

}
