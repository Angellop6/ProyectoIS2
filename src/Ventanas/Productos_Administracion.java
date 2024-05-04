/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import Clases.Administrador;
import Clases.Empleados;
import dao.DaoAdministrador;
import dao.DaoEmpleados;

public class Productos_Administracion extends javax.swing.JFrame {

    DaoEmpleados daoE = new DaoEmpleados();
    DaoAdministrador daoA = new DaoAdministrador();///vamos a ver que onda lol que XD 

    public Productos_Administracion() {
        initComponents();
        EstableccerPerfil();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Panelprincipal = new javax.swing.JTabbedPane();
        PaneldeAdministradores = new javax.swing.JPanel();
        panel_Administradores2 = new Ventanas.Panel_Administradores();
        PanelEmpleados = new javax.swing.JPanel();
        panelEmpleados1 = new Ventanas.PanelEmpleados();
        Paneldeclientes = new javax.swing.JPanel();
        panelClientes1 = new Ventanas.PanelClientes();
        Paneldeproductos = new javax.swing.JPanel();
        panelProductos1 = new Ventanas.PanelProductos();
        PanelCategoria = new javax.swing.JPanel();
        panelCategorias1 = new Ventanas.PanelCategorias();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PANombre = new javax.swing.JLabel();
        PACorreo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PaneldeAdministradores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PaneldeAdministradores.add(panel_Administradores2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 350));

        Panelprincipal.addTab("Administradoes", PaneldeAdministradores);

        PanelEmpleados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelEmpleados.add(panelEmpleados1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, 350));

        Panelprincipal.addTab("Empleados", PanelEmpleados);

        javax.swing.GroupLayout PaneldeclientesLayout = new javax.swing.GroupLayout(Paneldeclientes);
        Paneldeclientes.setLayout(PaneldeclientesLayout);
        PaneldeclientesLayout.setHorizontalGroup(
            PaneldeclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneldeclientesLayout.createSequentialGroup()
                .addComponent(panelClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        PaneldeclientesLayout.setVerticalGroup(
            PaneldeclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaneldeclientesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Panelprincipal.addTab("Clientes", Paneldeclientes);

        javax.swing.GroupLayout PaneldeproductosLayout = new javax.swing.GroupLayout(Paneldeproductos);
        Paneldeproductos.setLayout(PaneldeproductosLayout);
        PaneldeproductosLayout.setHorizontalGroup(
            PaneldeproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelProductos1, javax.swing.GroupLayout.DEFAULT_SIZE, 1130, Short.MAX_VALUE)
        );
        PaneldeproductosLayout.setVerticalGroup(
            PaneldeproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneldeproductosLayout.createSequentialGroup()
                .addComponent(panelProductos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Panelprincipal.addTab("Productos", Paneldeproductos);

        javax.swing.GroupLayout PanelCategoriaLayout = new javax.swing.GroupLayout(PanelCategoria);
        PanelCategoria.setLayout(PanelCategoriaLayout);
        PanelCategoriaLayout.setHorizontalGroup(
            PanelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCategoriaLayout.createSequentialGroup()
                .addComponent(panelCategorias1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelCategoriaLayout.setVerticalGroup(
            PanelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCategoriaLayout.createSequentialGroup()
                .addComponent(panelCategorias1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Panelprincipal.addTab("Categoria", PanelCategoria);

        jPanel1.add(Panelprincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, 380));

        jButton1.setText("Cerrar Secion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, -1));

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 90, 80));

        PANombre.setText("Nombre");
        jPanel1.add(PANombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 240, -1));

        PACorreo.setText("Correo");
        jPanel1.add(PACorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 240, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Tienda.Nombre = null;
        Tienda.Id = null;
        Tienda.TipoUsuario = null;
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Productos_Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos_Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos_Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos_Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos_Administracion().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel PACorreo;
    public static javax.swing.JLabel PANombre;
    private javax.swing.JPanel PanelCategoria;
    private javax.swing.JPanel PanelEmpleados;
    private javax.swing.JPanel PaneldeAdministradores;
    private javax.swing.JPanel Paneldeclientes;
    private javax.swing.JPanel Paneldeproductos;
    public javax.swing.JTabbedPane Panelprincipal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private Ventanas.PanelCategorias panelCategorias1;
    private Ventanas.PanelClientes panelClientes1;
    private Ventanas.PanelEmpleados panelEmpleados1;
    private Ventanas.PanelProductos panelProductos1;
    private Ventanas.Panel_Administradores panel_Administradores2;
    // End of variables declaration//GEN-END:variables

    private void EstableccerPerfil() {
        if (Tienda.TipoUsuario.equals("admin")) {
            Administrador admin = daoA.readAdministrador(String.valueOf(Tienda.Id));
            PACorreo.setText(admin.getCorreo());
            PANombre.setText(admin.getNombre());
        } else if (Tienda.TipoUsuario.equals("empleado")) {
            Empleados empleado = daoE.readEmpleado(String.valueOf(Tienda.Id));
            PACorreo.setText(empleado.getCorreo());
            PANombre.setText(empleado.getNombre());

        }

    }

}
