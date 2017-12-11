
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

/*
 * Ações dos botões da Janela do tipo A
 *
 * 
 */


public class ButtonHandler implements ActionListener {
    private JButton ok, cancela;
   
	
	public ButtonHandler(JButton ok, JButton cancela){
		this.ok = ok;
		this.cancela = cancela;
                
	}

	

    @Override
    public void actionPerformed(ActionEvent evento) {
		if(evento.getSource() == ok)
				JOptionPane.showMessageDialog(null, "O botão OK foi clicado");
			
		if(evento.getSource() == cancela)
			JOptionPane.showMessageDialog(null, "O botão CANCELA foi clicado");
	

    }
}