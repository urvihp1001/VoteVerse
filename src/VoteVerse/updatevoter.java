/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VoteVerse;
import java.sql.*;

import java.util.ArrayList;
import java.util.logging.*;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lenovo
 */
public class updatevoter extends javax.swing.JFrame {

    /**
     * Creates new form displayvoterlist
     */
   
    public updatevoter() {
        initComponents();
        showuser();
        
    }
public ArrayList<User> userlist()
{
    ArrayList<User> userlist=new ArrayList<>();
    try
    {
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/voting_system", "root", "");
       String sql="select * from addvoter1";
       Statement ps=con.createStatement();
       ResultSet rs=ps.executeQuery(sql);
       User u;
       while(rs.next())
       {
           u=new User(rs.getString("voterid"),rs.getString("password"),rs.getString("name"), rs.getString("middlename"),
                        rs.getString("surname"), rs.getString("address"), rs.getString("sex"), rs.getInt("age"));
           userlist.add(u);
       }
     
       
        } catch (SQLException ex) {
        Logger.getLogger(updatevoter.class.getName()).log(Level.SEVERE, null, ex);
    }
         
    
    return userlist;
}

   public void showuser() {
   ArrayList <User> list= userlist();
   DefaultTableModel m= (DefaultTableModel) jtableaddvoter.getModel();
   for(int i=0;i<list.size();i++)
   {
       User u=list.get(i);
       m.addRow(new Object[]{u.getvoterid(),u.getpassword(),u.getname(),u.getmiddlename(),u.getsurname(),u.getaddress(),u.getsex(),u.getage()});
       
   }
   }
public void updateUserInDatabase(User user) {
    try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/voting_system", "root", "");
        con.setAutoCommit(false);
        String sql = "UPDATE addvoter1 SET password=?, name=?, middlename=?, surname=?, address=?, sex=?, age=? WHERE voterid=?";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, user.getpassword());
        ps.setString(2, user.getname());
        ps.setString(3, user.getmiddlename());
        ps.setString(4, user.getsurname());
        ps.setString(5, user.getaddress());
        ps.setString(6, user.getsex());
        ps.setInt(7, user.getage());
        ps.setString(8, user.getvoterid());

        ps.executeUpdate();

        // Close the PreparedStatement and Connection
        //ps.close();
        con.commit();
        
    } catch (SQLException ex) {
        
        Logger.getLogger(updatevoter.class.getName()).log(Level.SEVERE, null, ex);
    }
   
}

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableaddvoter = new javax.swing.JTable();
        save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(740, 270));
        setName("frame3"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(730, 310));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VoteVerse/back.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 102, 0));
        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.red);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("UPDATE VOTER LIST");

        jtableaddvoter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtableaddvoter.setForeground(new java.awt.Color(153, 0, 51));
        jtableaddvoter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "VoterID", "Password", "Name", "FatherName", "Surname", "Address", "Sex", "Age"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtableaddvoter.setGridColor(new java.awt.Color(153, 0, 51));
        jtableaddvoter.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtableaddvoter);
        if (jtableaddvoter.getColumnModel().getColumnCount() > 0) {
            jtableaddvoter.getColumnModel().getColumn(0).setResizable(false);
            jtableaddvoter.getColumnModel().getColumn(1).setResizable(false);
            jtableaddvoter.getColumnModel().getColumn(2).setResizable(false);
            jtableaddvoter.getColumnModel().getColumn(3).setResizable(false);
            jtableaddvoter.getColumnModel().getColumn(4).setResizable(false);
            jtableaddvoter.getColumnModel().getColumn(6).setResizable(false);
            jtableaddvoter.getColumnModel().getColumn(7).setResizable(false);
        }

        save.setText("SAVE CHANGES");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(264, 264, 264)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(save)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(save)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Home h=new Home();
        h.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed

        DefaultTableModel model = (DefaultTableModel) jtableaddvoter.getModel();
        int rowCount = model.getRowCount();
        ArrayList<User> modifiedUsers = new ArrayList<>();

        for (int i = 0; i < rowCount; i++) {
            String voterID = (String) model.getValueAt(i, 0);
            String password = (String) model.getValueAt(i, 1);
            String name = (String) model.getValueAt(i, 2);
            String middleName = (String) model.getValueAt(i, 3);
            String surname = (String) model.getValueAt(i, 4);
            String address = (String) model.getValueAt(i, 5);
            String sex = (String) model.getValueAt(i, 6);
            int age = (int) model.getValueAt(i, 7);

            User modifiedUser = new User(voterID, password, name, middleName, surname, address, sex, age);
            modifiedUsers.add(modifiedUser);
        }

        for (User modifiedUser : modifiedUsers) {
            updateUserInDatabase(modifiedUser);
        }
        JOptionPane.showMessageDialog(null, "Data Updated Successfully");

    }//GEN-LAST:event_saveActionPerformed

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
            java.util.logging.Logger.getLogger(updatevoter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updatevoter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updatevoter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updatevoter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updatevoter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtableaddvoter;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
