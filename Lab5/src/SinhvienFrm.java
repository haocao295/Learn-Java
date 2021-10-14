
import domain.Lop;
import domain.Sinhvien;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtilities;

public class SinhvienFrm extends javax.swing.JFrame {

    private final DefaultTableModel model = new DefaultTableModel(new String[]{"MSSV", "HO TEN", "DTB", "LOP"}, 0);

    public SinhvienFrm() {
        initComponents();
        tblSinhvien.setDefaultEditor(Object.class, null);
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
            dslop.forEach(cmbLop::addItem);
            List<Sinhvien> dssv = ses.createQuery("from Sinhvien").list();
            dssv.forEach((Sinhvien sv) -> {
                Object[] row = {sv.getMssv(), sv.getHoten(), sv.getDtb(), sv.getLop()};
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

    private void clear() {
        txtHoten.setText("");
        txtDtb.setText("");
        cmbLop.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtHoten = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDtb = new javax.swing.JTextField();
        cmbLop = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jSPsinhvien = new javax.swing.JScrollPane();
        tblSinhvien = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ho ten:");

        jLabel2.setText("DTB:");

        jLabel3.setText("Lop:");

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

        jSPsinhvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jSPsinhvienMouseReleased(evt);
            }
        });

        tblSinhvien.setModel(model);
        tblSinhvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblSinhvienMouseReleased(evt);
            }
        });
        jSPsinhvien.setViewportView(tblSinhvien);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSPsinhvien, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtHoten)
                            .addComponent(txtDtb)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoa)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtHoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDtb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSPsinhvien, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        HibernateUtilities hbn = new HibernateUtilities();
        Session ses = hbn.openSession();
        Transaction tx = null;
        String hoTen = txtHoten.getText();
        double dtb = 0.0;
        try {
            dtb = Double.parseDouble(txtDtb.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Diem trung binh phai la so");
            return;
        }

        Lop lop = cmbLop.getItemAt(cmbLop.getSelectedIndex());
        try {
            tx = ses.beginTransaction();
            Sinhvien sv = new Sinhvien(lop, hoTen, dtb);
            ses.save(sv);
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
        int index = tblSinhvien.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(rootPane, "Chua chon sinh vien de sua");
            return;
        }
        HibernateUtilities hbn = new HibernateUtilities();
        Session ses = hbn.openSession();
        Transaction tx = null;
        String hoTen = txtHoten.getText();
        double dtb = 0.0;
        try {
            dtb = Double.parseDouble(txtDtb.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Diem trung binh phai la so");
            return;
        }

        Lop lop = cmbLop.getItemAt(cmbLop.getSelectedIndex());
        int mssv = (int) tblSinhvien.getValueAt(index, 0);
        try {
            tx = ses.beginTransaction();
            Sinhvien sv = (Sinhvien) ses.get(Sinhvien.class, mssv);
            if (sv != null) {

                sv.setLop(lop);
                sv.setHoten(hoTen);
                sv.setDtb(dtb);
                ses.update(sv);
                JOptionPane.showMessageDialog(rootPane, "Sua thanh cong");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Sinh vien khong ton tai");
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
        int index = tblSinhvien.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(rootPane, "Chua chon sinh vien de xoa");
            return;
        }
        HibernateUtilities hbn;
        hbn = new HibernateUtilities();
        Session ses = hbn.openSession();
        Transaction tx = null;
        int mssv = (int) tblSinhvien.getValueAt(index, 0);
        try {
            tx = ses.beginTransaction();
            Sinhvien sv = (Sinhvien) ses.get(Sinhvien.class, mssv);
            if (sv != null) {
                ses.delete(sv);
                JOptionPane.showMessageDialog(rootPane, "Xoa thanh cong");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Sinh vien khong ton tai");
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

    private void jSPsinhvienMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSPsinhvienMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jSPsinhvienMouseReleased

    private void tblSinhvienMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSinhvienMouseReleased
        // TODO add your handling code here:
        int index = tblSinhvien.getSelectedRow();
        if (index >= 0) {
            String hoTen = tblSinhvien.getValueAt(index, 1).toString();
            String dtb = tblSinhvien.getValueAt(index, 2).toString();
            Lop lop = (Lop) tblSinhvien.getValueAt(index, 3);
            txtHoten.setText(hoTen);
            txtDtb.setText(dtb);
            cmbLop.setSelectedItem(lop);
            System.out.println(lop);
        }
    }//GEN-LAST:event_tblSinhvienMouseReleased

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
            java.util.logging.Logger.getLogger(SinhvienFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SinhvienFrm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<Lop> cmbLop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jSPsinhvien;
    private javax.swing.JTable tblSinhvien;
    private javax.swing.JTextField txtDtb;
    private javax.swing.JTextField txtHoten;
    // End of variables declaration//GEN-END:variables
}
