package oop2.tp3.ejercicio5;

public abstract class Evento {

    private  String nombreEvento ;

    public Evento (String nombreEvento){
        this.nombreEvento = nombreEvento ;
    }

    public String nombreEvento(){
        return nombreEvento;
    }

    public abstract float calcularMonto(int numeroEspectadores);

    public abstract float calcularCredito(int numeroEspectadores);
}
