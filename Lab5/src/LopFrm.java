
import domain.Lop;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtilities;

public class LopFrm extends javax.swing.JFrame {

    private final DefaultTableModel model = new DefaultTableModel(new Object[]{"MA LOP", "TEN LOP"}, 0);

    public LopFrm() {
        initComponents();
        tblLop.setDefaultEditor(Object.class, null);
        loadData();
    }

    private void loadData() {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        HibernateUtilities hbn = new HibernateUtilities();
        Session ses = hbn.openSession();
        Transaction tx = null;
        try {
            tx = ses.beginTransaction();
            List<Lop> dslop = ses.createQuery("from Lop").list();
            dslop.forEach((Lop lop) -> {
                Object[] row = {lop.getMalop(), lop.getTenlop()};
                model.addRow(row);
            });
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e);
        } finally {
            hbn.close();
        }
    }

    private boolean isExists(int maLop) {
        HibernateUtilities hbn = new HibernateUtilities();
        Session ses = hbn.openSession();
        Transaction tx = null;
        Lop lop = null;
        try {
            tx = ses.beginTransaction();
            lop = (Lop) ses.get(Lop.class, maLop);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e);
        } finally {
            hbn.close();
        }
        return lop != null;
    }

    private void clear() {
        txtMalop.setText("");
        txtTenlop.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMalop = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenlop = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLop = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Ma lop:");

        jLabel3.setText("Ten lop:");

        btnThem.setText("Them");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sua");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xoa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        tblLop.setModel(model);
        tblLop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblLopMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblLop);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMalop))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenlop))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addGap(0, 165, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMalop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenlop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        HibernateUtilities hbn = new HibernateUtilities();
        Session ses = hbn.openSession();
        Transaction tx = null;
        int maLop;
        try {
            maLop = Integer.parseInt(txtMalop.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Ma lop phai la so nguyen");
            return;
        }
        if (isExists(maLop)) {
            JOptionPane.showMessageDialog(rootPane, "Ma lop da ton tai");
            return;
        }
        try {
            tx = ses.beginTransaction();
            Lop lop = new Lop(maLop, txtTenlop.getText());
            ses.save(lop);
            JOptionPane.showMessageDialog(rootPane, "Them thanh cong");
            tx.commit();
            loadData();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e);
        } finally {
            hbn.close();
        }
        clear();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        int index = tblLop.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(rootPane, "Chua chon lop de xoa");
            return;
        }
        HibernateUtilities hbn = new HibernateUtilities();
        Session ses = hbn.openSession();
        Transaction tx = null;
        int maLop = (int) tblLop.getValueAt(index, 0);

        try {
            tx = ses.beginTransaction();
            Lop lop = (Lop) ses.get(Lop.class, maLop);
            if (lop != null) {
                lop.setTenlop(txtTenlop.getText());
                ses.update(lop);
                JOptionPane.showMessageDialog(rootPane, "Sua thanh cong");

            } else {
                JOptionPane.showMessageDialog(rootPane, "Khong tim thay lop");
            }
            tx.commit();
            loadData();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e);
        } finally {
            hbn.close();
        }
        clear();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int index = tblLop.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(rootPane, "Chua chon lop de xoa");
            return;
        }
        HibernateUtilities hbn = new HibernateUtilities();
        Session ses = hbn.openSession();
        Transaction tx = null;
        int maLop = (int) tblLop.getValueAt(index, 0);

        try {
            tx = ses.beginTransaction();
            Lop lop = (Lop) ses.get(Lop.class, maLop);
            if (lop != null) {
                ses.delete(lop);
                JOptionPane.showMessageDialog(rootPane, "Xoa thanh cong");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Khong tim thay lop.");
            }
            tx.commit();
            loadData();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e);
        } finally {
            hbn.close();
        }
        clear();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblLopMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLopMouseReleased
        // TODO add your handling code here:
        int index = tblLop.getSelectedRow();
        if (index >= 0) {
            String maLop = tblLop.getValueAt(index, 0).toString();
            String tenLop = (String) tblLop.getValueAt(index, 1);
            txtMalop.setText(maLop);
            txtTenlop.setText(tenLop);
        }
    }//GEN-LAST:event_tblLopMouseReleased

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LopFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LopFrm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLop;
    private javax.swing.JTextField txtMalop;
    private javax.swing.JTextField txtTenlop;
    // End of variables declaration//GEN-END:variables
}
