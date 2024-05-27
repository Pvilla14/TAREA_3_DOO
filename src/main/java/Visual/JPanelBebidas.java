package Visual;
import javax.swing.*;
import java.awt.*;

public class JPanelBebidas extends JPanel {
    public JPanelBebidas(MainVisual main) {
        super();
        setLayout(null);
        this.setBackground(Color.WHITE);
        BotonCoca coca = new BotonCoca(main);
        coca.setBounds(30,50,100,100);
        this.add(coca);
        BotonSprite sprite = new BotonSprite(main);
        sprite.setBounds(140,50,100,100);
        this.add(sprite);
        BotonFanta fanta = new BotonFanta(main);
        fanta.setBounds(250,50,100,100);
        this.add(fanta);
    }
}
