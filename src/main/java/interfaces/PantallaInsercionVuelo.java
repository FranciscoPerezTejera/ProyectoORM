package interfaces;

import Utiles.ControlDeExcepciones;
import entities.Avion;
import entities.Miembro;
import entities.Piloto;
import entities.Vuelo;
import java.sql.Date;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PantallaInsercionVuelo extends javax.swing.JFrame {

    private Session session;
    private List<Integer> listaDePilotos;
    private List<Integer> listaDeMiembros;
    private List<Integer> listaDeAviones;
    private ControlDeExcepciones error;

    public PantallaInsercionVuelo(Session session) {
        initComponents();
        this.session = session;
        this.error = new ControlDeExcepciones();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        listaDePilotos = listaDePilotos();
        listaDeMiembros = listaDeMiembros();
        listaDeAviones = listaDeAviones();

        horadeDeVueloJLabel.setText("00:00");

        horarioJslider.setMinimum(0);
        horarioJslider.setMaximum(1439);
        horarioJslider.setValue(0);

        horarioJslider.addChangeListener(new ChangeListener() {

            public void stateChanged(ChangeEvent e) {
                int minutos = horarioJslider.getValue();
                float horas = minutos / 60.0f;
                String horaFormateada = formatarHora(horas);
                horadeDeVueloJLabel.setText(horaFormateada);
            }
        });
        for (Integer piloto : listaDePilotos) {
            comboBoxPiloto.addItem(piloto.toString());
        }

        for (Integer miembro : listaDeMiembros) {
            comboBoxMiembro.addItem(miembro.toString());

        }

        for (Integer avion : listaDeAviones) {
            comboBoxAvion.addItem(avion.toString());
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
        jLabel2 = new javax.swing.JLabel();
        numeroDeVueloTextfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        origenDelVueloTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        horarioJslider = new javax.swing.JSlider();
        horadeDeVueloJLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        destinoDelVueloTextField = new javax.swing.JTextField();
        cancelarInsercionVueloButton = new javax.swing.JButton();
        insertarNuevoVueloButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        comboBoxPiloto = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        comboBoxMiembro = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        comboBoxAvion = new javax.swing.JComboBox<>();
        anioCombo = new javax.swing.JComboBox<>();
        mesCombo = new javax.swing.JComboBox<>();
        diaCombo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Numero de vuelo:");

        numeroDeVueloTextfield.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        numeroDeVueloTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Origen del vuelo:");

        origenDelVueloTextField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        origenDelVueloTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Destino del vuelo:");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREACIÓN DE UN NUEVO VUELO");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Hora de vuelo:");

        horadeDeVueloJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        horadeDeVueloJLabel.setText("  ");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Fecha del vuelo:");

        destinoDelVueloTextField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        destinoDelVueloTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        destinoDelVueloTextField.setMaximumSize(null);

        cancelarInsercionVueloButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cancelarInsercionVueloButton.setText("CANCELAR");
        cancelarInsercionVueloButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarInsercionVueloButtonActionPerformed(evt);
            }
        });

        insertarNuevoVueloButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        insertarNuevoVueloButton.setText("INSERTAR");
        insertarNuevoVueloButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarNuevoVueloButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Piloto del vuelo:");

        comboBoxPiloto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Miembro del vuelo:");

        comboBoxMiembro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel9.setText("AÑO");

        jLabel10.setText("MES");

        jLabel11.setText("DÍA");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setText("Avión del vuelo:");

        comboBoxAvion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        anioCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065", "2066", "2067", "2068", "2069", "2070", "2071", "2072", "2073", "2074", "2075", "2076", "2077" }));

        mesCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        diaCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cancelarInsercionVueloButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(insertarNuevoVueloButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(horadeDeVueloJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(origenDelVueloTextField)
                                    .addComponent(numeroDeVueloTextfield)
                                    .addComponent(horarioJslider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(destinoDelVueloTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(comboBoxMiembro, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(comboBoxAvion, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(anioCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(jLabel10)
                                                .addGap(12, 12, 12)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(mesCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                                        .addComponent(jLabel11)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(diaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                        .addComponent(comboBoxPiloto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(2, 2, 2)))))))
                        .addGap(24, 24, 24)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(numeroDeVueloTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(origenDelVueloTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(destinoDelVueloTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horarioJslider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horadeDeVueloJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(anioCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxPiloto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxMiembro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxAvion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarInsercionVueloButton)
                    .addComponent(insertarNuevoVueloButton))
                .addGap(32, 32, 32))
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

    private void cancelarInsercionVueloButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarInsercionVueloButtonActionPerformed
        this.dispose();
        PantallaPrincipal nuevaPantallaPrincipal = new PantallaPrincipal(session);
    }//GEN-LAST:event_cancelarInsercionVueloButtonActionPerformed

    private void insertarNuevoVueloButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarNuevoVueloButtonActionPerformed

        StringBuilder posibleError = new StringBuilder("La inserción se realizó correctamente.\n");
        Transaction transaction = null;
        String numeroDeVuelo = numeroDeVueloTextfield.getText();
        String origenDeVuelo = origenDelVueloTextField.getText();
        String destinoDeVuelo = destinoDelVueloTextField.getText();
        String horaDeVuelo = horadeDeVueloJLabel.getText();
        String anioFecha = anioCombo.getSelectedItem().toString();
        String mesFecha = mesCombo.getSelectedItem().toString();
        String diaFecha = diaCombo.getSelectedItem().toString();
        Date fechaDeVuelo = Date.valueOf(formateoDeFecha(anioFecha, mesFecha, diaFecha));

        Vuelo nuevoVuelo = new Vuelo();

        if (!error.estaVacio(numeroDeVuelo)
                && !error.estaVacio(origenDeVuelo)
                && !error.estaVacio(destinoDeVuelo)
                && !error.estaVacio(anioFecha)
                && !error.estaVacio(mesFecha)
                && !error.estaVacio(diaFecha)
                && error.esUnNumero(numeroDeVuelo)) {

            nuevoVuelo.setNum_vuelo(Integer.parseInt(numeroDeVuelo));
            nuevoVuelo.setOrigen(origenDeVuelo);
            nuevoVuelo.setDestino(destinoDeVuelo);
            nuevoVuelo.setHora(horaDeVuelo);
            nuevoVuelo.setFecha(fechaDeVuelo);
            nuevoVuelo.setPiloto(pilotoDelVuelo(comboBoxPiloto.getSelectedItem().toString()));
            nuevoVuelo.setMiembro(miembroDelVuelo(comboBoxMiembro.getSelectedItem().toString()));
            nuevoVuelo.setAvion(avionDelVuelo(comboBoxAvion.getSelectedItem().toString()));

            try {

                transaction = session.beginTransaction();
                session.persist(nuevoVuelo);
                transaction.commit();

                this.dispose();
                PantallaPrincipal nuevaPantallaPrincipal = new PantallaPrincipal(session, posibleError);

            } catch (Exception e) {

                transaction.rollback();
                JOptionPane.showMessageDialog(null, "Ha habido un error en la transacción, canelando operació...", "ERROR", JOptionPane.ERROR_MESSAGE);
                this.dispose();
                PantallaPrincipal nuevaPantallaPrincipal = new PantallaPrincipal(session, posibleError);
            }
        } else {
            if (error.estaVacio(numeroDeVuelo)
                    || error.estaVacio(origenDeVuelo)
                    || error.estaVacio(destinoDeVuelo)) {
                JOptionPane.showMessageDialog(null, "Los campos no pueden estar vacíos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (!error.esUnNumero(numeroDeVuelo)) {
                JOptionPane.showMessageDialog(null, "El campos Número de vuelo solo admiten números.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_insertarNuevoVueloButtonActionPerformed

    private String formatarHora(float horas) {
        int horasEnteras = (int) horas;
        int minutos = (int) ((horas - horasEnteras) * 60);
        DecimalFormat formatoHora = new DecimalFormat("00");
        return formatoHora.format(horasEnteras) + ":" + formatoHora.format(minutos);
    }

    private LocalDate formateoDeFecha(String anioFecha, String mesFecha, String diaFecha) {

        return LocalDate.of(
                Integer.parseInt(anioFecha),
                Integer.parseInt(mesFecha),
                Integer.parseInt(diaFecha));

    }

    private List<Integer> listaDePilotos() {

        Transaction transaction = null;
        transaction = session.beginTransaction();
        List<Integer> lista = session.createQuery("SELECT id FROM Piloto", Integer.class
        ).getResultList();
        transaction.commit();
        return lista;
    }

    private List<Integer> listaDeMiembros() {

        Transaction transaction = null;
        transaction = session.beginTransaction();
        List<Integer> lista = session.createQuery("SELECT id FROM Miembro", Integer.class
        ).getResultList();
        transaction.commit();
        return lista;
    }

    private List<Integer> listaDeAviones() {

        Transaction transaction = null;
        transaction = session.beginTransaction();
        List<Integer> lista = session.createQuery("SELECT id FROM Avion", Integer.class
        ).getResultList();
        transaction.commit();
        return lista;
    }

    private Piloto pilotoDelVuelo(String idPiloto) {
        Piloto piloto = session.get(Piloto.class, idPiloto);
        return piloto;
    }

    private Miembro miembroDelVuelo(String idMiembro) {
        Miembro miembro = session.get(Miembro.class, idMiembro);
        return miembro;
    }

    private Avion avionDelVuelo(String idAvion) {
        Avion avion = session.get(Avion.class, idAvion);
        return avion;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> anioCombo;
    private javax.swing.JButton cancelarInsercionVueloButton;
    private javax.swing.JComboBox<String> comboBoxAvion;
    private javax.swing.JComboBox<String> comboBoxMiembro;
    private javax.swing.JComboBox<String> comboBoxPiloto;
    private javax.swing.JTextField destinoDelVueloTextField;
    private javax.swing.JComboBox<String> diaCombo;
    private javax.swing.JLabel horadeDeVueloJLabel;
    private javax.swing.JSlider horarioJslider;
    private javax.swing.JButton insertarNuevoVueloButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> mesCombo;
    private javax.swing.JTextField numeroDeVueloTextfield;
    private javax.swing.JTextField origenDelVueloTextField;
    // End of variables declaration//GEN-END:variables

}
