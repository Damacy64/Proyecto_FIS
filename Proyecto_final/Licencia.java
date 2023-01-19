package Proyecto_final;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author pzx64
 */
public class Licencia extends JFrame implements ActionListener, ChangeListener {

    private JLabel label1, label2;
    private JCheckBox check;
    private JButton button1, button2;
    private JScrollPane scroll;
    private JTextArea text;
    String nombre = "";

    public Licencia() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Licencia de uso");
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        Bienvenida ventaBienvenida = new Bienvenida();
        nombre = ventaBienvenida.nombre;

        label1 = new JLabel("TERMINOS Y CONDICIONES");
        label1.setBounds(215, 5, 200, 30);
        label1.setFont(new Font("Andale Mono", 1, 14));
        label1.setForeground(new Color(0, 0, 0));
        add(label1);

        text = new JTextArea();
        text.setEditable(false);
        text.setFont(new Font("Andale Mono", 0, 9));
        text.setText("\n\nTERMINOS Y CONDICIONES\nIMPORTANTE – LEA DETENIDAMENTE\n"
                + "AL INSTALAR, COPIAR O, EN CUALQUIER CASO, UTILIZAR EL  SOFTWARE SE CONSIDERA QUE USTED ESTÁ DE ACUERDO CON LOS TÉRMINOS Y CONDICIONES.\n\n"
                + "Los derechos de propiedad intelectual sobre el software, o “copyright”, pertenecen exclusivamente a su autor, según consta en el programa\n"
                + "de Instalación de cada sistema \ny el cual puede ser leído en su totalidad antes de ser instalado.\n\n"
                + "El usuario adquiere solamente el derecho a usarlo libremente en su sistema informático, con las únicas limitaciones que se detallan a \n"
                + "continuación en este documento:\n\n"
                + "En ningún caso esta licencia implica la cesión del derecho de propiedad sobre el software, por lo que el usuario no podrá proceder a \n"
                + "su  redistribución, venta, \n"
                + "o modificación del código interno del programa mediante ingeniería inversa o por cualquier otro procedimiento,\n"
                + "sin la autorización expresa y por escrito del autor.\n\n"
                + "La licencia es exclusiva y no transferible a terceros, es indefinida en el tiempo, y da derecho a instalar el programa en un único ordenador,\n"
                + "o en un único grupo de \nordenadores interconectados entre sí en una red de área local y compartiendo necesariamente los datos de\n"
                + " usuario cuando la versión ofrecida contemple esta función, pero no incluye necesariamente la actualización a versiones posteriores del programa,\n"
                + "las cuales podrán entregarse sin cargo u ofrecerse optativamente con cargo.\n\n"
                + "No se entiende como red de área local a las conexiones que puedan establecerse a través de la red internet, mediante ADSL, cable de fibra óptica,\n"
                + "T1, WiFi, u otras tecnologías. \n "
                + " En caso de utilizarse conexiones de este tipo para interconectar el software, será necesaria \n"
                + "una Licencia de Uso por cada Nodo a unir.\n\n"
                + "La instalación del Software en otro equipo o en otra red local siempre es posible a condición de que se siga el proceso completo de desinstalación,"
                + "\n empezando por el panel de control de Windows, sección “Agregar o quitar programas”, en el ordenador u ordenadores de red \n"
                + "donde hubiera estado instalado anteriormente, y eliminando después físicamente del disco todos los ficheros del programa,\n"
                + "de modo que no dejen de cumplirse las condiciones especificadas en el párrafo anterior.\n\n"
                + "La licencia es efectiva hasta su cancelación. La cancelación se producirá automáticamente sin recibir notificación expresa de SIMPLE Software \n"
                + "en el caso de no cumplirse alguna de las condiciones previstas en esta licencia.  En ningún caso se realizará devolución de\n"
                + " montos pagados cuando el número de serie de habilitación haya sido expedido.  A los fines de evitar malos entendidos,\n"
                + "SIMPLE Software ofrece la posibilidad de probar el software antes de solicitar el número de serie de habilitación.\n\n"
                + "SIMPLE Software garantiza el buen funcionamiento del sistema ofrecido, pero no puede asegurar que sus prestaciones sean las que en opinión \n"
                + "del usuario debieran cumplirse.\n\n"
                + "Ante la imposibilidad material de poner a prueba el programa en la gran variedad de ordenadores existente, con todos los sistemas operativos \n"
                + "y sus diferentes versiones y actualizaciones en circulación, y en interacción con las múltiples configuraciones particulares\n y de red local\n"
                + " que en la práctica pueden hallarse, SIMPLE Software considera que es el propio usuario quien – en todo caso – debe cerciorarse previamente,\n"
                + "mediante el uso o la prueba a fondo antes de la compra, de la completa idoneidad del software a las circunstancias específicas de su equipo\n"
                + " informático, de su red,y de su empresa, y que, en un supuesto afirmativo, el cliente acepta el programa TAL CUAL,\n"
                + " sin derecho a exigir ningún tipo de modificación que no haya sido pactada con anterioridad.\n\n\n\n"
                + "DATOS DE REGISTRO PARA EMISIÓN DE LICENCIA DE HABILITACIÓN\n\n"
                + "SIMPLE Software solicitará datos de registro para poder emitir la Licencia de Habilitación Definitiva del software.\n"
                + "Es EXCLUSIVA RESPONSABILIDAD DEL USUARIO informar datos comerciales correspondientes a su actividad, tomando en cuenta que ciertos datos como teléfono,\n"
                + "correo electrónico o razón social podrán ser asignados automáticamente en reportes o comprobantes fiscales.\n"
                + "Los datos de registro enviados para solicitar el número de serie de habilitación NO PODRÁN SER MODIFICADOS \n"
                + "en caso de errores u omisiones una vez emitido el serial, razón por la cual el Usuario deberá prestar especial atención antes de realizar el envío.\n"
                + "Para CORRECCIONES POSTERIORES A LA EMISIÓN DE LA LICENCIA DE USO, se deberá abonar nuevamente por la misma ya que se generará una nueva licencia.\n");
                
