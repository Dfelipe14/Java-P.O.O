package Servicio;

import entidad.Libro;
import java.util.Scanner;

public class LibroService {

    Scanner leer = new Scanner(System.in);

    public Libro crearLibro() {

        Libro L1 = new Libro();

        System.out.println("Indique el autor");
        L1.setAutor(leer.next());

        System.out.println("Indique el codigo");
        L1.setIsbn(leer.nextInt());

        System.out.println("Indique el numero de pagina");
        L1.setNumeroDePagina(leer.nextInt());

        System.out.println("Indique el Titulo");
        L1.setTitulo(leer.next());

        return L1;
    }

    public void devuelveLibro(Libro Pepito) {

//        Pepito.getAutor();
        System.out.println("Autor: "+Pepito.getAutor());
        
//        Pepito.getIsbn();
        System.out.println("ISNB: "+Pepito.getIsbn());
        
//        Pepito.getNumeroDePagina();
        System.out.println("Numero De Pagina: "+Pepito.getNumeroDePagina());
        
//        Pepito.getTitulo();
        System.out.println("Titulo: "+Pepito.getTitulo());
        
        
    }

}
