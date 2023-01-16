package Ejercicio03;
public class Lagarto extends Animal {

    public Lagarto() {}
  
    public Lagarto(String s) {
      super.getSexo(s);
    }
    public void tomaElSol() {
      System.out.println("Estoy tomando el Sol");
    }
  
    public void baniate() {
      System.out.println("Me estoy dando un chapuzón");
    }
  
    public void escondete() {
      System.out.println("Me he escondido, ya no me puedes ver");
    }
  }