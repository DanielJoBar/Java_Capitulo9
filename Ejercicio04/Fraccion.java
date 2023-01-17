package Ejercicio04;
public class Fraccion {
    private int numerador;
    private int denominador;
    private int signo;
    Fraccion(int num,int den){
        if(num/den<1){  
            this.signo = -1;
        }
        else{
            this.signo=1;
        }
        this.denominador = den;
        this.numerador= num;
    }
    public int getNumerador(){
        return this.numerador;
    }
    public int getDenominador(){
        return this.denominador;
    }
    public String toString(){
        return this.numerador + "/" + this.denominador;
    }
    
    public String invierte(){
        if(this.signo==-1){
            return "-"+denominador;
        }   
        else{
            return this.denominador+"/"+this.numerador;
        }
    }
    Fraccion simplifica(){
        int n = this.numerador;
        int d = this.denominador;
        for (int i = 2; i < Math.min(this.numerador, this.denominador); i++) {
            while (((n % i) == 0) && ((d % i) == 0)) {
              n /= i;
              d /= i;
            }
          }
        return new Fraccion(n, d);
    }
    Fraccion multiplica(int numero){
        return new Fraccion(this.signo*this.numerador*numero,this.denominador);
    }
    Fraccion multiplica(Fraccion f1){
        return new Fraccion(this.signo*this.numerador*f1.getNumerador(),this.denominador*f1.getDenominador());
    }
    Fraccion divide(int numero){
        return new Fraccion(this.signo*this.numerador,this.denominador*numero);
    }
    Fraccion divide(Fraccion f1){
        return new Fraccion(this.signo*this.numerador*f1.getDenominador(),this.denominador*f1.getNumerador());
    }
}