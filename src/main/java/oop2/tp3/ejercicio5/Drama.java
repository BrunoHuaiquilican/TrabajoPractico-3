package oop2.tp3.ejercicio5;

public class Drama extends Evento{

    public Drama(String nombreEvento) {
        super(nombreEvento);
    }
    public float calcularMonto(int numeroEsperctadores){
        float monto = 40000;
        if(numeroEsperctadores > 30){
            monto+= 1000* (numeroEsperctadores - 30) ;
        }
        return monto;
    }
    public float calcularCredito(int numeroEspectadores) {
        return Math.max(numeroEspectadores - 30, 0);
    }
}
