package proyecto;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Termino_y_condiciones extends JFrame implements ActionListener, ChangeListener{
  
    private  JLabel label1;
    private  JTextArea textarea1;
    private  JScrollPane pane1;
    private  JButton boton1, boton2;
    private  JCheckBox check1;
    
    public Termino_y_condiciones(){
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setTitle("Terminos y condiciones");
        
        setSize(610,410);
        
        setLayout(null);
        
        setIconImage(new ImageIcon(getClass().getResource("iconococacola.jpg")).getImage()); 
        
    textarea1 = new JTextArea();
    textarea1.setEditable(false);
    textarea1.setFont(new Font("Andale Mono", 0, 9));
    textarea1.setText("\n\n      TÉRMINOS Y CONDICIONES" +
                    "\n\n        A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACION DE LA MISMA EMPRESA COCA-COLA." +
                    "\n        B.  PROHIBIDO LA ALTERACION DEL PRODUCTO AL MOMENTO DE SER DISTRIBUIDO." +
                    "\n        C.  Coca-Cola Company SE HARA RESPONSABLE DE TODO DAÑO FISICO POR CULPA DEL PRODUCTO." +
                    "\n\n      LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                    "\n      AIEP NO SE HARA CARGO DE TODO MAL USO DE ESTE SOFTWARE Y COMO TAMBIEN DE EL USO QUE SE LE DE" + 
                    "\n      HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
                    "\n      SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." + 
                    "\n\n      PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" );

    pane1 = new JScrollPane(textarea1);
    pane1.setBounds(10,40,575,200);
    add(pane1);
    
    check1 = new JCheckBox("Yo "+Bienvenido.error +" acepto los Terminos Y Condiciones." );
    check1.setBounds(10,270,320,20);
    check1.addChangeListener(this);
    add(check1);
    
    boton1 = new JButton("Continuar");
    boton1.setBounds(10,315,95,30);
    boton1.addActionListener(this);
    boton1.setEnabled(false);
    add(boton1);
    
    boton2 = new JButton("No acepto");
    boton2.setBounds(120, 315, 95, 30);
    boton2.addActionListener(this);
    boton2.setEnabled(true);
    add(boton2);
    
    ImageIcon imagen = new ImageIcon(getClass().getResource("COCACOLA(1).png"));
    label1 = new JLabel(imagen);
    label1.setBounds(215,220,400,200);
    add(label1);
    
    }
    
    
    public void stateChanged(ChangeEvent a){
        if(check1.isSelected() == true){
            boton1.setEnabled(true);
            boton2.setEnabled(false);
            
        }else{
            boton1.setEnabled(false);
            boton2.setEnabled(true);
            
        }
    }
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == boton1){
        Pantalla_Principal Pantalla_Principal1 = new Pantalla_Principal();
        Pantalla_Principal1.setBounds(0,0,810,610);
        Pantalla_Principal1.setVisible(true);
        Pantalla_Principal1.setResizable(false);
        Pantalla_Principal1.setLocationRelativeTo(null);
        
        this.dispose();
        }
        if(e.getSource() == boton2){
        Bienvenido Bienvenido1 = new Bienvenido();
        Bienvenido1.setBounds(0,0,310,460);
        Bienvenido1.setVisible(true);
        Bienvenido1.setResizable(false);
        Bienvenido1.setLocationRelativeTo(null);
        
        this.dispose();
        }
    }

}