package Visual;

import javax.swing.*;
import Visual.Botones.*;
import java.awt.*;

public class JPanelProducto extends JPanel {
    public JPanelProducto(MainVisual main) {
        super();
        setLayout(null);
        BotonSerranita serranita = new BotonSerranita(main);
        serranita.setBounds(30, 50, 100, 100);
        this.add(serranita);
        BotonSuper8 super8 = new BotonSuper8(main);
        super8.setBounds(140, 50, 100, 100);
        this.add(super8);
        BotonSnickers snickers = new BotonSnickers(main);
        snickers.setBounds(250, 50, 100, 100);
        this.add(snickers);
        BotonCoca coca = new BotonCoca(main);
        coca.setBounds(30, 170, 100, 100);
        this.add(coca);
        BotonSprite sprite = new BotonSprite(main);
        sprite.setBounds(140, 170, 100, 100);
        this.add(sprite);
        BotonFanta fanta = new BotonFanta(main);
        fanta.setBounds(250, 170, 100, 100);
        this.add(fanta);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
    }
}