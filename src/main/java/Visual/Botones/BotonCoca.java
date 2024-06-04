package Visual.Botones;

import Tarea.Valoresestaticos;
import Visual.JPanelExpendedor;
import Visual.JPanelMonedas;
import Visual.MainVisual;

public class BotonCoca extends BotonUltra {
    public BotonCoca(JPanelExpendedor expendedor, JPanelMonedas botonesMonedas) {
        super(expendedor, botonesMonedas);
        setImage("/CocaCola.png");
    }

    @Override
    public void crearElemento() {
        System.out.println("Se selecciono una bebida CocaCola");
        maquina.SeleccionarProducto(Valoresestaticos.COCA);
    }
}