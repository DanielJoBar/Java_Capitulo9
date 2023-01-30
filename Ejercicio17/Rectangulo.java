package Ejercicio17;

public class Rectangulo {
    private int base;
    private int altura;
    private static int contadorRectangulos;
    Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
        contadorRectangulos++;
    }
    public String toString(){
        String cadena="";
        for(int i =0; i<this.altura;i++){
            if(i==0||i==this.altura-1){
                for(int j = 0; j<this.base;j++){
                    cadena+="*";
                }
                cadena+="\n";
            }
            else{
                cadena+="*";
                for(int j = 0; j<this.base-2;j++){
                    cadena+=" ";
                }
                cadena+="*\n";
            }
        }
        return cadena;
    }
    public static int getRectangulosCreados() {
        return contadorRectangulos;
    }
}
