package Servicio;

import Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {

    Scanner leer = new Scanner(System.in);

    public Cafetera crearCafetera() {
        Cafetera C1 = new Cafetera();

        System.out.println("----Iniciando Cafetera----");

        C1.setCantidadActual(0);
        System.out.println("La cantidad actual de la cafetera es: " + C1.getCantidadActual());

        C1.setCapacidadMaxima(100);
        System.out.println("La capacidad maxima es: " + C1.getCapacidadMaxima());

        return C1;
    }

    public static void llenarCafetera(Cafetera capacidad) {
        int cantidad;
        System.out.println("La cantidad Actual es: " + capacidad.getCantidadActual() + " puede llenarse al 100");

        capacidad.setCantidadActual(100);
        System.out.println("Se lleno la Cafetera: " + capacidad.getCantidadActual());

    }

    public void servirTaza(Cafetera servir) {
        double taza;
        System.out.println("Ingresar la cantidad a servir");
        taza = leer.nextDouble();
        if (taza > servir.getCantidadActual()) {
            System.out.println("Cafe insuficiente se sirvio: " + servir.getCantidadActual());
            servir.setCantidadActual(0);

        } else {

            servir.setCantidadActual((int) (servir.getCantidadActual() - taza));

        }
        System.out.println("Se sirvio, le quedan a la cafetera: " + servir.getCantidadActual());

    }

    public void vaciarCafetera(Cafetera vaciar) {
        int vacio;
        System.out.println("La cantidad Actual es: " + vaciar.getCantidadActual());

        vaciar.setCantidadActual(0);
        System.out.println("Se vacio la Cafetera: " + vaciar.getCantidadActual());
    }

    public void agregarCafe(Cafetera agregar) {
        int agr;

        System.out.println("Para agregar cafe inserte la cantidad que va usar, hay en la cafetera: " + agregar.getCantidadActual());

        agr = leer.nextInt();
        agregar.setCantidadActual(agr+agregar.getCantidadActual());
        
        System.out.println("Se agrego correctamente: "+agregar.getCantidadActual());
    }

}
