package Servicio;

import Entidades.Operacion;
import java.util.Scanner;

public class OperacionServicio {

    Scanner leer = new Scanner(System.in);

    public Operacion crearOperacion() {

        Operacion P1 = new Operacion();

        System.out.println("Ingresar el primer numero");
        P1.setNumero1(leer.nextInt());
        System.out.println("Ingresar el segundo numero");
        P1.setNumero2(leer.nextInt());

        return P1;
    }

    public void Suma(Operacion sum) {
        float suma;

        suma = sum.getNumero1() + sum.getNumero2();
        System.out.println("La suma es: " + suma);
    }

    public void Resta(Operacion res) {
        float resta;

        resta = res.getNumero1() - res.getNumero2();
        System.out.println("La resta de ambos numeros es: " + resta);
    }

    public float multiplicacion(Operacion res) {

        if ((res.getNumero1() == 0) || (res.getNumero2() == 0)) {
            System.out.println("No es posible multiplicar con 0 Intente con otro valor");
            return 0;
        } else {

            return res.getNumero1() * res.getNumero2();

        }
    }

    public float division(Operacion div) {
        if ((div.getNumero1() == 0) || (div.getNumero2() == 0)) {

            System.out.println("No es posible dividir con 0 Intente con otro valor");
            return 0;
            
        }
        else if(div.getNumero1()>=div.getNumero2()){

            return div.getNumero1() / div.getNumero2();

        }
        System.out.println("No es Posible completa la operacion con el dividendo mayor");
        return 0;
    }
}

