
package platooning;

import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;

public class Setup extends javax.swing.JFrame {

    public static double joining = 0.00;
    public static double leaving = 0.00;
    public static double m_joining = 0.00;
    public static double m_leaving = 0.00;
    
    public Setup() {
        super("Platoon Setup");
        initComponents();
        txtrange.requestFocus();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        txtrange = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtspeed = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtplatoonname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);

        jCheckBox1.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(jCheckBox1);
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox1.setText("Multiple Leave & Join");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(300, 50, 160, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Platoon Range :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 120, 120, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("Platoon Maneuver Setup");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(110, 10, 350, 40);

        jCheckBox2.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(jCheckBox2);
        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox2.setText("Joining");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox2);
        jCheckBox2.setBounds(120, 50, 80, 30);

        jCheckBox3.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(jCheckBox3);
        jCheckBox3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox3.setText("Leaving");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox3);
        jCheckBox3.setBounds(210, 50, 80, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Select : ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 50, 60, 30);

        txtrange.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtrange.setText("0");
        txtrange.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtrangeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtrangeFocusLost(evt);
            }
        });
        txtrange.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrangeKeyTyped(evt);
            }
        });
        jPanel1.add(txtrange);
        txtrange.setBounds(170, 120, 150, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Platoon Speed :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 160, 120, 30);

        txtspeed.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtspeed.setText("0");
        txtspeed.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtspeedFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtspeedFocusLost(evt);
            }
        });
        txtspeed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtspeedKeyTyped(evt);
            }
        });
        jPanel1.add(txtspeed);
        txtspeed.setBounds(170, 160, 150, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Graph");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(330, 170, 80, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Ok");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(170, 210, 70, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Record");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(330, 210, 80, 30);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(250, 210, 70, 30);

        txtplatoonname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtplatoonname.setText("Protocol Name...?");
        txtplatoonname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtplatoonnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtplatoonnameFocusLost(evt);
            }
        });
        txtplatoonname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtplatoonnameKeyTyped(evt);
            }
        });
        jPanel1.add(txtplatoonname);
        txtplatoonname.setBounds(170, 80, 150, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Protocol Name :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 80, 120, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(486, 291));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtrangeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrangeKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)||(c == KeyEvent.VK_DELETE) || c == KeyEvent.VK_BACKSPACE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtrangeKeyTyped

    private void txtspeedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtspeedKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)||(c == KeyEvent.VK_DELETE) || c == KeyEvent.VK_BACKSPACE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtspeedKeyTyped

    private void txtrangeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtrangeFocusGained
        if(txtrange.getText().equals("0")){
            txtrange.setText("");
        }else{
            txtrange.getText();
        }
    }//GEN-LAST:event_txtrangeFocusGained

    private void txtrangeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtrangeFocusLost
        if(txtrange.getText().equals("")){
            txtrange.setText("0");
        }else{
            txtrange.getText();
        }
    }//GEN-LAST:event_txtrangeFocusLost

    private void txtspeedFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtspeedFocusGained
        if(txtspeed.getText().equals("0")){
            txtspeed.setText("");
        }else{
            txtspeed.getText();
        }
    }//GEN-LAST:event_txtspeedFocusGained

    private void txtspeedFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtspeedFocusLost
        if(txtspeed.getText().equals("")){
            txtspeed.setText("0");
        }else{
            txtspeed.getText();
        }
    }//GEN-LAST:event_txtspeedFocusLost

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        Operation = "Joining";
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        Operation = "Leaving";
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        Operation = "Multiple";
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(Operation.equals("")){
            JOptionPane.showMessageDialog(null,"Please Select One Option...?");
            jCheckBox2.requestFocus();
        }else if(txtrange.getText().equals("0")||txtrange.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please Enter Platoon Range...?");
            txtrange.requestFocus();
        }else if(txtspeed.getText().equals("0")||txtspeed.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please Enter Platoon Speed...?");
            txtspeed.requestFocus();
        }else if(Integer.parseInt(txtrange.getText()) > 7){
            JOptionPane.showMessageDialog(null,"The Platoon Range is upto 7...?");
            txtrange.requestFocus();
        }else if(Integer.parseInt(txtspeed.getText()) > 100){
            JOptionPane.showMessageDialog(null,"The Platoon Speed is upto 100...?");
            txtspeed.requestFocus();
        }else{
            Main_Form mf = new Main_Form();
            mf.setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(joining == 0 && leaving == 0 && m_leaving == 0 && m_joining == 0){
            JOptionPane.showMessageDialog(null, "Please First Run One Simulation The Uppor Option\n"
                +"Than Show Graph...?");
        }else if(txtplatoonname.getText().equals("Platoon Name...?")|| txtplatoonname.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please Enter Platoon Name...?");
            txtplatoonname.requestFocus();
        }else{
        
            String option[] = {"Chart", "Comparison Chart","Cancel"};
        
            int x = JOptionPane.showOptionDialog(this, "Please Click below on One Button",
                    "Choose One...?", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, null, option,option[0]);
            if(x == 0){
                Report report = new Report();
                report.getReport(joining, leaving, m_leaving, m_joining,txtplatoonname);
            }else if(x == 1){
                Comparison_Graph cg = new Comparison_Graph();
                cg.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Record r = new Record();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtplatoonnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtplatoonnameFocusGained
        if(txtplatoonname.getText().equals("Protocol Name...?")){
            txtplatoonname.setText("");
        }else{
            txtplatoonname.getText();
        }
    }//GEN-LAST:event_txtplatoonnameFocusGained

    private void txtplatoonnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtplatoonnameFocusLost
        if(txtplatoonname.getText().equals("")){
            txtplatoonname.setText("Protocol Name...?");
        }else{
            txtplatoonname.getText();
        }
    }//GEN-LAST:event_txtplatoonnameFocusLost

    private void txtplatoonnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtplatoonnameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtplatoonnameKeyTyped

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
            java.util.logging.Logger.getLogger(Setup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Setup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Setup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Setup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Setup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField txtplatoonname;
    public static javax.swing.JTextField txtrange;
    public static javax.swing.JTextField txtspeed;
    // End of variables declaration//GEN-END:variables

    public static String Operation = "";
}
