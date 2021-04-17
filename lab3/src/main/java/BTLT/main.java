/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTLT;

import javax.swing.*;


public class main extends JFrame {


    public main() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtsongay = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rdA = new javax.swing.JRadioButton();
        rdB = new javax.swing.JRadioButton();
        rdC = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        cbA = new javax.swing.JCheckBox();
        cbB = new javax.swing.JCheckBox();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("So Ngay:");

        jLabel2.setText("Loai Phong:");

        buttonGroup1.add(rdA);
        rdA.setText("A");
        rdA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdAActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdB);
        rdB.setText("B");
        rdB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdC);
        rdC.setText("C");
        rdC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdCActionPerformed(evt);
            }
        });

        jLabel3.setText("Dich Vu:");

        cbA.setText("Thue Xe");
        cbA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAActionPerformed(evt);
            }
        });

        cbB.setText("Giat Ui");

        jToggleButton1.setText("Thanh Tien");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbA)
                        .addGap(18, 18, 18)
                        .addComponent(cbB))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtsongay, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdA)
                        .addGap(18, 18, 18)
                        .addComponent(rdB)
                        .addGap(18, 18, 18)
                        .addComponent(rdC)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtsongay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rdA)
                    .addComponent(rdB)
                    .addComponent(rdC))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbA)
                    .addComponent(cbB))
                .addGap(18, 18, 18)
                .addComponent(jToggleButton1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAActionPerformed
        // TODO add your handling code here:
    }

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        tinh();

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void rdAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdAActionPerformed

    private void rdBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdBActionPerformed

    private void rdCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdCActionPerformed

    public void thongBao(double thanhtien) {
        JFrame frame = new JFrame("JOptionPane showMessageDialog Thong_Bao");
        JOptionPane.showMessageDialog(frame,
                "Tong tien = " + thanhtien,
                "Thong_Bao",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private void tinh() {
        double giatui = 300;
        double thuexe = 200;
        double songay = Double.parseDouble(txtsongay.getText());
        if (rdA.isSelected() == true && cbA.isSelected() == false && cbB.isSelected() == false) {
            double thanhtien = 1500 * songay;
            thongBao(thanhtien);
        } else if (rdA.isSelected() == true && cbA.isSelected() == true && cbB.isSelected() == false) {
            double thanhtien1 = 1500 * songay + giatui;
            thongBao(thanhtien1);
        } else if (rdA.isSelected() == true && cbA.isSelected() == false && cbB.isSelected() == true) {
            double thanhtien2 = 1500 * songay + thuexe;
            thongBao(thanhtien2);
        } else if (rdA.isSelected() == true && cbA.isSelected() == true && cbB.isSelected() == true) {
            double thanhtien3 = 1500 * songay + (giatui + thuexe);
            thongBao(thanhtien3);
        }
        if (rdB.isSelected() == true && cbA.isSelected() == false && cbB.isSelected() == false) {
            double thanhtien4 = 1200 * songay;
            thongBao(thanhtien4);
        } else if (rdB.isSelected() == true && cbA.isSelected() == true && cbB.isSelected() == false) {
            double thanhtien5 = 1200 * songay + giatui;
            thongBao(thanhtien5);
        } else if (rdB.isSelected() == true && cbA.isSelected() == false && cbB.isSelected() == true) {
            double thanhtien6 = 1200 * songay + thuexe;
            thongBao(thanhtien6);
        } else if (rdB.isSelected() == true && cbA.isSelected() == true && cbB.isSelected() == true) {
            double thanhtien7 = 1200 * songay + (giatui + thuexe);
            thongBao(thanhtien7);
        }
        if (rdC.isSelected() == true && cbA.isSelected() == false && cbB.isSelected() == false) {
            double thanhtien8 = 1000 * songay;
            thongBao(thanhtien8);
        } else if (rdC.isSelected() == true && cbA.isSelected() == true && cbB.isSelected() == false) {
            double thanhtien9 = 1000 * songay + giatui;
            thongBao(thanhtien9);
        } else if (rdC.isSelected() == true && cbA.isSelected() == false && cbB.isSelected() == true) {
            double thanhtien10 = 1000 * songay + thuexe;
            thongBao(thanhtien10);
        } else if (rdC.isSelected() == true && cbA.isSelected() == true && cbB.isSelected() == true) {
            double thanhtien11 = 1000 * songay + (giatui + thuexe);
            thongBao(thanhtien11);
        }

    }


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
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbA;
    private javax.swing.JCheckBox cbB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JRadioButton rdA;
    private javax.swing.JRadioButton rdB;
    private javax.swing.JRadioButton rdC;
    private javax.swing.JTextField txtsongay;
    // End of variables declaration//GEN-END:variables
}
