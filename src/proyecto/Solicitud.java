/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author sergo
 */
    //Atributos
public class Solicitud {
    //Variables  

    private int idSolicitud;
    private String usuarioSolicitud;
    private String productoSolicitud;
    private int cantidadSolicitud;
    private int precioSolicitud;
    private String estado;

    //Constructores
    public Solicitud(int idSolicitud, String usuarioSolicitud, String productoSolicitud, int cantidadSolicitud, int precioSolicitud, String estado) {
        this.idSolicitud = idSolicitud;
        this.usuarioSolicitud = usuarioSolicitud;
        this.productoSolicitud = productoSolicitud;
        this.cantidadSolicitud = cantidadSolicitud;
        this.precioSolicitud = precioSolicitud;
        this.estado = estado;
    }

    public Solicitud() {
    }
//Gets y Sets

    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public String getUsuarioSolicitud() {
        return usuarioSolicitud;
    }

    public void setUsuarioSolicitud(String usuarioSolicitud) {
        this.usuarioSolicitud = usuarioSolicitud;
    }

    public String getProductoSolicitud() {
        return productoSolicitud;
    }

    public void setProductoSolicitud(String productoSolicitud) {
        this.productoSolicitud = productoSolicitud;
    }

    public int getCantidadSolicitud() {
        return cantidadSolicitud;
    }

    public void setCantidadSolicitud(int cantidadSolicitud) {
        this.cantidadSolicitud = cantidadSolicitud;
    }

    public int getPrecioSolicitud() {
        return precioSolicitud;
    }

    public void setPrecioSolicitud(int precioSolicitud) {
        this.precioSolicitud = precioSolicitud;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Solicitud{" + "idSolicitud=" + idSolicitud + ", usuarioSolicitud=" + usuarioSolicitud + ", productoSolicitud=" + productoSolicitud + ", cantidadSolicitud=" + cantidadSolicitud + ", precioSolicitud=" + precioSolicitud + ", estado=" + estado + '}';
    }

    // base de datos
    public void Serializar(String Archivo) throws IOException {
        ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(Archivo));
        salida.writeObject(this);
    }

    public Solicitud Hidratar(String Archivo) throws ClassNotFoundException, IOException {
        ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(Archivo));
        return (Solicitud) entrada.readObject();
    }

}
