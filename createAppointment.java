/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A.TUAN
 */
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class createAppointment extends javax.swing.JFrame {

    /**
     * Creates new form createAppointment
     */
    Connection conn = null;
    DBconnect db = new DBconnect();
    
    public createAppointment() {
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        aID = new javax.swing.JTextField();
        doc1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        day = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        time = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        timing = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SET APPOINTMENT");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 10, 1200, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("APPOINTMENT ID ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(260, 90, 140, 20);

        aID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(aID);
        aID.setBounds(410, 80, 540, 30);

        doc1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        doc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doc1ActionPerformed(evt);
            }
        });
        jPanel1.add(doc1);
        doc1.setBounds(410, 150, 350, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("DOCTOR");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(260, 150, 80, 30);

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(830, 280, 120, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("DAYS");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(260, 220, 70, 20);

        day.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayActionPerformed(evt);
            }
        });
        jPanel1.add(day);
        day.setBounds(410, 210, 150, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("VISIT TIMING");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(600, 210, 110, 30);

        time.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(time);
        time.setBounds(730, 210, 220, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("PATIENT ID");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(260, 280, 100, 30);

        id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel1.add(id);
        id.setBounds(410, 280, 360, 30);

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("SEARCH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(830, 150, 120, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("NAME");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(260, 360, 80, 20);

        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(name);
        name.setBounds(410, 350, 230, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("PHONE NO ");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(660, 360, 90, 20);

        phone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(phone);
        phone.setBounds(760, 350, 190, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("DATE");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(260, 420, 50, 30);

        date.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(date);
        date.setBounds(410, 420, 230, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("TIMING");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(660, 420, 80, 30);

        timing.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        timing.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9.00 AM", "9.30 AM", "10.00 AM", "10.30 AM", "13.00 PM", "13.30 PM", "14.00 PM", "14.30 PM", "15.00 PM", "15.30 PM", "16.00 PM" }));
        jPanel1.add(timing);
        timing.setBounds(760, 420, 140, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-save-30.png"))); // NOI18N
        jButton3.setText("SAVE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(830, 500, 110, 30);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-close-window-20.png"))); // NOI18N
        jButton4.setText("CANCEL");
        jPanel1.add(jButton4);
        jButton4.setBounds(410, 500, 110, 30);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-remove-16.png"))); // NOI18N
        jButton5.setText("REMOVE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(550, 500, 110, 30);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-edit-24.png"))); // NOI18N
        jButton6.setText("EDIT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(690, 500, 100, 30);

        jButton9.setForeground(new java.awt.Color(0, 102, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back (2).png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(0, 240, 50, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Patientphoto.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1210, 650);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1212, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doc1ActionPerformed

    private void dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayActionPerformed
    
        
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            // TODO add your handling code here:
            conn = db.getConnection();
            PreparedStatement pst = conn.prepareStatement("Select Days, VisitTiming from Doctor where Name = ? or DoctorID = ?");
            pst.setString(1, doc1.getText());
            pst.setString(2, doc1.getText());
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                day.setText(rs.getString("Days"));
                time.setText(rs.getString("VisitTiming"));
            }
        } catch (Exception ex) {
            Logger.getLogger(createAppointment.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(createAppointment.class.getName()).log(Level.SEVERE, null, ex);
            }
        }    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
      
    }//GEN-LAST:event_idActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
            conn = db.getConnection();
            PreparedStatement pst = conn.prepareStatement("Select Name, PhoneNo from Patient where PatientID =?");
            pst.setString(1, id.getText());
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                name.setText(rs.getString("Name"));
                phone.setText(rs.getString("PhoneNo"));
            }
        } catch (Exception ex) {
            Logger.getLogger(createAppointment.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(createAppointment.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    private boolean idCheck() throws SQLException, Exception{
        int count = 0;
        conn = db.getConnection();
        PreparedStatement pst = conn.prepareStatement("Select*From Appointment where AppointmentID = ?");
        pst.setString(1, aID.getText());
        ResultSet rs = pst.executeQuery();
        while(rs.next())
            ++count;
        return count==0;
    }
    private String DocID() throws Exception{
        String s =" ";
        conn = db.getConnection();
        PreparedStatement pst = conn.prepareStatement("Select DoctorID from Doctor where DoctorID=? or Name =?");
        pst.setString(1, doc1.getText());
        pst.setString(2, doc1.getText());
        ResultSet rs= pst.executeQuery();
        while(rs.next()){
            s = rs.getString("DoctorID");
        }
        return s;
    }
    private boolean check() throws SQLException, Exception{
        int count =0;
        conn= db.getConnection();
        PreparedStatement pst = conn.prepareStatement("Select* from Appointment where DoctorID=? and Hour =?");
        pst.setString(1, DocID());
        pst.setString(2, (String) timing.getSelectedItem());
       
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            count++;
        }
        return count == 0;
        
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            if (idCheck()) {
                if(check()){
                    try {
                    // TODO add your handling code here:
                    conn = db.getConnection();
                    PreparedStatement pst = conn.prepareStatement("Insert into Appointment (DoctorID, PatientID,AppointmentID,Date,Hour)"
                            + "values(?,?,?,?,?)");
                    pst.setString(1, doc1.getText());
                    pst.setString(2, id.getText());
                    pst.setString(3, aID.getText());
                    pst.setDate(4, convertFromJAVADateToSQLDate(date.getDate()));
                    pst.setString(5, (String) timing.getSelectedItem());
                    pst.execute();
                    JOptionPane.showMessageDialog(this, "Save sucessfully");
                } catch (Exception ex) {
                    Logger.getLogger(createAppointment.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    try {
                        conn.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(createAppointment.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                }else{
                    JOptionPane.showMessageDialog(this, "Doctor had a Appoitment");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Appointment ID is existing");
            }
        } catch (Exception ex) {
            Logger.getLogger(createAppointment.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            // TODO add your handling code here:
            conn = db.getConnection();
            PreparedStatement pst = conn.prepareStatement("Update Appointment Set "
                    + "DoctorID=?,Date =?,Hour=? where AppointmentID=?");
            pst.setString(1, doc1.getText());
            pst.setDate(2, convertFromJAVADateToSQLDate(date.getDate()));
            pst.setString(3, (String) timing.getSelectedItem());
            pst.setString(4, aID.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Update sucessfully");
        } catch (Exception ex) {
            Logger.getLogger(createAppointment.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(createAppointment.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            // TODO add your handling code here:
            conn = db.getConnection();
            PreparedStatement pst = conn.prepareStatement("Delete from Appointment where AppointmentID =? ");
            pst.setString(1, aID.getText());
            pst.execute();
            JOptionPane.showMessageDialog(this, "Delete sucessfully");
        } catch (Exception ex) {
            Logger.getLogger(createAppointment.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(createAppointment.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        recActivity re = new recActivity();
        re.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(createAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createAppointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aID;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JTextField day;
    private javax.swing.JTextField doc1;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField time;
    private javax.swing.JComboBox<String> timing;
    // End of variables declaration//GEN-END:variables
public static java.sql.Date convertFromJAVADateToSQLDate(
        java.util.Date javaDate) {
    java.sql.Date sqlDate = null;
    if (javaDate != null) {
        sqlDate = new Date(javaDate.getTime());
    }
    return sqlDate;
}
}
