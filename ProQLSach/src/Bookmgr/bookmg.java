
package Bookmgr;

import java.awt.Color;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class bookmg extends javax.swing.JFrame {

    private List<Book> list = new ArrayList<>();
    private DefaultTableModel model = new DefaultTableModel();
    

    public bookmg() {
        initComponents();
        
        initTable();
        fillTable();
    } 
    private void fillTable(){
        model.setRowCount(0);
        
        for(Book book : list){ 
            model.addRow(new Object []{book.getId(),book.getName(),  book.getType(), ""+ book.getPrice(), book.getState()});
        } 
        model.fireTableDataChanged(); 
    }
    
    private void initTable(){
        String[] columns = new String[] {"ID book", "Name", "Type", "Price", "State"};
        model.setColumnIdentifiers(columns);
        list.add(new Book("BK1", "Chung Han", "Fiction", 100000, "Sale"));
        list.add(new Book("BK2", "Mobility and Energy", "Science", 250000, "Sale"));
        list.add(new Book("BK3", "Vo Nhat", "Fiction", 120000, "Sale"));
        list.add(new Book("BK4", "Bay", "Fiction", 89000, "Read"));
        list.add(new Book("BK5", "Mars", "Science", 326000, "Sale"));
        list.add(new Book("BK6", "Doraemon", "Comic", 58000, "Read"));
        list.add(new Book("BK7", "How to win", "Self-help", 180000, "Read"));
        list.add(new Book("BK8", "Anyway", "Self-help", 220000, "Sale"));
        
        tblbook.setModel(model);
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        cbbType = new javax.swing.JComboBox<>();
        btAdd = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        btRemove = new javax.swing.JButton();
        btReset = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        rdoSale = new javax.swing.JRadioButton();
        rdoRead = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblbook = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("BOOK MANAGEMENT");

        jLabel2.setText("ID: ");

        jLabel3.setText("Name: ");

        jLabel4.setText("Type: ");

        jLabel5.setText("Price: ");

        cbbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fiction ", "Science ", "Comic ", "Self-help ", " " }));

        btAdd.setText("Add");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btUpdate.setText("Update");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        btRemove.setText("Remove");
        btRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoveActionPerformed(evt);
            }
        });

        btReset.setText("Reset");
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoSale);
        rdoSale.setText("Sale  ");

        buttonGroup1.add(rdoRead);
        rdoRead.setText("Read ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(btAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btUpdate)
                                .addGap(18, 18, 18)
                                .addComponent(btRemove)
                                .addGap(18, 18, 18)
                                .addComponent(btReset))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel2)
                                        .addGap(39, 39, 39))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5))
                                        .addGap(23, 23, 23)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName)
                                    .addComponent(txtId)
                                    .addComponent(cbbType, 0, 254, Short.MAX_VALUE)
                                    .addComponent(txtPrice))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdoSale)
                                    .addComponent(rdoRead))))
                        .addGap(0, 50, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btAdd)
                            .addComponent(btUpdate)
                            .addComponent(btRemove)
                            .addComponent(btReset)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(rdoSale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdoRead)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tblbook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblbookMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblbook);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblbookMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblbookMouseReleased
        // TODO add your handling code here:
       int bkclick = tblbook.getSelectedRow();
       
       if(bkclick >= 0){
           String id = (String) tblbook.getValueAt(bkclick, 0);
           
           for(Book book : list){
               if(id.equals(book.getId())){
                   txtId.setText(book.getId());
                   txtName.setText(book.getName());
                   cbbType.setSelectedItem(book.getType());
                   txtPrice.setText(""+ book.getPrice());
                   
                   break;
               }
           }
       }
        
    }//GEN-LAST:event_tblbookMouseReleased

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        // TODO add your handling code here:
         StringBuilder sb = new StringBuilder();
        if(txtId.getText().equals("")){
            sb.append("Empty!");
            txtId.setBackground(Color.pink);
        }
        else {
            txtId.setBackground(Color.white);
        }
        if(txtName.getText().equals("")){
            sb.append("Empty!");
            txtName.setBackground(Color.pink);
        }
        else {
            txtName.setBackground(Color.white);
        }
         if(txtPrice.getText().equals("")){
            sb.append("Empty!");
            txtPrice.setBackground(Color.pink);
        }
        else {
            txtPrice.setBackground(Color.white);
        }
        if(sb.length() > 0){
            JOptionPane.showMessageDialog(this, sb.toString(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Book book = new Book();
        book.setId(txtId.getText());
        book.setName(txtName.getText()); 
        book.setType(cbbType.getSelectedItem().toString());
        book.setPrice(Integer.parseInt(txtPrice.getText()));
        if(rdoSale.isSelected() == true)
            book.setState("Sale");
        if(rdoRead.isSelected() == true)
            book.setState("Read");
        
        list.add(book);
        fillTable();
    }//GEN-LAST:event_btAddActionPerformed

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        // TODO add your handling code here:
          StringBuilder sb = new StringBuilder();
        if(txtId.getText().equals("")){
            sb.append("Empty!");
            txtId.setBackground(Color.pink);
        }
        else {
            txtId.setBackground(Color.white);
        }
        if(txtName.getText().equals("")){
            sb.append("Empty!");
            txtName.setBackground(Color.pink);
        }
        else {
            txtName.setBackground(Color.white);
        }
         if(txtPrice.getText().equals("")){
            sb.append("Empty!");
            txtPrice.setBackground(Color.pink);
        }
        else {
            txtPrice.setBackground(Color.white);
        }
        if(sb.length() > 0){
            JOptionPane.showMessageDialog(this, sb.toString(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int choice = JOptionPane.showConfirmDialog(this," Do you want to UPDATE info?", "Question", JOptionPane.YES_NO_OPTION);
        if(choice == JOptionPane.NO_OPTION){
            return;
        }
        for (Book book : list ){
            if(book.getId().equals(txtId.getText())){
                book.setName(txtName.getText());
                book.setType(cbbType.getSelectedItem().toString());
               book.setPrice(Integer.parseInt(txtPrice.getText()));
                if(rdoSale.isSelected() == true)
                      book.setState("Sale");
                if(rdoRead.isSelected() == true)
                      book.setState("Read");
               break;
            }
        }
        fillTable();
        btResetActionPerformed(evt);
    }//GEN-LAST:event_btUpdateActionPerformed

    private void btRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoveActionPerformed
        // TODO add your handling code here:
         int choice = JOptionPane.showConfirmDialog(this," Do you want to REMOVE info?", "Question", JOptionPane.YES_NO_OPTION);
        if(choice == JOptionPane.NO_OPTION){
            return;
        }
         int bkclick = tblbook.getSelectedRow();
         for(Book book : list){
              if(book.getId().equals(txtId.getText())){
           list.remove(book);
           break;
       }
         }
      
       fillTable();
       btResetActionPerformed(evt);
    }//GEN-LAST:event_btRemoveActionPerformed

    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
        // TODO add your handling code here:
        txtId.setText("");
        txtName.setText("");
        txtPrice.setText("");
    }//GEN-LAST:event_btResetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bookmg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btRemove;
    private javax.swing.JButton btReset;
    private javax.swing.JButton btUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton rdoRead;
    private javax.swing.JRadioButton rdoSale;
    private javax.swing.JTable tblbook;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
