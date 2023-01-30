package Ejercicio15;

public class Generador {
    public static void main(String[] args) {
        int cuentaFichas = 0;

        FichaDominoA[] fichas = new FichaDominoA[8];
    
        fichas[0] = new FichaDominoA();
        
        for (int i = 1; i < 8; i++) {
          FichaDominoA aux;
          do {
            aux = new FichaDominoA();
          } while (!fichas[i - 1].encajaEnFila(aux));
          fichas[i] = aux;
        }
    
        for (FichaDominoA ficha : fichas) {
          System.out.print(ficha);
        }
    }
}
