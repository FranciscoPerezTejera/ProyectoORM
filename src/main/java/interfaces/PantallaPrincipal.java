package interfaces;

import entities.Avion;
import entities.Miembro;
import entities.Piloto;
import entities.Vuelo;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PantallaPrincipal extends javax.swing.JFrame {

    private Session session;
    StringBuilder posibleError;

    public PantallaPrincipal(Session session) {
        initComponents();
        this.setLocationRelativeTo(null);
        //this.connection = connection;
        this.session = session;
        this.posibleError = new StringBuilder("Bienvenidos a la aplicación para la gestión CRUD sobre la base de datos con hibernate");
        this.setVisible(true);
        textArea.append(posibleError.toString());
    }

    public PantallaPrincipal(Session session, StringBuilder posibleError) {
        initComponents();
        this.setLocationRelativeTo(null);
        //this.connection = con;
        this.session = session;
        this.posibleError = posibleError;
        textArea.append(posibleError.toString());
        this.setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaDeDatos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
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
        consutlasExtras = new javax.swing.JMenu();
        extraUno = new javax.swing.JMenuItem();
        extraDos = new javax.swing.JMenuItem();
        extraTres = new javax.swing.JMenuItem();
        extraCuatro = new javax.swing.JMenuItem();
        disconnectJMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(161, 155, 118));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        textArea.setLineWrap(true);
        textArea.setRows(5);
        textArea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        textArea.setFocusable(false);
        jScrollPane1.setViewportView(textArea);

        tablaDeDatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tablaDeDatos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tablaDeDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "  ", "   ", "   ", "   "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaDeDatos.setEnabled(false);
        jScrollPane2.setViewportView(tablaDeDatos);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hibernate-logo.png"))); // NOI18N
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(188, 174, 121));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenuBar1.setMinimumSize(new java.awt.Dimension(700, 30));

        insercionDato.setBackground(new java.awt.Color(104, 113, 111));
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

        borradoDatos.setBackground(new java.awt.Color(104, 113, 111));
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

        actualizarDatos.setBackground(new java.awt.Color(104, 113, 111));
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

        consultaDeDatos.setBackground(new java.awt.Color(104, 113, 111));
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

        consutlasExtras.setBackground(new java.awt.Color(104, 113, 111));
        consutlasExtras.setText("CONSULTAS EXTRAS");

        extraUno.setText("Contar la cantidad de vuelos realizados por cada piloto");
        extraUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraUnoActionPerformed(evt);
            }
        });
        consutlasExtras.add(extraUno);

        extraDos.setText("Obtener la lista de miembros ordenados por la cantidad de vuelos realizados");
        extraDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraDosActionPerformed(evt);
            }
        });
        consutlasExtras.add(extraDos);

        extraTres.setText("Obtener todos los vuelos con información completa");
        extraTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraTresActionPerformed(evt);
            }
        });
        consutlasExtras.add(extraTres);

        extraCuatro.setText("Obtener el piloto con más vuelos");
        extraCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraCuatroActionPerformed(evt);
            }
        });
        consutlasExtras.add(extraCuatro);

        jMenuBar1.add(consutlasExtras);

        disconnectJMenu.setBackground(new java.awt.Color(104, 113, 111));
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        List<Piloto> listaPilotos = listadePilotos();

        //"ID", "Código", "Nombre", "Horas de Vuelo"
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("CÓDIGO");
        tableModel.addColumn("NOMBRE");
        tableModel.addColumn("HORAS_DE_VUELO");

        listaPilotos.forEach(e -> {
            tableModel.addRow(new Object[]{e.getId(), e.getCodigo(), e.getNombrePersona(), e.getHoraDeVuelo()});
        });

        tablaDeDatos.setModel(tableModel);
    }//GEN-LAST:event_consultaTablaPilotoActionPerformed

    private void consultaTablaMiembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaTablaMiembroActionPerformed

        List<Miembro> listaMiembro = listadeMiembros();

        //"ID", "Código", "Nombre"
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("CÓDIGO");
        tableModel.addColumn("NOMBRE");

        listaMiembro.forEach(e -> {
            tableModel.addRow(new Object[]{e.getId(), e.getCodigo(), e.getNombrePersona()});
        });

        tablaDeDatos.setModel(tableModel);
    }//GEN-LAST:event_consultaTablaMiembroActionPerformed

    private void consultaTablaVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaTablaVueloActionPerformed

        List<Vuelo> listaVuelos = listadeVuelos();

        //"ID", "Numero_Vuelo", "Origen, Destino, Hora, Fecha, Piloto, Miembro, Avión
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("NÚMERO_VUELO");
        tableModel.addColumn("ORIGEN");
        tableModel.addColumn("DESTINO");
        tableModel.addColumn("HORA");
        tableModel.addColumn("FECHA");
        tableModel.addColumn("ID_PILOTO");
        tableModel.addColumn("ID_MIEMBRO");
        tableModel.addColumn("ID_AVIÓN");

        listaVuelos.forEach(e -> {
            tableModel.addRow(new Object[]{e.getId(), e.getNum_vuelo(), e.getOrigen(),
                e.getDestino(), e.getHora(), e.getFecha().toString(), e.getPiloto().getId(),
                e.getMiembro().getId(), e.getAvion().getId()});
        });

        tablaDeDatos.setModel(tableModel);
    }//GEN-LAST:event_consultaTablaVueloActionPerformed

    private void consultaTablaAvionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaTablaAvionActionPerformed

        List<Avion> listaAviones = listadeAviones();

        //"ID", "Código_Avion", "Tipo_Avion"
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("CÓDIGO_AVIÓN");
        tableModel.addColumn("TIPO_AVIÓN");

        listaAviones.forEach(e -> {
            tableModel.addRow(new Object[]{e.getId(), e.getCodigoAvion(), e.getTipoAvion()});
        });

        tablaDeDatos.setModel(tableModel);
    }//GEN-LAST:event_consultaTablaAvionActionPerformed

    private void extraUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extraUnoActionPerformed

        List<Object[]> listaVuelosPorPiloto = catidadVuelosPorPiloto();

        //ID_PILOTO, NOMBRE_PILOTO, TOTAL_VUELOS
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID_PILOTO");
        tableModel.addColumn("NOMBRE_PILOTO");
        tableModel.addColumn("TOTAL_VUELOS");

        for (Object[] datos : listaVuelosPorPiloto) {
            tableModel.addRow(datos);
        }
        tablaDeDatos.setModel(tableModel);

    }//GEN-LAST:event_extraUnoActionPerformed

    private void extraDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extraDosActionPerformed

        List<Object[]> listaDeMIembros = vuelosRealizadosPorMiembro();

        //ID_PILOTO, NOMBRE_PILOTO, TOTAL_VUELOS
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID_MIEMBRO");
        tableModel.addColumn("NOMBRE_MIEMBRO");
        tableModel.addColumn("TOTAL_VUELOS");

        for (Object[] datos : listaDeMIembros) {
            tableModel.addRow(datos);
        }
        tablaDeDatos.setModel(tableModel);
    }//GEN-LAST:event_extraDosActionPerformed

    private void extraTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extraTresActionPerformed

        List<Object[]> listaDeVuelosCompleta = listaDeVuelosCompletos();

        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID_VUELO");
        tableModel.addColumn("NÚMERO_VUELO");
        tableModel.addColumn("ORIGEN");
        tableModel.addColumn("DESTINO");
        tableModel.addColumn("FECHA");
        tableModel.addColumn("HORA");
        tableModel.addColumn("CÓDIGO_AVIÓN");
        tableModel.addColumn("TIPO_AVIÓN");
        tableModel.addColumn("NOMBRE_PILOTO");
        tableModel.addColumn("NOMBRE_MIEMBRO");

        for (Object[] datos : listaDeVuelosCompleta) {
            tableModel.addRow(datos);
        }
        tablaDeDatos.setModel(tableModel);

    }//GEN-LAST:event_extraTresActionPerformed

    private void extraCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extraCuatroActionPerformed

        List<Object[]> listaDeVuelosCompleta = pilotoConMasVuelos();

        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID_PILOTO");
        tableModel.addColumn("CÓDIGO_PILOTO");
        tableModel.addColumn("NOMBRE_PILOTO");
        tableModel.addColumn("TOTAL_VUELOS");

        for (Object[] datos : listaDeVuelosCompleta) {
            tableModel.addRow(datos);
        }
        tablaDeDatos.setModel(tableModel);

    }//GEN-LAST:event_extraCuatroActionPerformed


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
    private javax.swing.JMenu consutlasExtras;
    private javax.swing.JMenu disconnectJMenu;
    private javax.swing.JMenuItem extraCuatro;
    private javax.swing.JMenuItem extraDos;
    private javax.swing.JMenuItem extraTres;
    private javax.swing.JMenuItem extraUno;
    private javax.swing.JMenu insercionDato;
    private javax.swing.JMenuItem insercionDeAvionMenu;
    private javax.swing.JMenuItem insercionDePersonaMenu;
    private javax.swing.JMenuItem insercionDeVueloMenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaDeDatos;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables

    private List<Piloto> listadePilotos() {

        Transaction transaction = null;
        transaction = session.beginTransaction();
        List vuelos = session.createQuery("FROM Piloto", Piloto.class).list();
        transaction.commit();
        return vuelos;

    }

    private List<Miembro> listadeMiembros() {

        Transaction transaction = null;
        transaction = session.beginTransaction();
        List vuelos = session.createQuery("FROM Miembro", Miembro.class).list();
        transaction.commit();
        return vuelos;

    }

    private List<Vuelo> listadeVuelos() {

        Transaction transaction = null;
        transaction = session.beginTransaction();
        List vuelos = session.createQuery("FROM Vuelo", Vuelo.class).list();
        transaction.commit();
        return vuelos;

    }

    private List<Avion> listadeAviones() {

        Transaction transaction = null;
        transaction = session.beginTransaction();
        List aviones = session.createQuery("FROM Avion", Vuelo.class).list();
        transaction.commit();
        return aviones;
    }

    private List<Object[]> catidadVuelosPorPiloto() {

        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            String hql = "SELECT p.id AS IdPiloto, p.nombrePersona AS Piloto, COUNT(v.id) AS TotalVuelos "
                    + "FROM Piloto p "
                    + "LEFT JOIN p.vuelos v "
                    + "GROUP BY p.id, p.nombrePersona";

            List<Object[]> resultado = session.createQuery(hql).list();
            transaction.commit();

            return resultado;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            textArea.append("\nNose puede realizar la query por falta de datos en la tabla.");
            return null;
        }
    }

    private List<Object[]> vuelosRealizadosPorMiembro() {

        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            String hql = """
                    SELECT m.id AS IdMiembro, m.nombrePersona AS Miembro, COUNT(v.id) AS TotalVuelos
                                FROM Miembro m
                                LEFT JOIN m.vuelos v
                                GROUP BY m.id, m.nombrePersona
                                ORDER BY TotalVuelos DESC
                         """;

            List<Object[]> resultado = session.createQuery(hql).list();
            transaction.commit();

            return resultado;

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            textArea.append("\nNose puede realizar la query por falta de datos en la tabla.");
            return null;
        }
    }

    private List<Object[]> listaDeVuelosCompletos() {

        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            String hql = """
                    SELECT v.id AS IdVuelo, v.num_vuelo, v.origen, v.destino, v.fecha, v.hora, 
                           a.codigoAvion, a.tipoAvion, 
                           p.nombrePersona AS NombrePiloto,
                           m.nombrePersona AS NombreMiembro
                           FROM Vuelo v
                           LEFT JOIN v.avion a
                           LEFT JOIN v.piloto p
                           LEFT JOIN v.miembro m
                         """;

            List<Object[]> resultado = session.createQuery(hql).list();
            transaction.commit();

            return resultado;

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            textArea.append("\nNose puede realizar la query por falta de datos en la tabla.");
            return null;
        }
    }
    
    private List<Object[]> pilotoConMasVuelos() {

        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            String hql = """
                   SELECT p.id AS IdPiloto, p.codigo AS CodigoPiloto, p.nombrePersona AS Piloto, COUNT(v.id) AS TotalVuelos
                   FROM Piloto p
                   LEFT JOIN p.vuelos v
                   GROUP BY p.id, p.codigo, p.nombrePersona
                   ORDER BY TotalVuelos DESC
                   LIMIT 1
                         """;

            List<Object[]> resultado = session.createQuery(hql).list();
            transaction.commit();

            return resultado;

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            textArea.append("\nNose puede realizar la query por falta de datos en la tabla.");
            return null;
        }
    }
   
}
