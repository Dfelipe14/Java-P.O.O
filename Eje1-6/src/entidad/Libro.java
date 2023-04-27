
package entidad;


public class Libro {
    
    //Atributos
    private int isbn;
    private String Titulo;
    private String Autor;
    private int numeroDePagina;
    
    //Constructor

    public Libro(int isbn, String Titulo, String Autor, int numeroDePagina) {
        this.isbn = isbn;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.numeroDePagina = numeroDePagina;
        
    }

    public Libro() {
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumeroDePagina() {
        return numeroDePagina;
    }

    public void setNumeroDePagina(int numeroDePagina) {
        this.numeroDePagina = numeroDePagina;
    }

   
}
