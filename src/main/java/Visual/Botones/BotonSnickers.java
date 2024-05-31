package Visual.Botones;

import Tarea.Valoresestaticos;
import Visual.MainVisual;

public class BotonSnickers extends BotonUltra {
    public BotonSnickers(MainVisual main) {
        super(main);
        setImage("/Snickers.png");
    }

    @Override
    public void crearElemento() throws Exception {
        instanciaMain.SeleccionarProducto(Valoresestaticos.SNICKERS);
    }
}
