/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Faixa;
import Controller.Conexao;
import Controller.FaixaSQL;
import java.awt.Color;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Tibet Teixeira
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        menuMusica = new javax.swing.JLabel();
        menuArtista = new javax.swing.JLabel();
        menuAlbum = new javax.swing.JLabel();
        menuPlaylist = new javax.swing.JLabel();
        jTextBuscar = new javax.swing.JTextField();
        labelNovaPlaylist = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));

        jPanel3.setBackground(new java.awt.Color(24, 24, 24));

        labelTitulo.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Spotper");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(369, 369, 369)
                .addComponent(labelTitulo)
                .addContainerGap(347, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(labelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuMusica.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        menuMusica.setForeground(new java.awt.Color(155, 155, 155));
        menuMusica.setText("Músicas");
        menuMusica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMusicaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuMusicaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuMusicaMouseExited(evt);
            }
        });

        menuArtista.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        menuArtista.setForeground(new java.awt.Color(155, 155, 155));
        menuArtista.setText("Artistas");
        menuArtista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuArtistaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuArtistaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuArtistaMouseExited(evt);
            }
        });

        menuAlbum.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        menuAlbum.setForeground(new java.awt.Color(155, 155, 155));
        menuAlbum.setText("Álbuns");
        menuAlbum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAlbumMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuAlbumMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuAlbumMouseExited(evt);
            }
        });

        menuPlaylist.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        menuPlaylist.setForeground(new java.awt.Color(155, 155, 155));
        menuPlaylist.setText("Playlists");
        menuPlaylist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuPlaylistMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuPlaylistMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuPlaylistMouseExited(evt);
            }
        });

        jTextBuscar.setBackground(new java.awt.Color(51, 51, 51));
        jTextBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jTextBuscar.setText("Buscar...");
        jTextBuscar.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextBuscarKeyPressed(evt);
            }
        });

        labelNovaPlaylist.setFont(new java.awt.Font("MV Boli", 0, 16)); // NOI18N
        labelNovaPlaylist.setForeground(new java.awt.Color(155, 155, 155));
        labelNovaPlaylist.setText("+ Nova Playlist");
        labelNovaPlaylist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelNovaPlaylist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelNovaPlaylistMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelNovaPlaylistMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelNovaPlaylistMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menuAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menuPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menuMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextBuscar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(labelNovaPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jTextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(menuMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(labelNovaPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuMusicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMusicaMouseClicked
        new MostrarFaixas().setVisible(true);
        dispose();
    }//GEN-LAST:event_menuMusicaMouseClicked

    private void menuArtistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuArtistaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuArtistaMouseClicked

    private void menuAlbumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAlbumMouseClicked
        new MostrarAlbum().setVisible(true);
        dispose();
    }//GEN-LAST:event_menuAlbumMouseClicked

    private void menuPlaylistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPlaylistMouseClicked
        new MostrarPlaylist().setVisible(true);
        dispose();
    }//GEN-LAST:event_menuPlaylistMouseClicked

    private void jTextBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextBuscarKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String strTexto = jTextBuscar.getText();
            new MostrarResultado(strTexto).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jTextBuscarKeyPressed

    private void labelNovaPlaylistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelNovaPlaylistMouseClicked
        new CriarPlaylist(this).setVisible(true);
        dispose();
    }//GEN-LAST:event_labelNovaPlaylistMouseClicked

    private void menuMusicaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMusicaMouseEntered
        menuMusica.setForeground(Color.WHITE);
    }//GEN-LAST:event_menuMusicaMouseEntered

    private void menuMusicaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMusicaMouseExited
        Color gray = new Color(155,155,155);
        menuMusica.setForeground(gray);
    }//GEN-LAST:event_menuMusicaMouseExited

    private void menuArtistaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuArtistaMouseEntered
        menuArtista.setForeground(Color.WHITE);
    }//GEN-LAST:event_menuArtistaMouseEntered

    private void menuArtistaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuArtistaMouseExited
        Color gray = new Color(155,155,155);
        menuArtista.setForeground(gray);
    }//GEN-LAST:event_menuArtistaMouseExited

    private void menuAlbumMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAlbumMouseEntered
        menuAlbum.setForeground(Color.WHITE);
    }//GEN-LAST:event_menuAlbumMouseEntered

    private void menuAlbumMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAlbumMouseExited
        Color gray = new Color(155,155,155);
        menuAlbum.setForeground(gray);
    }//GEN-LAST:event_menuAlbumMouseExited

    private void menuPlaylistMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPlaylistMouseEntered
        menuPlaylist.setForeground(Color.WHITE);
    }//GEN-LAST:event_menuPlaylistMouseEntered

    private void menuPlaylistMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPlaylistMouseExited
        Color gray = new Color(155,155,155);
        menuPlaylist.setForeground(gray);
    }//GEN-LAST:event_menuPlaylistMouseExited

    private void labelNovaPlaylistMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelNovaPlaylistMouseEntered
        labelNovaPlaylist.setForeground(Color.WHITE);
    }//GEN-LAST:event_labelNovaPlaylistMouseEntered

    private void labelNovaPlaylistMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelNovaPlaylistMouseExited
        Color gray = new Color(155,155,155);
        labelNovaPlaylist.setForeground(gray);
    }//GEN-LAST:event_labelNovaPlaylistMouseExited

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextBuscar;
    private javax.swing.JLabel labelNovaPlaylist;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel menuAlbum;
    private javax.swing.JLabel menuArtista;
    private javax.swing.JLabel menuMusica;
    private javax.swing.JLabel menuPlaylist;
    // End of variables declaration//GEN-END:variables
}
