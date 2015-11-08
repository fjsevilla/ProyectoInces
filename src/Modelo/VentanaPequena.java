package Modelo;

/*import BD.Insertar;
import Controlador.Acciones;
import Controlador.EscuchaBoton;
import Modelo.Botones;
import Modelo.Tabla;
*/import java.awt.BorderLayout;
import Modelo.CampoTexto;
import javax.swing.JFrame;

//Ventana Componente

public class VentanaPequena extends JFrame implements Acciones{  
    
    Tabla tabla;
    Botones panelbotondos;
    CampoTexto panelnombre;
    Boolean modificar = false;
    String titulovent;
    
    public VentanaPequena(Tabla tabcom, String titulo, String etiqueta){
        this(tabcom, false,titulo, etiqueta);
    } 
    
    public VentanaPequena(Tabla tabcom, Boolean mod, String titulo, String etiqueta){
        
        tabla = tabcom;
        modificar = mod;
        titulovent = titulo;
            
        panelnombre = new CampoTexto(etiqueta,25);  
        panelbotondos = new Botones(new String[]{"Aceptar","Cancelar"});  
        
        
        panelbotondos.asignarOyente(0, new EscuchaBoton(this, panelbotondos));
        panelbotondos.asignarOyente(1, new EscuchaBoton(this, panelbotondos));
        
        setTitle(titulovent);
        setVisible(true); 
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        
        add(panelnombre,BorderLayout.NORTH);
        add(panelbotondos,BorderLayout.SOUTH);
        pack();    
    }
    
    public void setTexto(String texto){
        panelnombre.cambiarContenido(texto);
    }

    @Override
    public void aceptar() {  
        if (modificar)
            tabla.modificarFila(panelnombre.obtenerContenido());
        else{
            tabla.agregarFila(new String[]{panelnombre.obtenerContenido(),"0"});
            if (titulovent == "Componente"){
            new Insertar().insertarComponente(tabla.obtenerTabla().getRowCount(),
                    panelnombre.obtenerContenido());}
            if (titulovent == "Laboratorio"){
            new Insertar().insertarLaboratorio(tabla.obtenerTabla().getRowCount(),
                    panelnombre.obtenerContenido());}
            if (titulovent == "Unidad de Medida"){
            new Insertar().insertarUdeMedida(tabla.obtenerTabla().getRowCount(),
                    panelnombre.obtenerContenido());}
            
        }
        this.dispose();
    }

    @Override
    public void cancelar() {
        this.dispose();
    }

    
    public void modificar() {}

    
    public void incluir() {}

    
    public void cerrar() {}

    
    public void eliminar() {}

}



