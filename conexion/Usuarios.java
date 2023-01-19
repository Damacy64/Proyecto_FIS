package conexion;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author pzx64
 */
public class Usuarios {
    private final String SQL_INSERT = "INSERT INTO Usuarios(nombre, edad) values(?,?)";
    private PreparedStatement PS;
    private final Conexion CN;
    
    public Usuarios(){
        PS = null;
        CN = new Conexion();
    }
    
    public int insertDatos(String nombre, int edad){
        try {
            PS = CN.getConnection().prepareStatement(SQL_INSERT);
            PS.setString(1, nombre);
            PS.setInt(2, edad);
            int res = PS.executeUpdate();
            if(res > 0){
            }
        } catch (SQLException e) {
            System.err.println("Error al guardar los datos en la BD" + e.getMessage());
        } finally {
            PS = null;
            CN.close();
        }
        return 0;
    }
}
