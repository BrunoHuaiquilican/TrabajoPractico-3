package oop2.tp3.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private List<Alquiler> alquileres = new ArrayList<Alquiler>();
    private String name;

    public Cliente(String nombre) {
        this.name = nombre;
    }

    public Object[] calcularDeudaYPuntosObtenidos() {
        Object[] resultado = new Object[2];
        double total = 0;
        int puntosAlquilerFrecuente = 0;
        for (Alquiler alquiler : alquileres) {

            total =  alquiler.copia().libro().calcularPrecioLibro(alquiler.diasAlquilados());
// determine amounts for each line
//            switch (alquiler.copia().libro().codigoPrecio()) {
//                case Libro.REGULARES:
//                    monto += 2;
//                    if (alquiler.diasAlquilados() > 2)
//                        monto += alquiler.copia().libro().calcularPrecio(alquiler.diasAlquilados() - 2);
//                    break;
//                case Libro.NUEVO_LANZAMIENTO:
//                    monto += alquiler.copia().libro().calcularPrecio(alquiler.diasAlquilados());
//                    break;
//                case Libro.INFANTILES:
//                    monto += 1.5;
//                    if (alquiler.diasAlquilados() > 3)
//                        monto += alquiler.copia().libro().calcularPrecio(alquiler.diasAlquilados()-3);
//                    break;
//            }
            puntosAlquilerFrecuente += alquiler.copia().libro().calcularPunto(alquiler.diasAlquilados());
            // bonus por dos días de alquiler de un nuevo lanzamiento
//            if ((alquiler.copia().libro() == Libro.NUEVO_LANZAMIENTO)
//                    && alquiler.diasAlquilados() > 1) {
//                puntosAlquilerFrecuente++;
//            }
        }
        resultado[0] = total;
        resultado[1] = puntosAlquilerFrecuente;
        return resultado;
    }

    public void alquilar(Alquiler rental) {
        alquileres.add(rental);
    }
}