package Visual;

import Tarea.Producto;
import Tarea.clasemoneda.Moneda;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainVisual {
    private ArrayList<Moneda> billetera = new ArrayList<Moneda>();
    private Producto producto = null;
    public static void main(String[] args) {
        MainVisual instanciamain = new MainVisual();
        Pantalla pantalla = new Pantalla(instanciamain);
    }

    public void SeleccionarProducto(Producto p) {
        producto = p;
        System.out.println("Producto: " + producto + "serie " + producto.getSerie());

    }
    public void cargarMoneda(Moneda m){
        billetera.add(m);
        System.out.println("Moneda: " + m + "Valor" +m.getValor());
    }
    public Producto getCompra() {
        return producto;
    }
}
