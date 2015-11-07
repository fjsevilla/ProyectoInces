package Modelo;

import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.JPanel;

// Panel de la Clase JComboBOx que contiene Seleccion de Laboratorios

public class PanelJComboBox extends JPanel {

    private final JPanel panelcentral; 
    JComboBox combo;
    
    public PanelJComboBox(String etiqueta) {
        
        //Instanciando panel central
        panelcentral = new JPanel();        
              
        add(panelcentral);
        
        panelcentral.setBorder(javax.swing.BorderFactory.createTitledBorder(etiqueta));
       
        combo = new JComboBox ();
        combo.setPreferredSize(new Dimension(100, 25));
        panelcentral.add(combo);
    }
    
    public void agregarItem(String item){        
        combo.addItem(item);
    }
    
    public String obtenerContenido(){
        return (String) combo.getSelectedItem();
    }
    
    public int obtenerSeleccion(){
        return combo.getSelectedIndex();
    }
    
}
