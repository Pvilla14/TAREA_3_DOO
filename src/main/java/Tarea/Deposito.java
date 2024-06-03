package Tarea;
import Tarea.clasemoneda.Moneda;

import java.util.ArrayList;

public class Deposito<T> {//clase que permite la creación de depositos de manera generica para bebidas dulces y monedas

    private ArrayList<T> lista;//implementación de ArrayList para almacenar los elementos
    /**
     * agrega el elemnto dado al ArrayList
     * @author Pablo Villagrán-Lucas Morales
     * @param elemento puede ser de tipo Producto o moneda y se usa las funciones de ArrayList para agregarlo a lista
     */
    public void addElemento(T elemento){
        lista.add(elemento);
    }
    /**
     * se usa una variabe aux para entregar el elemento
     * @author Pablo Villagrán-Lucas Morales
     * @return retorna el primer elemento del arreglo, primero verifica que no este vacio y si no lo está, lo saca y lo retorna
     */
    public T getElemento() {
        if (lista.size() != 0) {
            T aux = lista.get(0);
            lista.remove(0);
            return aux;
        }
        else return null;//en caso de q este vacio retorna un null
    }

    public Deposito() {//constructor de la clase, incializa el ArrayList
        lista = new ArrayList<>();
    }

    /**
     *Metodo para obtener el tipo de clase q tiene guardado el deposito, es decir,
     * que elementos son los que hay dentro
     * @author Pablo Villagrán
     * @return un elemento del arreglo, q se usa para evaluar su clase luego en otras clases
     */
    public Object getTipo(){
        T aux = lista.getLast();
        if(!lista.isEmpty()){
            return aux;
        }
        else{
            return null;
        }
    }
    /**
     * Este metodo se cuando se quiere aceder a billetera, para poder ver los tipos de moneda q tiene dentro y poder
     * presentala en pantalla correctamente
     * @author Pablo Villagrán
     * @return una lista con las monedas y null si es q no tiene monedas, pero se usa solo si tiene monedas
     * */
    public ArrayList getDepMonedas() {
        if (lista.get(0) instanceof Moneda){
            return lista;
        }
        else{
            return null;
        }
    }

    /**
     * Retorna el largo de la lista, se usa en JPanelDeposito
     * @author PAblo Villagrán-Lucas Morales
     * @return im imt con el .size de la lista
     */
    public int getLargo(){
        return lista.size();
    }
}