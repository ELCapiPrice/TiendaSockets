/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author nschu
 */
public class ClienteUI extends javax.swing.JFrame {

    /**
     * Creates new form ClienteUI
     */
    public ClienteUI() {
        
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        cargarImagenes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        EtiquetaNombreEmpresa = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        imagen1Producto = new javax.swing.JLabel();
        imagen2Producto = new javax.swing.JLabel();
        imagen3Producto = new javax.swing.JLabel();
        imagen4Producto = new javax.swing.JLabel();
        imagen5Producto = new javax.swing.JLabel();
        imagen6Producto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        titulo3 = new javax.swing.JLabel();
        titulo4 = new javax.swing.JLabel();
        titulo5 = new javax.swing.JLabel();
        titulo6 = new javax.swing.JLabel();
        stock1 = new javax.swing.JLabel();
        stock2 = new javax.swing.JLabel();
        stock3 = new javax.swing.JLabel();
        stock4 = new javax.swing.JLabel();
        stock5 = new javax.swing.JLabel();
        stock6 = new javax.swing.JLabel();
        boton1Comprar = new javax.swing.JButton();
        boton2Comprar = new javax.swing.JButton();
        boton3Comprar = new javax.swing.JButton();
        boton4Comprar = new javax.swing.JButton();
        boton5Comprar = new javax.swing.JButton();
        boton6Comprar = new javax.swing.JButton();
        botonActualizar = new javax.swing.JButton();
        botonCarrito = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Practica 2 ");

        EtiquetaNombreEmpresa.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        EtiquetaNombreEmpresa.setText("Tomatera  Mike Feliz");

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setText("Articulos en Venta:");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText("Stock: ");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("Stock: ");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setText("Stock: ");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setText("Stock: ");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setText("Stock: ");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setText("Stock: ");

        titulo1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        titulo1.setText("1000  Recetas de Tomate");

        titulo2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        titulo2.setText("La Biblia del Tomate");

        titulo3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        titulo3.setText("Tomate en Polvo para Cocinar");

        titulo4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        titulo4.setText("Tomate en Polvo para cocinar");

        titulo5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        titulo5.setText("Tomate Entero Pelado");

        titulo6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        titulo6.setText("Jugo de Tomate");

        stock1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        stock1.setText("100");

        stock2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        stock2.setText("100");

        stock3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        stock3.setText("100");

        stock4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        stock4.setText("100");

        stock5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        stock5.setText("100");

        stock6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        stock6.setText("100");

        boton1Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ComprarActionPerformed(evt);
            }
        });

        boton2Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ComprarActionPerformed(evt);
            }
        });

        boton3Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ComprarActionPerformed(evt);
            }
        });

        boton4Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ComprarActionPerformed(evt);
            }
        });

        boton5Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ComprarActionPerformed(evt);
            }
        });

        boton6Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ComprarActionPerformed(evt);
            }
        });

        botonCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCarritoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(imagen1Producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(titulo1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(stock1))))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titulo4)
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(boton1Comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(panelLayout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(stock4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(boton4Comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(imagen4Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(152, 152, 152)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imagen2Producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(imagen5Producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stock2)
                                .addGap(32, 32, 32)
                                .addComponent(boton3Comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stock5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boton5Comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(titulo2)
                            .addComponent(titulo5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulo3)
                            .addComponent(titulo6)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(stock6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                    .addComponent(boton6Comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(stock3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(boton2Comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(imagen3Producto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(imagen6Producto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(46, 46, 46))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(EtiquetaNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EtiquetaNombreEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(botonActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagen3Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagen2Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagen1Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulo1)
                            .addComponent(titulo3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(stock1)
                                .addComponent(stock2)
                                .addComponent(stock3))
                            .addComponent(boton2Comprar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton1Comprar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(titulo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton3Comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagen6Producto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagen4Producto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagen5Producto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titulo4)
                            .addComponent(titulo5)
                            .addComponent(titulo6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(stock4)
                                .addComponent(stock5)
                                .addComponent(stock6))
                            .addComponent(boton4Comprar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton5Comprar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton6Comprar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(62, 62, 62))
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Salir");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton1ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ComprarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton1ComprarActionPerformed

    private void boton2ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ComprarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton2ComprarActionPerformed

    private void boton3ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ComprarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton3ComprarActionPerformed

    private void boton4ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ComprarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton4ComprarActionPerformed

    private void boton5ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ComprarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton5ComprarActionPerformed

    private void boton6ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ComprarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton6ComprarActionPerformed

    private void botonCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCarritoActionPerformed
        CarritoUI carrito= new CarritoUI();
        carrito.setVisible(true);
       // this.dispose();
    }//GEN-LAST:event_botonCarritoActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EtiquetaNombreEmpresa;
    private javax.swing.JButton boton1Comprar;
    private javax.swing.JButton boton2Comprar;
    private javax.swing.JButton boton3Comprar;
    private javax.swing.JButton boton4Comprar;
    private javax.swing.JButton boton5Comprar;
    private javax.swing.JButton boton6Comprar;
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonCarrito;
    private javax.swing.JLabel imagen1Producto;
    private javax.swing.JLabel imagen2Producto;
    private javax.swing.JLabel imagen3Producto;
    private javax.swing.JLabel imagen4Producto;
    private javax.swing.JLabel imagen5Producto;
    private javax.swing.JLabel imagen6Producto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel stock1;
    private javax.swing.JLabel stock2;
    private javax.swing.JLabel stock3;
    private javax.swing.JLabel stock4;
    private javax.swing.JLabel stock5;
    private javax.swing.JLabel stock6;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    private javax.swing.JLabel titulo4;
    private javax.swing.JLabel titulo5;
    private javax.swing.JLabel titulo6;
    // End of variables declaration//GEN-END:variables

    private void cargarImagenes() {
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/imagenes/1000RecetasDeTomate.jpg"));
        Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(imagen1Producto.getWidth(), imagen1Producto.getHeight(), Image.SCALE_SMOOTH));
        imagen1Producto.setIcon(fondo1);
        this.repaint();
        
        ImageIcon imagen2 = new ImageIcon(getClass().getResource("/imagenes/LaBibliaDelTomate.jpg"));
        Icon fondo2 = new ImageIcon(imagen2.getImage().getScaledInstance(imagen2Producto.getWidth(), imagen2Producto.getHeight(), Image.SCALE_SMOOTH));
        imagen2Producto.setIcon(fondo2);
        this.repaint();
        
        ImageIcon imagen3 = new ImageIcon(getClass().getResource("/imagenes/TomateEnPolvoCocinar.jpg"));
        Icon fondo3 = new ImageIcon(imagen3.getImage().getScaledInstance(imagen3Producto.getWidth(), imagen3Producto.getHeight(), Image.SCALE_SMOOTH));
        imagen3Producto.setIcon(fondo3);
        this.repaint();
        
        
        ImageIcon imagen4 = new ImageIcon(getClass().getResource("/imagenes/TomateEnPolvoGelatina.jpg"));
        Icon fondo4 = new ImageIcon(imagen4.getImage().getScaledInstance(imagen4Producto.getWidth(), imagen4Producto.getHeight(), Image.SCALE_SMOOTH));
        imagen4Producto.setIcon(fondo4);
        this.repaint();
        
        ImageIcon imagen5 = new ImageIcon(getClass().getResource("/imagenes/TomateEnteroPelado.jpg"));
        Icon fondo5 = new ImageIcon(imagen5.getImage().getScaledInstance(imagen5Producto.getWidth(), imagen5Producto.getHeight(), Image.SCALE_SMOOTH));
        imagen5Producto.setIcon(fondo5);
        this.repaint();
        
        ImageIcon imagen6 = new ImageIcon(getClass().getResource("/imagenes/ZumoDeTomatejpg.jpg"));
        Icon fondo6 = new ImageIcon(imagen6.getImage().getScaledInstance(imagen6Producto.getWidth(), imagen6Producto.getHeight(), Image.SCALE_SMOOTH));
        imagen6Producto.setIcon(fondo6);
        this.repaint();
        
        
        ImageIcon imagen7 = new ImageIcon(getClass().getResource("/imagenes/Boton.png"));
        Icon fondo7 = new ImageIcon(imagen7.getImage().getScaledInstance(boton1Comprar.getWidth(), boton1Comprar.getHeight(), Image.SCALE_SMOOTH));
        boton1Comprar.setIcon(fondo7);
        this.repaint();
        
        ImageIcon imagen8 = new ImageIcon(getClass().getResource("/imagenes/Boton.png"));
        Icon fondo8 = new ImageIcon(imagen8.getImage().getScaledInstance(boton2Comprar.getWidth(), boton2Comprar.getHeight(), Image.SCALE_SMOOTH));
        boton2Comprar.setIcon(fondo8);
        this.repaint();
        
        ImageIcon imagen9 = new ImageIcon(getClass().getResource("/imagenes/Boton.png"));
        Icon fondo9 = new ImageIcon(imagen9.getImage().getScaledInstance(boton3Comprar.getWidth(), boton3Comprar.getHeight(), Image.SCALE_SMOOTH));
        boton3Comprar.setIcon(fondo9);
        this.repaint();
        
        ImageIcon imagen10 = new ImageIcon(getClass().getResource("/imagenes/Boton.png"));
        Icon fondo10 = new ImageIcon(imagen10.getImage().getScaledInstance(boton4Comprar.getWidth(), boton4Comprar.getHeight(), Image.SCALE_SMOOTH));
        boton4Comprar.setIcon(fondo10);
        this.repaint();
        
        ImageIcon imagen11 = new ImageIcon(getClass().getResource("/imagenes/Boton.png"));
        Icon fondo11 = new ImageIcon(imagen11.getImage().getScaledInstance(boton5Comprar.getWidth(), boton5Comprar.getHeight(), Image.SCALE_SMOOTH));
        boton5Comprar.setIcon(fondo11);
        this.repaint();
        
        ImageIcon imagen12 = new ImageIcon(getClass().getResource("/imagenes/Boton.png"));
        Icon fondo12 = new ImageIcon(imagen12.getImage().getScaledInstance(boton6Comprar.getWidth(), boton6Comprar.getHeight(), Image.SCALE_SMOOTH));
        boton6Comprar.setIcon(fondo12);
        this.repaint();
        
        ImageIcon imagen13 = new ImageIcon(getClass().getResource("/imagenes/order.png"));
        Icon fondo13 = new ImageIcon(imagen13.getImage().getScaledInstance(botonCarrito.getWidth(), botonCarrito.getHeight(), Image.SCALE_SMOOTH));
        botonCarrito.setIcon(fondo13);
        this.repaint();
        
        ImageIcon imagen14 = new ImageIcon(getClass().getResource("/imagenes/update.png"));
        Icon fondo14 = new ImageIcon(imagen14.getImage().getScaledInstance(botonActualizar.getWidth(), botonActualizar.getHeight(), Image.SCALE_SMOOTH));
        botonActualizar.setIcon(fondo14);
        this.repaint();
        
    }
}
