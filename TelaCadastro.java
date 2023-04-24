package votacao;
import javax.swing.*;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class TelaCadastro implements Runnable {

    public void run() {
        JFrame telaCadastro = new JFrame("Tela de voto");
        telaCadastro.setSize(300, 200);
        telaCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField entradaNome = new JTextField("");
        JLabel numberUser = new JLabel("Número:");
        JLabel nameUser = new JLabel("Nome:");
        JTextField entradaName = new JTextField("");
        entradaName.setPreferredSize(new Dimension(200, 20));
        JLabel partidoUser = new JLabel("Partido:",  JLabel.LEFT  );
        JButton botaoEnviar = new JButton("Enviar");

        JPanel painelCadastro = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 5, 5); // espaçamento entre componentes

        c.gridx = 0;
        c.gridy = 0;
        painelCadastro.add(numberUser, c);

        c.gridx = 1;
        c.gridy = 0;
        c.fill = GridBagConstraints.HORIZONTAL; // preencher horizontalmente
        c.weightx = 1; // expandir horizontalmente
       
        entradaNome.setPreferredSize(new Dimension(200, 20)); // definir tamanho preferido
        painelCadastro.add(entradaNome, c);

        c.gridx = 0;
        c.gridy = 1;
        painelCadastro.add(nameUser, c);

        c.gridx = 1;
        c.gridy = 1;
        c.fill = GridBagConstraints.HORIZONTAL; // preencher horizontalmente
        c.weightx = 0; // expandir horizontalmente
        
        
        painelCadastro.add(entradaName, c);
         c.gridx = 1;
        c.gridy = 3;
        c.fill = GridBagConstraints.VERTICAL;
        c.weighty = 1;
        painelCadastro.add(partidoUser);
        c.gridx = 0;
        c.gridy = 0;
        c.fill = GridBagConstraints.HORIZONTAL; // preencher horizontalmente
        c.weightx = 0; // expandir horizontalmente
        
        painelCadastro.add(Box.createVerticalGlue());
        c.gridx = 1;
        c.gridy = 2;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weighty = 1;
        painelCadastro.add(botaoEnviar,c);

        telaCadastro.add(painelCadastro);
        telaCadastro.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new TelaCadastro());
    }
}
