package Visual;

import Tarea.Valoresestaticos;
import Tarea.Expendedor;
import Tarea.clasemoneda.Moneda;
import java.util.ArrayList;
import java.util.List;

public class MainVisual {
    private Moneda billetera;
    private Valoresestaticos producto = null;
    private Expendedor exp;
    private List<String> acciones = new ArrayList<>();  // Lista para almacenar las acciones

    public static void main(String[] args) {
        MainVisual instanciamain = new MainVisual();
        Pantalla pantalla = new Pantalla(instanciamain);
    }

    public void SeleccionarProducto(Valoresestaticos p) throws Exception {
        producto = p;
        String accion = "Producto seleccionado: " + producto;
        acciones.add(accion);  // Guardar la acción
        System.out.println(accion);
        checkMonedaYProducto();
    }

    public void cargarMoneda(Moneda m) throws Exception {
        billetera = m;
        String accion = "Moneda: " + m.getValor();
        acciones.add(accion);  // Guardar la acción
        System.out.println(accion);
        checkMonedaYProducto();
    }

    public Valoresestaticos getCompra() {
        return producto;
    }

    private void checkMonedaYProducto() throws Exception {
        if (producto != null && billetera == null) {
            exp.comprarProducto(billetera, producto);
        }
    }

    public List<String> getAcciones() {
        return acciones;  // Devolver la lista de acciones
    }
}