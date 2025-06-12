import javax.swing.*;
import java.awt.*;

public class TelaAgendamento extends JPanel {
    public TelaAgendamento() {
        setLayout(new GridLayout(4, 2, 10, 10));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        add(new JLabel("Professor:"));
        add(new JTextField());

        add(new JLabel("Data:"));
        add(new JTextField());

        add(new JLabel("Horário:"));
        add(new JTextField());

        JButton agendar = new JButton("Agendar Aula");
        add(agendar);
        add(new JLabel());
    }
}
