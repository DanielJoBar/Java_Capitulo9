package Ejercicio06;
public class PruebaTiempo {
    public static void main(String[] args){
    Tiempo t1 = new Tiempo(1, 20, 3);
    Tiempo t2 = new Tiempo(2,50,30);
    Tiempo t3 = new Tiempo(0, 40, 50);
    System.out.println("1er (t1) tiempo introducido: "+t1);
    System.out.println("2er (t2) tiempo introducido: "+t2);
    System.out.println("3er (t3) tiempo introducido: "+t3);
    System.out.println("La cuenta (t1+t2) resultó en : "+t1.suma(t2));
    System.out.println("La cuenta (t1+t3) resultó en : "+t1.suma(t3));
    System.out.println("La cuenta (t2-t3) resultó en : "+t2.resta(t3));
    System.out.println("La cuenta (t2-t1) resultó en : "+t2.resta(t1));
    }
}
