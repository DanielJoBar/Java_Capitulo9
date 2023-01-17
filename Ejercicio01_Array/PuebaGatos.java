package Ejercicio01_Array;

import java.util.Scanner;

public class PuebaGatos {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Gato[] gato = new Gato[4];
        System.out.println("Introduzca el nombre , el color y la raza de 4 gatos: ");
        for(int i =0;i<gato.length;i++){
            gato[i] = new Gato();
            System.out.println("    \nGato nº "+(i + 1));
            System.out.println("Nombre:");
            gato[i].setNombre(System.console().readLine());
            System.out.println("Color:");
            gato[i].setColor(System.console().readLine());
            System.out.println("Raza:");
            gato[i].setRaza(System.console().readLine());
        }
        System.out.println("\nCaracterísticas:\n");
        for(int i =0; i<gato.length; i++){
            System.out.println("Gato numero "+(i+1));
            System.out.println("Nombre:    "+gato[i].getNombre()+"  Color:  "+gato[i].getColor()+"  Raza:    "+gato[i].getRaza());
        }
        sc.close();
    }
    
}
