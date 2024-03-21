/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

public class Productos_Administracion extends javax.swing.JFrame {

    
    public Productos_Administracion() {
        initComponents();
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panelprincipal = new javax.swing.JTabbedPane();
        PaneldeAdministradores = new javax.swing.JPanel();
        panel_Administradores2 = new Ventanas.Panel_Administradores();
        PanelEmpleados = new javax.swing.JPanel();
        panelEmpleados1 = new Ventanas.PanelEmpleados();
        Paneldeproductos = new javax.swing.JPanel();
        panelProductos1 = new Ventanas.PanelProductos();
        paneldetickets = new javax.swing.JPanel();
        Paneldeclientes = new javax.swing.JPanel();
        panelClientes1 = new Ventanas.PanelClientes();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PaneldeAdministradores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PaneldeAdministradores.add(panel_Administradores2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Panelprincipal.addTab("Administradoes", PaneldeAdministradores);

        PanelEmpleados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelEmpleados.add(panelEmpleados1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Panelprincipal.addTab("Empleados", PanelEmpleados);

        javax.swing.GroupLayout PaneldeproductosLayout = new javax.swing.GroupLayout(Paneldeproductos);
        Paneldeproductos.setLayout(PaneldeproductosLayout);
        PaneldeproductosLayout.setHorizontalGroup(
            PaneldeproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelProductos1, javax.swing.GroupLayout.DEFAULT_SIZE, 1121, Short.MAX_VALUE)
        );
        PaneldeproductosLayout.setVerticalGroup(
            PaneldeproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneldeproductosLayout.createSequentialGroup()
                .addComponent(panelProductos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        Panelprincipal.addTab("Productos", Paneldeproductos);

        javax.swing.GroupLayout paneldeticketsLayout = new javax.swing.GroupLayout(paneldetickets);
        paneldetickets.setLayout(paneldeticketsLayout);
        paneldeticketsLayout.setHorizontalGroup(
            paneldeticketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1121, Short.MAX_VALUE)
        );
        paneldeticketsLayout.setVerticalGroup(
            paneldeticketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 357, Short.MAX_VALUE)
        );

        Panelprincipal.addTab("Tickets", paneldetickets);

        javax.swing.GroupLayout PaneldeclientesLayout = new javax.swing.GroupLayout(Paneldeclientes);
        Paneldeclientes.setLayout(PaneldeclientesLayout);
        PaneldeclientesLayout.setHorizontalGroup(
            PaneldeclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneldeclientesLayout.createSequentialGroup()
                .addComponent(panelClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        PaneldeclientesLayout.setVerticalGroup(
            PaneldeclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneldeclientesLayout.createSequentialGroup()
                .addComponent(panelClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        Panelprincipal.addTab("Clientes", Paneldeclientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panelprincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panelprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
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
    private javax.swing.JPanel PanelEmpleados;
    private javax.swing.JPanel PaneldeAdministradores;
    private javax.swing.JPanel Paneldeclientes;
    private javax.swing.JPanel Paneldeproductos;
    public javax.swing.JTabbedPane Panelprincipal;
    private Ventanas.PanelClientes panelClientes1;
    private Ventanas.PanelEmpleados panelEmpleados1;
    private Ventanas.PanelProductos panelProductos1;
    private Ventanas.Panel_Administradores panel_Administradores2;
    private javax.swing.JPanel paneldetickets;
    // End of variables declaration//GEN-END:variables
}



