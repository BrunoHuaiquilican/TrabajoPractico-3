package oop2.tp3.ejercicio5;

public class Comedia extends Evento{

    public Comedia(String nombreEvento) {
        super(nombreEvento);
    }
    public float calcularMonto(int numeroEsperctadores){
        float monto = 3000;
        if (numeroEsperctadores > 20) {
            monto += 10000 + 500 * (numeroEsperctadores - 20);
        }
        return monto += 300 * numeroEsperctadores;
    }
    public float calcularCredito(int numeroEspectadores){
        return (float) Math.floor( numeroEspectadores / 5);

    }
}
