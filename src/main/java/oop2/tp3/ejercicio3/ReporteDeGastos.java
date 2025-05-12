package oop2.tp3.ejercicio3;

import java.time.LocalDate;
import java.util.List;

public class ReporteDeGastos {

    public static final int MONTO_MAXIMO = 5000;
    public static final int MONTO_MINIMO = 1000;

    public String imprimir(List<Gasto> gastos) {
        int total = 0;
        int gastosDeComida = 0;

        String fechaExpenses = "Expenses " + LocalDate.now();

        for (Gasto gasto : gastos) {
//            if (gasto.tipoGasto == TipoDeGasto.CENA || gasto.tipoGasto == TipoDeGasto.DESAYUNO) {
//                gastosDeComida += gasto.montoGasto();
//            }
            if(gasto.esComida()){
                gastosDeComida += gasto.montoGasto();
            }
            String nombreGasto = gasto.informacion();

//            String nombreGasto = "";
//            switch (gasto.tipoGasto) {
//                case CENA:
//                    nombreGasto = "Cena";
//                    break;
//                case DESAYUNO:
//                    nombreGasto = "Desayuno";
//                    break;
//                case ALQUILER_AUTO:
//                    nombreGasto = "Alquiler de Autos";
//                    break;
//            }

//            String marcaExcesoComidas = gasto.tipoGasto == TipoDeGasto.CENA && gasto.monto > 5000
//                    || gasto.tipoGasto == TipoDeGasto.DESAYUNO && gasto.monto > 1000 ? "X" : " ";
            String marcaExcesoComidas = marcarComoExeso(gasto);

//            String mostrarNombreGasto= nombreGasto + "\t" + gasto.monto + "\t" + marcaExcesoComidas);
//            System.out.println(nombreGasto + "\t" + gasto.monto + "\t" + marcaExcesoComidas);
            total += gasto.monto;
        }

        return fechaExpenses + "\n"+"Gastos de comida:"+gastosDeComida+"\n"+"Total de gastos:"+total;

//        System.out.println("Gastos de comida: " + gastosDeComida);
//        System.out.println("Total de gastos: " + total);
    }

    private String marcarComoExeso(Gasto gasto) {
        String marcaExcesoComidas = gasto.esComida() && gasto.monto > MONTO_MAXIMO ||
                gasto.esComida() && gasto.monto > MONTO_MINIMO ? "X" : " ";
        return marcaExcesoComidas;
    }
}
