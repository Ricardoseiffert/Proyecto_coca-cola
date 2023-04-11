package proyecto;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URISyntaxException;


public class Pantalla_Principal extends JFrame implements ActionListener{

    private JLabel      label1, label2, label3, label4, label5, label6, label7, label8;
    private JMenuBar    bar1;
    private JMenu       menu1, menu2, menu3, menu4, menu5, menu6, menu7;
    private JMenuItem   item1, item2, item3,item4, item5, item6, item7, item8, item9;
    private JTextField  text1, text2, text3;
    private JComboBox   box1, box2;
    private JScrollPane panel1;
    private JTextArea   textarea1;
       
    
    public Pantalla_Principal(){
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        setLayout(null);
        
        setIconImage(new ImageIcon(getClass().getResource("iconococacola.jpg")).getImage()); 
        
        setTitle("Interfaz calculo de vacaciones");
        
        getContentPane().setBackground(new Color(255,0,0));
        
        textarea1 = new JTextArea();
        textarea1.setEditable(false);
        textarea1.setForeground(Color.blue);
        textarea1.setFont(new Font("Calibri",2, 16));
        textarea1.setText("\n   Resultado: ");

        panel1 = new JScrollPane(textarea1);
        panel1.setBounds(340,270,400,200);
        add(panel1);
        
        bar1 = new JMenuBar();
        setJMenuBar(bar1);
        
        menu1 = new JMenu("Opciones");
        bar1.add(menu1);
        
        menu2 = new JMenu("Color de fondo");
        menu1.add(menu2);
        
        item1 = new JMenuItem("Original");
        menu2.add(item1);
        item1.addActionListener(this);
        
        item2 = new JMenuItem("Gris");
        menu2.add(item2);
        item2.addActionListener(this);

        item3 = new JMenuItem("Anaranjado");
        menu2.add(item3);
        item3.addActionListener(this);
        
        item6 = new JMenuItem("Rosado");
        menu2.add(item6);
        item6.addActionListener(this);
       
        
        menu3 = new JMenu("Calcular");
        bar1.add(menu3);
        
        item4 = new JMenuItem("Calcular Vacaciones");
        menu3.add(item4);
        item4.addActionListener(this);
        
        item7 = new JMenuItem("Hacer nuevo calculo");
        menu3.add(item7);
        item7.addActionListener(this);
        
        menu4 = new JMenu("Regresar");
        menu1.add(menu4);
        
        item5 = new JMenuItem("Regresar a la Bienvenida");
        item5.addActionListener(this);
        menu4.add(item5);
        
        menu5 = new JMenu("Acerca de");
        bar1.add(menu5);
        
        menu6 = new JMenu("Desarrollador interfaz");
        menu6.addActionListener(this);
        menu5.add(menu6);
        
        item8 = new JMenuItem("Andr3x_Seiffert");
        item8.addActionListener(this);
        menu6.add(item8);
        
        menu7 = new JMenu("Pagina Coca-Cola");
        menu7.addActionListener(this);
        menu5.add(menu7);
        
        item9 = new JMenuItem("Coca-Cola");
        item9.addActionListener(this);
        menu7.add(item9);
                
                
        label1 = new JLabel("Nombre completo: ");
        label1.setBounds(30, 260, 150, 20);
        label1.setForeground(Color.white);
        add(label1);
        
        label2 = new JLabel("Apellido paterno:");
        label2.setBounds(30,330,150,20);
        label2.setForeground(Color.white);
        add(label2);
        
        label3 = new JLabel("Apellido materno:");
        label3.setBounds(30,400,150,20);
        label3.setForeground(Color.white);
        add(label3);
        
        ImageIcon imagen = new ImageIcon(getClass().getResource("Coca-Cola_logo_white (1).png"));
        label4 =new JLabel(imagen);
        label4.setBounds(30,20,200,200);
        add(label4);
        
        label5 = new JLabel("Elija el Departamento:");
        label5.setBounds(350,110,200,25);
        label5.setForeground(Color.white);
        add(label5);
        
        label6 = new JLabel("Elija sus años de servicio:");
        label6.setBounds(350,170,200,25);
        label6.setForeground(Color.white);
        add(label6);
        
        label7 = new JLabel("©2017 The Coca-Cola Company.");
        label7.setBounds(610,520,200,25);
        label7.setForeground(Color.white);
        add(label7);
        
        label8 = new JLabel("¡Hola! "+ Bienvenido.error + " Bienvenido a la Interfaz.");
        label8.setBounds(280,60,600,25);
        label8.setFont(new Font("Arial",3,25));
        label8.setForeground(Color.white);
        add(label8);
        
        text1 = new JTextField();
        text1.setBounds(30, 280, 150, 25);
        add(text1);
        
        text2 = new JTextField();
        text2.setBounds(30, 350, 150, 25);
        add(text2);
        
        text3 = new JTextField();
        text3.setBounds(30, 420, 150, 25);
        add(text3);
        
                

        
        box1 = new JComboBox();
            box1.setBounds(350,140,200,25);
            box1.addItem("Seleccione");
            box1.addItem("Atencion al cliente");
            box1.addItem("Departamento de Logistica");
            box1.addItem("Departamentos de Gerentes");
        add(box1);
        
        box2 = new JComboBox();
        box2.setBounds(350,200,200,25);
            box2.addItem("Seleccione");
            box2.addItem("1 año de servicio.");
            box2.addItem("2 a 6 años de servicio.");
            box2.addItem("7 años o mas de servicio.");
        add(box2);
        

        
    }
    
    
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()== item1){
        getContentPane().setBackground(new Color(255,0,0));
    }
        if(e.getSource()== item2){
        getContentPane().setBackground(new Color(81,90,90));
    }
        if(e.getSource()== item3){
        getContentPane().setBackground(new Color(255,166,0));
    }
        if(e.getSource()==item6){
        getContentPane().setBackground(new Color(255,0,120));
        } 
        
        
        if(e.getSource()== item5){
            
        Bienvenido Bienvenido1 = new Bienvenido();
        Bienvenido1.setBounds(0,0,310,460);
        Bienvenido1.setVisible(true);
        Bienvenido1.setResizable(false);
        Bienvenido1.setLocationRelativeTo(null);
        
        this.dispose();
    }
        
        if(e.getSource()==item7){
            
            text1.setText(null);
            text2.setText(null);
            text3.setText(null);
            box1.setSelectedItem("Seleccione");
            box2.setSelectedItem("Seleccione");
            textarea1.setText("\n   Resultado:");
        }
        if(e.getSource() == item8){
            if(java.awt.Desktop.isDesktopSupported()){
                java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
                
                    if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                       
                        try{ 
                        java.net.URI uri = new java.net.URI("https://www.instagram.com/andr3x_seiffert/");
                        desktop.browse(uri);
                    }catch(URISyntaxException | IOException ex){}
                    }
        
            }
        }
        
        if(e.getSource() == item9){
            if(java.awt.Desktop.isDesktopSupported()){
                java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
                
                    if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                       
                        try{ 
                        java.net.URI uri = new java.net.URI("https://www.cocacoladechile.cl/");
                        desktop.browse(uri);
                    }catch(URISyntaxException | IOException ex){}
                    }
        
            }
        }
        
        if (e.getSource() == item4) {

        String nombreTrabajador = text1.getText();
        String ApellidoP        = text2.getText();
        String ApellidoM        = text3.getText();
        String Departamento     = box1.getSelectedItem().toString();
        String Antiguedad       = box2.getSelectedItem().toString();

        if(nombreTrabajador.equals("") || ApellidoP.equals("") || ApellidoM.equals("") 
         ||   Departamento.equals("Seleccione") || Antiguedad.equals("Seleccione")){

            JOptionPane.showMessageDialog(null,"Debes completar todos los campos.");

            } 
        else 
               {
                   
        if (e.getSource() == item4) {
            
        if(Departamento.equals("Atencion al cliente")){
            
        if(Antiguedad.equals("1 año de servicio.")){
               
            textarea1.setText("\n   El trabajador "+nombreTrabajador+" "+ApellidoP+" "+ApellidoM+
                             "\n   quien labora en "+ Departamento+
                             "\n   con "+ Antiguedad +
                             "\n   recibe 6 dias de vacaciones.");
            
        }
        if(Antiguedad.equals("2 a 6 años de servicio.")){
            
            textarea1.setText("\n   El trabajador "+nombreTrabajador+" "+ApellidoP+" "+ApellidoM+
                             "\n   quien labora en "+ Departamento+
                             "\n   con "+ Antiguedad +
                             "\n   recibe 14 dias de vacaciones.");
        }
        if(Antiguedad.equals("7 años o mas de servicio.")){
            
            textarea1.setText("\n   El trabajador "+nombreTrabajador+" "+ApellidoP+" "+ApellidoM+
                             "\n   quien labora en "+ Departamento+
                             "\n   con "+ Antiguedad +
                             "\n   recibe 20 dias de vacaciones.");
        }
        }
        
        
        if(Departamento.equals("Departamento de Logistica")){
            
            if(Antiguedad.equals("1 año de servicio.")){
               
            textarea1.setText("\n    El trabajador "+nombreTrabajador+" "+ApellidoP+" "+ApellidoM+
                             "\n    quien labora en "+ Departamento+
                             "\n    con "+ Antiguedad +
                             "\n    recibe 7 dias de vacaciones.");
            
        }
            if(Antiguedad.equals("2 a 6 años de servicio.")){
            
            textarea1.setText("\n   El trabajador "+nombreTrabajador+" "+ApellidoP+" "+ApellidoM+
                             "\n   quien labora en "+ Departamento+
                             "\n   con "+ Antiguedad +
                             "\n   recibe 15 dias de vacaciones.");
        }
            if(Antiguedad.equals("7 años o mas de servicio.")){
            
            textarea1.setText("\n   El trabajador "+nombreTrabajador+" "+ApellidoP+" "+ApellidoM+
                             "\n   quien labora en "+ Departamento+
                             "\n   con "+ Antiguedad +
                             "\n   recibe 22 dias de vacaciones.");
        }
        }
        
        if(Departamento.equals("Departamentos de Gerentes")){
            
           if(Antiguedad.equals("1 año de servicio.")){
               
            textarea1.setText("\n   El trabajador "+nombreTrabajador+" "+ApellidoP+" "+ApellidoM+
                             "\n   quien labora en "+ Departamento+
                             "\n   con "+ Antiguedad +
                             "\n   recibe 10 dias de vacaciones.");
            
        }
            if(Antiguedad.equals("2 a 6 años de servicio.")){
            
            textarea1.setText("\n   El trabajador "+nombreTrabajador+" "+ApellidoP+" "+ApellidoM+
                             "\n   quien labora en "+ Departamento+
                             "\n   con "+ Antiguedad +
                             "\n   recibe 20 dias de vacaciones.");
        }
            if(Antiguedad.equals("7 años o mas de servicio.")){
            
            textarea1.setText("\n   El trabajador "+nombreTrabajador+" "+ApellidoP+" "+ApellidoM+
                             "\n   quien labora en "+ Departamento+
                             "\n   con "+ Antiguedad +
                             "\n   recibe 30 dias de vacaciones.");
        }
            
         
        }
        }
        }
    }
 }
}