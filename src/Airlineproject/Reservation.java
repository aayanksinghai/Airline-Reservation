package Airlineproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import java.util.Properties;

 

public class Reservation extends javax.swing.JFrame {

    Connection con;
    Statement stmt;
    ResultSet rs;
    private int row;


    public Reservation() {
        initComponents();

        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AirlineReservation", "root", "root");
            stmt = con.createStatement();

            rs = stmt.executeQuery("Select curdate()");
            rs.first();
            txtBookingDate.setText(rs.getString("curdate()"));
            txtBookingDate.setEnabled(false);

            DefaultComboBoxModel cls = (DefaultComboBoxModel) cmbClass.getModel();

            String s = "Select distinct(class) from seating";
            rs = stmt.executeQuery(s);

            cmbClass.setModel(cls);

            String clas, type;

            while (rs.next()) {

                clas = rs.getString("Class");
                cls.addElement(clas);

            }

            DefaultComboBoxModel ty = (DefaultComboBoxModel) cmbType.getModel();
            String p = "Select distinct(Type) from Flight";
            rs = stmt.executeQuery(p);

            cmbType.setModel(ty);

            while (rs.next()) {

                type = rs.getString("Type");
                ty.addElement(type);

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbType = new javax.swing.JComboBox<>();
        cmbFlight = new javax.swing.JComboBox<>();
        cmbClass = new javax.swing.JComboBox<>();
        txtBookingDate = new javax.swing.JTextField();
        txtType = new javax.swing.JTextField();
        txtFlight = new javax.swing.JTextField();
        txtClass = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSeats = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtSeatno = new javax.swing.JTextField();
        txtFare = new javax.swing.JTextField();
        btnBooking = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFlight = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtJourneyDate = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Reservation");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Booking Date");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Select Type");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Select Flight");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Class");

