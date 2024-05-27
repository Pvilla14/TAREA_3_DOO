package Visual;

import Tarea.Producto;
import Tarea.clasemoneda.Moneda;

public class MainVisual {
    private Moneda moneda = null;
    private Producto producto = null;
    public static void main(String[] args) {
        MainVisual instanciamain = new MainVisual();
        Pantalla pantalla = new Pantalla(instanciamain);
    }

    public void SeleccionarProducto(Producto p) {
        producto = p;

    }
    public void cargarMoneda(Moneda m){
        moneda = m;
        System.out.println("Moneda: " + moneda + "Valor" +moneda.getValor());
    }
}
