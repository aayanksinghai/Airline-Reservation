 

package Airlineproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

 
public class SearchFlight extends javax.swing.JFrame {

    Connection con;
    Statement stmt;
    ResultSet rs;
     
    public SearchFlight() {
        initComponents();
        
        try{
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AirlineReservation","root","root");
             stmt = con.createStatement();
        
        
        }
        catch(Exception e)
        {
        
            JOptionPane.showMessageDialog(null,e);
                    
        
        
        }
        
        
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblSearch = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFlightNo = new javax.swing.JTextField();
        txtSource = new javax.swing.JTextField();
        txtDestination = new javax.swing.JTextField();
        btnFlight = new javax.swing.JButton();
        btnSource = new javax.swing.JButton();
        btnDestination = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tblSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Flight_No", "Type", "Trip", "Source", "Destination ", "ArrivalTime", "DepartureTime"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSearch);
        if (tblSearch.getColumnModel().getColumnCount() > 0) {
            tblSearch.getColumnModel().getColumn(0).setResizable(false);
            tblSearch.getColumnModel().getColumn(1).setResizable(false);
            tblSearch.getColumnModel().getColumn(2).setResizable(false);
            tblSearch.getColumnModel().getColumn(3).setResizable(false);
            tblSearch.getColumnModel().getColumn(4).setResizable(false);
            tblSearch.getColumnModel().getColumn(5).setResizable(false);
            tblSearch.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Flight No.");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Source");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Destination");

        txtFlightNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtSource.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtDestination.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        btnFlight.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFlight.setText("Search");
        btnFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlightActionPerformed(evt);
            }
        });

        btnSource.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSource.setText("Search");
        btnSource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSourceActionPerformed(evt);
            }
        });

        btnDestination.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDestination.setText("Search");
        btnDestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDestinationActionPerformed(evt);
            }
        });

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
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDestination, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(txtSource)
                            .addComponent(txtFlightNo))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnFlight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSource, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDestination, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFlightNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFlight))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSource, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSource))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDestination))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnBack)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlightActionPerformed

        
        
         String flight,type,trip,source,destination,arrival,departure;
        
        DefaultTableModel newModel = (DefaultTableModel)tblSearch.getModel();
        
        
        try
        {
            String flgno = txtFlightNo.getText();
          
            String q = "Select * from Flight where Flight_No = " + "'"+flgno+"'" ;
            rs= stmt.executeQuery(q);
            
            newModel.setRowCount(0);
            while(rs.next())
            {
            
                flight = rs.getString("Flight_No");
                type = rs.getString("Type");
                trip = rs.getString("Trip");
                source = rs.getString("Source");
                destination = rs.getString("Destination");
                arrival = rs.getString("ArrivalTime");
                departure = rs.getString("DepartureTime");
                newModel.addRow(new Object[]
                { flight,type,trip,source,destination,arrival,departure});
                
                
            
            
            }
            txtFlightNo.setText("");
            }
        catch(Exception e)
                    {
                    
                    
                    JOptionPane.showMessageDialog(null,e);
                    
                    }
        



    }//GEN-LAST:event_btnFlightActionPerformed

    private void btnSourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSourceActionPerformed

        String flight,type,trip,source,destination,arrival,departure;
        
        DefaultTableModel newModel = (DefaultTableModel)tblSearch.getModel();
        
        
        try
        {
            String sourcename = txtSource.getText();
          
            String q = "Select * from Flight where Source = " + "'"+sourcename+"'"  ;
            rs= stmt.executeQuery(q);
            
            newModel.setRowCount(0);
            while(rs.next())
            {
            
                flight = rs.getString("Flight_No");
                type = rs.getString("Type");
                trip = rs.getString("Trip");
                source = rs.getString("Source");
                destination = rs.getString("Destination");
                arrival = rs.getString("ArrivalTime");
                departure = rs.getString("DepartureTime");
                newModel.addRow(new Object[]
                { flight,type,trip,source,destination,arrival,departure});
                
                
            
            
            }
            txtSource.setText("");
            }
        catch(Exception e)
                    {
                    
                    
                    JOptionPane.showMessageDialog(null,e);
                    
                    }


    }//GEN-LAST:event_btnSourceActionPerformed

    private void btnDestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDestinationActionPerformed

        String flight,type,trip,source,destination,arrival,departure;
        
        DefaultTableModel newModel = (DefaultTableModel)tblSearch.getModel();
        
        
        try
        {
            String destin = txtDestination.getText();
          
            String q = "Select * from Flight where Destination = " + "'"+destin+"'" ;
            rs= stmt.executeQuery(q);
            
            newModel.setRowCount(0);
            while(rs.next())
            {
            
                flight = rs.getString("Flight_No");
                type = rs.getString("Type");
                trip = rs.getString("Trip");
                source = rs.getString("Source");
                destination = rs.getString("Destination");
                arrival = rs.getString("ArrivalTime");
                departure = rs.getString("DepartureTime");
                newModel.addRow(new Object[]
                { flight,type,trip,source,destination,arrival,departure});
                
                
            
            
            }
            txtDestination.setText("");
            }
        catch(Exception e)
                    {
                    
                    
                    JOptionPane.showMessageDialog(null,e);
                    
                    }


    }//GEN-LAST:event_btnDestinationActionPerformed

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
            java.util.logging.Logger.getLogger(SearchFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchFlight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDestination;
    private javax.swing.JButton btnFlight;
    private javax.swing.JButton btnSource;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSearch;
    private javax.swing.JTextField txtDestination;
    private javax.swing.JTextField txtFlightNo;
    private javax.swing.JTextField txtSource;
    // End of variables declaration//GEN-END:variables
}