        cmbType.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        cmbType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTypeActionPerformed(evt);
            }
        });
        cmbType.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cmbTypePropertyChange(evt);
            }
        });

        cmbFlight.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmbFlight.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbFlightFocusGained(evt);
            }
        });
        cmbFlight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbFlightMouseClicked(evt);
            }
        });
        cmbFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFlightActionPerformed(evt);
            }
        });
        cmbFlight.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cmbFlightPropertyChange(evt);
            }
        });

        cmbClass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmbClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        cmbClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClassActionPerformed(evt);
            }
        });

        txtBookingDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtType.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtFlight.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtClass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        tblSeats.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tblSeats.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Flight_No", "Seat_No", "FlightDate", "Class", "Fare", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSeats.setColumnSelectionAllowed(true);
        tblSeats.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblSeats.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tblSeats.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSeatsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSeats);
        tblSeats.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblSeats.getColumnModel().getColumnCount() > 0) {
            tblSeats.getColumnModel().getColumn(0).setResizable(false);
            tblSeats.getColumnModel().getColumn(1).setResizable(false);
            tblSeats.getColumnModel().getColumn(2).setResizable(false);
            tblSeats.getColumnModel().getColumn(3).setResizable(false);
            tblSeats.getColumnModel().getColumn(4).setResizable(false);
            tblSeats.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Name of Person");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Seat No.");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Fare");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Journey Date");

        txtName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtSeatno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtFare.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtFare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFareActionPerformed(evt);
            }
        });

        btnBooking.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBooking.setText("CONFIRM BOOKING");
        btnBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookingActionPerformed(evt);
            }
        });

        btnNew.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNew.setText("NEW");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        tblFlight.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tblFlight.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Flight_No", "Type", "Trip", "Source", "Destination", "ArrivalTime", "DepartureTime"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFlight.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblFlight.setEditingColumn(0);
        tblFlight.setEditingRow(0);
        tblFlight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFlightMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblFlight);
        if (tblFlight.getColumnModel().getColumnCount() > 0) {
            tblFlight.getColumnModel().getColumn(0).setResizable(false);
            tblFlight.getColumnModel().getColumn(1).setResizable(false);
            tblFlight.getColumnModel().getColumn(2).setResizable(false);
            tblFlight.getColumnModel().getColumn(3).setResizable(false);
            tblFlight.getColumnModel().getColumn(4).setResizable(false);
            tblFlight.getColumnModel().getColumn(5).setResizable(false);
            tblFlight.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Email-Address");

        txtEmail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtJourneyDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("<BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel12))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(txtJourneyDate, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(jLabel8)
                                .addGap(59, 59, 59))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addGap(52, 52, 52)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                .addComponent(txtName))
                            .addComponent(txtSeatno, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFare, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(btnBack)
                        .addGap(98, 98, 98)
                        .addComponent(btnBooking)
                        .addGap(114, 114, 114)
                        .addComponent(btnNew))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(143, 143, 143)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbClass, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtClass, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(139, 139, 139)
                                    .addComponent(jLabel4))
                                .addComponent(jLabel2))
                            .addComponent(txtBookingDate, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(204, 204, 204)
                        .addComponent(jLabel5)
                        .addGap(62, 62, 62)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(368, 368, 368))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBookingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbFlight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFlight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSeatno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtJourneyDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBooking)
                            .addComponent(btnNew)
                            .addComponent(btnBack))))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFareActionPerformed


    private void cmbFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFlightActionPerformed

      
            txtFlight.setText(cmbFlight.getSelectedItem().toString());
            DefaultTableModel flgs = (DefaultTableModel) tblFlight.getModel();
            String flgno, type, trip, source, destin, arrive, depart;
            try {
                String q = "Select * from Flight where Flight_No = '" + txtFlight.getText() + "' ";
                rs = stmt.executeQuery(q);

                tblFlight.setModel(flgs);
                flgs.setRowCount(0);

                while (rs.next()) {

                    flgno = rs.getString("Flight_No");
                    type = rs.getString("Type");
                    trip = rs.getString("Trip");
                    source = rs.getString("Source");
                    destin = rs.getString("Destination");
                    arrive = rs.getString("ArrivalTime");
                    depart = rs.getString("DepartureTime");
                    flgs.addRow(new Object[]{flgno, type, trip, source, destin, arrive, depart
                    }
                    );
                }

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, e);

            }
        

    }//GEN-LAST:event_cmbFlightActionPerformed


    private void cmbTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTypeActionPerformed

        txtType.setText(cmbType.getSelectedItem().toString());

        try {

            if (cmbType.getSelectedItem().toString().equals("Domestic")) 
            {

                String q = "Select Flight_No from flight where Type= 'Domestic'";
                rs = stmt.executeQuery(q);

                DefaultComboBoxModel model = (DefaultComboBoxModel)cmbFlight.getModel();
                cmbFlight.setModel(model);
                
                
                while(rs.next())
                {

                    model.addElement(rs.getString("Flight_No"));

                }

            } else if (cmbType.getSelectedItem().toString().equals("International")) {

                String q = "Select Flight_No from flight where Type= 'International'";
                rs = stmt.executeQuery(q);
                
                int n = cmbFlight.getItemCount();
                if(n!=0)
                    cmbFlight.removeAllItems();
                
                while (rs.next()) {

                    cmbFlight.addItem(rs.getString("flight_no"));

                }

            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_cmbTypeActionPerformed

    private void cmbClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClassActionPerformed

        txtClass.setText(cmbClass.getSelectedItem().toString());

        try {
            String flg, seats, date, clas, fare, status;
            String q = "Select * from seating where Flight_No=  '" + txtFlight.getText() + "' and Class = '" + txtClass.getText() + "' and Status = 'Available'";
            rs = stmt.executeQuery(q);

            String cls = txtClass.getText();
            if (cls.equals("Luxury")) {
                DefaultTableModel details = (DefaultTableModel) tblSeats.getModel();
                tblSeats.setModel(details);
                details.setRowCount(0);

                while (rs.next()) {

                    flg = rs.getString("Flight_No");
                    seats = rs.getString("Seat_No");
                    date = rs.getString("flightdate");
                    clas = rs.getString("class");
                    fare = rs.getString("fare");
                    status = rs.getString("status");

                    details.addRow(new Object[]{flg, seats, date, clas, fare, status}
                    );

                }
            } else if (cls.equals("Economy")) {

                DefaultTableModel details = (DefaultTableModel) tblSeats.getModel();
                tblSeats.setModel(details);
                details.setRowCount(0);

                while (rs.next()) {

                    flg = rs.getString("Flight_No");
                    seats = rs.getString("Seat_No");
                    date = rs.getString("flightdate");
                    clas = rs.getString("class");
                    fare = rs.getString("fare");
                    status = rs.getString("status");

                    details.addRow(new Object[]{flg, seats, date, clas, fare, status}
                    );

                }

            } else {

                DefaultTableModel details = (DefaultTableModel) tblSeats.getModel();
                tblSeats.setModel(details);
                details.setRowCount(0);

                while (rs.next()) {

                    flg = rs.getString("Flight_No");
                    seats = rs.getString("Seat_No");
                    date = rs.getString("flightdate");
                    clas = rs.getString("class");
                    fare = rs.getString("fare");
                    status = rs.getString("status");

                    details.addRow(new Object[]{flg, seats, date, clas, fare, status}
                    );

                }

            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }


    }//GEN-LAST:event_cmbClassActionPerformed

    private void cmbFlightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbFlightMouseClicked


    }//GEN-LAST:event_cmbFlightMouseClicked

    private void cmbFlightPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cmbFlightPropertyChange


    }//GEN-LAST:event_cmbFlightPropertyChange

    private void cmbTypePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cmbTypePropertyChange


    }//GEN-LAST:event_cmbTypePropertyChange

    private void tblSeatsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSeatsMouseClicked

        tblSeats.setRowSelectionAllowed(true);

        try {
            int row = tblSeats.getSelectedRow();

            String seatno = (tblSeats.getModel().getValueAt(row, 1).toString());
            String date = (tblSeats.getModel().getValueAt(row, 2).toString());
            String fare = (tblSeats.getModel().getValueAt(row, 4).toString());
           

            
            

            txtSeatno.setText(seatno + " " );
            txtJourneyDate.setText(date);
            txtFare.setText(fare + "");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }


    }//GEN-LAST:event_tblSeatsMouseClicked

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed

        txtBookingDate.setText("");
        txtClass.setText("");
        txtEmail.setText("");
        txtFare.setText("");
        txtFlight.setText("");
        txtName.setText("");
        txtSeatno.setText("");
        txtType.setText("");
        txtJourneyDate.setText("");

    
        
        
        DefaultTableModel seat = (DefaultTableModel) tblSeats.getModel();
        seat.setRowCount(0);
        {    
        DefaultTableModel flg = (DefaultTableModel) tblFlight.getModel();
        flg.setRowCount(0);
        }
        

        
        {
        cmbClass.setSelectedIndex(0);
        cmbFlight.setSelectedIndex(0);
        cmbType.setSelectedIndex(0);
        }
        txtClass.setText("");
        txtFlight.setText("");
        txtType.setText("");


    }//GEN-LAST:event_btnNewActionPerformed

    private void btnBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookingActionPerformed

        try {

            int row = tblFlight.getSelectedRow();
            String name = txtName.getText();
            String email = txtEmail.getText();
            String sno = txtSeatno.getText();
            String fare = txtFare.getText();
            String journey = txtJourneyDate.getText();
            String booking = txtBookingDate.getText();
            String cls = txtClass.getText();
            String flgno = txtFlight.getText();

            String u = "update seating set status = 'Unavailable' where Seat_No=  '" + sno + "' and Flight_No= '" + flgno + "' and class= '" + cls + "'";
            stmt.executeUpdate(u);

            int i = JOptionPane.showConfirmDialog(null, "Are you sure you want to book?");
            if (i == 0) {

                String s = "Select * from booking";
                rs = stmt.executeQuery(s);

                String q = "insert into booking(Flight_No,CustomerName,BookingDate,journeyDate,Seat_No,Class,Fare,EmailAddress) values('" + flgno + "','" + name + "','" + booking + "','" + journey + "'," + sno + ",'" + cls + "','" + fare + "','" + email + "')";
                stmt.executeUpdate(q);

            }
            

            JOptionPane.showMessageDialog(null,"Successful Booking for SeatNo: " + sno );
            ReviewPassenger rev = new ReviewPassenger();
            rev.setVisible(true);
            dispose();
        
        } 
        catch (Exception e) 
        {
              JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnBookingActionPerformed

    private void cmbFlightFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbFlightFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFlightFocusGained

    private void tblFlightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFlightMouseClicked

        int i = tblFlight.getSelectedRow();
        String source;
        source = (tblFlight.getModel().getValueAt(row, 3).toString());
        String desti;
        desti = (tblFlight.getModel().getValueAt(row, 4).toString());


    }//GEN-LAST:event_tblFlightMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        
        AirlineWelcome open = new AirlineWelcome();
        open.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBooking;
    private javax.swing.JButton btnNew;
    private javax.swing.JComboBox<String> cmbClass;
    private javax.swing.JComboBox<String> cmbFlight;
    private javax.swing.JComboBox<String> cmbType;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblFlight;
    private javax.swing.JTable tblSeats;
    private javax.swing.JTextField txtBookingDate;
    private javax.swing.JTextField txtClass;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFare;
    private javax.swing.JTextField txtFlight;
    private javax.swing.JTextField txtJourneyDate;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSeatno;
    private javax.swing.JTextField txtType;
    // End of variables declaration//GEN-END:variables
}
