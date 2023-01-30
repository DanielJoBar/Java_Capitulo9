package Ejercicio18;

public class Incidencia {
    private static int codigo=0;
    private boolean pendiente;
    private int puesto;
    private String funcion;
    private String solucion;
    private static int numeroPendientes=0;
    Incidencia(int numeroDePuesto,String funcion){
        this.puesto = numeroDePuesto;
        this.funcion = funcion;
        this.pendiente=true;
        numeroPendientes++;
    }
    public void resuelve(String solucion){
        pendiente = false;
        this.solucion=solucion;
        numeroPendientes--;
    }
    public String toString(){
        codigo++;
        if(pendiente)
        return "Incidencia "+codigo+" - Puesto: "+this.puesto+" - "+this.funcion+ " - Pendiente";
        return "Incidencia "+codigo+" - Puesto: "+this.puesto+" - "+this.funcion+ " - "+this.solucion;
    }
    static int getNumeroPendientes() {
        return numeroPendientes;
    }
}
