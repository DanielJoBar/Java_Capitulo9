package Ejercicio17;

public class Piramide {
    private int altura;
    private static int contadorPiramide;
    Piramide(int altura){
        this.altura = altura;
        contadorPiramide++;
    }
    public void PintaPiramide(){
        for(int i=1;i<=this.altura;i++){
            //Pintar los espacios en blanco
            for(int j=1;j<=this.altura-i;j++)
            System.out.print("");
            for(int j=1;j<i;j++)
                System.out.print(j);
            for(int j=i;j>=1;j--)
            System.out.print(j);
            System.out.println();
        }
    }
    public static int getPiramidesCreadas() {
        return contadorPiramide;
    } 
    public String toString(){
        String pinta="";
        for(int i=1;i<=this.altura;i++){
            //Pintar los espacios en blanco
            for(int j=1;j<=this.altura-i;j++)
           pinta+=" ";
            for(int j=1;j<i;j++)
                pinta+="*";
            for(int j=i;j>=1;j--)
            pinta+="*";
            pinta+="\n";
        }
        return pinta;
    }
}
