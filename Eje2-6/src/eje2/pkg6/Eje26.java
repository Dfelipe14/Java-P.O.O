//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
//tipo real. A continuación, se deben crear los siguientes métodos:
//a) Método constructor que inicialice el radio pasado como parámetro.
//b) Métodos get y set para el atributo radio de la clase Circunferencia.
//c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
//objeto.
//d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
//e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).
package eje2.pkg6;

import Entidades.Circunferencia;
import java.util.Scanner;

public class Eje26 {

    public static void main(String[] args) {

        Circunferencia Cir1 = crearCircunferencia();
        Area(Cir1);
        Perimetro(Cir1);
    }

    public static Circunferencia crearCircunferencia() {
        Scanner leer = new Scanner(System.in);

        Circunferencia C1 = new Circunferencia();

        System.out.println("indique el Radio");
        C1.setRadio(leer.nextFloat());

        return C1;

    }

    public static void Area(Circunferencia Cir2) {
        float area;

        area = (float) (Math.PI * Cir2.getRadio() * Cir2.getRadio());
        System.out.println("El Area es: " + area);
    }

    public static void Perimetro(Circunferencia Per) {
        float perimetro;

        perimetro = (float) (Math.PI * Per.getRadio() * 2);
        System.out.println("El perimetro es: " + perimetro);
    }

}
