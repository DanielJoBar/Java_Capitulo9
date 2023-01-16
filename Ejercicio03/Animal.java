package Ejercicio03;
public abstract class Animal {
    private String come;
    private String sexo;
    private int edad;
    public String getSexo(){
        return "Macho";
    }
    public String getSexo(String s){
        sexo=s;
        return sexo;
    }
    public void come(String comida){
        System.out.println("ÑAM ÑAM "+comida);
        }
    public int getEdad(){
        edad=5;
        return this.edad;
    }   
    public int getEdad(int e){
        this.edad=e;
        return this.edad;
    }
}
