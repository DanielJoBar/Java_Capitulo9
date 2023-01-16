package Ejercicio01;
public class Caballo {
    private String nacionalidad;
    private int edad;
    private String color;
    private String nombre;
    
    Caballo (String n,String na, int e, String c){
        this.nombre=n;
        this.nacionalidad=na;
        this.edad=e;
        this.color=c;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void relincha(){
          System.out.println("hiiiiiiiaaaaaaa");
    }
    public void galopea(){
        System.out.println("Toloc Toloc Toloc");
    }
    public void come(){
        System.out.println("Ñam Ñam Ñam");
    }
}