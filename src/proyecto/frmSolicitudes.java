/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//Implements del metodo Printable
public class frmSolicitudes extends javax.swing.JInternalFrame implements Printable {

    //Variables Globales
    DefaultTableModel modelo = new DefaultTableModel();
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    String var, var1;

    //Objetos instanciados
    SolicitudesConexion soliConecta = new SolicitudesConexion();
    Solicitud soli = new Solicitud();
    Conexion c = new Conexion();

    //Arrays
    String titulos[] = {"Usuario", "Producto", "Cantidad", "Precio"};
    String fila[] = new String[4];

    public frmSolicitudes() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSolicitudes = new javax.swing.JPanel();
        lblCliente = new javax.swing.JLabel();
        lblProducto = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        cbProducto = new javax.swing.JComboBox();
        cbUsuario = new javax.swing.JComboBox();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        panelTableDetalleProductos = new javax.swing.JScrollPane();
        tableDetallePedido = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        lblDetallePedido = new javax.swing.JLabel();
        btnRefrescar = new javax.swing.JButton();
        btnCargarPrecio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);

        jSolicitudes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Solicitudes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        lblCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCliente.setText("Usuario:");

        lblProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblProducto.setText("Producto:");

        lblCantidad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCantidad.setText("Cantidad:");

        txtCantidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        cbProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbProducto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "[Seleccionar]" }));
        cbProducto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbProductoItemStateChanged(evt);
            }
        });
        cbProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProductoActionPerformed(evt);
            }
        });

        cbUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "[Seleccionar]" }));
        cbUsuario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbUsuarioItemStateChanged(evt);
            }
        });
        cbUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUsuarioActionPerformed(evt);
            }
        });

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/addSolicitud.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/deleteSol.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tableDetallePedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Producto", "Cantidad", "Precio"
            }
        ));
        panelTableDetalleProductos.setViewportView(tableDetallePedido);

        lblDetallePedido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDetallePedido.setText("Detalle del pedido");

        btnRefrescar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refresh.png"))); // NOI18N
        btnRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescarActionPerformed(evt);
            }
        });

        btnCargarPrecio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consultarPrecio.png"))); // NOI18N
        btnCargarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarPrecioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Precio:");

        txtPrecio.setEditable(false);
        txtPrecio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        jLabel2.setText("ELIMINAR");

        jLabel3.setText("CARGAR PRECIO");

        jLabel4.setText("REFRESCAR");

        jLabel5.setText("AGREGAR");

        javax.swing.GroupLayout jSolicitudesLayout = new javax.swing.GroupLayout(jSolicitudes);
        jSolicitudes.setLayout(jSolicitudesLayout);
        jSolicitudesLayout.setHorizontalGroup(
            jSolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSolicitudesLayout.createSequentialGroup()
                .addGroup(jSolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDetallePedido)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jSolicitudesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jSolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRefrescar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(43, 43, 43)
                .addGroup(jSolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(59, 59, 59))
            .addGroup(jSolicitudesLayout.createSequentialGroup()
                .addGroup(jSolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jSolicitudesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelTableDetalleProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jSolicitudesLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jSolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblProducto)
                            .addComponent(lblCliente)
                            .addComponent(jLabel1)
                            .addComponent(lblCantidad))
                        .addGap(49, 49, 49)
                        .addGroup(jSolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbProducto, 0, 241, Short.MAX_VALUE)
                            .addComponent(txtCantidad)
                            .addComponent(txtPrecio))
                        .addGroup(jSolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jSolicitudesLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel3))
                            .addGroup(jSolicitudesLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jSolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jSolicitudesLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel5))
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jSolicitudesLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(btnCargarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jSolicitudesLayout.setVerticalGroup(
            jSolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSolicitudesLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jSolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jSolicitudesLayout.createSequentialGroup()
                        .addGroup(jSolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jSolicitudesLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(cbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblCliente, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(8, 8, 8)
                        .addGroup(jSolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProducto))
                        .addGap(10, 10, 10))
                    .addGroup(jSolicitudesLayout.createSequentialGroup()
                        .addComponent(btnCargarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jSolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jSolicitudesLayout.createSequentialGroup()
                        .addGroup(jSolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jSolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCantidad)))
                    .addGroup(jSolicitudesLayout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDetallePedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelTableDetalleProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jSolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jSolicitudesLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel2))
                    .addGroup(jSolicitudesLayout.createSequentialGroup()
                        .addGroup(jSolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnRefrescar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSolicitudes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSolicitudes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void eliminar() {
        //Variables
        int fil;
        //Incio del metodo
        if (modelo.getRowCount() > 0) {
            if (tableDetallePedido.getSelectedRow() != -1) {//Seleccionamos un campo en la tabla
                fil = tableDetallePedido.getSelectedRow();
                modelo.removeRow(fil);
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione Una Fila");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay Filas en la Tabla");
        }
        //Fin del metodo
    }
    private void cbProductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbProductoItemStateChanged
        // TODO add your handling code here:


    }//GEN-LAST:event_cbProductoItemStateChanged

    private void cbUsuarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbUsuarioItemStateChanged
    }//GEN-LAST:event_cbUsuarioItemStateChanged

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        int a = modelo.getRowCount();
        int cont;
        if (modelo.getRowCount() == 0) {

            modelo = new DefaultTableModel(null, titulos);
        }

        try {

            fila[0] = cbUsuario.getSelectedItem().toString();
            fila[1] = cbProducto.getSelectedItem().toString();
            fila[2] = txtCantidad.getText();
            fila[3] = txtPrecio.getText();
            modelo.addRow(fila);
            tableDetallePedido.setModel(modelo);
        } catch (Exception e) {

        }
        soli.setUsuarioSolicitud(cbUsuario.getSelectedItem().toString());
        soli.setProductoSolicitud(cbProducto.getSelectedItem().toString());
        soli.setCantidadSolicitud(Integer.valueOf(txtCantidad.getText()));
        soli.setPrecioSolicitud(Integer.valueOf(txtPrecio.getText()));
        soli.setEstado("Sin Aprobacion");
        if (soliConecta.registrar(soli)) {
            JOptionPane.showMessageDialog(null, "Registro exitoso de solicitud, esperando por aprobacion");
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo guardar");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    public void limpiarCampos() {
        //Limpia los campos
        cbUsuario.setSelectedIndex(0);
        cbProducto.setSelectedIndex(0);
        txtCantidad.setText("");
    }
    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_btnRefrescarActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void cbProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProductoActionPerformed
        //Incio del Array
        ArrayList<String> lista = new ArrayList<String>();
        lista = SolicitudesConexion.llenarComboProductos();//De donde sale los valores del ComBox
        for (int i = 0; i < lista.size(); i++) {
            cbProducto.addItem(lista.get(i));
            //Agregamos al ComBox
        }

    }//GEN-LAST:event_cbProductoActionPerformed

    private void cbUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUsuarioActionPerformed
        //Incio del Array
        ArrayList<String> lista = new ArrayList<String>();
        lista = SolicitudesConexion.llenarComboUsuarios();//De donde sale los valores del ComBox
        for (int i = 0; i < lista.size(); i++) {
            cbUsuario.addItem(lista.get(i));
            //Agregamos al ComBox
        }
    }//GEN-LAST:event_cbUsuarioActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void btnCargarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarPrecioActionPerformed

        //Variables del metodo
        String cap = "";
        String sql = "SELECT precio FROM  productos WHERE nombreProducto = '" + cbProducto.getSelectedItem() + "'";

        try {

            //Incio del metodo
            String url = "jdbc:mysql://localhost:3306/pedidos";
            String usuario = "root";
            String contraseña = "";

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, usuario, contraseña);
            if (con != null) {
                System.out.println("Se ha establecido una conexión a la base de datos "
                        + "\n " + url);
            }

            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                //Pedimos el valor en la tabla
                cap = rs.getString("precio");
                System.out.println(cap);
                //Lo enviamos a la tabla
                txtPrecio.setText(cap);
                //Fin de la conexion y el metodo
            }
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
        }

        // TODO add your handling code here:

    }//GEN-LAST:event_btnCargarPrecioActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCargarPrecio;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRefrescar;
    public javax.swing.JComboBox cbProducto;
    private javax.swing.JComboBox cbUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jSolicitudes;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblDetallePedido;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JScrollPane panelTableDetalleProductos;
    public javax.swing.JTable tableDetallePedido;
    public javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
 @Override
    public int print(Graphics graf, PageFormat pagfor, int index) throws PrinterException {
       //Inicio del metodo Printable
        if (index > 0) {
            return NO_SUCH_PAGE;
        }
        Graphics2D hub = (Graphics2D) graf;
        hub.translate(pagfor.getImageableX() * 30, pagfor.getImageableY() * 30);
        hub.scale(1.0, 1.0);
        jSolicitudes.printAll(graf);
        return PAGE_EXISTS;
        //fin del metodo
    }

}
