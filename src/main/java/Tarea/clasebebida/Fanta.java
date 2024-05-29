package Tarea.clasebebida;

import Tarea.Valoresestaticos;

public class Fanta extends Bebida {
/**
 * cosntructor que define la serie de la bebida
 * @author Pablo Villagrán-Lucas Morales
 * @param ap número con el valor de la serie de la bebida
 */
    public Fanta(int ap) {
        super(ap);
    }

    public String Consumir() {//personaliza el metodo consumir de la clase bebida
        return (super.Consumir() + "pepsi");
    }

    @Override
    public int getPrecio() {
        Valoresestaticos v = Valoresestaticos.FANTA;
        return v.getCoste();
    }
}