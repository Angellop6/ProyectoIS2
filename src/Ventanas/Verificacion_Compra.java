/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Ventanas;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
public class Verificacion_Compra extends javax.swing.JDialog {

    
    public Verificacion_Compra(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        PanelTarjeta p1 = new PanelTarjeta();
        pintarPanel(p1); 
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Contenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(Contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 430, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenido;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void pintarPanel(JPanel p){
    
        p.setLocation(0,0);
        p.setSize(600, 500);
        Contenido.removeAll();
        Contenido.add(p,BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();
}
    

}
