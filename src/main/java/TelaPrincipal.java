import javax.swing.*;
import java.awt.*;

public class TelaPrincipal extends JFrame {

    JPanel painelLateral;
    JPanel painelCentral;

    public TelaPrincipal() {
        setTitle("Sistema de Professores");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        
        painelLateral = new JPanel();
        painelLateral.setLayout(new BoxLayout(painelLateral, BoxLayout.Y_AXIS));
        painelLateral.setBackground(new Color(50, 50, 50));
        painelLateral.setPreferredSize(new Dimension(200, 0));

        String[] nomesTelas = {"Cadastro", "Pagamento", "Agendamento", "Relatórios"};
        for (String nome : nomesTelas) {
            JButton botao = new JButton(nome);
            botao.setAlignmentX(Component.CENTER_ALIGNMENT);
            botao.setMaximumSize(new Dimension(180, 40));
            botao.addActionListener(e -> trocarTela(nome));
            painelLateral.add(Box.createRigidArea(new Dimension(0, 10)));
            painelLateral.add(botao);
        }

        
        painelCentral = new JPanel(new BorderLayout());

        add(painelLateral, BorderLayout.WEST);
        add(painelCentral, BorderLayout.CENTER);

       
        trocarTela("Cadastro");

        setVisible(true);
    }

    private void trocarTela(String nome) {
        painelCentral.removeAll();

        switch (nome) {
            case "Cadastro":
                painelCentral.add(new TelaCadastroFuncionario());
                break;
            case "Pagamento":
                painelCentral.add(new TelaPagamento());
                break;
            case "Agendamento":
                painelCentral.add(new TelaAgendamento());
                break;
            case "Relatórios":
                painelCentral.add(new TelaRelatorios());
                break;
        }

        painelCentral.revalidate();
        painelCentral.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaPrincipal());
    }
}
