package Visual.Botones;

import Tarea.Valoresestaticos;
import Visual.MainVisual;

public class BotonSerranita extends BotonUltra {
    public BotonSerranita(MainVisual main) {
        super(main);
        setImage("/Serranita.png");
    }

    @Override
    public void crearElemento() throws Exception {
        instanciaMain.SeleccionarProducto(Valoresestaticos.SERRANITA);
    }

}
