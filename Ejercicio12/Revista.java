package Ejercicio12;

public class Revista extends Publicación{
    private int numeroRevista;
    Revista(String ISBN, String titulo, int añoPublicacion, int numeroRevista){
        this.ISBN =ISBN;
        this.titulo =titulo;
        this.añoPublicacion =añoPublicacion;
        this.numeroRevista =numeroRevista;
    }
    public String toString(){
        return "ISBN: "+this.ISBN+", título: "+this.titulo+", año de publicación: "+añoPublicacion;
        
    }
}
