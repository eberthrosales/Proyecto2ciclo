/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pe.edu.upeu.app.gui;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import pe.edu.upeu.app.util.UtilsX;

public class Selector extends javax.swing.JFrame {

    BufferedImage image;
    UtilsX obj = new UtilsX();
    
    public Selector() {
        initComponents();
        //Titulo
        this.setTitle("Login El Brayan");
        //Icono
        try {
            image = ImageIO.read(obj.getFile("brayan.jpg"));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        this.setIconImage(image);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoSelector1 = new pe.edu.upeu.app.component.FondoSelector();
        jButton1 = new javax.swing.JButton();
        btnGVenta = new javax.swing.JButton();
        btnGUsuarios = new javax.swing.JButton();
        btnGMarca = new javax.swing.JButton();
        btnGProducto = new javax.swing.JButton();
        btnGCategoria = new javax.swing.JButton();
        btnGCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cerrar secion.png"))); // NOI18N
        jButton1.setText("CERRAR SECION");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnGVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/venta1.jpg"))); // NOI18N
        btnGVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGVentaActionPerformed(evt);
            }
        });

        btnGUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario1.jpg"))); // NOI18N
        btnGUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGUsuariosActionPerformed(evt);
            }
        });

        btnGMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marca1.jpg"))); // NOI18N
        btnGMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGMarcaActionPerformed(evt);
            }
        });

        btnGProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/producto1.jpg"))); // NOI18N
        btnGProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGProductoActionPerformed(evt);
            }
        });

        btnGCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/categoria1.jpg"))); // NOI18N
        btnGCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGCategoriaActionPerformed(evt);
            }
        });

        btnGCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente1.jpg"))); // NOI18N
        btnGCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fondoSelector1Layout = new javax.swing.GroupLayout(fondoSelector1);
        fondoSelector1.setLayout(fondoSelector1Layout);
        fondoSelector1Layout.setHorizontalGroup(
            fondoSelector1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoSelector1Layout.createSequentialGroup()
                .addGroup(fondoSelector1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoSelector1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(fondoSelector1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGCliente)
                            .addComponent(btnGUsuarios))
                        .addGap(55, 55, 55)
                        .addGroup(fondoSelector1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGMarca)
                            .addComponent(btnGCategoria))
                        .addGap(57, 57, 57)
                        .addGroup(fondoSelector1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGProducto)
                            .addComponent(btnGVenta)))
                    .addGroup(fondoSelector1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondoSelector1Layout.setVerticalGroup(
            fondoSelector1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoSelector1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(fondoSelector1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGCliente)
                    .addComponent(btnGCategoria)
                    .addComponent(btnGProducto))
                .addGap(18, 18, 18)
                .addGroup(fondoSelector1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGUsuarios)
                    .addComponent(btnGMarca)
                    .addComponent(btnGVenta))
                .addGap(55, 55, 55)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fondoSelector1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fondoSelector1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGCategoriaActionPerformed
        MainCategoria mc = new MainCategoria();
        mc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGCategoriaActionPerformed

    private void btnGProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGProductoActionPerformed
        MainProducto mc = new MainProducto();
        mc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGProductoActionPerformed

    private void btnGClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGClienteActionPerformed
        MainCliente mc = new MainCliente();
        mc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGClienteActionPerformed

    private void btnGUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGUsuariosActionPerformed
        MainUsuario mu = new MainUsuario();
        mu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGUsuariosActionPerformed

    private void btnGMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGMarcaActionPerformed
        MainMarca mu = new MainMarca();
        mu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGMarcaActionPerformed

    private void btnGVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGVentaActionPerformed
        MainVentas mu = new MainVentas();
        mu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGVentaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login mu = new Login();
        mu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGCategoria;
    private javax.swing.JButton btnGCliente;
    private javax.swing.JButton btnGMarca;
    private javax.swing.JButton btnGProducto;
    private javax.swing.JButton btnGUsuarios;
    private javax.swing.JButton btnGVenta;
    private pe.edu.upeu.app.component.FondoSelector fondoSelector1;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
