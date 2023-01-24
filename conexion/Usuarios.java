package conexion;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author pzx64
 */
public class Usuarios {
    private final String SQL_INSERT_PACIENTE = "INSERT INTO Pacientes(nombre_paciente, municipio, telefono, a_paterno, a_materno) values (?, ?, ?, ?, ?)";
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
    
    public int insertDatosP(String nombre_paciente, String municipio, String telefono, String a_paterno, String a_materno){
        try {
            PS = CN.getConnection().prepareStatement(SQL_INSERT_PACIENTE);
            PS.setString(1, nombre_paciente);
            PS.setString(2, municipio);
            PS.setString(3, telefono);
            PS.setString(4, a_paterno);
            PS.setString(5, a_materno);
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
    
//    public int modificarDatos(String paciente){
//        
//    }
}
