package Visual.Botones;

import Tarea.*;
import Visual.JPanelExpendedor;
import Visual.JPanelMonedas;
import Visual.MainVisual;

public class BotonSuper8 extends BotonUltra {
    public BotonSuper8(JPanelExpendedor expendedor, JPanelMonedas botonesMonedas) {
        super(expendedor, botonesMonedas);
        setImage("/Super8.png");
    }

    @Override
    public void crearElemento() {
        System.out.println("Se selecciono el dulce Super8");
        maquina.SeleccionarProducto(Valoresestaticos.SUPER8);
    }
}