package Visual.Botones;

import Tarea.Valoresestaticos;
import Visual.MainVisual;

public class BotonCoca extends BotonUltra {
    public BotonCoca(MainVisual main) {
        super(main);
        setImage("/CocaCola.png");
    }

    @Override
    public void crearElemento() throws Exception {
        instanciaMain.SeleccionarProducto(Valoresestaticos.COCA);
    }
}
