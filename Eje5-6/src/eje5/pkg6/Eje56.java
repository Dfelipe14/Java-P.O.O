package eje5.pkg6;

import Entidades.Cuenta;
import Servicio.CuentaServicios;
import java.util.Scanner;

public class Eje56 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        CuentaServicios Cs = new CuentaServicios();
        Cuenta C1 = Cs.crearCuenta();

        int opcion;
        String respuesta;
        boolean bandera;
        bandera = true;

        while (bandera) {

            System.out.println("1 == Ingresar Saldo");
            System.out.println("2 == Retirar Saldo");
            System.out.println("3 == Extraccion Rapida");
            System.out.println("4 == Consultar Saldo");
            System.out.println("5 == Consultar Datos");
            System.out.println("6 == Salir");
            
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    Cs.Ingresar(C1);
                    System.out.println();
                    break;
                case 2:
                    Cs.Retirar(C1);
                    System.out.println();
                    break;
                case 3:
                    Cs.extraccionRapida(C1);
                    System.out.println();
                    break;
                case 4:
                    Cs.consultarSaldo(C1);
                    System.out.println();
                    break;
                case 5:
                    Cs.consultarDatos(C1);
                    break;
                case 6:
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
