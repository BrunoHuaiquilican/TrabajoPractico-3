package oop2.tp3.ejercicio2;

import oop2.tp3.ejercicio3.Desayuno;
import oop2.tp3.ejercicio3.Gasto;
import oop2.tp3.ejercicio3.ReporteDeGastos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;



public class Ejercicio2Test {

    @Test
    public void test1(){
        Gasto g1 = new Desayuno(1000);
        ReporteDeGastos reporte = new ReporteDeGastos();
//        reporte.imprimir(List.of(g1));
        String esperado = "Expenses 2025-04-28\nGastos de comida: 1000\nTotal de gastos:1000" ;
        assertEquals(esperado , reporte.imprimir(List.of(g1)));
//        Expenses 2025-04-27
//        Desayuno	1000
//        Gastos de comida: 1000
//        Total de gastos: 1000
    }
}
