/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VoteVerse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author lenovo
 */
public class startelection extends javax.swing.JFrame {
int vc;
    /**
     * Creates new form startelection
     */
    public startelection() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jinc = new javax.swing.JButton();
        jcpi = new javax.swing.JButton();
        jbsp = new javax.swing.JButton();
        jncp = new javax.swing.JButton();
        jbjp = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 560));
        setPreferredSize(new java.awt.Dimension(500, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(270, 510));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setForeground(new java.awt.Color(51, 0, 51));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VoteVerse/ncp1.jpg"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 397, 101, 91));

        jLabel1.setBackground(java.awt.Color.red);
        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.red);
        jLabel1.setText("CPI");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 215, -1, -1));

        jLabel9.setForeground(new java.awt.Color(51, 0, 51));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VoteVerse/bjp1.jpg"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 11, -1, 77));

        jLabel12.setForeground(new java.awt.Color(51, 0, 51));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VoteVerse/INC1.jpg"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 94, -1, 88));

        jLabel13.setForeground(new java.awt.Color(51, 0, 51));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VoteVerse/Screenshot (146).png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 193, 90, -1));

        jLabel14.setForeground(new java.awt.Color(51, 0, 51));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VoteVerse/Screenshot (147).png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 294, -1, -1));

        jLabel2.setBackground(java.awt.Color.red);
        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.red);
        jLabel2.setText("BJP");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 40, -1, -1));

        jLabel3.setBackground(java.awt.Color.red);
        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.red);
        jLabel3.setText("BSP");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 328, -1, -1));

        jLabel4.setBackground(java.awt.Color.red);
        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.red);
        jLabel4.setText("NCP");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 413, -1, -1));

        jLabel5.setBackground(java.awt.Color.red);
        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.red);
        jLabel5.setText("INC");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 112, -1, -1));

        jinc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VoteVerse/fig forvote .png"))); // NOI18N
        jinc.setContentAreaFilled(false);
        jinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jincActionPerformed(evt);
            }
        });
        jPanel2.add(jinc, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 106, 82, 59));

        jcpi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VoteVerse/fig forvote .png"))); // NOI18N
        jcpi.setContentAreaFilled(false);
        jcpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcpiActionPerformed(evt);
            }
        });
        jPanel2.add(jcpi, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 193, 85, 60));

        jbsp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VoteVerse/fig forvote .png"))); // NOI18N
        jbsp.setContentAreaFilled(false);
        jbsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbspActionPerformed(evt);
            }
        });
        jPanel2.add(jbsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 294, 75, -1));

        jncp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VoteVerse/fig forvote .png"))); // NOI18N
        jncp.setContentAreaFilled(false);
        jncp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jncpActionPerformed(evt);
            }
        });
        jPanel2.add(jncp, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 413, 75, 61));

        jbjp.setBackground(java.awt.Color.lightGray);
        jbjp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VoteVerse/fig forvote .png"))); // NOI18N
        jbjp.setContentAreaFilled(false);
        jbjp.setFocusPainted(false);
        jbjp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbjpActionPerformed(evt);
            }
        });
        jPanel2.add(jbjp, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 11, 75, 72));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(51, 0, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(230, 510));

        jLabel10.setForeground(new java.awt.Color(51, 0, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VoteVerse/ic_fingerprint_white_24dp.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Start Election");
        jLabel11.setMaximumSize(new java.awt.Dimension(154, 30));
        jLabel11.setMinimumSize(new java.awt.Dimension(154, 30));
        jLabel11.setPreferredSize(new java.awt.Dimension(154, 30));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbjpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbjpActionPerformed
          Connection c=null;
       Statement stmt=null;
       
       try{
          Class.forName("com.mysql.jdbc.Driver").newInstance();
          c= DriverManager.getConnection("jdbc:mysql://localhost:3306/voting_system", "root", "");
          System.out.println("database opened successfully");
          stmt=c.createStatement();
          ResultSet rs=stmt.executeQuery("Select count from result5 where id=1;");
          while(rs.next())
          {
              vc=rs.getInt("count");
              vc++;
              System.out.println("Total=\n"+vc);
              int ps=stmt.executeUpdate("update result5 set count="+vc+" where id=1;");
                 JOptionPane.showMessageDialog(null, "You voted for BJP");
            admin h = new admin();
            h.setVisible(true);
            dispose();
          }
          
       }catch(Exception e){System.err.println(e.getClass().getName()+":"+e.getMessage());}
    

    }//GEN-LAST:event_jbjpActionPerformed

    private void jincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jincActionPerformed
        Connection c=null;
       Statement stmt=null;
       
       try{
          Class.forName("com.mysql.jdbc.Driver").newInstance();
          c= DriverManager.getConnection("jdbc:mysql://localhost:3306/voting_system", "root", "");
          System.out.println("database opened successfully");
          stmt=c.createStatement();
          ResultSet rs=stmt.executeQuery("Select count from result5 where id=2;");
          while(rs.next())
          {
              vc=rs.getInt("count");
              vc++;
              System.out.println("Total=\n"+vc);
              int ps=stmt.executeUpdate("update result5 set count="+vc+" where id=2;");
                 JOptionPane.showMessageDialog(null, "You voted for INC");
            admin h = new admin();
            h.setVisible(true);
            dispose();
          }
          
       }catch(Exception e){System.err.println(e.getClass().getName()+":"+e.getMessage());}
    

    }//GEN-LAST:event_jincActionPerformed

    private void jcpiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcpiActionPerformed
 Connection c=null;
       Statement stmt=null;
       
       try{
          Class.forName("com.mysql.jdbc.Driver").newInstance();
          c= DriverManager.getConnection("jdbc:mysql://localhost:3306/voting_system", "root", "");
          System.out.println("database opened successfully");
          stmt=c.createStatement();
          ResultSet rs=stmt.executeQuery("Select count from result5 where id=3;");
          while(rs.next())
          {
              vc=rs.getInt("count");
              vc++;
              System.out.println("Total=\n"+vc);
              int ps=stmt.executeUpdate("update result5 set count="+vc+" where id=3;");
                 JOptionPane.showMessageDialog(null, "You voted for CPI");
            admin h = new admin();
            h.setVisible(true);
            dispose();
          }
          
       }catch(Exception e){System.err.println(e.getClass().getName()+":"+e.getMessage());}
    

    }//GEN-LAST:event_jcpiActionPerformed

    private void jbspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbspActionPerformed
 Connection c=null;
       Statement stmt=null;
       
       try{
          Class.forName("com.mysql.jdbc.Driver").newInstance();
          c= DriverManager.getConnection("jdbc:mysql://localhost:3306/voting_system", "root", "");
          System.out.println("database opened successfully");
          stmt=c.createStatement();
          ResultSet rs=stmt.executeQuery("Select count from result5 where id=4;");
          while(rs.next())
          {
              vc=rs.getInt("count");
              vc++;
              System.out.println("Total=\n"+vc);
              int ps=stmt.executeUpdate("update result5 set count="+vc+" where id=4;");
                 JOptionPane.showMessageDialog(null, "You voted for BSP");
            admin h = new admin();
            h.setVisible(true);
            dispose();
          }
          
       }catch(Exception e){System.err.println(e.getClass().getName()+":"+e.getMessage());}
    

    }//GEN-LAST:event_jbspActionPerformed

    private void jncpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jncpActionPerformed
      Connection c=null;
       Statement stmt=null;
       
       try{
          Class.forName("com.mysql.jdbc.Driver").newInstance();
          c= DriverManager.getConnection("jdbc:mysql://localhost:3306/voting_system", "root", "");
          System.out.println("database opened successfully");
          stmt=c.createStatement();
          ResultSet rs=stmt.executeQuery("Select count from result5 where id=5;");
          while(rs.next())
          {
              vc=rs.getInt("count");
              vc++;
              System.out.println("Total=\n"+vc);
              int ps=stmt.executeUpdate("update result5 set count="+vc+" where id=5;");
                 JOptionPane.showMessageDialog(null, "You voted for NCP");
            admin h = new admin();
            h.setVisible(true);
            dispose();
          }
          
       }catch(Exception e){System.err.println(e.getClass().getName()+":"+e.getMessage());}
    

    }//GEN-LAST:event_jncpActionPerformed

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
            java.util.logging.Logger.getLogger(startelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(startelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(startelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(startelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new startelection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbjp;
    private javax.swing.JButton jbsp;
    private javax.swing.JButton jcpi;
    private javax.swing.JButton jinc;
    private javax.swing.JButton jncp;
    // End of variables declaration//GEN-END:variables
}