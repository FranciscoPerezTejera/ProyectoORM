package interfaces;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PantallaPrincipal extends javax.swing.JFrame {

    Connection connection;
    StringBuilder posibleError;

    public PantallaPrincipal(Connection connection) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.connection = connection;
        this.posibleError = new StringBuilder();
    }

    public PantallaPrincipal(Connection con, StringBuilder posibleError) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.connection = con;
        this.posibleError = posibleError;

        textArea.append(posibleError.toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        insercionDato = new javax.swing.JMenu();
        disconnectJMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PRÁCTICA JDBC ACCESO A DATOS");

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        textArea.setLineWrap(true);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuBar1.setMinimumSize(new java.awt.Dimension(700, 30));

        insercionDato.setText("INSERTAR DATOS");
        jMenuBar1.add(insercionDato);

        disconnectJMenu.setText("SALIR");
        disconnectJMenu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        disconnectJMenu.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        disconnectJMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disconnectJMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(disconnectJMenu);

        setJMenuBar(jMenuBar1);

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

    private void disconnectJMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disconnectJMenuMouseClicked

        try {
            connection.close();
            System.out.println("Conexión con el servidor cerrada.");
        } catch (SQLException ex) {

            textArea.append("No se ha podido cerrar la conexion con el servidor\n");
            textArea.append(ex.getMessage() + "\n");
            textArea.append("-1");
            textArea.append("\n----------------------------------------------------\n");

        }
        this.dispose();
    }//GEN-LAST:event_disconnectJMenuMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu disconnectJMenu;
    private javax.swing.JMenu insercionDato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
