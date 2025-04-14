package oop2.tp3.ejercicio2;

import oop2.tp3.ejercicio1.*;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ejercicio1Test {
    @Test
    public void testPruevaClases(){
        Libro elTunel = new LibroRegulares("El Tunel", 45);
        Libro antesDelFin = new LibroRegulares("Antes del Fin ", 55);
        CopiaLibro copiaLibroElTunel = new CopiaLibro(elTunel);
        CopiaLibro copiaLibroAntesDelFin = new CopiaLibro(antesDelFin);
        Alquiler alquilerElTunel = new Alquiler(copiaLibroElTunel , 5);
        Alquiler alquilerAntesDelFin = new Alquiler(copiaLibroAntesDelFin , 3);
        Cliente yo = new Cliente("Bruno");
        yo.alquilar(alquilerAntesDelFin);
        yo.alquilar(alquilerElTunel);
        Object [] resultado = yo.calcularDeudaYPuntosObtenidos();
        double esperado1 = 10 ;
        int esperado2 = 2 ;
        assertEquals(esperado1 , resultado[0]);
        assertEquals(esperado2 ,resultado[1] );
    }
}
