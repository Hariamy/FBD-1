/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.AlbumSQL;
import Controller.Conexao;
import Controller.GravadoraSQL;
import Model.Album;
import Model.Gravadora;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tibet Teixeira
 */
public class EditarAlbum extends javax.swing.JFrame {

    private Album album;

    /**
     * Creates new form EditarAlbum
     */
    public EditarAlbum(Album album) {

        initComponents();

//        String precoCompra = "" + album.getPrecoCompra();
        String precoCompra = String.format("%5.2f", album.getPrecoCompra());
        precoCompra = precoCompra.replace(".", ",");

        txtCodigoAlbum.setText("" + album.getIdAlbum());
        txtDescricao.setText(album.getDescricao());
        txtDataCompra.setText(album.getDataCompra());
        txtPrecoCompra.setText(precoCompra);
        txtTipoCompra.setText(album.getTipoCompra());
        txtDataGravacao.setText(album.getDataGravacao());

        cbGravadora.addItem(album.getCodigoGravadora() + " - " + album.getNomeGravadora());
        
        List<Gravadora> gravadoras = listarGravadoras();
        for (Gravadora gravadora : gravadoras) {
            cbGravadora.addItem(gravadora.getCodigoGravadora() + " - " + gravadora.getNome());
        }
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
        jPanel2 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigoAlbum = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtDataCompra = new javax.swing.JTextField();
        txtPrecoCompra = new javax.swing.JTextField();
        txtTipoCompra = new javax.swing.JTextField();
        txtDataGravacao = new javax.swing.JTextField();
        cbGravadora = new javax.swing.JComboBox<>();
        btnEditar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        menuMusica = new javax.swing.JLabel();
        menuArtista = new javax.swing.JLabel();
        menuAlbum = new javax.swing.JLabel();
        menuPlaylist = new javax.swing.JLabel();
        jTextBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(832, 37));

        labelTitulo.setFont(new java.awt.Font("Old English Text MT", 0, 36)); // NOI18N
        labelTitulo.setText("Editar Álbum");

        jLabel1.setText("Código do álbum");

        jLabel2.setText("Descrição");

        jLabel3.setText("Tipo da compra");

        jLabel4.setText("Data de gravação");

        jLabel5.setText("Data de compra");

        jLabel6.setText("Preço de compra");

        jLabel7.setText("Gravadora");

        txtCodigoAlbum.setEditable(false);

        btnEditar.setText("Editar");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarMouseClicked(evt);
            }
        });
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTitulo)
                .addGap(308, 308, 308))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtDataGravacao, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigoAlbum)
                            .addComponent(txtTipoCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(txtDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(txtPrecoCompra))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(cbGravadora, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(labelTitulo)
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigoAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(txtDataGravacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbGravadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        menuMusica.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        menuMusica.setForeground(new java.awt.Color(204, 204, 204));
        menuMusica.setText("Músicas");

        menuArtista.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        menuArtista.setForeground(new java.awt.Color(204, 204, 204));
        menuArtista.setText("Artistas");

        menuAlbum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        menuAlbum.setForeground(new java.awt.Color(204, 204, 204));
        menuAlbum.setText("Álbuns");

        menuPlaylist.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        menuPlaylist.setForeground(new java.awt.Color(204, 204, 204));
        menuPlaylist.setText("Playlists");

        jTextBuscar.setText("Buscar...");
        jTextBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBuscarActionPerformed(evt);
            }
        });
        jTextBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextBuscarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuMusica)
                    .addComponent(menuArtista)
                    .addComponent(menuAlbum)
                    .addComponent(menuPlaylist)
                    .addComponent(jTextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jTextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(menuMusica)
                .addGap(18, 18, 18)
                .addComponent(menuArtista)
                .addGap(18, 18, 18)
                .addComponent(menuAlbum)
                .addGap(18, 18, 18)
                .addComponent(menuPlaylist)
                .addContainerGap(271, Short.MAX_VALUE))
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

    private void jTextBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextBuscarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBuscarKeyPressed

    private void jTextBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
        dispose();
        new MostrarAlbum().setVisible(true);
    }//GEN-LAST:event_btnVoltarMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        editarAlbum();
        new MostrarAlbum().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEditarMouseClicked

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
            java.util.logging.Logger.getLogger(EditarAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new EditarAlbum().setVisible(true);
            }
        });
    }

    private List<Gravadora> listarGravadoras() {

        Connection conn = Conexao.abrirConexao();
        GravadoraSQL gravadoraSQL = new GravadoraSQL(conn);
        List<Gravadora> listaGravadoras = gravadoraSQL.listarGravadoras();
        Conexao.fecharConexao(conn);

        return listaGravadoras;
    }

    private void editarAlbum() {

        int codigoAlbum = Integer.parseInt(txtCodigoAlbum.getText());
        String descricao = txtDescricao.getText();
        String dataCompra = txtDataCompra.getText();
        String tipoCompra = txtTipoCompra.getText();
        String dataGravacao = txtDataGravacao.getText();
        float precoCompra = Float.parseFloat(txtPrecoCompra.getText().replace(",", "."));
        String[] gravadora = cbGravadora.getSelectedItem().toString().split(" - ");
        int codigoGravadora = Integer.parseInt(gravadora[0]);

        Connection conn = Conexao.abrirConexao();
        AlbumSQL albumSQL = new AlbumSQL(conn);
        albumSQL.editaAlbum(codigoAlbum, descricao, dataCompra, tipoCompra, dataGravacao, precoCompra, codigoGravadora);
        Conexao.fecharConexao(conn);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbGravadora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextBuscar;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel menuAlbum;
    private javax.swing.JLabel menuArtista;
    private javax.swing.JLabel menuMusica;
    private javax.swing.JLabel menuPlaylist;
    private javax.swing.JTextField txtCodigoAlbum;
    private javax.swing.JTextField txtDataCompra;
    private javax.swing.JTextField txtDataGravacao;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtPrecoCompra;
    private javax.swing.JTextField txtTipoCompra;
    // End of variables declaration//GEN-END:variables

}
