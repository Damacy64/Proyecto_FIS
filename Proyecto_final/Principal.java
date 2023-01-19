package Proyecto_final;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author pzx64
 */
public class Principal extends JFrame implements ActionListener {

    private JTextArea text;
    private JMenuBar m_bar;
    private JMenu m_opciones, m_calcular, m_acerca_de, m_color_fondo;
    private JMenuItem mi_calculo, mi_verde, mi_rosa, mi_naranja, mi_doctor, mi_salir, mi_nuevo;
    private JLabel label_logo, label_bienvenido, label_title, label_paterno, label_materno, label_nombre,
            label_departamento, label_resultado, label_footer, label_qr;
    private JTextField input_nombre, input_a_paterno, input_a_materno;
    private JComboBox combo_departamento;
    private JScrollPane scroll;
    String nombre = "";

    public Principal() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Pantalla principal");
        getContentPane().setBackground(new Color(63, 164, 246));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        Bienvenida ventaBienvenida = new Bienvenida();
        nombre = ventaBienvenida.nombre;

        m_bar = new JMenuBar();
        m_bar.setBackground(new Color(13, 110, 253));
        setJMenuBar(m_bar);

        m_opciones = new JMenu("Opciones");
        m_opciones.setBackground(new Color(255, 0, 0));
        m_opciones.setFont(new Font("Andale Mono", 1, 14));
        m_opciones.setForeground(new Color(255, 255, 255));
        m_bar.add(m_opciones);

        m_calcular = new JMenu("Encontrar");
        m_calcular.setBackground(new Color(255, 0, 0));
        m_calcular.setFont(new Font("Andale Mono", 1, 14));
        m_calcular.setForeground(new Color(255, 255, 255));
        m_bar.add(m_calcular);

        m_acerca_de = new JMenu("Acerca de");
        m_acerca_de.setBackground(new Color(255, 0, 0));
        m_acerca_de.setFont(new Font("Andale Mono", 1, 14));
        m_acerca_de.setForeground(new Color(255, 255, 255));
        m_bar.add(m_acerca_de);

        m_color_fondo = new JMenu("Color de fondo");
        m_color_fondo.setFont(new Font("Andale Mono", 1, 14));
        m_color_fondo.setForeground(new Color(9, 47, 84));
        m_opciones.add(m_color_fondo);

        mi_calculo = new JMenuItem("Buscar");
        mi_calculo.setFont(new Font("Andale Mono", 1, 14));
        mi_calculo.setForeground(new Color(9, 47, 84));
        m_calcular.add(mi_calculo);
        mi_calculo.addActionListener(this);

        mi_verde = new JMenuItem("Verde");
        mi_verde.setFont(new Font("Andale Mono", 1, 14));
        mi_verde.setForeground(new Color(9, 47, 84));
        m_color_fondo.add(mi_verde);
        mi_verde.addActionListener(this);

        mi_rosa = new JMenuItem("Rosa");
        mi_rosa.setFont(new Font("Andale Mono", 1, 14));
        mi_rosa.setForeground(new Color(9, 47, 84));
        m_color_fondo.add(mi_rosa);
        mi_rosa.addActionListener(this);

        mi_naranja = new JMenuItem("Naranja");
        mi_naranja.setFont(new Font("Andale Mono", 1, 14));
        mi_naranja.setForeground(new Color(9, 47, 84));
        m_color_fondo.add(mi_naranja);
        mi_naranja.addActionListener(this);

        mi_nuevo = new JMenuItem("Nuevo");
        mi_nuevo.setFont(new Font("Andale Mono", 1, 14));
        mi_nuevo.setForeground(new Color(9, 47, 84));
        m_opciones.add(mi_nuevo);
        mi_nuevo.addActionListener(this);

        mi_salir = new JMenuItem("Salir");
        mi_salir.setFont(new Font("Andale Mono", 1, 14));
        mi_salir.setForeground(new Color(9, 47, 84));
        m_opciones.add(mi_salir);
        mi_salir.addActionListener(this);

