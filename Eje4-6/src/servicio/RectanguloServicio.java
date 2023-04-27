package servicio;

import entidades.Rectangulo;
import java.util.Scanner;

public class RectanguloServicio {

    Scanner leer = new Scanner(System.in);

    public Rectangulo creaRectangulo() {

        Rectangulo R1 = new Rectangulo();

        System.out.println("Ingresar la altura");
        R1.setAltura(leer.nextInt());

        System.out.println("Ingresar la base");
        R1.setBase(leer.nextInt());

        return R1;
    }

    public void Superficie1(Rectangulo super1) {
        float superficie;

        superficie = super1.getAltura() * super1.getBase();
        System.out.println("La superficie es: " + superficie);
    }

    public void Perimetro(Rectangulo Per1) {
        float perimetro;

        perimetro = Per1.getAltura() * 2 + Per1.getBase() * 2;
        System.out.println("El perimetro es: " + perimetro);

    }
public void Dibujo(Rectangulo Di){
   
    for (int i = 0; i < Di.getAltura(); i++) {
        
        for (int j = 0; j < Di.getBase(); j++) {
            System.out.print("* ");
        }
        System.out.println(" ");
    }
    
    
    
}
    
    
    
}
