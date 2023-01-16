package Ejercicio03;

public class Canario extends Ave  {
    public Canario (String color, int edad,int tamañoPico){
        System.out.println( "Tiene "+tamañoPico+" cms de pico ,es "+color+this.getSexo()+", tiene "+this.getEdad(edad)+" años");
    }
    public void Vuela(){
        super.Vuela(); 
    }
    public void canta(){
        System.out.println("Pipiripipi");
    }
    public String rie(){
        return "JIJIJIJA";
    }
    
    
}