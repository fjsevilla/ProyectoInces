package Modelo;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

/**
 *
 * @author Soporte
 */
public class Login extends JFrame {
    
        private JPanel panelUser, panelPass,panelCarga, panelBoton, panelImagen, panelDerecho;
        private JTextField txtUser, txtPass;
        private JLabel lblUser, lblPass;
        private JButton btnAceptar, btnCancelar;
        private JProgressBar barra;
        String usuario, elPassword;
 
    Login()
    {
 
        Container contenedor = getContentPane();
        contenedor.setLayout(new GridLayout(1,2));
        //se instancian 3 paneles
        panelUser = new JPanel();
        panelPass = new JPanel();
        panelCarga = new JPanel();
        panelBoton = new JPanel();
        panelImagen = new JPanel();
        panelDerecho = new JPanel();
        
        //se adiciona los layout
        panelUser.setLayout(new FlowLayout());
        panelPass.setLayout(new FlowLayout());
        panelCarga.setLayout(new FlowLayout());
        panelBoton.setLayout(new FlowLayout());
        panelDerecho.setLayout(new GridLayout(4,1));
        
         
        // crear etiqueta y cuadro de texto del usuario
        txtUser = new JTextField(10);
        lblUser = new JLabel("Usuario: ");
        txtUser.setToolTipText("Escriba su nombre de usuario");        
        panelUser.add(lblUser);
        panelUser.add(txtUser);
        //contenedor.add(Box.createVerticalStrut(50));
        panelDerecho.add(panelUser);
 
        //crear etiqueta y cuadro de texxto del pw
        txtPass = new JPasswordField(10);
        lblPass = new JLabel("Contraseña: ");
        txtPass.setToolTipText("Escriba su contraseña");
        panelPass.add(lblPass);
        panelPass.add(txtPass);
        panelDerecho.add(panelPass);
        
        //crear barra de carga
        barra = new JProgressBar();
        panelCarga.add(barra);
        panelDerecho.add(panelCarga);
 
        //Crear y agregar los botones 
        btnAceptar = new JButton("Aceptar");
        //establecer Boton aceptar por defecto
        getRootPane().setDefaultButton(btnAceptar);
 
        btnCancelar = new JButton("Cancelar");
        panelBoton.add(btnAceptar);
        panelBoton.add(btnCancelar);
        panelDerecho.add(panelBoton);
        
        //colocamos la imagen en el panel lateral
        
        panelImagen.setOpaque(false);
        
        contenedor.add(panelImagen);
        contenedor.add(panelDerecho);
    
        setTitle("Acceso al Sistema");
        setSize(410,220);           // Tamanio del Frame 
        setResizable(true);       // que no se le pueda cambiar el tamanio 
        //Centrar la ventana de autentificacion en la pantalla
        Dimension tamFrame=this.getSize();//para obtener las dimensiones del frame
        Dimension tamPantalla=Toolkit.getDefaultToolkit().getScreenSize();      //para obtener el tamanio de la pantalla
        setLocation((tamPantalla.width-tamFrame.width)/2, (tamPantalla.height-tamFrame.height)/2);  //para posicionar
        setVisible(true);     
    }
    
    public static void main(String[] args)
    {
        Login prueba = new Login();
        prueba.setDefaultCloseOperation(prueba.EXIT_ON_CLOSE);
    }
}
