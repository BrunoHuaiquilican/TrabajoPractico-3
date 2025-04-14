package oop2.tp3.ejercicio1;

public  class LibroNuevoLanzamiento extends Libro{
    private static final int COBRO_ALQUILER = 3 ;
    public LibroNuevoLanzamiento(String nombre , int codigoPrecio) {
        super(nombre , codigoPrecio);
    }
    @Override
    public double calcularPrecio(int diasAlquiler){
        return diasAlquiler * COBRO_ALQUILER ;
    }

    @Override
    public int calcularPunto(int diasAlquilier){
        if(diasAlquilier > 1){
        return 2 ;
        }
        return 1;
    }
}
