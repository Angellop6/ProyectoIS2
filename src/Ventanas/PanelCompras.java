/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ventanas;

import Clases.Productos;
import Clases.Venta;
import dao.DaoProductos;
import dao.DaoVenta;
import dao.RenderImagen;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author angel
 */
public class PanelCompras extends javax.swing.JPanel {

    DaoVenta Daov = new DaoVenta();
    DaoProductos DaoP = new DaoProductos();
    ArrayList<Venta> ventas = new ArrayList<>();
    public PanelCompras() {
        initComponents();
        llenarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVentas = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        TablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "producto", "Cantidad", "Precio", "Total", "color", "Descrpcion", "Imagen"
            }
        ));
        TablaVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaVentasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaVentas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));
    }// </editor-fold>//GEN-END:initComponents

    private void TablaVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaVentasMouseClicked
        
    }//GEN-LAST:event_TablaVentasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaVentas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables


private void llenarTabla() {
        TablaVentas.setDefaultRenderer(Object.class, new RenderImagen());
        ventas = Daov.readVentas(String.valueOf(Tienda.Id));
        ArrayList<Productos> productos = new ArrayList<Productos>();
        for (int i = 0; i < ventas.size(); i++) {
            productos.add(DaoP.readProducto(String.valueOf(ventas.get(i).getIdProducto())));//este for empareja la venta con el carrito
        }
        DefaultTableModel m = (DefaultTableModel) TablaVentas.getModel();
        while (m.getRowCount() > 0) {
            m.removeRow(0);
        }
        for (int i = 0; i < ventas.size(); i++) {
            Object[] rowData = new Object[8]; // Mueve la declaración de rowData aquí para que se reinicie en cada iteración
            rowData[0] = ventas.get(i).getId();
            rowData[1] = productos.get(i).getNombre();
            rowData[2] = ventas.get(i).getCantidad();
            rowData[3] = productos.get(i).getPrecio();
            rowData[4] = ventas.get(i).getTotal();
            rowData[5] = productos.get(i).getColor();
            rowData[6] = productos.get(i).getDescripcion();
            try {
                byte[] imagen = productos.get(i).getImagen();
                BufferedImage bufferedImage = null;
                InputStream inputStream = new ByteArrayInputStream(imagen);
                bufferedImage = ImageIO.read(inputStream);
                ImageIcon mIcono = new ImageIcon(bufferedImage.getScaledInstance(150, 110, 0));
                rowData[7] = new JLabel(mIcono);
            } catch (Exception e) {
                rowData[7] = new JLabel("no imagen");
            }
            m.addRow(rowData); // Agrega la fila al modelo de la tabla en cada iteración
        }
        TablaVentas.setRowHeight(110);
        TablaVentas.getColumnModel().getColumn(7).setPreferredWidth(150);
    }






}
