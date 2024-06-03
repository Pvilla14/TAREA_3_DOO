package Tarea.clasebebida;

public class CocaCola extends Bebida {
/**
 * cosntructor que define la serie de la bebida
 * @author Pablo Villagrán-Lucas Morales
 * @param ac número con el valor de la serie de la bebida 
 */
    public CocaCola(int ac) {
        super(ac);
    }
/**
 * Metodo q imprime el tipo de producto
 * @author Pablo Villagrán-Lucas Morales
 * @return un string con el nombre de la clase
 */
    public String Consumir() {//personaliza el metodo consumir de la clase bebida
        return (super.Consumir() + "cocacola");
    }

}