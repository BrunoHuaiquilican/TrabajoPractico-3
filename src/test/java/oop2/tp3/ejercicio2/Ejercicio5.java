package oop2.tp3.ejercicio2;

import oop2.tp3.ejercicio5.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ejercicio5 {

    @Test
    public void test01(){

        var eventos = cargarEventos();
        var factura = crearFactura();

        String esperado ="Facturación para c1\nEscuela de Rock: 156400.0. Asientos: 158\n"+
                "Hamlet: 113000.0. Asientos: 103\nEl Perfume: 40000.0. Asientos: 8\n"+
                "Monto ganado: 309400.0\nCréditos ganados: 232.0 ";
//        String esperado = new Calculador().reporte(factura, eventos);

        assertEquals(esperado , new Calculador().reporte(factura, eventos));

    }
    private static List<Evento> cargarEventos() {
        return List.of(
                new Comedia("Escuela de Rock") ,
                new Drama("Hamlet") ,
                new Drama("El Avion") ,
                new Comedia("Cantando en la playa") ,
                new Drama("El Perfume")
        );

//                new Evento("Escuela de Rock", "Comedia"),
//                new Evento("Hamlet", "Drama"),
//                new Evento("El Avion", "Dram"),
//                new Evento("Cantando en la playa", "Comedia"),
//                new Evento("El Perfume", "Drama")
//        );
    }
    private static Factura crearFactura() {
        return new Factura("c1", List.of(new Actuacion("Escuela de Rock", 158),
                new Actuacion("Hamlet", 103),
                new Actuacion("El Perfume", 8)));
    }
}
