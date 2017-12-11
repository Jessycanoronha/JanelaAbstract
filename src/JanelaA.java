
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public abstract class JanelaA extends JFrame{
   
        JFrame frame ;
        Container container;
        ImageIcon img,img2;
        JLabel label, label2;
        JPanel panel;
   
    
    JanelaA(){
        alterarTitulo();
        criarJanela();
        alterarFundo();
    }

   
    public void criarJanela() {
            frame = new JFrame("Janela A");
            
            container = frame.getContentPane();
            
            //carrega a imagem  
            ImageIcon img = new ImageIcon("ryu_animated.gif");  
            ImageIcon img2 = new ImageIcon("akuma1.gif");
            
             //pega a altura e largura  
             int altura = img.getIconHeight();  
             int largura = img.getIconWidth();
             
            //adiciona a imagem em um label
            label = new JLabel(img);
            
             
            label2 = new JLabel(img2);
            
            //JPanel para colar os labels
            panel = new JPanel(); 
            panel.add(label, BorderLayout.NORTH);  
            panel.add(label2, BorderLayout.SOUTH);  
  
            //adiciona o panel no container  
            container.add(panel, BorderLayout.CENTER);  
            //panel.setBackground(Color.blue);
            frame.pack();  
            frame.setVisible(true);  
      
    } 
    public abstract void alterarFundo();
    
    public abstract void alterarTitulo();
}
    
