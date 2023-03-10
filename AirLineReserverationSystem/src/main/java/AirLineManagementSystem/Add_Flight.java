/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package AirLineManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sarvesh Kumar
 */
public class Add_Flight extends javax.swing.JInternalFrame {

    /**
     * Creates new form Add_Flight
     */
    public Add_Flight() {
        initComponents();
        autoID();
    }
    
    
    Connection con;
    PreparedStatement pre;
    
    public void autoID(){
            try {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Add_Flight.class.getName()).log(Level.SEVERE, null, ex);
                }
                con=DriverManager.getConnection("jdbc:mysql://localhost/airlinemanagementsystem","root", "Y1012Jqkhkp");
                java.sql.Statement s = con.createStatement();
                ResultSet rs = s.executeQuery("Select MAX(FlightId) from flights");
                rs.next();
                
                if(rs.getString("MAX(FlightId)")==null){
                    FlightId.setText("IND/FT/0001");
                }
                else{
                    long id = Long.parseLong(rs.getString("MAX(FlightId)").substring(8,rs.getString("MAX(FlightId").length()));
                    id++;
                    FlightId.setText("IND/FT/"+String.format("%04", id));
                }
            } catch (SQLException ex) {
                Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        FlightId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        flightName = new javax.swing.JTextField();
        departure = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        seats = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fare = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        duration = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        arrival = new javax.swing.JTextField();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Flight ID");

        FlightId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlightIdActionPerformed(evt);
            }
        });

        jLabel2.setText("Flight Name");

        jLabel3.setText("Departure");

        flightName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightNameActionPerformed(evt);
            }
        });

        jLabel4.setText("Date");

        jLabel5.setText("Remaining Seat");

        seats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatsActionPerformed(evt);
            }
        });

        jLabel6.setText("Fare / person");

        fare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fareActionPerformed(evt);
            }
        });

        jLabel7.setText("Duration");

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField7.setBackground(new java.awt.Color(153, 153, 255));
        jTextField7.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 51, 0));
        jTextField7.setText("Thanks for visiting");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jLabel8.setText("Arrival");

        arrival.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrivalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(31, 31, 31)
                                                .addComponent(FlightId, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))
                                        .addGap(77, 77, 77))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jButton2)
                                .addGap(114, 114, 114))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(departure, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fare, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(seats, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(65, 65, 65)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(arrival, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(flightName, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(367, 367, 367))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(seats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FlightId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(flightName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(arrival, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(departure, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void fareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fareActionPerformed

    private void seatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatsActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void flightNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flightNameActionPerformed

    private void FlightIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlightIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FlightIdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                String FirstName = flightName.getText();
                String LastName = arrival.getText();
                String Passport = fare.getText();
                String Address = seats.getText();
                String NICId = departure.getText();
                String Contact = duration.getText();
                
                //Date d = (Date) date.getDate();
                String FlightID = FlightId.getText();
                
                DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
                String Date = dt.format(date.getDate().toString());
                try {
                    try {
                        Class.forName("con.mysql.jdbc.Driver");
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/airlinemanagementsystem","root", "Y1012Jqkhkp");
                    pre = con.prepareStatement("insert into Customers(customerId,FirstName, LastName, Passport, NICId, date, Mob_No, Address, Gender)values(?,?,?,?,?,?,?,?,?,?)");
                    pre.setString(1, FlightId.toString());
                    pre.setString(2, flightName.toString());
                    pre.setString(3, arrival.toString());
                    pre.setString(4, departure.toString());
                    pre.setString(5, duration.toString());
                    pre.setString(6, fare.toString());
                    pre.setString(7, seats.toString());
                    pre.setString(8, Date);
                    
                    pre.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Customer Added!!!");
                    
                } catch (SQLException ex) {
                    Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void arrivalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrivalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arrivalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FlightId;
    private javax.swing.JTextField arrival;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JTextField departure;
    private javax.swing.JTextField duration;
    private javax.swing.JTextField fare;
    private javax.swing.JTextField flightName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField seats;
    // End of variables declaration//GEN-END:variables
}
