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



interface TelaCadastro{
    
    public static void main(String[] args) {
        JFrame telaCadastro= new JFrame("Tela de cadastro");
         telaCadastro.setSize(250,150);
         telaCadastro.setBackground(Color.RED);
        JTextField entradaNome=new JTextField("  ");
        entradaNome.setSize(100 ,50);
        entradaNome.setPreferredSize(new Dimension(100, 20));
        JLabel nomeUser=new JLabel("nome:");
        JPasswordField senhaUser= new JPasswordField("");
        JLabel senhadoUser=new JLabel("senha:");
        senhaUser.setPreferredSize(new Dimension(100, 20));
        JButton botaoEnviar=new JButton("enviar");
           
        
        
        
         JPanel painelCadastro= new JPanel();
         
         painelCadastro.setBackground(Color.gray);
         painelCadastro.add(nomeUser);
         painelCadastro.add(entradaNome);
         painelCadastro.add(senhadoUser);
         painelCadastro.add(senhaUser);
         painelCadastro.add(botaoEnviar);
         telaCadastro.add(painelCadastro);
            telaCadastro.setVisible(true);

    
    
    
    
    
    
    } 
        
    
        
    
    
}
