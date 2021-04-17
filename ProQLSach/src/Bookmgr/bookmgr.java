
package Bookmgr;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;


public class bookmgr extends javax.swing.JFrame {

  private DefaultTableModel model = new DefaultTableModel();
    private Object comboOption;
    public bookmgr() {
        initComponents();
         model.addColumn("ID");
         model.addColumn("Name");
         model.addColumn("Type");
         model.addColumn("Price");
         
         
    }
    book bkclick = null;
   Vector tableRecord = new Vector();
   Vector tableTitle = new Vector();
    
    
    public bookmgr(JComboBox<String> typeb) {
        this.typecbb = typecbb;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jLabel1 = new javax.swing.JLabel();
        idlb = new javax.swing.JLabel();
        idtxt = new javax.swing.JTextField();
        namelb = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        typelb = new javax.swing.JLabel();
        pricelb = new javax.swing.JLabel();
        pricetxt = new javax.swing.JTextField();
        addbt = new javax.swing.JButton();
        updatebt = new javax.swing.JButton();
        removebt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        typecbb = new javax.swing.JComboBox<>();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("BOOK MANAGEMENT");

        idlb.setText("ID: ");

        namelb.setText("Name: ");

        typelb.setText("Type: ");

        pricelb.setText("Price: ");

        addbt.setText("Add");
        addbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtActionPerformed(evt);
            }
        });

        updatebt.setText("Update");
        updatebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtActionPerformed(evt);
            }
        });

        removebt.setText("Remove");
        removebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removebtActionPerformed(evt);
            }
        });

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseReleased(evt);
            }
        });

        jTable1.setModel(model);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        typecbb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fiction ", "Science ", "Comic ", " " }));
        typecbb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typecbbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(updatebt)
                                .addGap(31, 31, 31)
                                .addComponent(removebt)
                                .addGap(43, 43, 43))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pricelb)
                                    .addComponent(typelb, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pricetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                    .addComponent(typecbb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addbt))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(idlb)
                        .addGap(18, 18, 18)
                        .addComponent(idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(namelb)
                        .addGap(18, 18, 18)
                        .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idlb)
                    .addComponent(idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namelb)
                    .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typelb)
                    .addComponent(typecbb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pricelb)
                    .addComponent(pricetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbt)
                    .addComponent(updatebt)
                    .addComponent(removebt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtActionPerformed
       Random rd = new Random();
       int number = rd.nextInt(100);
       String id = idtxt.getText();
       String name = nametxt.getText();
       String type = (String) typecbb.getSelectedItem();
       Double price = Double.parseDouble(pricetxt.getText());
        java.util.List<book> list = new ArrayList<>();
        book bk = new book(id, name, type, price);
        list.add(bk);
        Object[] row = {bk.getId(), bk.getName(), bk.getType(), bk.getPrice() };
        model.addRow(row);
        
    }//GEN-LAST:event_addbtActionPerformed

    private void typecbbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typecbbActionPerformed
        // TODO add your handling code here:
        String selectedItem = (String) typecbb.getSelectedItem();
        
    }//GEN-LAST:event_typecbbActionPerformed

    private void updatebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtActionPerformed
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();
    
        if (index != -1) {
             Vector record = new Vector();
             record.add(idtxt.getText());
             record.add(nametxt.getText());
             record.add(typecbb.getSelectedItem());
             record.add(pricetxt.getText());
             tableRecord.add(record);
            
            
             
        }
    }//GEN-LAST:event_updatebtActionPerformed

    private void jScrollPane1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jScrollPane1MouseReleased

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        // TODO add your handling code here:
            
           
    }//GEN-LAST:event_jTable1MouseReleased

    private void removebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removebtActionPerformed
        // TODO add your handling code here:
         int index = jTable1.getSelectedRow();
        if (index != -1) {
            model.removeRow(index);
            
        }
    }//GEN-LAST:event_removebtActionPerformed

    
    public book getSelectedItem() {
        return (book) typecbb.getSelectedItem();
    }

   
      
  
   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bookmgr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbt;
    private javax.swing.JLabel idlb;
    private javax.swing.JTextField idtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JLabel namelb;
    private javax.swing.JTextField nametxt;
    private javax.swing.JLabel pricelb;
    private javax.swing.JTextField pricetxt;
    private javax.swing.JButton removebt;
    private javax.swing.JComboBox<String> typecbb;
    private javax.swing.JLabel typelb;
    private javax.swing.JButton updatebt;
    // End of variables declaration//GEN-END:variables
}
