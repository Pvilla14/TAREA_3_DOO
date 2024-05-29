package Tarea.clasebebida;

import Tarea.Valoresestaticos;

public class Sprite extends Bebida {
/**
 * cosntructor que define la serie de la bebida
 * @author Pablo Villagrán-Lucas Morales
 * @param ab número con el valor de la serie de la bebida
 */
    public Sprite(int ab) {
        super(ab);
    }

    public String Consumir() {//personaliza el metodo consumir de la clase bebida
        return (super.Consumir() + "sprite");
    }

    @Override
    public int getPrecio() {
        Valoresestaticos v = Valoresestaticos.SPRITE;
        return v.getCoste();
    }
}