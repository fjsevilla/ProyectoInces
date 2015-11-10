package Modelo;

import java.awt.Container;
import java.awt.GridLayout;


/**
 *
 * @author Yuli / Fr@n
 */
public class PanelCursos extends Container{
    
    PanelJComboBox areas, horaInicio, horaFin;
    CampoTexto nombre, duracion;
    
    public PanelCursos(){
        
        inicializar();
        
        areas = new PanelJComboBox("Area de Saber: ");
        horaInicio = new PanelJComboBox("Hora: ");
        horaFin = new PanelJComboBox(" a : ");
        duracion = new CampoTexto(5, "Duracion: ");
        nombre = new CampoTexto(15, "Nombre");
        
        llenarCombo(horaInicio);
        llenarCombo(horaFin);
        
        add(nombre);
        add(duracion);
        add(areas);
        add(horaInicio);
        add(horaFin);                 
    }
    
    private void inicializar(){
        setLayout(new GridLayout(3,2));
    }
    
    private void llenarCombo(PanelJComboBox panel){
        int x = 730;
        for (int i = 0; i < 20; i++){
            x+= 30;
            panel.agregarItem(x);
        }
    }

    
}
