package Ejercicio13;

public class CuentaCorriente {
    private double numeroDeCuenta;
    private long saldo;
    private double aleatorio;
    CuentaCorriente(){
        this.saldo=0;
        this.aleatorio=Math.random()*899999999*10+1000000000;
        this.numeroDeCuenta=aleatorio;
    }
    CuentaCorriente(int saldo){
        this.saldo=saldo;
        this.aleatorio=Math.random()*899999999*10+1000000000;
        this.numeroDeCuenta=aleatorio;
    }
    public void ingreso(long dinero){
        this.saldo+=dinero;
    }
    public void cargo(long dinero){
        this.saldo-=dinero;
    }
    public void transferencia(CuentaCorriente cuenta,long dinero){
        this.saldo-=dinero;
        cuenta.saldo+=dinero;
    }
    public String toString(){
        return "Numero de cta: "+this.numeroDeCuenta+" Saldo: "+this.saldo+" €";
    }
}
