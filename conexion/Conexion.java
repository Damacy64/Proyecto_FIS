package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author pzx64
 */
public class Conexion {
    private static final String DRIVER = "java.sql.Driver";
    private static final String USER = "administrador";
    private static final String PASSWORD = "Damacy6464azul";
    private static final String URL = "jdbc:sqlserver://proyectof.database.windows.net:1433;database=proyecto;user="+USER+"@proyectof;password="+PASSWORD+";encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
    private Connection CN;
    
    public Conexion(){
        CN = null;
    }
    
    public Connection getConnection(){
        try {
            Class.forName(DRIVER);
            CN = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al conectar la BD", JOptionPane.ERROR_MESSAGE);
        }
        return CN;
    }
    
    public void close(){
        try {
            CN.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al cerrar la BD", JOptionPane.ERROR_MESSAGE);
        }
    }
}
