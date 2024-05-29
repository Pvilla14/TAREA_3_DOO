package Tarea.clasedulces;

import Tarea.Valoresestaticos;

public class Serranita extends Dulces{
/**
 * cosntructor que define la serie del dulce
 * @author Lucas Morales
 * @param ac número con el valor de la serie del dulce 
 */
    public Serranita(int ac) {
        super(ac);
    }

    public String Consumir() {//personaliza el metodo consumir de la clase dulce
        return (super.Consumir() + "serranita");
    }

    @Override
    public int getPrecio() {
        Valoresestaticos v = Valoresestaticos.SERRANITA;
        return v.getCoste();
    }
}