package Visual.Botones;

import Tarea.Valoresestaticos;
import Visual.MainVisual;

public class BotonSprite extends BotonUltra{
    public BotonSprite(MainVisual main) {
        super(main);
        setImage("/Sprite.png");
    }

    @Override
    public void crearElemento() {
        System.out.println("Se selecciono una bebida Sprite");
        instanciaMain.SeleccionarProducto(Valoresestaticos.SPRITE);
    }
}