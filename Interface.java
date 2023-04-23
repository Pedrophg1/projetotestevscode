package votacao;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Interface {

    public static void main(String[] args) {

        
        // Cria a interface como no seu exemplo
        JFrame miJFrame = new JFrame("exemplo");
        miJFrame.setSize(350, 150);

        JPanel miJPanel = new JPanel();
        miJPanel.setSize(300, 300);
        JLabel miJLabel = new JLabel();
        miJLabel.setText("Descreva:   ");
        JTextField miJTexto= new JTextField("Digite algo aqui");
        miJTexto.setText("");
        miJTexto.setPreferredSize(new Dimension(150, 100));
        JTextArea miJTextArea = new JTextArea(5, 20);
        JButton miJButton = new JButton("Enviar");

        miJPanel.add(miJLabel);
        miJPanel.add(miJButton);
        miJPanel.add(miJTexto);    
        miJFrame.add(miJPanel);

        // Adiciona um ouvinte de eventos ao botão "Enviar"
        miJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Recupera o texto da área de texto
                String descricao = miJTexto.getText();

                // Cria uma nova instância da classe "Votacao"
                Votacao votacao = new Votacao(descricao);
                // Processa o resultado da votação
                votacao.processarResultado();
            }
        });

        miJFrame.setVisible(true);
    }
}

