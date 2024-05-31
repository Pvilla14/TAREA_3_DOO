package Visual;

import javax.swing.*;

public class Pantalla extends JFrame {
    public Pantalla(MainVisual main) {
        super();
        setTitle("Pantalla");
        this.setLayout(null);

        this.add(new JPanelExpendedor(main));
        this.add(new JPanelMonedas(main));

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1000, 800);
        this.setVisible(true);
    }
}