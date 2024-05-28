package Tarea.clasemoneda;

public abstract class Moneda {
    private int serie;
    public Moneda getSerie() {//retorna la instancia del la moneda
        return this;
    }

    public abstract int getValor();//metodo que se perzonaliza para cada tipo de moneda

    public Moneda(int x) {//el constructor de esta clase no hace nada, ya que moneda es unicamente utilizada por su valor
        serie = x;
    }

    public int getserie(){
        return serie;
    }
}