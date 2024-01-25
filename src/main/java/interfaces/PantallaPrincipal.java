package interfaces;

import entities.Avion;
import entities.Miembro;
import entities.Piloto;
import entities.Vuelo;
import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PantallaPrincipal extends javax.swing.JFrame {

    //Connection connection;
    private Session session;
    StringBuilder posibleError;

    public PantallaPrincipal(Session session) {
        initComponents();
        this.setLocationRelativeTo(null);
        //this.connection = connection;
        this.session = session;
        this.posibleError = new StringBuilder();
        this.setVisible(true);
    }

    public PantallaPrincipal(Session session, StringBuilder posibleError) {
        initComponents();
        this.setLocationRelativeTo(null);
        //this.connection = con;
        this.session = session;
        this.posibleError = posibleError;
        textArea.append(posibleError.toString());
        textArea.append("\n------------------------------------------------\n");
        this.setVisible(true);

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
        insercionDePersonaMenu = new javax.swing.JMenuItem();
        insercionDeVueloMenu = new javax.swing.JMenuItem();
        insercionDeAvionMenu = new javax.swing.JMenuItem();
        borradoDatos = new javax.swing.JMenu();
        borradoDePiloto = new javax.swing.JMenuItem();
        borradoDeMiembro = new javax.swing.JMenuItem();
        borradoDeVuelo = new javax.swing.JMenuItem();
        borradoDeAvion = new javax.swing.JMenuItem();
        actualizarDatos = new javax.swing.JMenu();
        actualizarUnPiloto = new javax.swing.JMenuItem();
        actualizarUnVuelo = new javax.swing.JMenuItem();
        actualizarUnAvion = new javax.swing.JMenuItem();
        consultaDeDatos = new javax.swing.JMenu();
        consultaTablaPiloto = new javax.swing.JMenuItem();
        consultaTablaMiembro = new javax.swing.JMenuItem();
        consultaTablaVuelo = new javax.swing.JMenuItem();
        consultaTablaAvion = new javax.swing.JMenuItem();
        disconnectJMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HIBERNATE ACCESO A DATOS");

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        textArea.setLineWrap(true);
        textArea.setRows(5);
        textArea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        textArea.setFocusable(false);
        jScrollPane1.setViewportView(textArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 153, 255));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenuBar1.setMinimumSize(new java.awt.Dimension(700, 30));

        insercionDato.setBorder(null);
        insercionDato.setText("INSERCIÓN DE DATOS");
        insercionDato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        insercionDato.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        insercionDato.setMargin(new java.awt.Insets(11, 11, 11, 11));

        insercionDePersonaMenu.setText("Insertar una nueva Persona (Piloto o miembro)");
        insercionDePersonaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insercionDePersonaMenuActionPerformed(evt);
            }
        });
        insercionDato.add(insercionDePersonaMenu);

        insercionDeVueloMenu.setText("Insertar un nuevo Vuelo");
        insercionDeVueloMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insercionDeVueloMenuActionPerformed(evt);
            }
        });
        insercionDato.add(insercionDeVueloMenu);

        insercionDeAvionMenu.setText("Insertar un nuevo Avión");
        insercionDeAvionMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insercionDeAvionMenuActionPerformed(evt);
            }
        });
        insercionDato.add(insercionDeAvionMenu);

        jMenuBar1.add(insercionDato);

        borradoDatos.setBorder(null);
        borradoDatos.setText("BORRADO DE DATOS");
        borradoDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        borradoDatos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        borradoDatos.setMargin(new java.awt.Insets(11, 11, 11, 11));

        borradoDePiloto.setText("Borrado de un Piloto");
        borradoDePiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borradoDePilotoActionPerformed(evt);
            }
        });
        borradoDatos.add(borradoDePiloto);

        borradoDeMiembro.setText("Borrado de un Miembro");
        borradoDeMiembro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borradoDeMiembroActionPerformed(evt);
            }
        });
        borradoDatos.add(borradoDeMiembro);

        borradoDeVuelo.setText("Borrado de un Vuelo");
        borradoDeVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borradoDeVueloActionPerformed(evt);
            }
        });
        borradoDatos.add(borradoDeVuelo);

        borradoDeAvion.setText("Borrado de un Avión");
        borradoDeAvion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borradoDeAvionActionPerformed(evt);
            }
        });
        borradoDatos.add(borradoDeAvion);

        jMenuBar1.add(borradoDatos);

        actualizarDatos.setBorder(null);
        actualizarDatos.setText("ACTUALIZACIÓN DE DATOS");
        actualizarDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        actualizarDatos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        actualizarDatos.setMargin(new java.awt.Insets(11, 11, 11, 11));

        actualizarUnPiloto.setText("Actualización de una Persona (Piloto o Miembro)");
        actualizarUnPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarUnPilotoActionPerformed(evt);
            }
        });
        actualizarDatos.add(actualizarUnPiloto);

        actualizarUnVuelo.setText("Actualización de un Vuelo");
        actualizarUnVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarUnVueloActionPerformed(evt);
            }
        });
        actualizarDatos.add(actualizarUnVuelo);

        actualizarUnAvion.setText("Actualización de un Avión");
        actualizarUnAvion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarUnAvionActionPerformed(evt);
            }
        });
        actualizarDatos.add(actualizarUnAvion);

        jMenuBar1.add(actualizarDatos);

        consultaDeDatos.setText("CONSULTA DE DATOS");

        consultaTablaPiloto.setText("Consultar tabla Piloto");
        consultaTablaPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaTablaPilotoActionPerformed(evt);
            }
        });
        consultaDeDatos.add(consultaTablaPiloto);

        consultaTablaMiembro.setText("Consultar tabla Miembro");
        consultaTablaMiembro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaTablaMiembroActionPerformed(evt);
            }
        });
        consultaDeDatos.add(consultaTablaMiembro);

        consultaTablaVuelo.setText("Consultar tabla Vuelo");
        consultaTablaVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaTablaVueloActionPerformed(evt);
            }
        });
        consultaDeDatos.add(consultaTablaVuelo);

        consultaTablaAvion.setText("Consultar tabla Avión");
        consultaTablaAvion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaTablaAvionActionPerformed(evt);
            }
        });
        consultaDeDatos.add(consultaTablaAvion);

        jMenuBar1.add(consultaDeDatos);

        disconnectJMenu.setText("SALIR");
        disconnectJMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        disconnectJMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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
        this.dispose();
    }//GEN-LAST:event_disconnectJMenuMouseClicked

    private void insercionDePersonaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insercionDePersonaMenuActionPerformed
        PantallaInsercionPersona nuevaPantallaInsercionPersona = new PantallaInsercionPersona(session);
        this.dispose();
    }//GEN-LAST:event_insercionDePersonaMenuActionPerformed

    private void insercionDeVueloMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insercionDeVueloMenuActionPerformed
        PantallaInsercionVuelo nuevaPantallaInsercionVuelo = new PantallaInsercionVuelo(session);
        this.dispose();
    }//GEN-LAST:event_insercionDeVueloMenuActionPerformed

    private void insercionDeAvionMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insercionDeAvionMenuActionPerformed
        PantallaInsercionAvion nuevaPantallaInsercionAvion = new PantallaInsercionAvion(session);
        this.dispose();

    }//GEN-LAST:event_insercionDeAvionMenuActionPerformed

    private void borradoDePilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borradoDePilotoActionPerformed
        PantallaBorradoPiloto nuevaPantallaBorradoPiloto = new PantallaBorradoPiloto(session);
        this.dispose();

    }//GEN-LAST:event_borradoDePilotoActionPerformed

    private void borradoDeMiembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borradoDeMiembroActionPerformed
        PantallaBorradoMiembro nuevaPantallaBorradoMiembro = new PantallaBorradoMiembro(session);
        this.dispose();

    }//GEN-LAST:event_borradoDeMiembroActionPerformed

    private void borradoDeVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borradoDeVueloActionPerformed
        PantallaBorradoVuelo nuevaPantallaBorradoVuelo = new PantallaBorradoVuelo(session);
        this.dispose();
    }//GEN-LAST:event_borradoDeVueloActionPerformed

    private void borradoDeAvionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borradoDeAvionActionPerformed
        PantallaBorradoAvion nuevaPantallaBorradoAvion = new PantallaBorradoAvion(session);
        this.dispose();
    }//GEN-LAST:event_borradoDeAvionActionPerformed

    private void actualizarUnPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarUnPilotoActionPerformed
        PantallaActualizarPersona nuevaPantallaActualizarPersona = new PantallaActualizarPersona(session);
        this.dispose();

    }//GEN-LAST:event_actualizarUnPilotoActionPerformed

    private void actualizarUnVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarUnVueloActionPerformed
        PantallaActualizarVuelo nuevaPantallaActualizarVuelo = new PantallaActualizarVuelo(session);
        this.dispose();

    }//GEN-LAST:event_actualizarUnVueloActionPerformed

    private void actualizarUnAvionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarUnAvionActionPerformed
        PantallaActualizarAvion nuevaPantallaActualizarAvion = new PantallaActualizarAvion(session);
        this.dispose();

    }//GEN-LAST:event_actualizarUnAvionActionPerformed

    private void consultaTablaPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaTablaPilotoActionPerformed

        Transaction transaction = null;
        try {
            textArea.append("CONSULTA DE PILOTOS\n");
            textArea.append("=====================================\n");
            textArea.append("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-\n");
            transaction = session.beginTransaction();
            List pilotos = session.createQuery("FROM Piloto").list();
            for (Iterator it = pilotos.iterator(); it.hasNext();) {
                Piloto piloto = (Piloto) it.next();
                textArea.append(piloto.toString());
                textArea.append("\n-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-\n");
            }
            textArea.append("=====================================\n");
            transaction.commit();
        } catch (HibernateException e) {

            if (transaction != null) {
                transaction.rollback();
                posibleError = new StringBuilder();
                posibleError.append("La transacción no pudo iniciarse correctamente... Cancelando operación...\n"
                        + e.getMessage());

            }
        }
    }//GEN-LAST:event_consultaTablaPilotoActionPerformed

    private void consultaTablaMiembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaTablaMiembroActionPerformed

        Transaction transaction = null;

        try {
            textArea.append("CONSULTA DE MIEMBROS\n");
            textArea.append("=====================================\n");
            textArea.append("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-\n");
            transaction = session.beginTransaction();
            List miembros = session.createQuery("FROM Miembro").list();
            for (Iterator it = miembros.iterator(); it.hasNext();) {
                Miembro miembro = (Miembro) it.next();
                textArea.append(miembro.toString());
                textArea.append("\n-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-\n");

            }
            textArea.append("=====================================\n");
            transaction.commit();
        } catch (HibernateException e) {

            if (transaction != null) {
                transaction.rollback();
                posibleError = new StringBuilder();
                posibleError.append("La transacción no pudo iniciarse correctamente... Cancelando operación...\n"
                        + e.getMessage());

            }
        }
    }//GEN-LAST:event_consultaTablaMiembroActionPerformed

    private void consultaTablaVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaTablaVueloActionPerformed

        Transaction transaction = null;

        try {
            textArea.append("CONSULTA DE VUELOS\n");
            textArea.append("=====================================\n");
            textArea.append("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-\n");
            transaction = session.beginTransaction();
            List vuelos = session.createQuery("FROM Vuelo").list();
            for (Iterator it = vuelos.iterator(); it.hasNext();) {
                Vuelo vuelo = (Vuelo) it.next();
                textArea.append(vuelo.toString());
                textArea.append("\n-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-\n");
            }
            textArea.append("=====================================\n");
            transaction.commit();
        } catch (HibernateException e) {

            if (transaction != null) {
                transaction.rollback();
                posibleError = new StringBuilder();
                posibleError.append("La transacción no pudo iniciarse correctamente... Cancelando operación...\n"
                        + e.getMessage());

            }
        }
    }//GEN-LAST:event_consultaTablaVueloActionPerformed

    private void consultaTablaAvionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaTablaAvionActionPerformed

        Transaction transaction = null;

        try {
            textArea.append("CONSULTA DE AVIONES\n");
            textArea.append("=====================================\n");
            textArea.append("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-\n");
            transaction = session.beginTransaction();
            List aviones = session.createQuery("FROM Avion").list();
            for (Iterator it = aviones.iterator(); it.hasNext();) {
                Avion avion = (Avion) it.next();
                textArea.append(avion.toString());
                textArea.append("\n-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-\n");
            }
            textArea.append("=====================================\n");
            transaction.commit();
        } catch (HibernateException e) {

            if (transaction != null) {
                transaction.rollback();
                posibleError = new StringBuilder();
                posibleError.append("La transacción no pudo iniciarse correctamente... Cancelando operación...\n"
                        + e.getMessage());

            }
        }
    }//GEN-LAST:event_consultaTablaAvionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu actualizarDatos;
    private javax.swing.JMenuItem actualizarUnAvion;
    private javax.swing.JMenuItem actualizarUnPiloto;
    private javax.swing.JMenuItem actualizarUnVuelo;
    private javax.swing.JMenu borradoDatos;
    private javax.swing.JMenuItem borradoDeAvion;
    private javax.swing.JMenuItem borradoDeMiembro;
    private javax.swing.JMenuItem borradoDePiloto;
    private javax.swing.JMenuItem borradoDeVuelo;
    private javax.swing.JMenu consultaDeDatos;
    private javax.swing.JMenuItem consultaTablaAvion;
    private javax.swing.JMenuItem consultaTablaMiembro;
    private javax.swing.JMenuItem consultaTablaPiloto;
    private javax.swing.JMenuItem consultaTablaVuelo;
    private javax.swing.JMenu disconnectJMenu;
    private javax.swing.JMenu insercionDato;
    private javax.swing.JMenuItem insercionDeAvionMenu;
    private javax.swing.JMenuItem insercionDePersonaMenu;
    private javax.swing.JMenuItem insercionDeVueloMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
