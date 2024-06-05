package Tarea;
import Tarea.clasemoneda.*;
import Tarea.mensajeerror.*;

import java.util.ArrayList;

public class Comprador {
    private String sonido;
    private int vuelto = 0;
    private Deposito<Moneda> billeteralocal;
    private int totaldinero = 0;

    public Deposito<Moneda> cuantoVuelto() {
        return billeteralocal;//funcion para devolver el vuelto al usuario
    }
    /**
     * @author Lucas Morales
     * @return un string que se imprime en el main con el producto que se come/toma
     */
    public String queConsumiste() {
        return sonido;
    }
    /**
     * @author Pablo Villagrán-Lucas Morales
     * @param m es la moneda q se usa para pagar, se inicializa en el main y se calcula el vuelto que se debe entregar, y se ingresa al deposito
     * @param producto es el tipo de preducto que se usa que viene con el precio definido desde la clase Valoresestaticos
     * @param exp el expendedor del cual se compra la bebida/dulce, revisa que la moneda sea valida y que tenga el valor suficiente
     * @throws Exception manda una excepción en caso de que el deposito esté vacio
     */
    public Comprador(Deposito<Moneda> billetera, Valoresestaticos producto, Expendedor exp)throws Exception {
        billeteralocal = billetera;
        this.getSaldo();
        exp.comprarProducto(totaldinero, producto, billeteralocal);//se llama a la funcion comprarProducto que devuelve un producto o devuelve
        // null si estaba vacio el deposito de dicho producto
        Producto beer = exp.getCompra();
        if (beer != null) {
            sonido = beer.Consumir();//si no es null le asigna un valor a sonido con lo que llega desde el producto
        } else {
            throw new NoHayProductoException();//si es null manda la excepción de que no hay dicho producto en los depositos de este expendedor
        }
        billetera = exp.getVuelto();
    }
    public void getSaldo() {
        if(billeteralocal.getLargo() != 0) {
            ArrayList<Moneda> monedero = billeteralocal.getDepMonedas();
            for(Moneda m: monedero) {
                this.totaldinero += m.getValor();
            }
        }
    }
}