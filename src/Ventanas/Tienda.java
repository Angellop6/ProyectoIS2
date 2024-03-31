/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import Clases.Productos;
import dao.DaoProductos;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Tienda extends javax.swing.JFrame {

    public static String Nombre = "";
    public static Integer Id = null;
    public static Integer IdProducto = null;
    DaoProductos daoP = new DaoProductos();
    ArrayList<Integer> Idproductos = new ArrayList<>();
    ArrayList<Productos> productos = daoP.readProductos();
    int cantidadProductos = 0;

    public Tienda() {

        //Productos P = daoP.readProducto("1");
        initComponents();
        Botonmenu.setIcon(SetIcono("/Imagenes/menu.png", Botonmenu));
        BotonAtras.setIcon(SetIcono("/Imagenes/Flecha.png", BotonAtras));
        BotonAdelante.setIcon(SetIcono("/Imagenes/Flecha2.png", BotonAdelante));
        MostrarProductos();
        //Producto1.setIcon(crearIconoDesdeBits( P.getImagen(), 100, 100));
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelBotones = new javax.swing.JPanel();
        Perfil = new javax.swing.JButton();
        Botonmenu = new javax.swing.JButton();
        PanelMuestra = new javax.swing.JPanel();
        Producto1 = new javax.swing.JButton();
        Producto3 = new javax.swing.JButton();
        Producto4 = new javax.swing.JButton();
        BotonAdelante = new javax.swing.JButton();
        Producto6 = new javax.swing.JButton();
        Producto7 = new javax.swing.JButton();
        Producto8 = new javax.swing.JButton();
        Producto9 = new javax.swing.JButton();
        Producto2 = new javax.swing.JButton();
        Producto5 = new javax.swing.JButton();
        BotonAtras = new javax.swing.JButton();
        NombreUsuario = new javax.swing.JLabel();
        PanelCategorias = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelBotones.setBackground(new java.awt.Color(204, 255, 204));

        Perfil.setText("Perfil");
        Perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerfilActionPerformed(evt);
            }
        });

        Botonmenu.setOpaque(true);
        Botonmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonmenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBotonesLayout = new javax.swing.GroupLayout(PanelBotones);
        PanelBotones.setLayout(PanelBotonesLayout);
        PanelBotonesLayout.setHorizontalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesLayout.createSequentialGroup()
                .addComponent(Botonmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 260, Short.MAX_VALUE)
                .addComponent(Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelBotonesLayout.setVerticalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesLayout.createSequentialGroup()
                .addGroup(PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botonmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(PanelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 110));

        PanelMuestra.setBackground(new java.awt.Color(255, 204, 204));

        Producto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Producto1ActionPerformed(evt);
            }
        });

        Producto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Producto3ActionPerformed(evt);
            }
        });

        Producto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Producto4ActionPerformed(evt);
            }
        });

        BotonAdelante.setBackground(new java.awt.Color(204, 255, 255));
        BotonAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAdelanteActionPerformed(evt);
            }
        });

        Producto6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Producto6ActionPerformed(evt);
            }
        });

        Producto7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Producto7ActionPerformed(evt);
            }
        });

        Producto8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Producto8ActionPerformed(evt);
            }
        });

        Producto9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Producto9ActionPerformed(evt);
            }
        });

        Producto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Producto2ActionPerformed(evt);
            }
        });

        Producto5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Producto5ActionPerformed(evt);
            }
        });

        BotonAtras.setBackground(new java.awt.Color(204, 255, 255));
        BotonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMuestraLayout = new javax.swing.GroupLayout(PanelMuestra);
        PanelMuestra.setLayout(PanelMuestraLayout);
        PanelMuestraLayout.setHorizontalGroup(
            PanelMuestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMuestraLayout.createSequentialGroup()
                .addComponent(BotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonAdelante, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(NombreUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMuestraLayout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addGroup(PanelMuestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMuestraLayout.createSequentialGroup()
                        .addComponent(Producto1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Producto2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Producto3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelMuestraLayout.createSequentialGroup()
                        .addGroup(PanelMuestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Producto7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Producto4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelMuestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Producto8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelMuestraLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(Producto5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(PanelMuestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Producto9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Producto6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17))
        );
        PanelMuestraLayout.setVerticalGroup(
            PanelMuestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMuestraLayout.createSequentialGroup()
                .addComponent(NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelMuestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Producto1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Producto3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Producto2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(PanelMuestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Producto4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Producto6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Producto5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(PanelMuestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Producto7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Producto8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Producto9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101)
                .addGroup(PanelMuestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonAdelante, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.add(PanelMuestra, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 380, 590));

        PanelCategorias.setBackground(new java.awt.Color(255, 255, 255));

        jButton14.setText("Categoria3");

        jButton15.setText("Categoria1");

        jButton16.setText("Categoria2");

        jButton17.setText("Categoria4");

        javax.swing.GroupLayout PanelCategoriasLayout = new javax.swing.GroupLayout(PanelCategorias);
        PanelCategorias.setLayout(PanelCategoriasLayout);
        PanelCategoriasLayout.setHorizontalGroup(
            PanelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
            .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelCategoriasLayout.setVerticalGroup(
            PanelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCategoriasLayout.createSequentialGroup()
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(417, Short.MAX_VALUE))
        );

        jPanel1.add(PanelCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));
        PanelCategorias.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerfilActionPerformed

        if (Id == null) {
            
            InicioSesion is = new InicioSesion();
            is.setVisible(true);
        } else {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Perfil().setVisible(true);
                }
            });

        }
    }//GEN-LAST:event_PerfilActionPerformed

    private void BotonmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonmenuActionPerformed
        if (PanelCategorias.isVisible()) {
            PanelCategorias.setVisible(false);
        } else {
            PanelCategorias.setVisible(true);
        }

    }//GEN-LAST:event_BotonmenuActionPerformed

    private void BotonAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAdelanteActionPerformed
        JButton[] botonesProductos = {Producto1, Producto2, Producto3, Producto4, Producto5, Producto6, Producto7, Producto8, Producto9};
        BotonAtras.setEnabled(true);

        Idproductos.clear();
        try {
            // Iterar sobre los botones y establecer sus iconos
            for (int i = 0; i < botonesProductos.length; i++) {
                Productos producto = productos.get(cantidadProductos);
                if (producto != null) {
                    botonesProductos[i].setIcon(crearIconoDesdeBits(producto.getImagen(), 90, 90));
                    botonesProductos[i].setContentAreaFilled(true);
                    botonesProductos[i].setEnabled(true);
                    Idproductos.add(producto.getId());
                } else {
                    botonesProductos[i].setContentAreaFilled(false);
                    botonesProductos[i].setEnabled(false);
                    botonesProductos[i].setIcon(null);
                }
                cantidadProductos++;
            }
        } catch (Exception e) {
            System.out.println("Error al establecer el ícono: " + e.getMessage());
        }
        System.out.println(productos.size());
        System.out.println(cantidadProductos);
        if (cantidadProductos == productos.size()) {
            BotonAdelante.setEnabled(false);
        }
    }//GEN-LAST:event_BotonAdelanteActionPerformed

    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        JButton[] botonesProductos = {Producto1, Producto2, Producto3, Producto4, Producto5, Producto6, Producto7, Producto8, Producto9};
        BotonAdelante.setEnabled(true);

        Idproductos.clear();
        cantidadProductos -= 18;
        try {
            // Iterar sobre los botones y establecer sus iconos
            for (int i = 0; i < botonesProductos.length; i++) {
                Productos producto = productos.get(cantidadProductos);
                if (producto != null) {
                    botonesProductos[i].setIcon(crearIconoDesdeBits(producto.getImagen(), 90, 90));
                    botonesProductos[i].setContentAreaFilled(true);
                    botonesProductos[i].setEnabled(true);
                    Idproductos.add(producto.getId());
                } else {
                    botonesProductos[i].setContentAreaFilled(false);
                    botonesProductos[i].setEnabled(false);
                    botonesProductos[i].setIcon(null);
                }
                cantidadProductos++;
            }
        } catch (Exception e) {
            System.out.println("Error al establecer el ícono: " + e.getMessage());
        }
        System.out.println(productos.size());
        System.out.println(cantidadProductos);
        if (cantidadProductos <= 9) {
            BotonAtras.setEnabled(false);
        }
    }//GEN-LAST:event_BotonAtrasActionPerformed

    private void Producto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Producto2ActionPerformed
        Productos producto = daoP.readProducto(String.valueOf(Idproductos.get(1)));
        VisualProduc p1 = new VisualProduc(new JFrame (),true);

        p1.ImagenProducto.setIcon(crearIconoDesdeBits(producto.getImagen(), 200, 200));
        p1.Nombre.setText(producto.getNombre());
        p1.Marca.setText(producto.getMarca());
        p1.Precio.setText(String.valueOf(producto.getPrecio()));
        p1.Color.setText(producto.getColor());
        p1.Descripcion.setText(producto.getDescripcion());   
        IdProducto =  producto.getId();
        p1.setVisible(true);
     

    }//GEN-LAST:event_Producto2ActionPerformed

    private void Producto5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Producto5ActionPerformed
        Productos producto = daoP.readProducto(String.valueOf(Idproductos.get(4)));

        VisualProduc p1 = new VisualProduc(this, true);
        
        p1.ImagenProducto.setIcon(crearIconoDesdeBits(producto.getImagen(), 200, 200));
        p1.Nombre.setText(producto.getNombre());
        p1.Marca.setText(producto.getMarca());
        p1.Precio.setText(String.valueOf(producto.getPrecio()));
        p1.Color.setText(producto.getColor());
        p1.Descripcion.setText(producto.getDescripcion());
        IdProducto =  producto.getId();
        p1.setVisible(true);


    }//GEN-LAST:event_Producto5ActionPerformed

    private void Producto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Producto1ActionPerformed

        Productos producto = daoP.readProducto(String.valueOf(Idproductos.get(0)));
        VisualProduc p1 = new VisualProduc(new JFrame(), true);

        p1.ImagenProducto.setIcon(crearIconoDesdeBits(producto.getImagen(), 200, 200));
        p1.Nombre.setText(producto.getNombre());
        p1.Marca.setText(producto.getMarca());
        p1.Precio.setText(String.valueOf(producto.getPrecio()));
        p1.Color.setText(producto.getColor());
        p1.Descripcion.setText(producto.getDescripcion());
        IdProducto =  producto.getId();
        p1.setVisible(true);
    }//GEN-LAST:event_Producto1ActionPerformed

    private void Producto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Producto3ActionPerformed
        Productos producto = daoP.readProducto(String.valueOf(Idproductos.get(2)));
        VisualProduc p1 = new VisualProduc(new JFrame(), true);

        p1.ImagenProducto.setIcon(crearIconoDesdeBits(producto.getImagen(), 200, 200));
        p1.Nombre.setText(producto.getNombre());
        p1.Marca.setText(producto.getMarca());
        p1.Precio.setText(String.valueOf(producto.getPrecio()));
        p1.Color.setText(producto.getColor());
        p1.Descripcion.setText(producto.getDescripcion());
        IdProducto =  producto.getId();
        p1.setVisible(true);
    }//GEN-LAST:event_Producto3ActionPerformed

    private void Producto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Producto4ActionPerformed
        Productos producto = daoP.readProducto(String.valueOf(Idproductos.get(3)));
        VisualProduc p1 = new VisualProduc(new JFrame(), true);

        p1.ImagenProducto.setIcon(crearIconoDesdeBits(producto.getImagen(), 200, 200));
        p1.Nombre.setText(producto.getNombre());
        p1.Marca.setText(producto.getMarca());
        p1.Precio.setText(String.valueOf(producto.getPrecio()));
        p1.Color.setText(producto.getColor());
        p1.Descripcion.setText(producto.getDescripcion());
        IdProducto =  producto.getId();
        p1.setVisible(true);
    }//GEN-LAST:event_Producto4ActionPerformed

    private void Producto6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Producto6ActionPerformed
        Productos producto = daoP.readProducto(String.valueOf(Idproductos.get(5)));
        VisualProduc p1 = new VisualProduc(new JFrame(), true);

        p1.ImagenProducto.setIcon(crearIconoDesdeBits(producto.getImagen(), 200, 200));
        p1.Nombre.setText(producto.getNombre());
        p1.Marca.setText(producto.getMarca());
        p1.Precio.setText(String.valueOf(producto.getPrecio()));
        p1.Color.setText(producto.getColor());
        p1.Descripcion.setText(producto.getDescripcion());
        IdProducto =  producto.getId();
        p1.setVisible(true);
    }//GEN-LAST:event_Producto6ActionPerformed

    private void Producto7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Producto7ActionPerformed
        Productos producto = daoP.readProducto(String.valueOf(Idproductos.get(6)));
        VisualProduc p1 = new VisualProduc(new JFrame(), true);

        p1.ImagenProducto.setIcon(crearIconoDesdeBits(producto.getImagen(), 200, 200));
        p1.Nombre.setText(producto.getNombre());
        p1.Marca.setText(producto.getMarca());
        p1.Precio.setText(String.valueOf(producto.getPrecio()));
        p1.Color.setText(producto.getColor());
        p1.Descripcion.setText(producto.getDescripcion());
        IdProducto =  producto.getId();
        p1.setVisible(true);
    }//GEN-LAST:event_Producto7ActionPerformed

    private void Producto8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Producto8ActionPerformed
        Productos producto = daoP.readProducto(String.valueOf(Idproductos.get(7)));
        VisualProduc p1 = new VisualProduc(new JFrame(), true);

        p1.ImagenProducto.setIcon(crearIconoDesdeBits(producto.getImagen(), 200, 200));
        p1.Nombre.setText(producto.getNombre());
        p1.Marca.setText(producto.getMarca());
        p1.Precio.setText(String.valueOf(producto.getPrecio()));
        p1.Color.setText(producto.getColor());
        p1.Descripcion.setText(producto.getDescripcion());
        IdProducto =  producto.getId();
        p1.setVisible(true);
    }//GEN-LAST:event_Producto8ActionPerformed

    private void Producto9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Producto9ActionPerformed
        Productos producto = daoP.readProducto(String.valueOf(Idproductos.get(8)));
        VisualProduc p1 = new VisualProduc(new JFrame(), true);

        p1.ImagenProducto.setIcon(crearIconoDesdeBits(producto.getImagen(), 200, 200));
        p1.Nombre.setText(producto.getNombre());
        p1.Marca.setText(producto.getMarca());
        p1.Precio.setText(String.valueOf(producto.getPrecio()));
        p1.Color.setText(producto.getColor());
        p1.Descripcion.setText(producto.getDescripcion());
        IdProducto =  producto.getId();
        p1.setVisible(true);
    }//GEN-LAST:event_Producto9ActionPerformed

 
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
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAdelante;
    private javax.swing.JButton BotonAtras;
    private javax.swing.JButton Botonmenu;
    public static javax.swing.JLabel NombreUsuario;
    private javax.swing.JPanel PanelBotones;
    private javax.swing.JPanel PanelCategorias;
    private javax.swing.JPanel PanelMuestra;
    private javax.swing.JButton Perfil;
    private javax.swing.JButton Producto1;
    private javax.swing.JButton Producto2;
    private javax.swing.JButton Producto3;
    private javax.swing.JButton Producto4;
    private javax.swing.JButton Producto5;
    private javax.swing.JButton Producto6;
    private javax.swing.JButton Producto7;
    private javax.swing.JButton Producto8;
    private javax.swing.JButton Producto9;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public Icon SetIcono(String url, JButton boton) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = boton.getWidth();
        int alto = boton.getHeight();
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return icono;
    }

    public static Icon crearIconoDesdeBits(byte[] imagen, int ancho, int alto) {
        try {

            BufferedImage bufferedImage = null;
            InputStream inputStream = new ByteArrayInputStream(imagen);
            bufferedImage = ImageIO.read(inputStream);
            ImageIcon mIcono = new ImageIcon(bufferedImage.getScaledInstance(ancho, alto, 0));
            return mIcono;
        } catch (Exception e) {
            System.out.println("no se encontro imagen");
        }
        return null;
    }

    private void MostrarProductos() {
        JButton[] botonesProductos = {Producto1, Producto2, Producto3, Producto4, Producto5, Producto6, Producto7, Producto8, Producto9};

        BotonAtras.setEnabled(false);
        if (productos.size() < 9) {
            BotonAdelante.setEnabled(false);
        }

        while (productos.size() % 9 != 0) {
            productos.add(null);
        }

        try {
            // Iterar sobre los botones y establecer sus iconos
            for (int i = 0; i < botonesProductos.length; i++) {
                Productos producto = productos.get(cantidadProductos);
                if (producto != null) {
                    botonesProductos[i].setIcon(crearIconoDesdeBits(producto.getImagen(), 90, 90));
                    botonesProductos[i].setContentAreaFilled(true);
                    botonesProductos[i].setEnabled(true);
                    Idproductos.add(producto.getId());
                } else {
                    botonesProductos[i].setContentAreaFilled(false);
                    botonesProductos[i].setEnabled(false);
                }
                cantidadProductos++;
            }
        } catch (Exception e) {
            System.out.println("Error al establecer el ícono: " + e.getMessage());
        }

    }

    
    
}
