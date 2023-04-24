package votacao;

import javax.swing.*;
import java.awt.*;

public class TelaCadastro implements Runnable {

    public void run() {
        JFrame telaCadastro = new JFrame("Tela de voto");
        telaCadastro.setSize(300, 200);
        telaCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel numberUser = new JLabel("Número:");
        JTextField entradaNome = new JTextField("");
        JLabel nameUser = new JLabel("Nome:");
        JLabel partidoUser = new JLabel("Partido:");
        JButton botaoEnviar = new JButton("Enviar");

        JPanel painelCadastro = new JPanel(new GridLayout(0, 2, 5, 5));
        painelCadastro.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        painelCadastro.add(numberUser);
        painelCadastro.add(entradaNome);
        painelCadastro.add(nameUser);
        painelCadastro.add(new JPanel()); // espaço em branco
        painelCadastro.add(new JPanel()); // espaço em branco
        painelCadastro.add(partidoUser);
        painelCadastro.add(new JPanel()); // espaço em branco
        painelCadastro.add(new JPanel()); // espaço em branco
        painelCadastro.add(botaoEnviar);

        telaCadastro.add(painelCadastro);
        telaCadastro.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new TelaCadastro());
    }
}
