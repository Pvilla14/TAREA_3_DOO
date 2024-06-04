package Visual.Botones;

import Tarea.Valoresestaticos;
import Visual.JPanelExpendedor;
import Visual.JPanelMonedas;
import Visual.MainVisual;

public class BotonSnickers extends BotonUltra {
    public BotonSnickers(JPanelExpendedor expendedor, JPanelMonedas botonesMonedas) {
        super(expendedor, botonesMonedas);
        setImage("/Snickers.png");
    }

    @Override
    public void crearElemento() {
        System.out.println("Se selecciono el dulce Snickers");
        maquina.SeleccionarProducto(Valoresestaticos.SNICKERS);
    }
}
