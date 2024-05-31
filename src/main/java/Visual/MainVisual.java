package Visual;

import Tarea.Valoresestaticos;
import Tarea.clasemoneda.Moneda;
import java.util.ArrayList;

public class MainVisual {
    private ArrayList<Moneda> billetera = new ArrayList<Moneda>();
    private Valoresestaticos producto = null;
    static MainVisual instanciamain;
    public static void main(String[] args) {
        instanciamain = new MainVisual();
        Pantalla pantalla = new Pantalla(instanciamain);
    }

    public void SeleccionarProducto(Valoresestaticos p) {
        producto = p;
        System.out.println("Producto: " + producto + "serie " + producto);

    }
    public void cargarMoneda(Moneda m){
        billetera.add(m);
        System.out.println("Moneda: " + m + "Valor" +m.getValor());
    }
    public Valoresestaticos getCompra() {
        return producto;
    }
}
