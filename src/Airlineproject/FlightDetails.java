 
package Airlineproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

 
public class FlightDetails extends javax.swing.JFrame {

    Connection con;
    Statement stmt;
    ResultSet rs;
     
    public FlightDetails() {
        initComponents();
        try{
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AirlineReservation","root","root");
            stmt = con.createStatement();
        
        
        }
        

        catch(Exception e)
        {
        
            JOptionPane.showMessageDialog(null, e);
        
        }
        
       
    }

      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFlight = new javax.swing.JTable();
        rdbDomestic = new javax.swing.JRadioButton();
        rdbInternational = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
        jScrollPane1.setViewportView(tblFlight);
        if (tblFlight.getColumnModel().getColumnCount() > 0) {
            tblFlight.getColumnModel().getColumn(0).setResizable(false);
            tblFlight.getColumnModel().getColumn(1).setResizable(false);
            tblFlight.getColumnModel().getColumn(2).setResizable(false);
            tblFlight.getColumnModel().getColumn(3).setResizable(false);
            tblFlight.getColumnModel().getColumn(4).setResizable(false);
            tblFlight.getColumnModel().getColumn(5).setResizable(false);
            tblFlight.getColumnModel().getColumn(6).setResizable(false);
        }

        buttonGroup1.add(rdbDomestic);
        rdbDomestic.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdbDomestic.setText("Domestic Flights");
        rdbDomestic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbDomesticActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbInternational);
        rdbInternational.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdbInternational.setText("International Flight");
        rdbInternational.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbInternationalActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Flight Details");

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("<<Back");
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
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(rdbDomestic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
                .addComponent(rdbInternational)
                .addGap(188, 188, 188))
            .addGroup(layout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(155, 155, 155))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbInternational)
                    .addComponent(rdbDomestic))
                .addGap(76, 76, 76)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rdbInternationalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbInternationalActionPerformed

        if(rdbInternational.isSelected()==true)
        {
        String flight,type,trip,source,destination,arrival,departure;
        
        DefaultTableModel newModel = (DefaultTableModel)tblFlight.getModel();
        
        
        try{
          
            String q = "Select * from Flight where Type = 'International'";
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
        
            
        
        
        
              }

        catch(Exception e)
        {
        
            JOptionPane.showMessageDialog(null,e);
        
        
        }
        
    }




    }//GEN-LAST:event_rdbInternationalActionPerformed

    private void rdbDomesticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbDomesticActionPerformed

        if(rdbDomestic.isSelected()==true)
        {
        String flight,type,trip,source,destination,arrival,departure;
        
        DefaultTableModel newModel = (DefaultTableModel)tblFlight.getModel();
       
                           
        try{
          
            String q = "Select * from Flight where Type = 'Domestic'";
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
        
            }

        catch(Exception e)
        {
        
            JOptionPane.showMessageDialog(null,e);
        
        
        }
        
    }


    }//GEN-LAST:event_rdbDomesticActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed


        FlightInfoAdd add = new FlightInfoAdd();
        add.setVisible(true);
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
            java.util.logging.Logger.getLogger(FlightDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FlightDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FlightDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FlightDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FlightDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdbDomestic;
    private javax.swing.JRadioButton rdbInternational;
    private javax.swing.JTable tblFlight;
    // End of variables declaration//GEN-END:variables
}
