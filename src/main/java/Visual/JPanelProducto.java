package Visual;

import javax.swing.*;
import java.awt.*;
import Visual.Botones.*;
import Tarea.Valoresestaticos;

public class JPanelProducto extends JPanel {
    private Valoresestaticos valor;
    private JLabel saldoLabel; // Etiqueta para mostrar el saldo

    public JPanelProducto(JPanelExpendedor jpex, JPanelMonedas botonesMonedas) {
        super();
        this.saldoLabel = saldoLabel; // Asignar la etiqueta de saldo
        setLayout(null);

        // Agregar botones con etiquetas de precios
        addProductButtonWithPrice(new BotonSerranita(jpex, botonesMonedas), Valoresestaticos.SERRANITA, 30, 50);
        addProductButtonWithPrice(new BotonSuper8(jpex, botonesMonedas), Valoresestaticos.SUPER8, 140, 50);
        addProductButtonWithPrice(new BotonSnickers(jpex, botonesMonedas), Valoresestaticos.SNICKERS, 250, 50);
        addProductButtonWithPrice(new BotonCoca(jpex, botonesMonedas), Valoresestaticos.COCA, 30, 200);
        addProductButtonWithPrice(new BotonSprite(jpex, botonesMonedas), Valoresestaticos.SPRITE, 140, 200);
        addProductButtonWithPrice(new BotonFanta(jpex, botonesMonedas), Valoresestaticos.FANTA, 250, 200);
    }

    private void addProductButtonWithPrice(JButton button, Valoresestaticos valor, int x, int y) {
        button.setBounds(x, y, 100, 100);
        this.add(button);

        JLabel priceLabel = new JLabel("$" + valor.getCoste());
        priceLabel.setBounds(x, y + 110, 100, 20);
        priceLabel.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(priceLabel);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setOpaque(false);
    }
}
