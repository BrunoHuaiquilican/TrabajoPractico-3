package oop2.tp3.ejercicio3;

public class Cena extends Gasto {

    public Cena(int monto) {
        super(monto);
    }
    @Override
    public  String  informacion(){
        return "Cena" ;
    }
    @Override
    public boolean esComida(){
        return true ;
    }
}
