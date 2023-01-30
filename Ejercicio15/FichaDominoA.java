package Ejercicio15;

public class FichaDominoA {
    private int lado1;
    private int lado2;
  
    public FichaDominoA() {
      this.lado1 = (int) (Math.random() * 7);
      this.lado2 = (int) (Math.random() * 7);
    }
  
    public FichaDominoA(int lado1, int lado2) {
      this.lado1 = lado1;
      this.lado2 = lado2;
    }
  
    FichaDominoA voltea() {
      return new FichaDominoA(lado2, lado1);
    }
  
    boolean encaja(FichaDominoA ficha) {
      return (lado1 == ficha.lado1) || (lado1 == ficha.lado2)
              || (lado2 == ficha.lado1) || (lado2 == ficha.lado2);
    }
  
    boolean encajaEnFila(FichaDominoA ficha) {
      return lado2 == ficha.lado1;
    }
  
    @Override
    public String toString() {
      return "[" + (lado1 == 0 ? " " : lado1) + "|" + (lado2 == 0 ? " " : lado2) + ']';
    }
  
}