package Ejercicio09;

public class Movil extends Terminal2{
    private String tarifa;
    private double tarifaTotal;
Movil(String numero, String tarifa){
    super(numero);
    this.tarifa = tarifa;
    tarifaTotal = 0;
}
@Override
    public void llama(Terminal2 t, int segundosllamada){
        super.llama(t, segundosllamada);
        double minutos = (double)segundosllamada/60;
        switch(this.tarifa){
            case "rata":
            this.tarifaTotal += 0.06*minutos;
            break;
            case "mono":
            this.tarifaTotal += 0.12*minutos;
            break;
            case "bisonte":
            this.tarifaTotal += 0.30*minutos;
            break;
            default:
        }
}
@Override
    public String toString(){
        
        return "Nº "+this.getNumero()+" - "+this.getSegundos()+"s de conversación - tarificados "+ this.tarifaTotal+" euros";
    }
}
