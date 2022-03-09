package proyecto;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Logger;

//Atributos
public class Usuario implements Serializable {
//Variables
    private int idUsuario;
    private String nombreUsuario;
    private String usuario;
    private String claveUsuario;
    private String tipoUsuario;
    
 //Constructores
    public Usuario() {
    }
//Gets y Sets
    public Usuario(int idUsuario, String nombreUsuario, String usuario, String claveUsuario, String tipoUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.usuario = usuario;
        this.claveUsuario = claveUsuario;
        this.tipoUsuario = tipoUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClaveUsuario() {
        return claveUsuario;
    }

    public void setClaveUsuario(String claveUsuario) {
        this.claveUsuario = claveUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

   
    // base de datos
    public void Serializar(String Archivo) throws IOException {
        ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(Archivo));
        salida.writeObject(this);
    }

    public Usuario Hidratar(String Archivo) throws ClassNotFoundException, IOException {
        ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(Archivo));
        return (Usuario) entrada.readObject();
    }
}
