package Ejercicio03;
public class Ejercicio03 {
    public static void main(String[] args) {
    Pinguino tux = new Pinguino("Macho",10);
    tux.come("palomitas");
    tux.nada();
    tux.Vuela();
    
    Perro laika = new Perro("Macho");
    laika.ladra();
    laika.dameLaPata();
    laika.amamanta();
    laika.cuidaCrias();
    
    Canario godzilla = new Canario("Marrón",5,10);
    godzilla.Vuela();
    godzilla.canta();
  }
}
