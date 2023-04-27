package eje6.pkg6;

import Entidades.Cafetera;
import Servicio.CafeteraServicio;
import static Servicio.CafeteraServicio.llenarCafetera;

import java.util.Scanner;

public class Eje66 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        CafeteraServicio Ce = new CafeteraServicio();
        Cafetera C1 = Ce.crearCafetera();

        System.out.println("-------------------------");

        boolean bandera;
        bandera = true;
        String respuesta;

        while (bandera) {

            System.out.println("1 == Llenar cafetera a su capacidad maxima");
            System.out.println("2 == Servir taza");
            System.out.println("3 == Vaciar cafetera");
            System.out.println("4 == Agregar Cafe");
            System.out.println("5 == Salir");
            System.out.println("");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    llenarCafetera(C1);
                    System.out.println();
                    break;
                case 2:
                    Ce.servirTaza(C1);
                    System.out.println("");
                    break;
                case 3:
                    Ce.vaciarCafetera(C1);
                    System.out.println("");
                    break;
                case 4:
                    Ce.agregarCafe(C1);
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("salir: ");
                    System.out.println("Desea confirmar salir ?\n presione S");

                    respuesta = leer.next();
                    respuesta = respuesta.toLowerCase();

                    if ("s".equals(respuesta)) {
                        bandera = false;
                        System.out.println("");
                    }

                    break;
            }
        }
    }

}
