package oop2.tp3.ejercicio3;

public class Desayuno extends Gasto{

    public Desayuno(int monto) {
        super(monto);
    }

    @Override
    public  String  informacion(){
        return "Desayuno" ;
    }
    @Override
    public boolean esComida(){
        return true ;
    }
}
