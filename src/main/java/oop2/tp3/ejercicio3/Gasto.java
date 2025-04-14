package oop2.tp3.ejercicio3;

public abstract class Gasto {
    int monto;

    public Gasto(int monto){
        this.monto = monto;
    }

    public int gastosDeComida(){
        return this.monto ;
    }
    public abstract  String  informacion() ;

    public int montoGasto(){
        return monto;
    }
    public abstract boolean esComida();
}
