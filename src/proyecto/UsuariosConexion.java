/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author sergo
 */
//Herencia de la clase conexion 
public class UsuariosConexion extends Conexion {
//Varibles Globles
PreparedStatement ps = null;
ResultSet rs = null;

    public boolean registrar(Usuario u) {
        String sql = "INSERT INTO usuarios(nombreUsuario,usuario,claveUsuario,tipoUsuario) VALUES(?,?,?,?)";
        //Inicio del metodo
        try {
            //Incio de la conexion
            ps = super.getConexion().prepareStatement(sql);
            ps.setString(1, u.getNombreUsuario());
            ps.setString(2, u.getUsuario());
            ps.setString(3, u.getClaveUsuario());
            ps.setString(4, u.getTipoUsuario());
            ps.execute();//Ejecuta el insert
            return true;//Devuelve true

        } catch (SQLException ex) {
            Logger.getLogger(UsuariosConexion.class.getName()).log(Level.SEVERE, null, ex);

            return false;
        }
      //Fin del metodo
    }
 

    public int eliminarUsuarios(int id) {
        //Variable/Contador del metodo
        int r = 0;
        String sql = "DELETE FROM usuarios WHERE idUsuario=" + id;
        //Incio del metodo
        try {
            //Incio de la conexion
            ps = super.getConexion().prepareStatement(sql);
            r = ps.executeUpdate();//Realizamos el Delete
        } catch (SQLException e) {
        }
        return r;//Se completa el metodo
        //Fin del metodo
    }

}
