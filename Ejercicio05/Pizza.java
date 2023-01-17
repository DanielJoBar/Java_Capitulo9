package Ejercicio05;
public class Pizza {
    //Atributos
    protected String tamaño;
    protected String tipo;
    protected String estado;
    private static int numeroPizzasPedidasTotal=0;
    private static int numeroPizzasServidasTotal=0;
    //Constructor
    public Pizza(String tipo,String tamaño){
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.estado = "pedida";
        numeroPizzasPedidasTotal++;
    }

    //Setters y Getters del tamaño y el tipo de las pizzas
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    public String getTamaño() {
        return tamaño;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getEstado() {
        return estado;
    }
    //Métodos numero de pizzas totales
    public static int getNumeroPizzasPedidasTotal(){
        return numeroPizzasPedidasTotal;
    }
    public static int getNumeroPizzasServidasTotal(){
        return numeroPizzasServidasTotal;
    }
    //sirve la pizza
    public void sirve(){
        if(this.estado.equals("pedida")){
        numeroPizzasServidasTotal++;
        this.estado="servida";
        }
        else
        System.out.println("esa pizza ya se ha servido");
    }
    //imprime si esta servida o no la pizza
    public String toString(){
        if(this.estado.equals("servida")){
            return this.tipo+" "+this.tamaño+", "+this.estado;
        }   
        else{
            return this.tipo+" "+this.tamaño+", "+this.estado;
        }
    }
}