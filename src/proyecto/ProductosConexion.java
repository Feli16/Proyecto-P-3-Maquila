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
 * @author paola
 */
//Herencia de la clase conexion 
public class ProductosConexion extends Conexion {
//Varibles Globles
PreparedStatement ps = null;
ResultSet rs = null;

    public boolean registrar(Producto p) {
        String sql = "INSERT INTO productos (nombreProducto, cantidad, precio)VALUES(?,?,?)";
        //Inicio del metodo
        try {
            //Incio de la conexion
            ps = super.getConexion().prepareStatement(sql);
            ps.setString(1, p.getNombreProducto());
            ps.setInt(2, p.getCantidad());
            ps.setInt(3, p.getPrecio());
            ps.execute();//Ejecuta el insert
            return true;//Devuelve true

        } catch (SQLException ex) {
            Logger.getLogger(ProductosConexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        //Fin del metodo
    }

    public boolean modificar(Producto p) {
         
        String sql = "UPDATE productos(nombreProducto, cantidad, precio) VALUES(?,?,?)";
        //Incio del metodo
        try {
            //Fin de la conexion
            ps = super.getConexion().prepareStatement(sql);
            int updateCount = ps.executeUpdate();
            ps.setString(1, p.getNombreProducto());
            ps.setInt(2, p.getCantidad());
            ps.setInt(3, p.getPrecio());
            ps.execute();//Realizamos el Update
            return true;//Devuelve true

        } catch (SQLException ex) {

            System.out.println(ex.getMessage());
            Logger.getLogger(UsuariosConexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;//Devuelve false
        }
        //Fin del metodo
    }

    public int eliminarProducto(int id) {
        //Variable/Contador del metodo
        int r = 0;
        String sql = "DELETE FROM productos WHERE idProducto=" + id;
        //Incio del metodo
        try {
           
            ps = super.getConexion().prepareStatement(sql);
            r = ps.executeUpdate();//Realizamos el Delete
        } catch (SQLException e) {
            
        }
        return r;
        //Fin del metodo
    }

}
