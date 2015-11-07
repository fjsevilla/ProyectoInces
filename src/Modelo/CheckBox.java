package Modelo;

import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class CheckBox extends JPanel{
	
    private final JCheckBox botones[]; 
	
	public CheckBox(String[] nombres){

		botones = new JCheckBox[nombres.length]; 

		for(int cuenta = 0; cuenta < nombres.length; cuenta++){
			botones[cuenta] = new JCheckBox(nombres[cuenta]);
                        this.add(botones[cuenta]);
		} 
	} 
        
        public void asignarOyente(int numBoton, ActionListener oyente){
            if (numBoton >= 0 && numBoton < obtenerBotones().length)
                botones[numBoton].addActionListener(oyente);
        }
	
        public JCheckBox[] obtenerBotones(){
            return botones;
        }

}