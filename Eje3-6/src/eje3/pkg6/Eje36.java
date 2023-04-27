package eje3.pkg6;

import Entidades.Operacion;
import Servicio.OperacionServicio;
import java.util.Scanner;

public class Eje36 {

    Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        
        OperacionServicio Os = new OperacionServicio();

        Operacion op1=Os.crearOperacion();
        
        
       Os.Suma(op1);
       System.out.println("");
       Os.Resta(op1);
       System.out.println("");
        System.out.println("La multiplicacion es: "+Os.multiplicacion(op1)); 
        System.out.println("");
        System.out.println("La Division da como resultado: "+Os.division(op1));
    }

}
