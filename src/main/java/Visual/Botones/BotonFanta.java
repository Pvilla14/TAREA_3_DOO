package Visual.Botones;

import Tarea.Valoresestaticos;
import Visual.JPanelExpendedor;
import Visual.JPanelMonedas;

public class BotonFanta extends BotonUltra {
    public BotonFanta(JPanelExpendedor expendedor, JPanelMonedas botonesMonedas) {
        super(expendedor, botonesMonedas);
        setImage("/Fanta.png");
    }

    @Override
    public void crearElemento() {
        System.out.println("Se selecciono una bebida Fanta");
        maquina.SeleccionarProducto(Valoresestaticos.FANTA);
    }
}