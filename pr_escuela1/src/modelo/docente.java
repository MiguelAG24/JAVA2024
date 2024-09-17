/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author melis
 */
public class docente extends persona1{
    
    
   
    private String nit;
    Conexion1 cn;
    public docente(){}
    public docente(int id,String nit, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        
        this.nit = nit;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    @Override
    public void agregar(){
        try{
            PreparedStatement parametro;
            String query ="INSERT INTO clientes(nit,nombres,apellidos,direccion,telefono,fecha_naciemiento)VALUES(?,?,?,?,?,?);";
            cn = new Conexion1();
            cn.abrir_conexion();
            parametro = (PreparedStatement) cn.conexionDB.prepareStatement(query);
            parametro.setString(1, getNit());
            parametro.setString(2, getNombres());
            parametro.setString(3, getApellidos());
            parametro.setString(4, getDireccion());
            parametro.setString(5, getTelefono());
            parametro.setString(6, getFecha_nacimiento());
            
            int executar = parametro.executeUpdate();
            cn.cerrar_conexion();
            //JOptionPane.showMessageDialog(null,Integer.toString(executar) + "Registro creado","Agregar",JOptionPane.INFORMATION_MESSAGE);
    }catch(Exception ex){
            System.out.println("Error...."+ ex.getMessage());
    }
    }
}