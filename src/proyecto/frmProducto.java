package proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmProducto extends javax.swing.JInternalFrame {

    //Obejetos instanciados
    Producto mod = new Producto();
    ProductosConexion uP = new ProductosConexion();
    Conexion c = new Conexion();

    //Variables Globales
    ResultSet rs = null;
    Connection con = null;
    Statement stmt = null;
    DefaultTableModel modelo;
    String var, var1;

    //Arrays
    String titulos[] = {"Id", "Nombre", "Cantidad", "Precio"};
    String fila[] = new String[6];

    public frmProducto() {
        initComponents();
        txtIdProducto.setVisible(false);
        lblIdCliente.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        panelIngresarDatos = new javax.swing.JPanel();
        txtIdProducto = new javax.swing.JTextField();
        lblIdCliente = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        panelDetalle = new javax.swing.JPanel();
        panelTableProducto = new javax.swing.JScrollPane();
        tableProducto = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        lblFlag = new javax.swing.JLabel();
        btnRefrescar = new javax.swing.JButton();
        btnBuscarPorNombre = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        menuEditar = new javax.swing.JMenu();
        menuEditarRegistro = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setTitle("Registro Productos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelIngresarDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INGRESAR DATOS DEL PRODUCTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        txtIdProducto.setEditable(false);
        txtIdProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblIdCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblIdCliente.setText("ID PRODUCTO:");

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNombre.setText("NOMBRE:");

        lblCantidad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCantidad.setText("CANTIDAD: ");

        lblPrecio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPrecio.setText("PRECIO:");

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrarProducto.png"))); // NOI18N
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtCantidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtPrecio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel1.setText("REGISTRAR");

        javax.swing.GroupLayout panelIngresarDatosLayout = new javax.swing.GroupLayout(panelIngresarDatos);
        panelIngresarDatos.setLayout(panelIngresarDatosLayout);
        panelIngresarDatosLayout.setHorizontalGroup(
            panelIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresarDatosLayout.createSequentialGroup()
                .addGroup(panelIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIngresarDatosLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(panelIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIdCliente)
                            .addComponent(lblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelIngresarDatosLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(panelIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        panelIngresarDatosLayout.setVerticalGroup(
            panelIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresarDatosLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(panelIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdCliente)
                    .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantidad)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelIngresarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecio))
                .addGap(37, 37, 37)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getContentPane().add(panelIngresarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 62, 370, 350));
        panelIngresarDatos.getAccessibleContext().setAccessibleName("INGRESAR DATOS DEL NUEVO PRODUCTO");

        panelDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DETALLES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        tableProducto = new javax.swing.JTable(){
            public boolean isCellEditable(int fila,int col){
                return false;
            }
        };
        tableProducto.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tableProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "CANTIDAD", "PRECIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableProducto.setFocusable(false);
        tableProducto.setRowMargin(4);
        tableProducto.getTableHeader().setReorderingAllowed(false);
        tableProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductoMouseClicked(evt);
            }
        });
        panelTableProducto.setViewportView(tableProducto);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/deteleProducto.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblFlag.setText("0");

        btnRefrescar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refresh product.png"))); // NOI18N
        btnRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescarActionPerformed(evt);
            }
        });

        btnBuscarPorNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBuscarPorNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/browse.png"))); // NOI18N
        btnBuscarPorNombre.setText("BUSCAR POR NOMBRE");
        btnBuscarPorNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPorNombreActionPerformed(evt);
            }
        });

        jLabel2.setText("REFRESCAR");

        jLabel3.setText("ELIMINAR");

        javax.swing.GroupLayout panelDetalleLayout = new javax.swing.GroupLayout(panelDetalle);
        panelDetalle.setLayout(panelDetalleLayout);
        panelDetalleLayout.setHorizontalGroup(
            panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetalleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTableProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetalleLayout.createSequentialGroup()
                        .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelDetalleLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(panelDetalleLayout.createSequentialGroup()
                                .addComponent(lblFlag)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelDetalleLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3)))
                        .addGap(45, 45, 45))
                    .addGroup(panelDetalleLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnBuscarPorNombre)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelDetalleLayout.setVerticalGroup(
            panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetalleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBuscarPorNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelTableProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFlag)
                    .addGroup(panelDetalleLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDetalleLayout.createSequentialGroup()
                                .addComponent(btnRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addContainerGap())
                            .addComponent(btnEliminar)))))
        );

        getContentPane().add(panelDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 530, 360));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setText("Productos");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 15, 290, -1));

        menuEditar.setText("Editar");

        menuEditarRegistro.setText("Editar Registro");
        menuEditarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditarRegistroActionPerformed(evt);
            }
        });
        menuEditar.add(menuEditarRegistro);

        MenuBar.add(menuEditar);

        setJMenuBar(MenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void actualizar() {
        //Variables del metodo
        String cadena1, cadena2, cadena3, cadena4, cadena5;

        cadena1 = txtIdProducto.getText();
        txtIdProducto.setVisible(true);
        cadena2 = txtNombre.getText();
        cadena3 = txtCantidad.getText();
        cadena4 = txtPrecio.getText();

        //inicio del metodo
        if (txtNombre.getText().equals("")) {

            javax.swing.JOptionPane.showMessageDialog(this, "1-. Consulte el nombre del producto\n 2-. Actualice el dato deseado en el campo correspondiente", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {

            try {

                stmt = c.getConexion().createStatement();
                stmt.executeUpdate("update ignore productos set producto_id= '" + cadena1 + "' , nombreProducto = '" + cadena2 + "',cantidad = '" + cadena3 + "',orden_id = '" + cadena4 + "', precio = '" + "' where producto_id = '" + txtIdProducto.getText() + "' || nombreProducto = '" + txtNombre.getText() + "' || cantidad = '" + txtCantidad.getText() + "' || precio = '" + txtPrecio.getText() + "'  || tipousuario = '" + "'");

                //Fin de la conexion
                System.out.println("Los valores han sido Actualizados");
            } catch (SQLException e) {
                e.printStackTrace();

                if (con != null) {

                    try {
                        con.close();
                        stmt.close();
                    } catch (Exception es) {
                        System.out.println(e.getMessage());
                    }
                }
            }
            javax.swing.JOptionPane.showMessageDialog(this, "Actualizado correctamente!", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        //Limpiar la tabla
        this.txtNombre.setText("");
        this.txtCantidad.setText("");
        this.txtPrecio.setText("");
        //Fin del metodo
    }

    public void consulta() {
        //Variables del metodo
        var1 = var;
        String sql2 = "Select idProducto, nombreProducto, cantidad, precio FROM productos where nombreProducto = '" + var1 + "'";
        //inicio del metodo
        try {
            //Incio de la conexion
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
            rs = stmt.executeQuery(sql2);
            //Fin de la conexion
            int i = 1;
            while (rs.next()) {
                 //Lo que extraemos de la Base de datos
                String id = rs.getString("idProducto");
                String inom = rs.getString("nombreProducto");
                String icant = rs.getString("cantidad");
                String iprec = rs.getString("precio");

                //Colocamos la informacion  
                txtNombre.setText(inom);
                txtCantidad.setText(icant);
                txtPrecio.setText(iprec);

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            Logger.getLogger(frmProducto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(frmProducto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmProducto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                    ex.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                    ex.printStackTrace();
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                    ex.printStackTrace();
                }
            }
        }
        //Fin del metodo
    }

    private void tableProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductoMouseClicked

    }//GEN-LAST:event_tableProductoMouseClicked

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c < 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }

    }

    private void txtProductoKeyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c < 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }

    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarActionPerformed
        //Inicio del metodo
        try {
             //Incio de la conexion a la base de datos
            con = c.getConexion();
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT* from productos");
            modelo = new DefaultTableModel(null, titulos);
            
            //Aqui le solicitamos la informacion a la tabla de la base de datos
            while (rs.next()) {
                fila[0] = rs.getString("idProducto");
                fila[1] = rs.getString("nombreProducto");
                fila[2] = rs.getString("cantidad");
                fila[3] = rs.getString("precio");
                modelo.addRow(fila);
            }
            tableProducto.setModel(modelo);
            //Se agrega a la tabla
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        //Fin del metodo
    }//GEN-LAST:event_btnRefrescarActionPerformed

    private void btnBuscarPorNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPorNombreActionPerformed

        String cap = "";
        ResultSet rs = null;
        var = javax.swing.JOptionPane.showInputDialog(this, "Nombre del producto", "Consulta Producto", javax.swing.JOptionPane.QUESTION_MESSAGE);
        String sql = "SELECT* FROM  productos WHERE nombreProducto = '" + var + "'";
        if (var == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "La accion fue cancelada", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (var.equals("")) {
                javax.swing.JOptionPane.showMessageDialog(this, "Favor de ingresar el nombre de prodcuto que desea consultar", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            } else {
                try {

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

                        consulta();

                    }   // fin del bucle While

                } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(frmUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    if (con != null) {
                        try {
                            con.close();
                            stmt.close();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                }

                //  javax.swing.JOptionPane.showMessageDialog(this, "El usuario no fue encontrado\n", "ERROR!", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_btnBuscarPorNombreActionPerformed

    private void menuEditarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditarRegistroActionPerformed
        actualizar();
    }//GEN-LAST:event_menuEditarRegistroActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
       //Variable del metodo
        int r = 0;
        //Inicio del metodo
        mod.setNombreProducto(txtNombre.getText());
        mod.setCantidad(Integer.valueOf(txtCantidad.getText()));
        mod.setPrecio(Integer.valueOf(txtPrecio.getText()));
        if (uP.registrar(mod)) {//Aqui enviamos la informacion del frm a la tabla de la Base de datos
            JOptionPane.showMessageDialog(null, "Registro con exito");
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "no se pudo guardar");
        }
        //Fin del metodo

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       //Variables del metodo
        int r = 0;
        int fila = tableProducto.getSelectedRow();
        //Inicio del metodo
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Para eliminar un registro debe de seleccionar un usuario en la tabla");
        } else {
            int id = Integer.parseInt(tableProducto.getValueAt(fila, 0).toString());
            r = uP.eliminarProducto(id);//Aqui enviamos la informacion del frm a la tabla de la Base de datos
            if (r == 1) {
                limpiar();
                JOptionPane.showMessageDialog(null, "Producto eliminado con exito");
            } else {
                JOptionPane.showMessageDialog(null, "Producto NO eliminado");
            }
        }
        //Fin del metodo
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void limpiar() {
        //Liampiamos la tabla
        txtNombre.setText("");
        txtCantidad.setText("");
        txtPrecio.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    public javax.swing.JButton btnBuscarPorNombre;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnRefrescar;
    public javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JLabel lblCantidad;
    public javax.swing.JLabel lblFlag;
    private javax.swing.JLabel lblIdCliente;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JMenu menuEditar;
    public javax.swing.JMenuItem menuEditarRegistro;
    private javax.swing.JPanel panelDetalle;
    public javax.swing.JPanel panelIngresarDatos;
    private javax.swing.JScrollPane panelTableProducto;
    public javax.swing.JTable tableProducto;
    private javax.swing.JTextField txtCantidad;
    public javax.swing.JTextField txtIdProducto;
    public javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
