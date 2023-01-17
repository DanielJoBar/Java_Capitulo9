package Ejercicio07;

import java.util.Scanner;

public class PruebaZona {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int EntradasZona1=1000;
    int EntradasZona2=200;
    int EntradasZona3=25;
    boolean salir = false;
    while(!salir){
        Zona Principal = new Zona(EntradasZona1);
        Zona CompraVenta = new Zona(EntradasZona2);
        Zona VIP = new Zona(EntradasZona3);
        System.out.println("1. Mostrar número de entradas libres");
        System.out.println("2. Vender entradas");
        System.out.println("3. Salir");
        int opcion = sc.nextInt();
        switch(opcion){
            case 1:
            System.out.println("Las entradas que se encuentran libres en este momento son :");
            System.out.println("De la zona 1: "+Principal.getEntradasPorVender());
            System.out.println("De la zona 2: "+CompraVenta.getEntradasPorVender());
            System.out.println("De la zona 3: "+VIP.getEntradasPorVender());
            break;
            case 2:
            System.out.println("¿De qué zona(1 , 2 , 3)?");
            int opcion2 = sc.nextInt();
            while(opcion2>3||opcion2<1){
                System.out.println("Ha introducido un valor inválido introduzcalo de nuevo: ");
                opcion2 = sc.nextInt();
            }
            System.out.println("Indique la cantidad: ");
            int entradas = sc.nextInt();
            switch(opcion2){
                case 1:
                    Principal.vender(entradas);
                    EntradasZona1-=entradas;
                break;
                case 2:
                    CompraVenta.vender(entradas);
                    EntradasZona2-=entradas;
                break;
                case 3:
                    VIP.vender(entradas);
                    EntradasZona3-=entradas;
                break;
                default:
                System.out.println("Ha introducido un valor inválido ");
            }
            break;
            case 3:
            salir=true;
            break;
            default:
            System.out.println("Ha introducido un valor inválido ");
        }
        }
        sc.close();
    }
}