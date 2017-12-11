
import java.awt.Color;
import javax.swing.JOptionPane;


public class JanelaA2 extends JanelaA {
   
    @Override
    public void alterarTitulo() {
        JOptionPane.showMessageDialog(this,"Janela A2");
    }
    
     @Override
     public void alterarFundo(){
        panel.setBackground(Color.PINK);
    
     }
     
    }

   


