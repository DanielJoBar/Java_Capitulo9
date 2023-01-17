package Ejercicio02_Array;
import java.util.Scanner;
public class PruebaGatos {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
//Array
        Gato[] gato = new Gato[4];

//Asignamos valores a los gatos
        gato[0] = new Gato("Mariano", "Naranja","Ural rex" );
        gato[1] = new Gato("Rex", "Beige","Himalayo" );
        gato[2] = new Gato("Bolilla", "Negro y Gris","Romano" );
        gato[3] = new Gato("Nieves", "Blanco","Albino" );
        System.out.println("\nCaracterísticas:\n");
//Pintamos la Array
        for(int i =0; i<gato.length; i++){
            System.out.println("Gato numero "+(i+1));
            System.out.println("Nombre:    "+gato[i].getNombre()+"  Color:  "+gato[i].getColor()+"  Raza:    "+gato[i].getRaza());
        }
        sc.close();
    }
    
}
