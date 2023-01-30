package Ejercicio16;

public class Punto {
    private double x;
    private double y;
    Punto(double coordenadaX,double coordenadaY){
        this.x = coordenadaX;
        this.y = coordenadaY;
    }
    public String toString(){
        return "("+this.x+", "+this.y+")";
    }
}
