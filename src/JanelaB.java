/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.*;


public abstract class JanelaB extends JFrame{ 
  
    JFrame frame ;
    Container container;
    ImageIcon img;
    JLabel label, label2;
    JPanel panel;
    
     public JanelaB(){
        alterarTitulo();
        criarJanela();
    }
    public void criarJanela(){
        
          frame = new JFrame("Janela B"); 
          container = frame.getContentPane(); 
          //carrega a imagem passando o nome da mesma  
          ImageIcon img = new ImageIcon("test.gif");  
           
         //pega a altura e largura  
         int altura = img.getIconHeight();  
         int largura = img.getIconWidth(); 
        
         //adiciona a imagem em um label
        label = new JLabel(img);
        
        //adiciona altura e largura em outro label
        label2 = new JLabel("Altura: "+altura+"      Largura: "+largura);
        
        //JPanel para colar os labels
        panel = new JPanel(); 
        panel.add(label, BorderLayout.NORTH);  
        panel.add(label2, BorderLayout.SOUTH);  
  
        //adiciona o panel no container  
        container.add(panel, BorderLayout.CENTER);  
        panel.setBackground(Color.red);
        frame.pack();  
        frame.setVisible(true); 
    
    }
    public abstract void alterarTitulo();
      
     
}
    
   
    

