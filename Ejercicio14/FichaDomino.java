package Ejercicio14;

public class FichaDomino {
    private String lado1;
    private String lado2;
    FichaDomino(int lado1,int lado2){
        this.lado1=lado1+"";
        if(this.lado1.equals("0"))
        this.lado1=" ";
        this.lado2=lado2+"";
        if(this.lado2.equals("0"))
        this.lado2=" ";
    }
    public String voltea(){
        return"["+lado2+"|"+lado1+"]";
    }
    public boolean encaja(FichaDomino otraFicha){
        if(otraFicha.lado1.equals(this.lado1)||otraFicha.lado1.equals(this.lado2)||otraFicha.lado2.equals(this.lado1)||otraFicha.lado2.equals(this.lado2))
        return true;
        return false;
    }
    public String toString(){
        return "["+this.lado1+"|"+this.lado2+"]";
    }
}
