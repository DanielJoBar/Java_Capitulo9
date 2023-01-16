package Ejercicio03;
public class Perro extends Mamifero{
    Perro(String sexo){
        super.getSexo(sexo);
    }
    public void ladra(){
        System.out.println("WOOF WOOF WOOF");
    }
    public void dameLaPata() {
        System.out.println("Toma mi patita");
      }
    
      public void caza() {
        System.out.println("Estoy cazando perdices");
      }
}
