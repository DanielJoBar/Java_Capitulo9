package Ejercicio08;
public class Terminal {
    private String numero ;
    private int segundos;
    Terminal(String numero){
        this.numero=numero;
        this.segundos=0;
    }
    public void llama(Terminal t, int segundosllamada){
        this.segundos+=segundosllamada;
        t.segundos = segundosllamada;
    }
    @Override
    public String toString(){
        return "Nº "+numero+" - "+this.segundos+"s de conversación";
    }

}
