/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VoteVerse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author lenovo
 */
public class voterupdate extends javax.swing.JFrame {

    /**
     * Creates new form addvoter
     */
    public voterupdate() {
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
        jLabel1 = new javax.swing.JLabel();
        juvoterid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        juname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        juaddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jusurname = new javax.swing.JTextField();
        jumiddlename = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        juother = new javax.swing.JRadioButton();
        jumale = new javax.swing.JRadioButton();
        jufemale = new javax.swing.JRadioButton();
        juage = new javax.swing.JSpinner();
        jPanel4 = new javax.swing.JPanel();
        jupdate = new javax.swing.JButton();
        jclear = new javax.swing.JButton();
        jRetrieve = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(510, 540));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setMinimumSize(new java.awt.Dimension(250, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Voter ID");
        jLabel1.setMaximumSize(new java.awt.Dimension(39, 14));
        jLabel1.setMinimumSize(new java.awt.Dimension(39, 14));
        jLabel1.setPreferredSize(new java.awt.Dimension(39, 14));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 50, -1));

        juvoterid.setForeground(java.awt.Color.red);
        juvoterid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(juvoterid, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 180, 30));

        jLabel3.setText("Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        juname.setForeground(java.awt.Color.red);
        juname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(juname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 180, 30));

        jLabel4.setText("Surname");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        juaddress.setForeground(java.awt.Color.red);
        juaddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(juaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 180, 30));

        jLabel5.setText("Address");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel6.setText("Sex");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        jLabel7.setText("Age");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        jusurname.setForeground(java.awt.Color.red);
        jusurname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jusurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jusurnameActionPerformed(evt);
            }
        });
        jPanel1.add(jusurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 180, 30));

        jumiddlename.setForeground(java.awt.Color.red);
        jumiddlename.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jumiddlename.setName(""); // NOI18N
        jPanel1.add(jumiddlename, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 180, 30));

        jLabel10.setText("Middle Name");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        juother.setForeground(java.awt.Color.red);
        juother.setText("Other");
        juother.setBorder(null);
        jPanel1.add(juother, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 405, -1, -1));
        juother.getAccessibleContext().setAccessibleName("Female");

        jumale.setForeground(java.awt.Color.red);
        jumale.setText("Male");
        jumale.setBorder(null);
        jPanel1.add(jumale, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 405, -1, -1));

        jufemale.setForeground(java.awt.Color.red);
        jufemale.setText("Female");
        jufemale.setBorder(null);
        jPanel1.add(jufemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 405, -1, -1));

        juage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        juage.setPreferredSize(new java.awt.Dimension(180, 30));
        jPanel1.add(juage, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        jPanel4.setBackground(new java.awt.Color(153, 153, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(250, 41));

        jupdate.setBackground(new java.awt.Color(204, 204, 0));
        jupdate.setForeground(new java.awt.Color(153, 153, 0));
        jupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VoteVerse/add.png"))); // NOI18N
        jupdate.setBorder(null);
        jupdate.setContentAreaFilled(false);
        jupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupdateActionPerformed(evt);
            }
        });

        jclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VoteVerse/cached.png"))); // NOI18N
        jclear.setBorder(null);
        jclear.setContentAreaFilled(false);
        jclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jclearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jclear, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jupdate, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jclear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, -1, 100));

        jRetrieve.setText("RETRIEVE");
        jRetrieve.setMaximumSize(new java.awt.Dimension(71, 23));
        jRetrieve.setMinimumSize(new java.awt.Dimension(71, 23));
        jRetrieve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRetrieveActionPerformed(evt);
            }
        });
        jPanel1.add(jRetrieve, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 250, 600));

        jPanel2.setBackground(new java.awt.Color(51, 0, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(260, 600));

        jPanel3.setBackground(java.awt.Color.red);
        jPanel3.setPreferredSize(new java.awt.Dimension(52, 52));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VoteVerse/back.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jLabel8.setForeground(new java.awt.Color(51, 0, 51));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VoteVerse/ic_fingerprint_white_24dp.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jLabel8.setMaximumSize(new java.awt.Dimension(96, 96));
        jLabel8.setMinimumSize(new java.awt.Dimension(96, 96));
        jLabel8.setPreferredSize(new java.awt.Dimension(96, 96));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Update Voter");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel9)
                .addGap(0, 265, Short.MAX_VALUE))
        );

        jLabel8.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Home h=new Home();
        h.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jusurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jusurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jusurnameActionPerformed
