package Tarea.clasedulces;

public class Snickers extends Dulces{
/**
 * cosntructor que define la serie del dulce
 * @author Pablo Villagrán-Lucas Morales
 * @param ac número con el valor de la serie del dulce 
 */
    public Snickers(int ac) {
        super(ac);
    }

/**
 * Metodo q imprime el tipo de producto
 * @author Pablo Villagrán-Lucas Morales
 * @return un string con el nombre de la clase
 */
    public String Consumir() {//personaliza el metodo consumir de la clase dulce
        return (super.Consumir() + "caluga");
    }

}
