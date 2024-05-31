package Visual.Botones;

import Tarea.*;
import Visual.MainVisual;

public class BotonSuper8 extends BotonUltra {
    public BotonSuper8(MainVisual main) {
        super(main);
        setImage("/Super8.png");
    }

    @Override
    public void crearElemento() throws Exception {
        instanciaMain.SeleccionarProducto(Valoresestaticos.SUPER8);
    }
}