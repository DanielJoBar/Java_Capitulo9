import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args){

        int opcion =0;
        int km;
        while (opcion != 8) {
            System.out.println("\n1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            System.out.println("Elige una opción (1-8): ");
            
            opcion = Integer.parseInt(System.console().readLine());
            Coche c = new Coche(3);
            Bicicleta b = new Bicicleta(4);
            switch (opcion) {
              case 1:
                System.out.print("¿Cuántos kilómetros quiere recorrer? ");
                km = Integer.parseInt(System.console().readLine());
                b.recorre(km);
                break;
              case 2:
                b.Caballito();
                break;
              case 3:
                System.out.print("¿Cuántos kilómetros quiere recorrer? ");
                km = Integer.parseInt(System.console().readLine());
                c.recorre(km);
                break;
              case 4:
                c.quemaRuedas();
                break;
              case 5:
                System.out.print("La bicicleta lleva recorridos ");
                System.out.println(b.getKilometrosRecorridos() + " Km");
                break;
              case 6:
                System.out.print("El coche lleva recorridos ");
                System.out.println(c.getKilometrosRecorridos() + " Km");
                break;
              case 7:
                System.out.print("Los vehículos llevan recorridos ");
                System.out.println(Vehiculo.getKilometrosTotales() + " Km");
              default:
            } 
          } 
        }    
    
}
