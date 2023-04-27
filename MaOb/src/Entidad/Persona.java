package Entidad;

public class Persona {

    //Atributos
    public String nombre;
    public int edad;
    public String domicilio;
    public float altura;
    public String fecha;
    public String genero;
    public String sexo;

    //Metodos- Constructor
    public Persona() {
this.nombre = "";
        this.edad=0;
        this.domicilio="";
    }

    public Persona(String name) {
        this.nombre = name;
        
    }
      public Persona(String name,int edad,float altura) {
        this.nombre = name;
        this.edad=edad;
        this.altura=altura;
    }

}
