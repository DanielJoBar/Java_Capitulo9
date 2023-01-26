package Ejercicio09;
public class Terminal2 {
    protected  String numero ;
    private int segundos;
    //Contructor de la Terminal
    Terminal2(String numero){
        this.numero=numero;
        this.segundos=0;
    }
    //Getters y setters
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public int getSegundos() {
        return segundos;
    }
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    //Métodos terminal
    public void llama(Terminal2 t, int segundosllamada){
        this.segundos+=segundosllamada;
        t.segundos += segundosllamada;
    }
    @Override
    public String toString(){
        return "Nº "+numero+" - "+this.segundos+"s de conversación";
    }

}
