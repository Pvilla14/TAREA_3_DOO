package Visual.Botones;

import Tarea.Valoresestaticos;
import Visual.MainVisual;

public class BotonSprite extends BotonUltra{
    public BotonSprite(MainVisual main) {
        super(main);
        setImage("/Sprite.png");
    }

    @Override
    public void crearElemento() throws Exception {
        instanciaMain.SeleccionarProducto(Valoresestaticos.SPRITE);
    }
}