        mi_doctor = new JMenuItem("El Doctor");
        mi_doctor.setFont(new Font("Andale Mono", 1, 14));
        mi_doctor.setForeground(new Color(9, 47, 84));
        m_acerca_de.add(mi_doctor);
        mi_doctor.addActionListener(this);

        ImageIcon imagen = new ImageIcon(getClass().getResource("images/logo.png"));
        label_logo = new JLabel(imagen);
        label_logo.setBounds(5, 5, 250, 100);
        add(label_logo);

        label_bienvenido = new JLabel("Bienvenido " + nombre);
        label_bienvenido.setBounds(280, 30, 300, 50);
        label_bienvenido.setFont(new Font("Andale Mono", 1, 32));
        label_bienvenido.setForeground(new Color(255, 255, 255));
        add(label_bienvenido);

        label_title = new JLabel("Datos del paciente");
        label_title.setBounds(45, 140, 900, 25);
        label_title.setFont(new Font("Andale Mono", 0, 24));
        label_title.setForeground(new Color(255, 255, 255));
        add(label_title);

        label_nombre = new JLabel("Nombre(S):");
        label_nombre.setBounds(25, 188, 180, 25);
        label_nombre.setFont(new Font("Andale Mono", 1, 12));
        label_nombre.setForeground(new Color(255, 255, 255));
        add(label_nombre);

        input_nombre = new JTextField();
        input_nombre.setBounds(25, 213, 150, 25);
        input_nombre.setBackground(new Color(224, 224, 224));
        input_nombre.setFont(new Font("Andale Mono", 1, 14));
        input_nombre.setForeground(new Color(9, 47, 84));
        add(input_nombre);

        label_paterno = new JLabel("Apellido Paterno:");
        label_paterno.setBounds(25, 248, 180, 25);
        label_paterno.setFont(new Font("Andale Mono", 1, 12));
        label_paterno.setForeground(new Color(255, 255, 255));
        add(label_paterno);

        input_a_paterno = new JTextField();
        input_a_paterno.setBounds(25, 273, 150, 25);
        input_a_paterno.setBackground(new Color(224, 224, 224));
        input_a_paterno.setFont(new Font("Andale Mono", 1, 14));
        input_a_paterno.setForeground(new Color(9, 47, 84));
        add(input_a_paterno);

        label_materno = new JLabel("Apellido Materno:");
        label_materno.setBounds(25, 308, 180, 25);
        label_materno.setFont(new Font("Andale Mono", 1, 12));
        label_materno.setForeground(new Color(255, 255, 255));
        add(label_materno);

        input_a_materno = new JTextField();
        input_a_materno.setBounds(25, 334, 150, 25);
        input_a_materno.setBackground(new Color(224, 224, 224));
        input_a_materno.setFont(new Font("Andale Mono", 1, 14));
        input_a_materno.setForeground(new Color(9, 47, 84));
        add(input_a_materno);

        label_departamento = new JLabel("Ingreso al Area:");
        label_departamento.setBounds(220, 188, 180, 25);
        label_departamento.setFont(new Font("Andale Mono", 1, 12));
        label_departamento.setForeground(new Color(255, 255, 255));
        add(label_departamento);

        combo_departamento = new JComboBox();
        combo_departamento.setBounds(220, 213, 220, 25);
        combo_departamento.setBackground(new Color(224, 224, 224));
        combo_departamento.setFont(new Font("Andale Mono", 1, 14));
        combo_departamento.setForeground(new Color(9, 47, 84));
        add(combo_departamento);
        combo_departamento.addItem("");
        combo_departamento.addItem("Algologia");
        combo_departamento.addItem("Anestesiologia");
        combo_departamento.addItem("Audiologia");
        combo_departamento.addItem("Cardiologia");
        combo_departamento.addItem("Cirugia de Torax");
        combo_departamento.addItem("Ecocardiografia");
        combo_departamento.addItem("Gastroenterologia");
        combo_departamento.addItem("Ginecologia");
        combo_departamento.addItem("Neurocirugia");
        combo_departamento.addItem("Oftalmologia");
        combo_departamento.addItem("Ortopedia");
        combo_departamento.addItem("Pediatria");
        combo_departamento.addItem("Radiologia Intervencionista");
        combo_departamento.addItem("Terapia Intensiva");

