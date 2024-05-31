package Visual;
import javax.swing.*;

public class Pantalla extends JFrame{
    public Pantalla(MainVisual main) {
        super();
        this.setSize(1500,800);
        int ancho = this.getWidth();
        int largo = this.getHeight();
        setTitle("Pantalla");
        this.setLayout(null);

        this.add(new JPanelExpendedor(main, largo, ancho));
        this.add(new JPanelMonedas(main, largo, ancho));

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}