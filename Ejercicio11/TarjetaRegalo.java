package Ejercicio11;

public class TarjetaRegalo {
    private int saldo ;
    private double numeroDigitos;
    private int numero;
    boolean gasto=false;

    TarjetaRegalo(int saldo ){
        this.saldo = saldo;
        this.numeroDigitos = Math.random()*90000+10000;
    }
    public void gasta(double d){
        if(this.saldo>d)
        this.saldo-=d;
        else{
            this.gasto = true;
        }
        
    }
    public String toString(){
        if(!gasto)
        return "Tarjeta nº"+this.numeroDigitos+" - Saldo "+this.saldo+" €";
        else{
            return "No tiene suficiente saldo para gastar ";
        }
    }
    TarjetaRegalo fusionaCon(TarjetaRegalo tarjeta){
        numero = tarjeta.saldo+this.saldo;
        tarjeta.saldo=0;
        this.saldo=0;
        return new TarjetaRegalo(numero);
    }
}

