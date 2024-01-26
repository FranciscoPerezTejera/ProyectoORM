package interfaces;

import Utiles.ControlDeExcepciones;
import entities.Vuelo;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PantallaBorradoVuelo extends javax.swing.JFrame {

    private Session session;
    private ControlDeExcepciones error;

    public PantallaBorradoVuelo(Session session) {
        initComponents();

        this.session = session;
        error = new ControlDeExcepciones();
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
        idVueloTextField = new javax.swing.JTextField();
        cancelarBorradoButton = new javax.swing.JButton();
        borrarVueloButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BORRADO DE UN VUELO");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("ID del vuelo:");

        idVueloTextField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        idVueloTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cancelarBorradoButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cancelarBorradoButton.setText("CANCELAR");
        cancelarBorradoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBorradoButtonActionPerformed(evt);
            }
        });

        borrarVueloButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        borrarVueloButton.setText("BORRAR");
        borrarVueloButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarVueloButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(28, 28, 28)
                        .addComponent(idVueloTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cancelarBorradoButton)
                        .addGap(18, 18, 18)
                        .addComponent(borrarVueloButton)))
                .addContainerGap(33, Short.MAX_VALUE))
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
                    .addComponent(idVueloTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(borrarVueloButton)
                    .addComponent(cancelarBorradoButton))
                .addContainerGap(28, Short.MAX_VALUE))
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

    private void cancelarBorradoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBorradoButtonActionPerformed
        this.dispose();
        PantallaPrincipal nuevaPantallaPrincipal = new PantallaPrincipal(session);
    }//GEN-LAST:event_cancelarBorradoButtonActionPerformed

    private void borrarVueloButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarVueloButtonActionPerformed

        StringBuilder posibleError = new StringBuilder("El vuelo con ID" + idVueloTextField.getText() + ", ha sido eliminado correctamente.\n");
        Transaction transaction = null;
        Vuelo borrarVuelo = null;

        String idVuelo = idVueloTextField.getText();

        if (!error.estaVacio(idVuelo) && error.esUnNumero(idVuelo)) {

            try {
                transaction = session.beginTransaction();
                borrarVuelo = session.get(Vuelo.class, idVuelo);
                session.remove(borrarVuelo);
                transaction.commit();

                this.dispose();
                PantallaPrincipal newPantallaPrincipal = new PantallaPrincipal(session, posibleError);

            } catch (Exception e) {

                transaction.rollback();
                JOptionPane.showMessageDialog(null, "Ese ID de vuelo no existe en la base de datos.", "ERROR", JOptionPane.ERROR_MESSAGE);

            }
        } else {

            JOptionPane.showMessageDialog(null, "El ID solo admite números\n y no puede estar vacio el campo", "ERROR", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_borrarVueloButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrarVueloButton;
    private javax.swing.JButton cancelarBorradoButton;
    private javax.swing.JTextField idVueloTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
