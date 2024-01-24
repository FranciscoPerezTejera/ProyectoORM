package interfaces;

import entities.Avion;
import entities.Miembro;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PantallaBorradoMiembro extends javax.swing.JFrame {

    private Session session;

    public PantallaBorradoMiembro(Session session) {
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
        idMiembroTextfield = new javax.swing.JTextField();
        cancelarBorradoMiembroButton = new javax.swing.JButton();
        borradoMiembroButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BORRADO DE UN MIEMBRO");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("ID del miembro:");

        idMiembroTextfield.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        idMiembroTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cancelarBorradoMiembroButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cancelarBorradoMiembroButton.setText("CANCELAR");
        cancelarBorradoMiembroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBorradoMiembroButtonActionPerformed(evt);
            }
        });

        borradoMiembroButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        borradoMiembroButton.setText("INSERTAR");
        borradoMiembroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borradoMiembroButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cancelarBorradoMiembroButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(borradoMiembroButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(idMiembroTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idMiembroTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarBorradoMiembroButton)
                    .addComponent(borradoMiembroButton))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarBorradoMiembroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBorradoMiembroButtonActionPerformed
        this.dispose();
        PantallaPrincipal nuevaPantallaPrincipal = new PantallaPrincipal(session);
    }//GEN-LAST:event_cancelarBorradoMiembroButtonActionPerformed

    private void borradoMiembroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borradoMiembroButtonActionPerformed

        StringBuilder posibleError = new StringBuilder("El avión con ID" + idMiembroTextfield.getText() + ", ha sido eliminado correctamente.\n");
        Transaction transaction = null;
        Miembro miembroABorrar = new Miembro();

        try {
            miembroABorrar = session.get(Miembro.class, Integer.parseInt(idMiembroTextfield.getText()));
            System.out.println(miembroABorrar.toString());

            if (miembroABorrar.equals(null)) {
                throw new Exception();

            } else {

                transaction = session.beginTransaction();
                session.remove(miembroABorrar);
                transaction.commit();
            }

        } catch (Exception e) {

            if (transaction != null) {
                transaction.rollback();
                posibleError = new StringBuilder();
                posibleError.append("La transacción no pudo iniciarse correctamente... Cancelando operación...\n"
                        + e.getMessage());

            } else {
                posibleError = new StringBuilder();
                posibleError.append("El avión con ID " + idMiembroTextfield.getText() + ", "
                        + "no se ha podido eliminar por un ERROR, cancelando operación...\n"
                        + e.getMessage());
            }
        }

        this.dispose();
        PantallaPrincipal newPantallaPrincipal = new PantallaPrincipal(session, posibleError);
    }//GEN-LAST:event_borradoMiembroButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borradoMiembroButton;
    private javax.swing.JButton cancelarBorradoMiembroButton;
    private javax.swing.JTextField idMiembroTextfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
