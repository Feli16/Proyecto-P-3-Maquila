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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static proyecto.Conexion.con;
import static proyecto.Conexion.getConexion;
import static proyecto.Conexion.resultado;
import static proyecto.Conexion.stmt;

/**
 *
 * @author felig
 */
//Herencia de la clase Conexion
public class SolicitudesConexion extends Conexion {
    //Variables Globales

    PreparedStatement ps = null;
    ResultSet rs = null;
    static Connection con = getConexion();

    public boolean modificar(Solicitud soli, String valor) {
        //Variable del metodo
        String estado = "Aprobado";

        //Sentencia SQL
        String sql = "UPDATE solicitud set estadoSolicitud= '" + estado + "' Where idSolicitud= '" + valor + "'";
        try {
            //Inicio del metodo
            ps = super.getConexion().prepareStatement(sql);
            ps.executeUpdate(sql);
            ps.setString(6, soli.getEstado());
            ps.execute();
            return true;

        } catch (SQLException ex) {

            System.out.println(ex.getMessage());
            Logger.getLogger(UsuariosConexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        //Fin del metodo
    }

    public boolean registrar(Solicitud soli) {
        //Sentencia SQL
        String sql = "INSERT INTO solicitud(usuarioSolicitud,productoSolicitud,cantidadSolicitud,precioSolicitud,estadoSolicitud) VALUES(?,?,?,?,?)";
        try {
            //Inicio del metodo
            ps = super.getConexion().prepareStatement(sql);
            ps.setString(1, soli.getUsuarioSolicitud());
            ps.setString(2, soli.getProductoSolicitud());
            ps.setInt(3, soli.getCantidadSolicitud());
            ps.setInt(4, soli.getPrecioSolicitud());
            ps.setString(5, soli.getEstado());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }

    }

    public static ArrayList<String> llenarComboUsuarios() {
        //Array recorre la tabla de usuarios
        ArrayList<String> lista = new ArrayList<String>();
        //Sentencia SQL
        String q = "SELECT * FROM usuarios";
        //Inicio del metodo
        try {
            //Inico de la conexion
            stmt = con.createStatement();
            resultado = stmt.executeQuery(q);
            //Fin de la conexion 
            System.out.println("Correcto");
        } catch (Exception e) {
            System.out.println("no Correcto");
        }
        try {
            while (resultado.next()) {
                //El Valor que extraemos en la tabla
                lista.add(resultado.getString("nombreUsuario"));
            }
        } catch (Exception e) {
        }
        return lista;
        //Fin del metodo
    }

    public static ArrayList<String> llenarComboProductos() {
        //Array recorre la tabla de Productos
        ArrayList<String> listap = new ArrayList<String>();
        //Sentencia SQL
        String p = "SELECT * FROM productos";
        //Inicio del metodo
        try {
            //Inico de la conexion
            stmt = con.createStatement();
            resultado = stmt.executeQuery(p);
            //Fin de la conexion 
            System.out.println("Correcto");
        } catch (Exception e) {
            System.out.println();
        }
        try {
            while (resultado.next()) {
                //El Valor que extraemos en la tabla
                listap.add(resultado.getString("nombreProducto"));
            }
        } catch (Exception e) {
        }
        return listap;
        //Fin del metodo
    }

}
