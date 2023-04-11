package proyecto;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenido extends JFrame implements ActionListener,KeyListener {
    
    private JLabel label1, label2, label3, label4, label5;
    public JTextField text1;
    private JButton boton1;
    public static String error=" ";
    
    
public Bienvenido(){
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    setLayout(null);
    
    setTitle("Bienvenida");
    
    getContentPane().setBackground(new Color(255,0,0));
    
    setIconImage(new ImageIcon(getClass().getResource("iconococacola.jpg")).getImage());   
    
    label1 = new JLabel("Sistema de Control Vacacional" );
    label1.setBounds(35,140,255,70);
    label1.setFont(new Font("Andale Mono",3,17));
    label1.setForeground(Color.white);
    add(label1);
    
    
    label2 = new JLabel("Ingrese su nombre:");
    label2.setBounds(40,265,150,20);
    label2.setFont(new Font("Arial",3,13));
    label2.setForeground(Color.white);
    add(label2);
    
    label3 = new JLabel("©2017 The Coca-Cola Company.");
    label3.setBounds(110,395,200,30);
    label3.setForeground(Color.white);
    add(label3);
    
    ImageIcon imagen = new ImageIcon(getClass().getResource("Coca-Cola_logo_white (1).png"));
    label4 =new JLabel(imagen);
    label4.setBounds(50,0,200,200);
    add(label4);
    
    text1 = new JTextField();
    text1.setBounds(40,290,210,25);
    text1.addKeyListener(this);
    add(text1);
    
    boton1 = new JButton("Ingresar");
    boton1.setBounds(90,325,100,35);
    boton1.addActionListener(this);
    boton1.addKeyListener(this);
    add(boton1);
    
    
    
}
public void keyPressed(KeyEvent k){
        if(k.getExtendedKeyCode()== KeyEvent.VK_ENTER){
          boton1.requestFocus();
          boton1.doClick();

      }
 
  }
    public void keyTyped(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {

    }
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==boton1){
            error = text1.getText().trim();
        if(error.equals("")){
            JOptionPane.showMessageDialog(null, "Falta escribir el nombre...");
        } else{
       
        Termino_y_condiciones Bienvenido1 = new Termino_y_condiciones();
        
        Bienvenido1.setVisible(true);
        Bienvenido1.setResizable(false);
        Bienvenido1.setLocationRelativeTo(null);
        
        this.dispose();
        
        }
    
    }
    
}
}