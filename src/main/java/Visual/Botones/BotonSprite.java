package Visual.Botones;

import Tarea.Valoresestaticos;
import Visual.JPanelExpendedor;
import Visual.JPanelMonedas;

public class BotonSprite extends BotonUltra{
    public BotonSprite(JPanelExpendedor expendedor, JPanelMonedas botonesMonedas) {
        super(expendedor, botonesMonedas);
        setImage("/Sprite.png");
    }

    @Override
    public void crearElemento() {
        System.out.println("Se selecciono una bebida Sprite");
        maquina.SeleccionarProducto(Valoresestaticos.SPRITE);
    }
}