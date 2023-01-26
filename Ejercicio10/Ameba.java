package Ejercicio10;

public class Ameba {
    private int peso;
    Ameba(){
        peso =3;
    }
    public void come(int numero){
        if(numero>0)
        this.peso+=numero-1;
        else
        this.peso+=0;
    }
    public void come(Ameba ameba){
        this.peso+=ameba.peso-1;
        ameba.peso=0;
    }
    public String toString(){
        return "Soy una ameba y peso "+this.peso+" microgramos.";
    }
}