private void fillFieldsBasedOnVoterID(String voterId) {
    try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/voting_system", "root", "");
        String sql = "SELECT * FROM addvoter1 WHERE voterid=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, voterId);

        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            // Fill the text fields with data from the database
            juname.setText(rs.getString("name"));
            jumiddlename.setText(rs.getString("middlename"));
            juaddress.setText(rs.getString("address"));
            jusurname.setText(rs.getString("surname"));

            // Set the radio button for sex based on the retrieved value
            String sex = rs.getString("sex");
            if ("Male".equals(sex)) {
                jumale.setSelected(true);
            } else if ("Female".equals(sex)) {
                jufemale.setSelected(true);
            } else if ("Other".equals(sex)) {
                juother.setSelected(true);
            }

            // Set the age spinner
            int age = rs.getInt("age");
            juage.setValue(age);
        } else {
            // Voter ID not found in the database
            JOptionPane.showMessageDialog(null, "Voter ID not found.");
        }

        rs.close();
        ps.close();
        con.close();
    } catch (SQLException ex) {
        Logger.getLogger(voterupdate.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    private void jupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jupdateActionPerformed

       try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/voting_system", "root", "");
           String sql = "UPDATE addvoter1 SET name=?, middlename=?, address=?, surname=?, sex=?, age=? WHERE voterid=?";
PreparedStatement ps = con.prepareStatement(sql);

// Set the parameters
ps.setString(1, juname.getText());
ps.setString(2, jumiddlename.getText());
ps.setString(3, juaddress.getText());
ps.setString(4, jusurname.getText());

if (jumale.isSelected()) {
    ps.setString(5, jumale.getText());
} else if (jufemale.isSelected()) {
    ps.setString(5, jufemale.getText());
} else if (juother.isSelected()) {
    ps.setString(5, juother.getText());
}

int age = (Integer) juage.getValue();
if (age >= 18) {
    ps.setInt(6, age);
} else {
    JOptionPane.showMessageDialog(null, "Age must be greater than 18");
    return; // Return without executing the database update if age is invalid
}

// Set the voterid as the last parameter
ps.setString(7, juvoterid.getText());

// Execute the update query
int rowsAffected = ps.executeUpdate();

if (rowsAffected > 0) {
    JOptionPane.showMessageDialog(null, "Update successful");
} else {
    JOptionPane.showMessageDialog(null, "Update failed");
}

// Close the PreparedStatement
ps.close();


           
            Home h = new Home();
            h.setVisible(true);
            dispose();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid age. Age must be a valid integer.");
        } catch (SQLException ex) {
            Logger.getLogger(addvoter.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jupdateActionPerformed

    private void jclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jclearActionPerformed
        juage.setValue(0);
        juname.setText(null);
        juaddress.setText(null);
        jumiddlename.setText(null);
        jusurname.setText(null);
        jumale.setSelected(false);
        jufemale.setSelected(false);
        juother.setSelected(false);
        juvoterid.setText(null);
       
    }//GEN-LAST:event_jclearActionPerformed

    private void jRetrieveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRetrieveActionPerformed
         String voterId = juvoterid.getText();
    if (!voterId.isEmpty()) {
        fillFieldsBasedOnVoterID(voterId);
    }
    }//GEN-LAST:event_jRetrieveActionPerformed

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
            java.util.logging.Logger.getLogger(voterupdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(voterupdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(voterupdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(voterupdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new voterupdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jRetrieve;
    private javax.swing.JButton jclear;
    private javax.swing.JTextField juaddress;
    private javax.swing.JSpinner juage;
    private javax.swing.JRadioButton jufemale;
    private javax.swing.JRadioButton jumale;
    private javax.swing.JTextField jumiddlename;
    private javax.swing.JTextField juname;
    private javax.swing.JRadioButton juother;
    private javax.swing.JButton jupdate;
    private javax.swing.JTextField jusurname;
    private javax.swing.JTextField juvoterid;
    // End of variables declaration//GEN-END:variables
}