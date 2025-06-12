import javax.swing.*;
import java.awt.*;

public class TelaCadastroFuncionario extends JPanel {

    public TelaCadastroFuncionario() {
        setLayout(new GridBagLayout());
        setBackground(new Color(240, 240, 240));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 5, 10);
        gbc.anchor = GridBagConstraints.WEST;

        String[] labels = {"Nome:", "CPF:", "E-mail:", "Telefone:", "Especialidade:"};
        JTextField[] campos = new JTextField[labels.length];

        for (int i = 0; i < labels.length; i++) {
            gbc.gridx = 0;
            gbc.gridy = i;
            add(new JLabel(labels[i]), gbc);

            campos[i] = new JTextField(20); // largura reduzida
            gbc.gridx = 1;
            add(campos[i], gbc);
        }

        // Botão salvar
        JButton salvar = new JButton("Salvar");
        salvar.setPreferredSize(new Dimension(120, 30)); // botão menor
        gbc.gridy = labels.length;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(salvar, gbc);
    }
}
