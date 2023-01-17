package Ejercicio02_Array;
public class Gato {
    //Atributos 
    public String nombre;
    private String color;
    private String raza;
   //Constructor
    Gato(String nombre, String color, String raza){
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
    }   
    
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    

}
