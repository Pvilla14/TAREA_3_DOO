package Visual.Botones;

import Tarea.Valoresestaticos;
import Visual.JPanelExpendedor;
import Visual.JPanelMonedas;
import Visual.MainVisual;

public class BotonSerranita extends BotonUltra {
    public BotonSerranita(JPanelExpendedor expendedor, JPanelMonedas botonesMonedas) {
        super(expendedor, botonesMonedas);
        setImage("/Serranita.png");
    }

    @Override
    public void crearElemento() {
        System.out.println("Se selecciono el dulce Serranita");
        Valoresestaticos p = Valoresestaticos.SERRANITA;
        maquina.SeleccionarProducto(p);
    }

}