        label_resultado = new JLabel("Resultado de la Busqueda:");
        label_resultado.setBounds(220, 307, 180, 25);
        label_resultado.setFont(new Font("Andale Mono", 1, 12));
        label_resultado.setForeground(new Color(255, 255, 255));
        add(label_resultado);

        text = new JTextArea();
        text.setEditable(false);
        text.setBackground(new Color(224, 224, 224));
        text.setFont(new Font("Andale Mono", 1, 11));
        text.setForeground(new Color(9, 47, 84));
        text.setText("\n   Aqui aparece el resultado de la busqueda");
        scroll = new JScrollPane(text);
        scroll.setBounds(220, 333, 385, 90);
        add(scroll);

        label_footer = new JLabel("©2023 MEDICALOB  | Todos los derechos reservados");
        label_footer.setBounds(135, 445, 500, 30);
        label_footer.setFont(new Font("Andale Mono", 1, 12));
        label_footer.setForeground(new Color(255, 255, 255));
        add(label_footer);
        
        ImageIcon imagenQr = new ImageIcon(getClass().getResource("images/codigoQr.jpg"));
        label_qr = new JLabel(imagenQr);
        add(label_qr);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mi_calculo) {
            String nombre_trabajador = input_nombre.getText();
            String a_paterno = input_a_paterno.getText();
            String a_materno = input_a_materno.getText();
            String departamento = combo_departamento.getSelectedItem().toString();

            if (nombre_trabajador.equals("") || a_paterno.equals("") || a_materno.equals("") || departamento.equals("")) {
                JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos");
            } else {
                if (departamento.equals("Algologia")) {
                    text.setText("\nEl paciente " + nombre_trabajador + " " + a_paterno + " " + a_materno
                            + "\nquien entro al Area de: " + departamento + " es atendido por el/la \nDr: Hugo Pérez Rea Méndez"
                                    + " - Algologo");
                }
                if (departamento.equals("Anestesiologia")) {
                    text.setText("\nEl paciente " + nombre_trabajador + " " + a_paterno + " " + a_materno
                            + "\nquien entro al Area de: " + departamento + " es atendido por el/la \nDr: Adrian Raymond Murillo Cuevas"
                                    + " - Anestesiologo");
                }
                if (departamento.equals("Audiologia")) {
                    text.setText("\nEl paciente " + nombre_trabajador + " " + a_paterno + " " + a_materno
                            + "\nquien entro al Area de: " + departamento + " es atendido por el/la \nDr: Brenda Guadalupe Castillo Trejo"
                                    + " - Audiologo");
                }
                if (departamento.equals("Cardiologia")) {
                    text.setText("\nEl paciente " + nombre_trabajador + " " + a_paterno + " " + a_materno
                            + "\nquien entro al Area de: " + departamento + " es atendido por el/la \nDr: Coral Olguín Arias"
                                    + " - Cardiologo");
                }
                if (departamento.equals("Cirugia de Torax")) {
                    text.setText("\nEl paciente " + nombre_trabajador + " " + a_paterno + " " + a_materno
                            + "\nquien entro al Area de: " + departamento + " es atendido por el/la \nDr: Julian Ruíz Anguas"
                                    + " - Cirujano Toracico");
                }
                if (departamento.equals("Ecocardiografia")) {
                    text.setText("\nEl paciente " + nombre_trabajador + " " + a_paterno + " " + a_materno
                            + "\nquien entro al Area de: " + departamento + " es atendido por el/la \nDr: Erick Gonzales Bautista"
                                    + " - Cardiologo Ecocardiografista");
                }
                if (departamento.equals("Gastroenterologia")) {
                    text.setText("\nEl paciente " + nombre_trabajador + " " + a_paterno + " " + a_materno
                            + "\nquien entro al Area de: " + departamento + " es atendido por el/la \nDr: Benjamín Gonzales Manzo"
                                    + " - Gastroenterologo");
                }
                if (departamento.equals("Ginecologia")) {
                    text.setText("\nEl paciente " + nombre_trabajador + " " + a_paterno + " " + a_materno
                            + "\nquien entro al Area de: " + departamento + " es atendido por el/la \nDr: Edgar Jesus LLovera Hernandez"
                                    + " - Ginecologo");
                }
                if (departamento.equals("Neurocirugia")) {
                    text.setText("\nEl paciente " + nombre_trabajador + " " + a_paterno + " " + a_materno
                            + "\nquien entro al Area de: " + departamento + " es atendido por el/la \nDr: Melesio Eduardo Palazuelos Lopez"
                                    + " - Neurocirujano");
                }
                if (departamento.equals("Oftalmologia")) {
                    text.setText("\nEl paciente " + nombre_trabajador + " " + a_paterno + " " + a_materno
                            + "\nquien entro al Area de: " + departamento + " es atendido por el/la \nDr: Oliver Guillermo Perez Bautista"
                                    + " - Oftalmologo");
                }
                if (departamento.equals("Ortopedia")) {
                    text.setText("\nEl paciente " + nombre_trabajador + " " + a_paterno + " " + a_materno
                            + "\nquien entro al Area de: " + departamento + " es atendido por el/la \nDr: Karina Guadalupe Moreno Gonzalez"
                                    + " - Ortopedista");
                }
                if (departamento.equals("Pediatria")) {
                    text.setText("\nEl paciente " + nombre_trabajador + " " + a_paterno + " " + a_materno
                            + "\nquien entro al Area de: " + departamento + " es atendido por el/la \nDr: Maria Alejandra Monstserrat Acosta"
                                    + " - Pediatra");
                }
                if (departamento.equals("Radiologia Intervencionista")) {
                    text.setText("\nEl paciente " + nombre_trabajador + " " + a_paterno + " " + a_materno
                            + "\nquien entro al Area de: " + departamento + " es atendido por el/la \nDr: Samanta Garcia Ramirez"
                                    + " - Radiologa");
                }
                if (departamento.equals("Terapia Intensiva")) {
                    text.setText("\nEl paciente " + nombre_trabajador + " " + a_paterno + " " + a_materno
                            + "\nquien entro al Area de: " + departamento + " es atendido por el/la \nDr: Yessica Edith Ochoa Rangel"
                                    + " - Medica Intensivista");
                }
            }
        }
        if (e.getSource() == mi_verde) {
            getContentPane().setBackground(new Color(18, 167, 108));
        }
        if (e.getSource() == mi_rosa) {
            getContentPane().setBackground(new Color(225, 156, 137));
        }
        if (e.getSource() == mi_naranja) {
            getContentPane().setBackground(new Color(217, 130, 0));
        }
        if (e.getSource() == mi_nuevo) {
            input_nombre.setText("");
            input_a_paterno.setText("");
            input_a_materno.setText("");
            combo_departamento.setSelectedIndex(0);
            text.setText("\n   Aqui aparece el resultado de la busqueda");
        }
        if (e.getSource() == mi_salir) {
            Bienvenida ventanaBienvenida = new Bienvenida();
            ventanaBienvenida.setBounds(0, 0, 350, 450);
            ventanaBienvenida.setVisible(true);
            ventanaBienvenida.setResizable(false);
            ventanaBienvenida.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        if (e.getSource() == mi_doctor) {
            JOptionPane.showMessageDialog(null, label_qr);
        }
    }

    public static void main(String[] args) {
        Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.setBounds(0, 0, 640, 535);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);
    }
}
