package Entidades;

public class Cafetera {
//ATRIBUTOS

    private int capacidadMaxima;
    ////(la cantidad máxima de café que puede contener la cafetera)
    private int cantidadActual;
    ////cantidadActual (la cantidad actual de café que hay en la cafetera).

    //CONSTRUCTOR
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public Cafetera() {
    }
    //METODOS SETTER AND GETTER

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

}
