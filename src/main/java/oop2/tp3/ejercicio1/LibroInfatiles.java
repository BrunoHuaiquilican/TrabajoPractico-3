package oop2.tp3.ejercicio1;

public class LibroInfatiles extends Libro{
    private static final double COBRO_ALQUILER = 1.5 ;
    public LibroInfatiles(String nombre , int codigoPrecio) {
        super(nombre, codigoPrecio);
    }
    @Override
    public double calcularPrecio(int diasAlquiler){
        double monto = 1.5 ;
        if (diasAlquiler > 3) {
            monto =+ diasAlquiler * COBRO_ALQUILER ;
        }
        return monto ;
    }
}
