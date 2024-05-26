/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Ventanas;

import Clases.Carrito;
import Clases.Productos;
import Clases.Venta;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import dao.DaoCarrito;
import dao.DaoCliente;
import dao.DaoProductos;
import dao.DaoVenta;
import Errores.Lectura;
import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
public class Verificacion_Compra extends javax.swing.JDialog {
    DaoProductos DaoP = new DaoProductos();
    DaoCliente Daoc = new DaoCliente();
    DaoCarrito DaoCAR = new DaoCarrito();
    DaoVenta Daov = new DaoVenta();
    ArrayList<Carrito> Carrito = new ArrayList<>();
    private float total = 0f;
    
    public Verificacion_Compra(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CVVText = new javax.swing.JTextField();
        NombreText = new javax.swing.JTextField();
        FechaText = new javax.swing.JTextField();
        TarjetaText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Error3 = new javax.swing.JLabel();
        Error1 = new javax.swing.JLabel();
        Error4 = new javax.swing.JLabel();
        Error2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        CVVText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CVVTextKeyTyped(evt);
            }
        });

        NombreText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreTextActionPerformed(evt);
            }
        });
        NombreText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreTextKeyTyped(evt);
            }
        });

        FechaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaTextActionPerformed(evt);
            }
        });
        FechaText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FechaTextKeyTyped(evt);
            }
        });

        TarjetaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TarjetaTextActionPerformed(evt);
            }
        });
        TarjetaText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TarjetaTextKeyTyped(evt);
            }
        });

        jButton1.setText("Pagar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Error3.setText("jLabel5");

        Error1.setText("jLabel5");

        Error4.setText("jLabel5");

        Error2.setText("jLabel5");

        jLabel1.setText("Nombre del titular");

        jLabel2.setText("CVV");

        jLabel3.setText("Numero de tarjeta");

        jLabel4.setText("Fecha de expiracion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TarjetaText, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(Error3))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(FechaText, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(Error4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(NombreText, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Error1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CVVText)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Error2)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(84, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Error1)
                            .addComponent(CVVText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Error2)
                            .addComponent(NombreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TarjetaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(Error3)))
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FechaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(Error4)))
                .addGap(51, 51, 51)
                .addComponent(jButton1)
                .addGap(56, 56, 56))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CVVTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CVVTextKeyTyped
        if (CVVText.getText().length() >= 3) {
            evt.consume();
        }
    }//GEN-LAST:event_CVVTextKeyTyped

    private void NombreTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreTextActionPerformed

    private void NombreTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreTextKeyTyped
        if (NombreText.getText().length() >= 50) {
            evt.consume();
        }
    }//GEN-LAST:event_NombreTextKeyTyped

    private void FechaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaTextActionPerformed

    private void FechaTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FechaTextKeyTyped
        if (FechaText.getText().length() >= 7) {
            evt.consume();
        }
    }//GEN-LAST:event_FechaTextKeyTyped

    private void TarjetaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TarjetaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TarjetaTextActionPerformed

    private void TarjetaTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TarjetaTextKeyTyped
        if (TarjetaText.getText().length() >= 16) {
            evt.consume();
        }
    }//GEN-LAST:event_TarjetaTextKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int res = Lectura.Ltext(NombreText.getText())
        + Lectura.Leercvv(CVVText.getText())
        + Lectura.LeerTarjeta(TarjetaText.getText())
        + Lectura.validarFecha(FechaText.getText());
        if (res == 4) {
            restarcantidad();
            crearticket();
            comprar();
            limpiarError();
            this.dispose();
            JOptionPane.showMessageDialog(null, "Se a Realizado la compra");

        } else {
            if (Lectura.Ltext(NombreText.getText()) != 1) {
                Error1.setText("!");
            } else {
                Error1.setText("");
            }
            if (Lectura.Leercvv(CVVText.getText()) != 1) {
                Error2.setText("!");
            } else {
                Error2.setText("");
            }
            if (Lectura.LeerTarjeta(TarjetaText.getText()) != 1) {
                Error3.setText("!");
            } else {
                Error3.setText("");
            }
            if (Lectura.validarFecha(FechaText.getText()) != 1) {
                Error4.setText("!");
            } else {
                Error4.setText("");
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CVVText;
    private javax.swing.JLabel Error1;
    private javax.swing.JLabel Error2;
    private javax.swing.JLabel Error3;
    private javax.swing.JLabel Error4;
    private javax.swing.JTextField FechaText;
    private javax.swing.JTextField NombreText;
    private javax.swing.JTextField TarjetaText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void comprar() {
        Carrito = DaoCAR.readCarritos(String.valueOf(Tienda.Id));
        if (Carrito.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No tiene productos en el carrito");
        } else {
            for (int i = 0; i < Carrito.size(); i++) {
                Daov.createVenta(new Venta(1, Carrito.get(i).getCantidad(), Carrito.get(i).getTotal(), Carrito.get(i).getIdUsuario(),
                        Carrito.get(i).getIdProducto()));
            }
            for (int i = 0; i < Carrito.size(); i++) {
                DaoCAR.deleteCarrito(String.valueOf(Carrito.get(i).getId()));
            }
        }
    }

    private void limpiarError() {
        Error1.setText("");
        Error2.setText("");
        Error3.setText("");
        Error4.setText("");
    }

    private void restarcantidad() {
        Carrito = DaoCAR.readCarritos(String.valueOf(Tienda.Id));
        for (int i = 0; i < Carrito.size(); i++) {
            Productos prod = DaoP.readProducto(String.valueOf(Carrito.get(i).getIdProducto()));
            int cant = 0;
            cant =  prod.getCantidad() - Carrito.get(i).getCantidad();
            DaoP.updateCantidad(cant, String.valueOf(Carrito.get(i).getIdProducto()));
            
        }
        
    }
    
    public void crearticket() {
    // Obtener la fecha actual con formato legible
    Date fechaActual = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    // Verificar que el carrito no esté vacío
    if (Carrito.isEmpty()) {
        System.out.println("El carrito está vacío.");
        return;
    }

    // Obtener el ID del primer producto en el carrito para el nombre del archivo
    String fileName = "src/PDF/Cliente_" + Carrito.get(0).getId()+ ".pdf";

    // Crear un nuevo documento PDF
    Document document = new Document(PageSize.A4);
    try {
        PdfWriter.getInstance(document, new FileOutputStream(fileName));

        // Abrir el documento
        document.open();

        // Agregar el nombre de la empresa
        document.add(new Paragraph("eComoda\n\n"));

        // Agregar la fecha actual
        document.add(new Paragraph("Fecha: " + sdf.format(fechaActual) + "\n\n"));

        // Crear una tabla para los productos del carrito
        PdfPTable table = new PdfPTable(8);

        // Agregar encabezados de la tabla
        final String[] headers = {"ID", "Nombre", "Cantidad", "Precio", "Total", "Color", "Descripción", "Imagen"};
        for (String header : headers) {
            table.addCell(header);
        }

        // Agregar datos de productos al carrito
        for (int i = 0; i < Carrito.size(); i++) {
            Productos prod = DaoP.readProducto(String.valueOf(Carrito.get(i).getIdProducto()));

            // Agregar fila a la tabla
            table.addCell(String.valueOf(Carrito.get(i).getId()));
            table.addCell(prod.getNombre());
            table.addCell(String.valueOf(Carrito.get(i).getCantidad()));
            table.addCell(String.valueOf(prod.getPrecio()));
            table.addCell(String.valueOf(Carrito.get(i).getTotal()));
            table.addCell(prod.getColor());
            table.addCell(prod.getDescripcion());

            try {
                // Convertir el arreglo de bytes de la imagen a un objeto Image de iText
                byte[] imageBytes = prod.getImagen();
                BufferedImage bufferedImage = ImageIO.read(new ByteArrayInputStream(imageBytes));
                Image image = Image.getInstance(bufferedImage, null);
                PdfPCell cell = new PdfPCell(image, true);
                table.addCell(cell);
            } catch (Exception e) {
                table.addCell("no imagen");
            }
        }

        // Agregar la tabla al documento
        document.add(table);

    } catch (DocumentException | FileNotFoundException e) {
        e.printStackTrace();
    } finally {
        // Asegurarse de cerrar el documento
        if (document.isOpen()) {
            document.close();
        }
    }
}
    
    

}
