
package platooning;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Record extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public Record() {
        super("Old Record");
        initComponents();
        conn = db.connect();
        jTable1.setRowHeight(25);
        setDate();
    }

    
    public void setDate(){
        combdate.removeAllItems();
        
        try{
            String sql = "select * from Joining";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            String eq = "";
            while(rs.next()){
                String dt = rs.getString("Date");
                if(dt.equals(eq)){
                eq = dt;
                }else{
                combdate.addItem(dt);
                eq = dt;
                }
            }
         
            rs.close();pst.close();
            getTableData();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){}
        }
    }
    
    public void getTableData(){
        String dt = combdate.getSelectedItem().toString();
        try{
            String sql = "select * from Joining where Date='"+dt+"'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            pst.close();
            Counting();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){}
        }
    }
    
    public void Counting(){
        lbljoining.setText("0");
        lblleaving.setText("0");
        lbltotal.setText("0");
        for(int i=0; i<jTable1.getRowCount(); i++){
            String value = (String)jTable1.getValueAt(i, 9);
            if(value.equals("Joining")){
                int x = Integer.parseInt(lbljoining.getText());
                x = x+1;
                lbljoining.setText(String.valueOf(x));
            }else{
                int x = Integer.parseInt(lblleaving.getText());
                x = x+1;
                lblleaving.setText(String.valueOf(x));
            }
        }
        lbltotal.setText(String.valueOf(jTable1.getRowCount()));
    }
    
    public void deleteAll(){
        String dt = combdate.getSelectedItem().toString();
        try{
            String sql = "delete from Joining where Date='"+dt+"'";
            pst = conn.prepareStatement(sql);
            int x = JOptionPane.showConfirmDialog(null,"Do you Really Want To Delete "+dt
            +"\nRecord...?","Warning...?",JOptionPane.YES_NO_OPTION);
            if(x==0){
            pst.execute();
            JOptionPane.showMessageDialog(null,dt+" Deleted Successfully...?");
            setDate();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void delete(){
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        try{
            int row = jTable1.getSelectedRow();
            
            int x = JOptionPane.showConfirmDialog(null,"Do you Really Want To Delete...?"
                    ,"Warning...?",JOptionPane.YES_NO_OPTION);
            if(x==0){
                
                while(row != -1){
                int del = jTable1.convertColumnIndexToModel(row);
                String click = jTable1.getModel().getValueAt(del, 0).toString();
            
                String sql = "delete from Joining where ID='"+click+"'";
                pst = conn.prepareStatement(sql);
                pst.execute();
                model.removeRow(del);
                row = jTable1.getSelectedRow();
                }
                JOptionPane.showMessageDialog(null,"Cars Record Deleted Successfully...?");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        combdate = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        lbljoining = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblleaving = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        combdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        combdate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combdate.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                combdatePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel2.add(combdate);
        combdate.setBounds(60, 10, 150, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Date :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 10, 50, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Delete All");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(140, 50, 100, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(20, 50, 100, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(210, 0, 260, 90);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setRowHeight(25);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 90, 830, 420);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);

        lbljoining.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbljoining.setText("0");
        jPanel4.add(lbljoining);
        lbljoining.setBounds(70, 10, 100, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Joining :");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(10, 10, 60, 20);

        lblleaving.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblleaving.setText("0");
        jPanel4.add(lblleaving);
        lblleaving.setBounds(70, 30, 100, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Leaving :");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(10, 30, 60, 20);

        lbltotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltotal.setText("0");
        jPanel4.add(lbltotal);
        lbltotal.setBounds(70, 50, 100, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Total :");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(10, 50, 60, 20);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(470, 0, 180, 90);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 830, 510);

        setSize(new java.awt.Dimension(832, 535));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Setup s = new Setup();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    private void combdatePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_combdatePopupMenuWillBecomeInvisible
        getTableData();
    }//GEN-LAST:event_combdatePopupMenuWillBecomeInvisible

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jTable1.getSelectedRow() == -1){
        JOptionPane.showMessageDialog(null,"Please Select Delete Row From Table...?");   
        }else{
        delete();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        deleteAll();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Record().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbljoining;
    private javax.swing.JLabel lblleaving;
    private javax.swing.JLabel lbltotal;
    // End of variables declaration//GEN-END:variables
}
