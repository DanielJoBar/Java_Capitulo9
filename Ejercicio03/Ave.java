package Ejercicio03;
public class Ave extends Animal{
    private String vuelo = "Estoy volando";
    public void ponerHuevo(){ 
        if(this.getSexo().equals("Macho")){
            System.out.println("Lo siento yo no pongo huevos");
        }
        else{
            System.out.println("Pup... Ahí lo tenés");
        }
    }
    public void Vuela(){
        System.out.println(vuelo);
    }
}

