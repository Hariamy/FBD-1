package View;

/**
 *
 * @author Arida
 */
public class telaInicialUsuario extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public telaInicialUsuario() {
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

        Menu = new javax.swing.JMenuBar();
        fileOptionMenu = new javax.swing.JMenu();
        quitFileOptionMenu = new javax.swing.JMenuItem();
        editOptionMenu = new javax.swing.JMenu();
        helpOptionMenu = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();

        fileOptionMenu.setText("File");

        quitFileOptionMenu.setText("Exit");
        fileOptionMenu.add(quitFileOptionMenu);

        Menu.add(fileOptionMenu);

        editOptionMenu.setText("Edit");
        Menu.add(editOptionMenu);

        helpOptionMenu.setText("Help");
        Menu.add(helpOptionMenu);

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel1)
                .addContainerGap(226, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel1)
                .addContainerGap(181, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu editOptionMenu;
    private javax.swing.JMenu fileOptionMenu;
    private javax.swing.JMenu helpOptionMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem quitFileOptionMenu;
    // End of variables declaration//GEN-END:variables
}
