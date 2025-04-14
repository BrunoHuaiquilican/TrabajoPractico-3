package oop2.tp3.ejercicio1;

public class LibroRegulares extends Libro{

    private static final double COBRO_ALQUILER = 2;
    public LibroRegulares(String nombre , int codigoPrecio) {
        super(nombre , codigoPrecio);
    }
    @Override
    public double calcularPrecio(int diasAlquiler){
        double monto = 2 ;
        if (diasAlquiler > 2){
        monto =+diasAlquiler * COBRO_ALQUILER  ;
        }
        return monto ;
    }
}