        scroll = new JScrollPane(text);
        scroll.setBounds(10, 40, 760, 300);
        add(scroll);

        check = new JCheckBox("Yo " + nombre + " acepto");
        check.setBounds(100, 340, 90, 30);
        check.addChangeListener(this);
        add(check);

        button1 = new JButton("Continuar");
        button1.setBounds(10, 380, 90, 30);
        button1.addActionListener(this);
        button1.setEnabled(false);
        add(button1);

        button2 = new JButton("No acepto");
        button2.setBounds(120, 380, 100, 30);
        button2.addActionListener(this);
        button2.setEnabled(true);
        add(button2);

        ImageIcon imagen = new ImageIcon(getClass().getResource("images/logo.png"));
        label2 = new JLabel(imagen);
        label2.setBounds(450, 335, 180, 100);
        add(label2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            Principal ventanaPrincipal = new Principal();
            ventanaPrincipal.setBounds(0, 0, 640, 535);
            ventanaPrincipal.setVisible(true);
            ventanaPrincipal.setResizable(false);
            ventanaPrincipal.setLocationRelativeTo(null);
            this.setVisible(false);
        } else if (e.getSource() == button2) {
            Bienvenida ventanaBienvenida = new Bienvenida();
            ventanaBienvenida.setBounds(0, 0, 350, 450);
            ventanaBienvenida.setVisible(true);
            ventanaBienvenida.setResizable(false);
            ventanaBienvenida.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (check.isSelected() == true) {
            button1.setEnabled(true);
            button2.setEnabled(false);
        } else {
            button1.setEnabled(false);
            button2.setEnabled(true);
        }
    }

    public static void main(String[] args) {
        Licencia ventanaLicencia = new Licencia();
        ventanaLicencia.setBounds(0, 0, 790, 450);
        ventanaLicencia.setVisible(true);
        ventanaLicencia.setResizable(false);
        ventanaLicencia.setLocationRelativeTo(null);
    }
}
