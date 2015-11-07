package Modelo;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Botones extends JPanel{
	
    private final JButton botones[]; 
	
	public Botones(String[] nombres){

		botones = new JButton[nombres.length]; 

		for(int cuenta = 0; cuenta < nombres.length; cuenta++){
			botones[cuenta] = new JButton(nombres[cuenta]);
                        this.add(botones[cuenta]);
		} 
	} 
        
        public void asignarOyente(int numBoton, ActionListener oyente){
            if (numBoton >= 0 && numBoton < obtenerBotones().length)
                botones[numBoton].addActionListener(oyente);
        }
	
        public JButton[] obtenerBotones(){
            return botones;
        }

}