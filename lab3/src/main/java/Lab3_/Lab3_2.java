package Lab3_;



public class Lab3_2 extends javax.swing.JFrame {


    public Lab3_2() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        txtB = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtKq = new javax.swing.JTextField();
        rdbCong = new javax.swing.JRadioButton();
        rdbTru = new javax.swing.JRadioButton();
        rdbNhan = new javax.swing.JRadioButton();
        rdbChia = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lab3_2");

        jLabel1.setText("So A:");

        jLabel2.setText("So B:");

        jLabel3.setText("Ket qua:");

        buttonGroup1.add(rdbCong);
        rdbCong.setSelected(true);
        rdbCong.setText("+");
        rdbCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbCongActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbTru);
        rdbTru.setText("-");
        rdbTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbTruActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbNhan);
        rdbNhan.setText("*");
        rdbNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNhanActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbChia);
        rdbChia.setText("/");
        rdbChia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbChiaActionPerformed(evt);
            }
        });

        jButton1.setText("Ket qua");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdbCong)
                        .addGap(18, 18, 18)
                        .addComponent(rdbTru)
                        .addGap(18, 18, 18)
                        .addComponent(rdbNhan)
                        .addGap(18, 18, 18)
                        .addComponent(rdbChia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(txtA)
                    .addComponent(txtB)
                    .addComponent(txtKq, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbCong)
                    .addComponent(rdbTru)
                    .addComponent(rdbNhan)
                    .addComponent(rdbChia)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtKq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        tinh();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rdbCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbCongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbCongActionPerformed

    private void rdbTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbTruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbTruActionPerformed

    private void rdbNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNhanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbNhanActionPerformed

    private void rdbChiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbChiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbChiaActionPerformed

    private void tinh() {
        double a = Double.parseDouble(txtA.getText());
        double b = Double.parseDouble(txtB.getText());
        double kq = 0;

        if (rdbCong.isSelected()) {
            kq = a + b;
        } else if (rdbTru.isSelected()) {
            kq = a - b;
        } else if (rdbNhan.isSelected()) {
            kq = a * b;
        } else if (rdbChia.isSelected()) {
            kq = a / b;
        }
        txtKq.setText(kq + "");
    }


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Lab3_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lab3_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lab3_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lab3_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab3_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton rdbChia;
    private javax.swing.JRadioButton rdbCong;
    private javax.swing.JRadioButton rdbNhan;
    private javax.swing.JRadioButton rdbTru;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtKq;
    // End of variables declaration//GEN-END:variables
}
