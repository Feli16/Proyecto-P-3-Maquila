/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author sergo
 */

// Herencia de clase de conexion
public class Login  extends Conexion{
   
    //Obejetos instanciados
    Conexion c =new Conexion();
    frmPrincipal f=new frmPrincipal();
    
    //Variables Globales
    Connection conexion;
    PreparedStatement st;
    ResultSet res;
    String sql;
    
    
    public void buscar(String usuario, String password) {
        //Incio cel metodo
        try {
            //Variables del metodo
            String validar;
            
            //Inicio de la conexion
            conexion = c.getConexion();
            sql = "SELECT usuario, claveUsuario,tipoUsuario from usuarios WHERE usuario ='" + usuario + "' && claveUsuario='" + password + "'	";
            st = conexion.prepareStatement(sql);
            res = st.executeQuery();
            
            //Verificamos el usuario y el tipo
            if (res.next()) {
                usuario = res.getString("usuario");
                validar=res.getString("tipoUsuario");
            //Permisos de cada Usuario
                if (validar.equals("Administrador")) {
                    
                    
                    System.out.println(validar);
                      f.btnRegistroUsuario.setVisible(true);
                      f.btnRegistroProducto.setVisible(true);
                      f.btnPedido.setVisible(true);
                      f.btnCompras.setVisible(true);

                } else if (validar.equals("Bodega")){
                     f.btnPedido.setVisible(true);
                } else if (validar.equals("Ventas")){
                     f.btnCompras.setVisible(true);
 
                }

                //Verificacion de la clave
                password = res.getString("claveUsuario");
                f.setVisible(true);
                                f.setEnabled(true);


            }else{
                JOptionPane.showMessageDialog(null,"Error en usuario o la password");
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar" + e);
        }
    }   
   //Fin del metodo 
}
