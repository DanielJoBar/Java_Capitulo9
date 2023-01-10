import java.util.Scanner;

public class Ejercicio02{
    public static void main(String ars){
        System.out.println("1. Anda con la bicicleta");
        System.out.println("2. Haz el caballito");
        System.out.println("3. Anda con el coche");
        System.out.println("4. Quema rueda");
        System.out.println("5. Kms Bicicleta");
        System.out.println("6. Kms Coche");
        System.out.println("7. Kms Totales");
        System.out.println("8. Salir");
    
    boolean salir = false;
    Scanner sc = new Scanner(System.in);
    Bicicleta b = new Bicicleta(9);
    Coche c = new Coche(0);
    do{
        int opcion = sc.nextInt();
       switch(opcion){
        case 1:
            System.out.println("¿Cuántos kms?");
            int kms = sc.nextInt(opcion);
            b.recorre(kms);
        break;
        case 2:
        break;
        case 3:
        break;
        case 4:
        break;
        case 5:
        break;
        case 6:
        break;
        case 7:
        break;
        case 8:
        break;

       }
    }
    while(!salir);
    
    sc.close();
}
}