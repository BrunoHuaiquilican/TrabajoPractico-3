package oop2.tp3.ejercicio3;

public class AlquilerAuto extends Gasto{
    public AlquilerAuto(int monto) {
        super(monto);
    }
    @Override
    public  String  informacion(){
        return "Alquiler Auto" ;
    }
    @Override
    public boolean esComida(){
        return false ;
    }
}
