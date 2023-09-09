package VoteVerse;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
import java.awt.*;
import java.awt.Event;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class addcandidate extends javax.swing.JFrame {

    /**
     * Creates new form addcandidate
     */
    public addcandidate() {
        initComponents();
        partysign();
    }
public void partysign()
{
    jpsign.addItem("");
    jpsign.addItem("Lotus");
    jpsign.addItem("Hand");
    jpsign.addItem("Elephant");
    jpsign.addItem("CPI");
    jpsign.addItem("NCP");
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
        jpname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jpleader = new javax.swing.JTextField();
        jother = new javax.swing.JRadioButton();
        jmale = new javax.swing.JRadioButton();
        jfemale = new javax.swing.JRadioButton();
        jage = new javax.swing.JSpinner();
        jPanel4 = new javax.swing.JPanel();
        jadd = new javax.swing.JButton();
        jclear = new javax.swing.JButton();
        jpsign = new java.awt.Choice();
        jhq = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setMinimumSize(new java.awt.Dimension(250, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Name of Party");
        jLabel1.setMaximumSize(new java.awt.Dimension(39, 14));
        jLabel1.setMinimumSize(new java.awt.Dimension(39, 14));
        jLabel1.setPreferredSize(new java.awt.Dimension(39, 14));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 90, -1));

        jpname.setForeground(java.awt.Color.red);
        jpname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jpname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 180, 30));

        jLabel2.setText("Party Leader");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel3.setText("Party Headquarter");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel5.setText("Party Sign");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel6.setText("Sex");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel7.setText("Age");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jpleader.setForeground(java.awt.Color.red);
        jpleader.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpleader.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpleaderActionPerformed(evt);
            }
        });
        jPanel1.add(jpleader, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 180, 30));

        jother.setForeground(java.awt.Color.red);
        jother.setText("Other");
        jother.setBorder(null);
        jPanel1.add(jother, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        jmale.setForeground(java.awt.Color.red);
        jmale.setText("Male");
        jmale.setBorder(null);
        jPanel1.add(jmale, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jfemale.setForeground(java.awt.Color.red);
        jfemale.setText("Female");
        jfemale.setBorder(null);
        jPanel1.add(jfemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        jage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jage.setPreferredSize(new java.awt.Dimension(180, 30));
        jPanel1.add(jage, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jPanel4.setBackground(new java.awt.Color(153, 153, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(250, 41));

        jadd.setBackground(new java.awt.Color(204, 204, 0));
        jadd.setForeground(new java.awt.Color(153, 153, 0));
        jadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VoteVerse/add.png"))); // NOI18N
        jadd.setBorder(null);
        jadd.setContentAreaFilled(false);
        jadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddActionPerformed(evt);
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
                .addComponent(jadd, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jclear, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jadd, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jclear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 270, 100));
        jPanel1.add(jpsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 231, -1));

        jhq.setForeground(java.awt.Color.red);
        jhq.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jhq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jhqActionPerformed(evt);
            }
        });
        jPanel1.add(jhq, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 180, 30));

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

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Add Candidate");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 44, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 384, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpleaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpleaderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpleaderActionPerformed

    private void jaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddActionPerformed

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/voting_system", "root", "");
            String sql = "insert into partylist1 values(?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, jpname.getText());
            ps.setString(2, jpleader.getText());
            ps.setString(5, jhq.getText());
            if (jmale.isSelected())
            ps.setString(3,jmale.getText());
            else if(jfemale.isSelected()){ps.setString(3,jfemale.getText());}
            else if(jother.isSelected()){ps.setString(3,jother.getText());}

            int age = (Integer)jage.getValue();
            if (age >= 18) {
                ps.setInt(4, age);
            } else {
                JOptionPane.showMessageDialog(null, "Age must be greater than 18");
                return; // Return without executing the database insert if age is invalid
            }
           
             ps.setString(6, jpsign.getItem(jpsign.getSelectedIndex()));

            ps.execute();

            JOptionPane.showMessageDialog(null, "Data Inserted Successfully");
            Home h = new Home();
            h.setVisible(true);
            dispose();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid age. Age must be a valid integer.");
        } catch (SQLException ex) {
            Logger.getLogger(addvoter.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Helper method to check if a string is numeric

        // Helper method to check if a string is numeric
    }//GEN-LAST:event_jaddActionPerformed

    private void jclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jclearActionPerformed
        jage.setValue(0);
        jmale.setSelected(false);
        jfemale.setSelected(false);
        jother.setSelected(false);;
        jpname.setText(null);
        jpleader.setText(null);
        jhq.setText(null);
       jpsign.select(-1);
    }//GEN-LAST:event_jclearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Home h=new Home();
        h.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jhqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jhqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jhqActionPerformed

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
            java.util.logging.Logger.getLogger(addcandidate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addcandidate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addcandidate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addcandidate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addcandidate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jadd;
    private javax.swing.JSpinner jage;
    private javax.swing.JButton jclear;
    private javax.swing.JRadioButton jfemale;
    private javax.swing.JTextField jhq;
    private javax.swing.JRadioButton jmale;
    private javax.swing.JRadioButton jother;
    private javax.swing.JTextField jpleader;
    private javax.swing.JTextField jpname;
    private java.awt.Choice jpsign;
    // End of variables declaration//GEN-END:variables
}