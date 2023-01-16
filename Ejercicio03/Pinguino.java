package Ejercicio03;

public class Pinguino extends Ave {
    Pinguino(String sexo,int edad){
        System.out.println("Es "+this.getSexo(sexo)+" y tiene "+this.getEdad(edad)+" años");
    }

    public void nada(){
        System.out.println("Estoy nadando glup glup glup");
    }
    public void pia(){
        System.out.println("pio pio pio");
    }
    @Override
    public void Vuela() {
        System.out.println("Yo no puedo volar :(");
    }
}
