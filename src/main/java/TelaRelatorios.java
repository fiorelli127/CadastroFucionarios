import javax.swing.*;
import java.awt.*;

public class TelaRelatorios extends JPanel {
    public TelaRelatorios() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        add(new JLabel("Relatório de Atividades do Professor:"));
        add(Box.createRigidArea(new Dimension(0, 10)));

        JTextArea relatorio = new JTextArea(10, 50);
        relatorio.setText(
            "Nome: João Silva\n" +
            "Aulas dadas: 25\n" +
            "Pagamentos realizados: Sim\n" +
            "Próxima aula: 14/06/2025\n"
        );
        relatorio.setEditable(false);
        add(new JScrollPane(relatorio));
    }
}
