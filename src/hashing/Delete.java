/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashing;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mithun
 */
public class Delete extends javax.swing.JFrame {

    /**
     * Creates new form Delete
     */
    public Delete() {
        initComponents();
        this.setSize(1280,770);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        a4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        a8 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        a1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        a5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        a6 = new javax.swing.JTextField();
        a2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        a3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        a7 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1280, 770));
        getContentPane().setLayout(null);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 1280, 0);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 102, 102));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(null);

        jLabel8.setBackground(new java.awt.Color(204, 255, 204));
        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("LOGOUT");
        jLabel8.setToolTipText("");
        jLabel8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel8FocusGained(evt);
            }
        });
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel8);
        jLabel8.setBounds(20, 0, 90, 30);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(1010, 80, 100, 30);

        jLabel12.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("DELETE INFO");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 10, 130, 20);

        jLabel15.setFont(new java.awt.Font("Product Sans", 1, 21)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("CYBER CAFE RECORD SYSTEM");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(420, 10, 330, 28);

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });
        jPanel6.setLayout(null);

        jLabel17.setBackground(new java.awt.Color(204, 255, 204));
        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("<-- HOME");
        jLabel17.setToolTipText("");
        jLabel17.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel17FocusGained(evt);
            }
        });
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel17);
        jLabel17.setBounds(10, 0, 80, 30);

        jPanel1.add(jPanel6);
        jPanel6.setBounds(20, 80, 100, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1130, 120);

        jPanel2.setBackground(new java.awt.Color(14, 14, 14));
        jPanel2.setLayout(null);

        a4.setBackground(new java.awt.Color(16, 15, 15));
        a4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        a4.setForeground(new java.awt.Color(255, 255, 255));
        a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a4ActionPerformed(evt);
            }
        });
        jPanel2.add(a4);
        a4.setBounds(160, 67, 130, 33);

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("UID - ");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(60, 60, 80, 40);

        jButton2.setBackground(new java.awt.Color(153, 255, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("SEARCH");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(350, 60, 140, 40);

        a8.setBackground(new java.awt.Color(13, 13, 13));
        a8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        a8.setForeground(new java.awt.Color(255, 255, 255));
        a8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a8ActionPerformed(evt);
            }
        });
        jPanel2.add(a8);
        a8.setBounds(750, 60, 150, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("UID -");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(640, 60, 80, 40);

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("DELETE");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(940, 60, 140, 40);

        a1.setBackground(new java.awt.Color(51, 51, 51));
        a1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        a1.setForeground(new java.awt.Color(255, 255, 255));
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });
        jPanel2.add(a1);
        a1.setBounds(210, 170, 280, 35);

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText(" UID :");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(50, 170, 100, 30);

        a5.setBackground(new java.awt.Color(51, 51, 51));
        a5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        a5.setForeground(new java.awt.Color(255, 255, 255));
        a5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a5ActionPerformed(evt);
            }
        });
        jPanel2.add(a5);
        a5.setBounds(790, 170, 270, 35);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SYSTEM ID -");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(620, 170, 140, 30);

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CHECK-IN -");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(620, 250, 140, 30);

        a6.setBackground(new java.awt.Color(51, 51, 51));
        a6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        a6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(a6);
        a6.setBounds(790, 250, 270, 35);

        a2.setBackground(new java.awt.Color(51, 51, 51));
        a2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        a2.setForeground(new java.awt.Color(255, 255, 255));
        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });
        jPanel2.add(a2);
        a2.setBounds(210, 250, 280, 35);

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("USERNAME -");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(50, 250, 140, 30);

        a3.setBackground(new java.awt.Color(51, 51, 51));
        a3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        a3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(a3);
        a3.setBounds(210, 340, 280, 35);

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("PURPOSE -");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(50, 340, 120, 30);

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("CHECK-OUT -");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(620, 340, 150, 30);

        a7.setBackground(new java.awt.Color(51, 51, 51));
        a7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        a7.setForeground(new java.awt.Color(255, 255, 255));
        a7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a7ActionPerformed(evt);
            }
        });
        jPanel2.add(a7);
        a7.setBounds(790, 340, 270, 35);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 120, 1130, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a4ActionPerformed

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a1ActionPerformed

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a2ActionPerformed

    private void a5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a5ActionPerformed

    private void a7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Hashing.delete_rec();
            Hashing.pack();
        } catch (IOException ex) {
            Logger.getLogger(Delete.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Hashing.search1();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void a8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a8ActionPerformed

    private void jLabel8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel8FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8FocusGained

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        this.dispose();
        Login.main(new String[]{});
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        Adddet ad=new Adddet();
        ad.setVisible(true);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jLabel17FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel17FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel17FocusGained

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        this.dispose();
        Selpage.main(new String[]{});
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        // TODO add your handling code here:
        this.dispose();
        Selpage.main(new String[]{});
    }//GEN-LAST:event_jPanel6MouseClicked

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
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField a1;
    public static javax.swing.JTextField a2;
    public static javax.swing.JTextField a3;
    public static javax.swing.JTextField a4;
    public static javax.swing.JTextField a5;
    public static javax.swing.JTextField a6;
    public static javax.swing.JTextField a7;
    public static javax.swing.JTextField a8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
