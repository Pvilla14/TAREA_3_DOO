package Visual;
import Visual.Botones.BotonSerranita;
import Visual.Botones.BotonSnickers;
import Visual.Botones.BotonSuper8;

import javax.swing.*;
import java.awt.*;

public class JPanelDulces extends JPanel {
    public JPanelDulces(MainVisual main) {
        super();
        setLayout(null);
        BotonSerranita serranita = new BotonSerranita(main);
        serranita.setBounds(30,50,100,100);
        this.add(serranita);
        BotonSuper8 super8 = new BotonSuper8(main);
        super8.setBounds(140,50,100,100);
        this.add(super8);
        BotonSnickers snickers = new BotonSnickers(main);
        snickers.setBounds(250,50,100,100);
        this.add(snickers);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.RED);
    }
}
