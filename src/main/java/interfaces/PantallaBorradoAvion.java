package interfaces;

import entities.Avion;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PantallaBorradoAvion extends javax.swing.JFrame {

    private Session session;

    public PantallaBorradoAvion(Session session) {
        initComponents();
        this.session = session;
        this.setLocationRelativeTo(null);
        this.setVisible(true);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idAvionTextField = new javax.swing.JTextField();
        borrarAvionButton = new javax.swing.JButton();
        cancelarBorradoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BORRADO DE UN AVIÓN");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("ID del avión:");

        idAvionTextField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        idAvionTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        borrarAvionButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        borrarAvionButton.setText("INSERTAR");
        borrarAvionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarAvionButtonActionPerformed(evt);
            }
        });

        cancelarBorradoButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cancelarBorradoButton.setText("CANCELAR");
        cancelarBorradoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBorradoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cancelarBorradoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(borrarAvionButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(idAvionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(idAvionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(borrarAvionButton)
                    .addComponent(cancelarBorradoButton))
                .addContainerGap(28, Short.MAX_VALUE))
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

    private void borrarAvionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarAvionButtonActionPerformed

        StringBuilder posibleError = new StringBuilder("El avión con ID " + idAvionTextField.getText() + ", ha sido eliminado correctamente.\n");
        Transaction transaction = null;
        String idAvion = idAvionTextField.getText();

        try {
            transaction = session.beginTransaction();
            session.createQuery("DELETE FROM Avion WHERE id = :idAvion")
                    .setParameter("idAvion", idAvion)
                    .executeUpdate();

            transaction.commit();

        } catch (Exception e) {

            if (transaction != null) {
                transaction.rollback();
                posibleError = new StringBuilder();
                posibleError.append("La transacción no pudo iniciarse correctamente... Cancelando operación...\n"
                        + e.getMessage());

            } else {
                posibleError = new StringBuilder();
                posibleError.append("El avión con ID " + idAvionTextField.getText() + ", "
                        + "no se ha podido eliminar por un ERROR, cancelando operación...\n"
                        + e.getMessage());
            }
        }
        this.dispose();
        PantallaPrincipal newPantallaPrincipal = new PantallaPrincipal(session, posibleError);
    }//GEN-LAST:event_borrarAvionButtonActionPerformed

    private void cancelarBorradoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBorradoButtonActionPerformed
        this.dispose();
        PantallaPrincipal nuevaPantallaPrincipal = new PantallaPrincipal(session);

    }//GEN-LAST:event_cancelarBorradoButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrarAvionButton;
    private javax.swing.JButton cancelarBorradoButton;
    private javax.swing.JTextField idAvionTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
