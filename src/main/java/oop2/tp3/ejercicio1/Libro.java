package oop2.tp3.ejercicio1;

public abstract class Libro {

    private String nombre;
    private int codigoPrecio;

    public Libro(String nombre , int codigoPrecio) {
        this.nombre = nombre;
        this.codigoPrecio = codigoPrecio;
    }

    public abstract double calcularPrecio(int diasAlquiler);

    public int calcularPunto(int diasAlquilier){
        return 1 ;
    }

    public int codigoPrecio() {
        return codigoPrecio;
    }

    public String nombre() {
        return nombre;
    }
}