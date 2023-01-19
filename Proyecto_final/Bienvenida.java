package Proyecto_final;
import java.sql.Connection;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import conexion.Usuarios;
/**
 *
 * @author pzx64
 */
public class Bienvenida extends JFrame implements ActionListener{
    private Usuarios CP = new Usuarios();
    private JTextField textfield, textFEdad;
    private JLabel label1, label2, label3, label4, label5;
    private JButton button;
    public static int edad = 0;
    public static String nombre = "";
    Connection cn;
    public Bienvenida(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(63, 164, 246));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        
        ImageIcon imagen = new ImageIcon(getClass().getResource("images/logo.png"));
        label1 = new JLabel(imagen);
        label1.setBounds(25,15,300,150);
        add(label1);
        
        label2 = new JLabel("Sistema de Busqueda Pacientes");
        label2.setBounds(35,135,300,30);
        label2.setFont(new Font("Andale Mono", 3, 18));
        label2.setForeground(new Color(255,255,255));
        add(label2);
        
        label3 = new JLabel("Ingrese su nombre");
        label3.setBounds(45,170,200,30);
        label3.setFont(new Font("Andale Mono", 1, 12));
        label3.setForeground(new Color(255,255,255));
        add(label3);
        
        label4 = new JLabel("©2023 MEDICALOB");
        label4.setBounds(120,375,300,30);
        label4.setFont(new Font("Andale Mono", 1, 12));
        label4.setForeground(new Color(255,255,255));
        add(label4);
        
        textfield = new JTextField();
        textfield.setBounds(45,200,255,25);
        textfield.setBackground(new Color(224,224,224));
        textfield.setFont(new Font("Andale Mono", 1, 14));
        textfield.setForeground(new Color(9, 47, 84));
        add(textfield);
        
        label5 = new JLabel("Ingrese su edad");
        label5.setBounds(45, 225, 200, 30);
        label5.setFont(new Font("Andale Mono", 1, 12));
        label5.setForeground(new Color(255,255,255));
        add(label5);
        
        textFEdad = new JTextField();
        textFEdad.setBounds(45,250,255,25);
        textFEdad.setBackground(new Color(224,224,224));
        textFEdad.setFont(new Font("Andale Mono", 1, 14));
        textFEdad.setForeground(new Color(9, 47, 84));
        add(textFEdad);
        
        button = new JButton("Ingresar");
        button.setBounds(125,300,100,30);
        button.setBackground(new Color(255,255,255));
        button.setFont(new Font("Andale Mono", 1, 14));
        button.setForeground(new Color(9, 47, 84));
        button.addActionListener(this);
        add(button);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            nombre = textfield.getText().trim();
            edad = Integer.parseInt(textFEdad.getText());
            CP.insertDatos(nombre, edad);
            if(nombre.equals("") || edad == 0){
                JOptionPane.showMessageDialog(null,"Debes ingresar tu nombre y edad"); //es como poner un alert en javascript
            } else{
                Licencia ventanaLicencia = new Licencia();
                ventanaLicencia.setBounds(0,0,790,450);
                ventanaLicencia.setVisible(true);
                ventanaLicencia.setResizable(false);
                ventanaLicencia.setLocationRelativeTo(null);
                this.setVisible(false);
            }
        }
    }
    
    public static void main(String[] args) {
        Bienvenida ventanaBienvenida = new Bienvenida();
        ventanaBienvenida.setBounds(0,0,350,450);
        ventanaBienvenida.setVisible(true);
        ventanaBienvenida.setResizable(false);
        ventanaBienvenida.setLocationRelativeTo(null);
    }
}
