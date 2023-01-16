package Ejercicio01;
public class Ejercicio01 {
    public static void main(String[] args){
        Caballo caballo1 = new Caballo("Rodolfo", "Italiano", 7, "Negro");
        Caballo caballo2 = new Caballo("José","Español",9,"Marrón");
        System.out.print("Saludos, mi nombre es "+ caballo1.getNombre());
        caballo1.relincha();
        caballo1.galopea();
        System.out.println("Hola, yo soy"+ caballo2.getNombre());
        caballo2.come();
        caballo2.relincha();
    }
}
