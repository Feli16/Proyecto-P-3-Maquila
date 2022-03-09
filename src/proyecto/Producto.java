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
import java.io.Serializable;

/**
 *
 * @author paola
 */
//Atributos
public class Producto implements Serializable {
//Definicion de Variables
    private int idProducto;
    private String nombreProducto;
    private int cantidad;
    private int precio;
//Constructores 
    public Producto() {
    }

    public Producto(int idProducto, String nombreProducto, int cantidad, int precio) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.precio = precio;
    }
//Gets y Sets
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return this.nombreProducto;
    }
// base de datos
    public void Serializar(String Archivo) throws IOException {
        ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(Archivo));
        salida.writeObject(this);
    }

    public Producto Hidratar(String Archivo) throws ClassNotFoundException, IOException {
        ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(Archivo));
        return (Producto) entrada.readObject();
    }

}
