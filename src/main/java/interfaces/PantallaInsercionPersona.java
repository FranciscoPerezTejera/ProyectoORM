package interfaces;

import entities.Miembro;
import entities.Piloto;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PantallaInsercionPersona extends javax.swing.JFrame {

    private Session session;
    private boolean esPiloto;
    
    public PantallaInsercionPersona(Session session) {
        initComponents();
        this.session = session;
        esPiloto = false;
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        isPiloto.addActionListener((e) -> {

            if (isPiloto.isSelected()) {

                horasDeVueloJLabel.setEnabled(true);
                horasDeVueloPilotoTextField.setEnabled(true);
                esPiloto = true;
                

            } else {

                horasDeVueloJLabel.setEnabled(false);
                horasDeVueloPilotoTextField.setEnabled(false);
                horasDeVueloPilotoTextField.setText("");
                esPiloto = false;
            }

        });
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
        jLabel2 = new javax.swing.JLabel();
        condigoPersonaTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nombrePersonaTextfield = new javax.swing.JTextField();
        isPiloto = new javax.swing.JCheckBox();
        cancelarInsercionJButton = new javax.swing.JButton();
        insertarPersonaJButton = new javax.swing.JButton();
        horasDeVueloJLabel = new javax.swing.JLabel();
        horasDeVueloPilotoTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREACIÓN DE UNA NUEVA PERSONA");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Codigo de persona:");

        condigoPersonaTextField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        condigoPersonaTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Nombre de la persona:");

        nombrePersonaTextfield.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nombrePersonaTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        isPiloto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        isPiloto.setText("¿LA PERSONA ES UN PILOTO?");
        isPiloto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        cancelarInsercionJButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cancelarInsercionJButton.setText("CANCELAR");
        cancelarInsercionJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarInsercionJButtonActionPerformed(evt);
            }
        });

        insertarPersonaJButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        insertarPersonaJButton.setText("INSERTAR");
        insertarPersonaJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarPersonaJButtonActionPerformed(evt);
            }
        });

        horasDeVueloJLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        horasDeVueloJLabel.setText("Horas de vuelo del piloto:");
        horasDeVueloJLabel.setEnabled(false);

        horasDeVueloPilotoTextField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        horasDeVueloPilotoTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        horasDeVueloPilotoTextField.setEnabled(false);
        horasDeVueloPilotoTextField.setMaximumSize(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(horasDeVueloPilotoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(isPiloto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(horasDeVueloJLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(cancelarInsercionJButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(insertarPersonaJButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombrePersonaTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                    .addComponent(condigoPersonaTextField))
                                .addGap(3, 3, 3)))
                        .addGap(21, 21, 21))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(condigoPersonaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nombrePersonaTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(isPiloto)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horasDeVueloPilotoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horasDeVueloJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarInsercionJButton)
                    .addComponent(insertarPersonaJButton))
                .addContainerGap(21, Short.MAX_VALUE))
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

    private void insertarPersonaJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarPersonaJButtonActionPerformed

        StringBuilder posibleError = new StringBuilder("La inserción se realizo correctamente.\n");
        Transaction transaction = null;
        String codigoPersona = condigoPersonaTextField.getText();
        String nombrePersona = nombrePersonaTextfield.getText();
        Piloto nuevoPiloto = null;
        Miembro nuevoMiembro = null;

        if (esPiloto) {
            String horasDeVuelo = horasDeVueloPilotoTextField.getText();
            nuevoPiloto = new Piloto();
            nuevoPiloto.setCodigo(codigoPersona);
            nuevoPiloto.setNombrePersona(nombrePersona);
            nuevoPiloto.setHoraDeVuelo(Integer.parseInt(horasDeVuelo));
            posibleError.append("El piloto llamado " + nuevoPiloto.getNombrePersona() + " ha sido insertado con éxito.");

        } else {
            nuevoMiembro = new Miembro();
            nuevoMiembro.setCodigo(codigoPersona);
            nuevoMiembro.setNombrePersona(nombrePersona);
            posibleError.append("El miembro llamado " + nuevoMiembro.getNombrePersona() + " ha sido insertado con éxito.");

        }
        
        try {

            transaction = session.beginTransaction();

            if (nuevoPiloto != null) {
                session.persist(nuevoPiloto);
            } else if (nuevoMiembro != null) {
                session.persist(nuevoMiembro);
            }
            transaction.commit();
            
        } catch (Exception e) {

            if (transaction != null) {
                transaction.rollback();
                posibleError = new StringBuilder("La transacción no pudo iniciarse correctamente... Cancelando operación...\n"
                        + e.getMessage());
            }
            e.printStackTrace();
        }
        this.dispose();
        PantallaPrincipal nuevaPantallaPrincipal = new PantallaPrincipal(session, posibleError);
    }//GEN-LAST:event_insertarPersonaJButtonActionPerformed

    private void cancelarInsercionJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarInsercionJButtonActionPerformed
        this.dispose();
        PantallaPrincipal nuevaPantallaPrincipal = new PantallaPrincipal(session);

    }//GEN-LAST:event_cancelarInsercionJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarInsercionJButton;
    private javax.swing.JTextField condigoPersonaTextField;
    private javax.swing.JLabel horasDeVueloJLabel;
    private javax.swing.JTextField horasDeVueloPilotoTextField;
    private javax.swing.JButton insertarPersonaJButton;
    private javax.swing.JCheckBox isPiloto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombrePersonaTextfield;
    // End of variables declaration//GEN-END:variables
}
