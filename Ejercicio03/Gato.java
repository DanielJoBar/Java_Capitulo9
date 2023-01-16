package Ejercicio03;

public class Gato extends Mamifero{
    private String raza;

  public Gato (String s, String r) {
    super.getSexo(s);
    this.raza = r;
  }
  public Gato () {
    super.getSexo("Hembra");
    raza = "siamés";
  }
  
  public void maulla() {
    System.out.println("Miauuuu");
  }
  
  public void ronronea() {
    System.out.println("mrrrrrr");
  }
  
  public void come(String comida) {
    if (comida.equals("pescado")) {
      System.out.println("Hmmmm, gracias");
    } else {
      System.out.println("Lo siento, yo solo como pescado");
    }
  }
  
  public void peleaCon(Gato contrincante) {
    if (this.getSexo().equals("Hembra")) {
      System.out.println("no me gusta pelear");
    } else {
      if (contrincante.getSexo().equals("Hembra")) {
        System.out.println("no peleo contra gatitas");
      } else {
        System.out.println("ven aquí que te vas a enterar");
      }
    }
  }
  
  public void limpiate() {
    System.out.println("Me estoy lamiendo");
  }
  
  public void caza() {
    System.out.println("Estoy cazando ratones");
  }
}
