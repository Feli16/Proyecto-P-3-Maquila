/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author felig
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        btnRegistroUsuario.setVisible(false);
        btnRegistroProducto.setVisible(false);
        btnPedido.setVisible(false);
        btnCompras.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnSalir = new javax.swing.JMenu();
        btnVolverLogin = new javax.swing.JMenuItem();
        btnCerrarPrograma = new javax.swing.JMenuItem();
        btnRegistro = new javax.swing.JMenu();
        btnRegistroUsuario = new javax.swing.JMenuItem();
        btnRegistroProducto = new javax.swing.JMenuItem();
        bv = new javax.swing.JMenu();
        btnPedido = new javax.swing.JMenuItem();
        btnCompras = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 528, Short.MAX_VALUE)
        );

        btnSalir.setText("Salir");

        btnVolverLogin.setText("Volver al Login");
        btnVolverLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverLoginActionPerformed(evt);
            }
        });
        btnSalir.add(btnVolverLogin);

        btnCerrarPrograma.setText("Salir");
        btnCerrarPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarProgramaActionPerformed(evt);
            }
        });
        btnSalir.add(btnCerrarPrograma);

        jMenuBar1.add(btnSalir);

        btnRegistro.setText("Registro");

        btnRegistroUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        btnRegistroUsuario.setText("Registro Usuario");
        btnRegistroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroUsuarioActionPerformed(evt);
            }
        });
        btnRegistro.add(btnRegistroUsuario);

        btnRegistroProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        btnRegistroProducto.setText("Registro Producto");
        btnRegistroProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroProductoActionPerformed(evt);
            }
        });
        btnRegistro.add(btnRegistroProducto);

        jMenuBar1.add(btnRegistro);

        bv.setText("Pedidos");

        btnPedido.setText("Solicitudes");
        btnPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoActionPerformed(evt);
            }
        });
        bv.add(btnPedido);

        btnCompras.setText("Compras");
        btnCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprasActionPerformed(evt);
            }
        });
        bv.add(btnCompras);

        jMenuBar1.add(bv);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void btnRegistroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroUsuarioActionPerformed
       //Inicio del metodo
        frmUsuarios frmU = new frmUsuarios();
        desktopPane.add(frmU);
        frmU.toFront();
        frmU.setVisible(true);
        //Fin del metodo
    }//GEN-LAST:event_btnRegistroUsuarioActionPerformed

    private void btnRegistroProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroProductoActionPerformed
        //Incio del metodo
        frmProducto frmP = new frmProducto();
        desktopPane.add(frmP);
        frmP.toFront();
        frmP.setVisible(true);
        //Fin del metodo
    }//GEN-LAST:event_btnRegistroProductoActionPerformed

    private void btnPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoActionPerformed
       //Incio del metodo
        frmSolicitudes frmPedidos = new frmSolicitudes();
        desktopPane.add(frmPedidos);
        frmPedidos.toFront();
        frmPedidos.setVisible(true);
        //Fin del metodo
    }//GEN-LAST:event_btnPedidoActionPerformed

    private void btnComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprasActionPerformed
        //Incio del metodo
        frmGenerarOrdenCompra frmR = new frmGenerarOrdenCompra();
        desktopPane.add(frmR);
        frmR.toFront();
        frmR.setVisible(true);
        //Fin del metodo
    }//GEN-LAST:event_btnComprasActionPerformed

    private void btnVolverLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverLoginActionPerformed
        //Incio del metodo
        this.dispose();
        frmLogin fl = new frmLogin();
        fl.toFront();
        fl.setVisible(true);
        //Fin del metodo
    }//GEN-LAST:event_btnVolverLoginActionPerformed

    private void btnCerrarProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarProgramaActionPerformed
    //Incio del metodo    
    System.exit(0);
    //Fin del metodo
// TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarProgramaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnCerrarPrograma;
    public javax.swing.JMenuItem btnCompras;
    public javax.swing.JMenuItem btnPedido;
    private javax.swing.JMenu btnRegistro;
    public javax.swing.JMenuItem btnRegistroProducto;
    public javax.swing.JMenuItem btnRegistroUsuario;
    private javax.swing.JMenu btnSalir;
    private javax.swing.JMenuItem btnVolverLogin;
    private javax.swing.JMenu bv;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
