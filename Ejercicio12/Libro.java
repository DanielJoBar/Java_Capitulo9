package Ejercicio12;

public class Libro extends Publicación implements Prestable {
    private boolean prestado;
    Libro(String ISBN,String titulo,int añoPublicacion){
        super();
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
        this.ISBN = ISBN;
        prestado=false;
    }
    public void presta(){
        if (this.prestado)
        System.out.println("Lo siento este libro ya ha sido prestado ");
        else
        this.prestado = true;
    }
    public void devuelve(){
        this.prestado = false;
    }
    public boolean estaPrestado(){
        if(prestado)
        return true;
        return false;
    }
    public String toString(){
        if(prestado)
        return "ISBN: "+this.ISBN+", título: "+this.titulo+", año de publicación: "+añoPublicacion;
        else
        return "ISBN: "+this.ISBN+", título: "+this.titulo+", año de publicación: "+añoPublicacion + "(no prestado)";
    }
}
