

package Servicio;

import Entidad.Persona;
import java.util.Scanner;


public class PersonaServicio {

    Scanner leer=new Scanner(System.in);
    
    public Persona crearPersona(){
        Persona P1=new Persona();
       
       System.out.println("Nombre: ");
       P1.setNombre(leer.next());
        System.out.println("Edad: ");
        P1.setEdad(leer.nextInt());
        System.out.println("Sexo: ");
        P1.setSexo(leer.next());
        System.out.println("Peso: ");
        P1.setPeso(leer.nextInt());
        System.out.println("Altura: ");
        P1.setAltura(leer.nextDouble());
        return P1;
    }
    
    
}
