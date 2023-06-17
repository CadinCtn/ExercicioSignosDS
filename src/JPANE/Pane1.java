package JPANE;

import aula4.*;


import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Dialog.ModalityType;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class Pane1 {


public static void pergSimples() {
	String resposta = JOptionPane.showInputDialog("Qual o seu nome?");
    System.out.println(resposta);
}

public static void pergSugestao() {
	String resposta = JOptionPane.showInputDialog("Qual o seu nome?", "Ana Júlia");
    System.out.println(resposta);

}

public static void dropDownString() {

	  String[] options = {"O maior dos clássicos", "Talvez","Desconheço", "Lixo"};
      ImageIcon icon = new ImageIcon("src/images/teste4.jpg");
      String n = (String)JOptionPane.showInputDialog(null, "Você conhece Pokémon??", 
              "Pokémon", JOptionPane.QUESTION_MESSAGE, icon, options, options[0]);
      System.out.println(n);

}

public static void exemploClick() {
	  Object[] options = {"Opção 1", "Opção 2", "Opção 3"};
      
      int selectedOption = JOptionPane.showOptionDialog(null,
              "Selecione uma opção",
              "JOptionPane com opções clicáveis",
              JOptionPane.DEFAULT_OPTION,
              JOptionPane.INFORMATION_MESSAGE,
              null,
              options,
              options[0]);
      
      // Verificar qual opção foi selecionada
      if (selectedOption == 0) {
          JOptionPane.showMessageDialog(null, "Você selecionou a Opção 1");
      } else if (selectedOption == 1) {
          JOptionPane.showMessageDialog(null, "Você selecionou a Opção 2");
      } else if (selectedOption == 2) {
          JOptionPane.showMessageDialog(null, "Você selecionou a Opção 3");
      }

}

public static void avisos() {
	JOptionPane.showMessageDialog(null, "Este é um aviso!", "Aviso", JOptionPane.WARNING_MESSAGE);

}


public static void tela() {
    JDialog dialog = new JDialog();
    dialog.setModalityType(ModalityType.APPLICATION_MODAL);
    dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    String mensagem = "Olá, descubra seu signo com nosso horoscopo!!!";
    JPanel panel = new JPanel(new BorderLayout());
    JLabel label = new JLabel(mensagem, SwingConstants.CENTER);
    label.setFont(new Font("Arial", Font.BOLD, 30));
    panel.add(label, BorderLayout.CENTER);
     
    dialog.getContentPane().add(panel);
    dialog.setSize(800, 600);
    dialog.setLocationRelativeTo(null);
    dialog.setVisible(true);
    
    
    Object[] options = {"Opção 1", "Opção 2", "Opção 3"};
    
    int selectedOption = JOptionPane.showOptionDialog(null,
            "Selecione uma opção",
            "JOptionPane com opções clicáveis",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            null,
            options,
            
            options[0]);

}
	//public static void main(String[] args) {
        //Pergunta simples
		//pergSimples();
		
		//Pergunta com sugestão
		//pergSugestao();
		
		//Drop Down com imagem
		//dropDownString();
		
		//Tela com botões Clicáveis
		//exemploClick();
		
		//Avisos
		//avisos();
		
		//Tela JFRAME
		//tela();
		
		;
	}
// }
