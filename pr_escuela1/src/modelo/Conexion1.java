/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author melis
 */
public class Conexion1 {
    private final String puerto = "3306";
    public Connection conexionDB;
    public final String db = "db_escuela";
    private final String urlConexion = String.format("jdbc:mysql://localhost:%s/%s?serverTimezone=UTC",puerto,db);
    public final String usuario = "root";
    public final String contra = "47480786";
    private final String jdbc="com.mysql.cj.jdbc.Driver";
    public Connection conexionBD;
    
    public void abrir_conexion(){
    try{
        Class.forName(jdbc);
        conexionDB = DriverManager.getConnection(urlConexion,usuario,contra);
        //JOptionPane.showMessageDialog(null, "Conexion Exitosa...", "Exito",JOptionPane.INFORMATION_MESSAGE);
    }catch (HeadlessException | ClassNotFoundException | SQLException ex){
        System.out.println("Error..." + ex.getMessage());
    }
    }
    public void cerrar_conexion(){
        try{
            conexionDB.close();
        }catch(SQLException ex){
            System.out.println("Error..." + ex.getMessage());
    }
    }
}
