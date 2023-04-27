package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class Mascotapp {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Mascota m1 = new Mascota("Kovu Dante", "Negro", "perro");

        System.out.println( m1.nombre + " ");

        m1.setNombre("Pepe");
        
//     m1.apodo= "Orejas";
//     m1.nombre="Goofy";
//     m1.tipo="Perro";
//     m1.color="Blanco";
//     m1.edad=8;
//     m1.cola=true;
//     m1.raza="Puddle";
    }

}
