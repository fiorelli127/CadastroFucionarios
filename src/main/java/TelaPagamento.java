import javax.swing.*;
import java.awt.*;

public class TelaPagamento extends JPanel {
    public TelaPagamento() {
        setLayout(new GridLayout(4, 2, 10, 10));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        add(new JLabel("Nome do Professor:"));
        add(new JTextField());

        add(new JLabel("Valor a pagar:"));
        add(new JTextField());

        add(new JLabel("Data de Pagamento:"));
        add(new JTextField());

        JButton pagar = new JButton("Registrar Pagamento");
        add(pagar);
        add(new JLabel());
    }
}
