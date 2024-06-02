package Visual;
import Tarea.Expendedor;

import javax.swing.*;

public class Pantalla extends JFrame{
    public Pantalla(MainVisual main, Expendedor ex) {
        super();
        this.setSize(1000,800);
        int ancho = this.getWidth();
        int largo = this.getHeight();
        setTitle("Pantalla");
        this.setLayout(null);

        this.add(new JPanelExpendedor(main, largo, ancho, ex));
        this.add(new JPanelMonedas(main, largo, ancho));

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}