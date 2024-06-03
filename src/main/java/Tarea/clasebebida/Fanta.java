package Tarea.clasebebida;

public class Fanta extends Bebida {
/**
 * cosntructor que define la serie de la bebida
 * @author Pablo Villagrán-Lucas Morales
 * @param ap número con el valor de la serie de la bebida
 */
    public Fanta(int ap) {
        super(ap);
    }
    /**
     * Metodo que imprime el tipo de producto
     * @author Pablo Villagrán-Lucas Morales
     * @return un String con el nombre de la clase
     */
    public String Consumir() {//personaliza el metodo consumir de la clase bebida
        return (super.Consumir() + "pepsi");
    }

}