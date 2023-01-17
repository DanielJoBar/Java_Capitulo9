package Ejercicio06;

public class Tiempo {
    //Atributos horas , minutos, segundos 

    private int horas=0;
    private int minutos=0;
    private int segundos=0;

    //Construcor (los objetos se crearan asi: 
    //Tiempo t = new Tiempo(1, 20, 30)siendo las horas, minutos, segundos)

    public Tiempo(int horas, int minutos, int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    //Metodos(get y set)
    public int getHoras() {
        return this.horas;
    }
    
    public void setHoras(int horas) {
        this.horas = horas;
    }
    public int getMinutos() {
        return this.minutos;
    }
    
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    public int getSegundos() {
        return this.segundos;
    }
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    

    // suma  y resta tipo : suma(Tiempo t1, Tiempo t2)
    //ej si se suma 30m 40s  y  35m 20s el resultado ha de ser: 1h 6m 0s.
    Tiempo suma(Tiempo t2){
            if(this.segundos + t2.getSegundos()>=60){
                t2.segundos-=60;
                t2.minutos+=1;
            }
            else if(this.minutos + t2.getMinutos()>=60){
                t2.minutos-=60;
                t2.horas+=1;
            }
        return new Tiempo(this.horas+t2.getHoras(), this.minutos + t2.getMinutos(), this.segundos + t2.getSegundos());
    }
    Tiempo resta(Tiempo t2){
        if(this.segundos - t2.getSegundos()<0){
            t2.segundos-=60;
            t2.minutos-=1;
        }
        else if(this.minutos - t2.getMinutos()<0){
            t2.minutos-=60;
            t2.horas-=1;
        }
    return new Tiempo(this.horas-t2.getHoras(), this.minutos - t2.getMinutos(), this.segundos - t2.getSegundos());

}
//Metodo toString para ver intervalos de tiempo  de 10h 35min 5seg

public String toString(){
    return getHoras()+" horas "+getMinutos()+" minutos "+getSegundos()+" Segundos";
}
}
