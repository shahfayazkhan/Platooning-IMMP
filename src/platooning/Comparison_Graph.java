/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platooning;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Comparison_Graph extends javax.swing.JFrame {

    public Comparison_Graph() {
        super("Comparison Graph");
        initComponents();
        
        setNameAndValue();
        checkValues();
    }
    
    public void setNameAndValue(){
        lbljoiningvalue.setText(String.format("%.2f", Setup.joining));
        lblleavingvalue.setText(String.format("%.2f", Setup.leaving));
        lblmleavingvalue.setText(String.format("%.2f", Setup.m_leaving));
        lblmjoiningvalue.setText(String.format("%.2f", Setup.m_joining));
        lbljoiningname.setText(Setup.txtplatoonname.getText());
    }
    
    public void checkValues(){
        double j = Double.parseDouble(lbljoiningvalue.getText());
        double l = Double.parseDouble(lblleavingvalue.getText());
        double mj = Double.parseDouble(lblmjoiningvalue.getText());
        double ml = Double.parseDouble(lblmleavingvalue.getText());
        
        if(j == 0){
            txtjoiningvalue1.setEnabled(false);
            txtjoiningvalue2.setEnabled(false);
        }
        if( l == 0){
            txtleavingvalue1.setEnabled(false);
            txtleavingvalue2.setEnabled(false);
        }
        if(mj == 0){
            txtmultiplejoiningvalue1.setEnabled(false);
            txtmultiplejoiningvalue2.setEnabled(false);
        }
        if(ml == 0){
            txtmultipleleavingvalue1.setEnabled(false);
            txtmultipleleavingvalue2.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbljoiningname = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtjoining1 = new javax.swing.JTextField();
        txtjoining2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtjoining3 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtleavingvalue2 = new javax.swing.JTextField();
        txtleavingvalue1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtjoiningvalue2 = new javax.swing.JTextField();
        txtjoiningvalue1 = new javax.swing.JTextField();
        lbljoiningvalue = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblleavingvalue = new javax.swing.JLabel();
        txtmultiplejoiningvalue1 = new javax.swing.JTextField();
        txtmultiplejoiningvalue2 = new javax.swing.JTextField();
        lblmjoiningvalue = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtmultipleleavingvalue1 = new javax.swing.JTextField();
        txtmultipleleavingvalue2 = new javax.swing.JTextField();
        lblmleavingvalue = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Comparison Graph Setup");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 10, 250, 33);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Comparing Platoon Name", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N

        lbljoiningname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbljoiningname.setText("Your Platoon Name...?");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Platoon Name :");

        txtjoining1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtjoining1.setText("Enter First Comparison Name...?");
        txtjoining1.setNextFocusableComponent(txtjoining2);
        txtjoining1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtjoining1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtjoining1FocusLost(evt);
            }
        });

        txtjoining2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtjoining2.setText("Enter Second Comparison Name...?");
        txtjoining2.setNextFocusableComponent(txtjoining3);
        txtjoining2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtjoining2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtjoining2FocusLost(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("First Name :");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Second Name :");

        txtjoining3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtjoining3.setText("Enter Third Comparison Name...?");
        txtjoining3.setNextFocusableComponent(txtjoiningvalue1);
        txtjoining3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtjoining3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtjoining3FocusLost(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Third Name :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtjoining3, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtjoining2)
                        .addComponent(txtjoining1)
                        .addComponent(lbljoiningname, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbljoiningname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtjoining1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtjoining2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtjoining3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(100, 50, 470, 180);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Comparing Platoon Values", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanel3.setLayout(null);

        txtleavingvalue2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtleavingvalue2.setText("0.00");
        txtleavingvalue2.setNextFocusableComponent(txtmultiplejoiningvalue1);
        txtleavingvalue2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtleavingvalue2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtleavingvalue2FocusLost(evt);
            }
        });
        txtleavingvalue2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtleavingvalue2KeyTyped(evt);
            }
        });
        jPanel3.add(txtleavingvalue2);
        txtleavingvalue2.setBounds(130, 150, 100, 28);

        txtleavingvalue1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtleavingvalue1.setText("0.00");
        txtleavingvalue1.setNextFocusableComponent(txtleavingvalue2);
        txtleavingvalue1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtleavingvalue1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtleavingvalue1FocusLost(evt);
            }
        });
        txtleavingvalue1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtleavingvalue1KeyTyped(evt);
            }
        });
        jPanel3.add(txtleavingvalue1);
        txtleavingvalue1.setBounds(130, 110, 100, 28);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("First Joining :");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(10, 30, 92, 25);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Second Joining :");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(10, 70, 113, 25);

        txtjoiningvalue2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtjoiningvalue2.setText("0.00");
        txtjoiningvalue2.setNextFocusableComponent(txtleavingvalue1);
        txtjoiningvalue2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtjoiningvalue2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtjoiningvalue2FocusLost(evt);
            }
        });
        txtjoiningvalue2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtjoiningvalue2KeyTyped(evt);
            }
        });
        jPanel3.add(txtjoiningvalue2);
        txtjoiningvalue2.setBounds(130, 70, 100, 28);

        txtjoiningvalue1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtjoiningvalue1.setText("0.00");
        txtjoiningvalue1.setNextFocusableComponent(txtjoiningvalue2);
        txtjoiningvalue1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtjoiningvalue1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtjoiningvalue1FocusLost(evt);
            }
        });
        txtjoiningvalue1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtjoiningvalue1KeyTyped(evt);
            }
        });
        jPanel3.add(txtjoiningvalue1);
        txtjoiningvalue1.setBounds(130, 30, 100, 28);

        lbljoiningvalue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbljoiningvalue.setText("5.0");
        jPanel3.add(lbljoiningvalue);
        lbljoiningvalue.setBounds(240, 30, 50, 25);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("First Leaving :");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(10, 110, 96, 25);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Second Leaving :");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(10, 150, 117, 25);

        lblleavingvalue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblleavingvalue.setText("0.00");
        jPanel3.add(lblleavingvalue);
        lblleavingvalue.setBounds(240, 110, 50, 25);

        txtmultiplejoiningvalue1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtmultiplejoiningvalue1.setText("0.00");
        txtmultiplejoiningvalue1.setNextFocusableComponent(txtmultiplejoiningvalue2);
        txtmultiplejoiningvalue1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtmultiplejoiningvalue1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtmultiplejoiningvalue1FocusLost(evt);
            }
        });
        txtmultiplejoiningvalue1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmultiplejoiningvalue1KeyTyped(evt);
            }
        });
        jPanel3.add(txtmultiplejoiningvalue1);
        txtmultiplejoiningvalue1.setBounds(444, 30, 106, 28);

        txtmultiplejoiningvalue2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtmultiplejoiningvalue2.setText("0.00");
        txtmultiplejoiningvalue2.setNextFocusableComponent(txtmultipleleavingvalue1);
        txtmultiplejoiningvalue2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtmultiplejoiningvalue2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtmultiplejoiningvalue2FocusLost(evt);
            }
        });
        txtmultiplejoiningvalue2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmultiplejoiningvalue2KeyTyped(evt);
            }
        });
        jPanel3.add(txtmultiplejoiningvalue2);
        txtmultiplejoiningvalue2.setBounds(444, 69, 106, 28);

        lblmjoiningvalue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblmjoiningvalue.setText("9.0");
        jPanel3.add(lblmjoiningvalue);
        lblmjoiningvalue.setBounds(554, 31, 47, 25);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("First_M_Joining :");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(291, 31, 118, 25);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Second_M_Joining :");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(291, 70, 139, 25);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("First_M_Leaving :");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(291, 109, 122, 25);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Second_M_Leaving :");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(291, 148, 143, 25);

        txtmultipleleavingvalue1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtmultipleleavingvalue1.setText("0.00");
        txtmultipleleavingvalue1.setNextFocusableComponent(txtmultipleleavingvalue2);
        txtmultipleleavingvalue1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtmultipleleavingvalue1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtmultipleleavingvalue1FocusLost(evt);
            }
        });
        txtmultipleleavingvalue1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmultipleleavingvalue1KeyTyped(evt);
            }
        });
        jPanel3.add(txtmultipleleavingvalue1);
        txtmultipleleavingvalue1.setBounds(444, 108, 106, 28);

        txtmultipleleavingvalue2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtmultipleleavingvalue2.setText("0.00");
        txtmultipleleavingvalue2.setNextFocusableComponent(txtjoining1);
        txtmultipleleavingvalue2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtmultipleleavingvalue2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtmultipleleavingvalue2FocusLost(evt);
            }
        });
        txtmultipleleavingvalue2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmultipleleavingvalue2KeyTyped(evt);
            }
        });
        jPanel3.add(txtmultipleleavingvalue2);
        txtmultipleleavingvalue2.setBounds(444, 147, 106, 28);

        lblmleavingvalue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblmleavingvalue.setText("9.0");
        jPanel3.add(lblmleavingvalue);
        lblmleavingvalue.setBounds(554, 109, 47, 25);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(20, 230, 610, 190);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Back");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(320, 430, 80, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Ok");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(230, 430, 80, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1065, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(656, 506));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtjoiningvalue1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjoiningvalue1KeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c == KeyEvent.VK_DELETE) || c == KeyEvent.VK_BACKSPACE)){
            getToolkit().beep();
            evt.consume();
        }
       
    }//GEN-LAST:event_txtjoiningvalue1KeyTyped

    private void txtjoiningvalue2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjoiningvalue2KeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c == KeyEvent.VK_DELETE) || c == KeyEvent.VK_BACKSPACE)){
            getToolkit().beep();
            evt.consume();
        }
        
    }//GEN-LAST:event_txtjoiningvalue2KeyTyped

    private void txtleavingvalue1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtleavingvalue1KeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c == KeyEvent.VK_DELETE) || c == KeyEvent.VK_BACKSPACE)){
            getToolkit().beep();
            evt.consume();
        }
        
    }//GEN-LAST:event_txtleavingvalue1KeyTyped

    private void txtleavingvalue2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtleavingvalue2KeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c == KeyEvent.VK_DELETE) || c == KeyEvent.VK_BACKSPACE)){
            getToolkit().beep();
            evt.consume();
        }
       
    }//GEN-LAST:event_txtleavingvalue2KeyTyped

    private void txtmultiplejoiningvalue1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmultiplejoiningvalue1KeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c == KeyEvent.VK_DELETE) || c == KeyEvent.VK_BACKSPACE)){
            getToolkit().beep();
            evt.consume();
        }
        
    }//GEN-LAST:event_txtmultiplejoiningvalue1KeyTyped

    private void txtmultiplejoiningvalue2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmultiplejoiningvalue2KeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c == KeyEvent.VK_DELETE) || c == KeyEvent.VK_BACKSPACE)){
            getToolkit().beep();
            evt.consume();
        }
        
    }//GEN-LAST:event_txtmultiplejoiningvalue2KeyTyped

    private void txtjoining1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjoining1FocusGained
        if(txtjoining1.getText().equals("Enter First Comparison Name...?")){
            txtjoining1.setText("");
        }else{
            txtjoining1.getText();
        }
    }//GEN-LAST:event_txtjoining1FocusGained

    private void txtjoining1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjoining1FocusLost
        if(txtjoining1.getText().equals("")){
            txtjoining1.setText("Enter First Comparison Name...?");
        }else{
            txtjoining1.getText();
        }
    }//GEN-LAST:event_txtjoining1FocusLost

    private void txtjoining2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjoining2FocusGained
        if(txtjoining2.getText().equals("Enter Second Comparison Name...?")){
            txtjoining2.setText("");
        }else{
            txtjoining2.getText();
        }
    }//GEN-LAST:event_txtjoining2FocusGained

    private void txtjoining2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjoining2FocusLost
        if(txtjoining2.getText().equals("")){
            txtjoining2.setText("Enter Second Comparison Name...?");
        }else{
            txtjoining2.getText();
        }
    }//GEN-LAST:event_txtjoining2FocusLost

    private void txtjoiningvalue1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjoiningvalue1FocusGained
        if(txtjoiningvalue1.getText().equals("0.00")){
            txtjoiningvalue1.setText("");
        }else{
            txtjoiningvalue1.getText();
        }
    }//GEN-LAST:event_txtjoiningvalue1FocusGained

    private void txtjoiningvalue1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjoiningvalue1FocusLost
        if(txtjoiningvalue1.getText().equals("")){
            txtjoiningvalue1.setText("0.00");
        }else{
            txtjoiningvalue1.getText();
        }
    }//GEN-LAST:event_txtjoiningvalue1FocusLost

    private void txtjoiningvalue2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjoiningvalue2FocusGained
        if(txtjoiningvalue2.getText().equals("0.00")){
            txtjoiningvalue2.setText("");
        }else{
            txtjoiningvalue2.getText();
        }
    }//GEN-LAST:event_txtjoiningvalue2FocusGained

    private void txtjoiningvalue2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjoiningvalue2FocusLost
        if(txtjoiningvalue2.getText().equals("")){
            txtjoiningvalue2.setText("0.00");
        }else{
            txtjoiningvalue2.getText();
        }
    }//GEN-LAST:event_txtjoiningvalue2FocusLost

    private void txtleavingvalue1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtleavingvalue1FocusGained
        if(txtleavingvalue1.getText().equals("0.00")){
            txtleavingvalue1.setText("");
        }else{
            txtleavingvalue1.getText();
        }
    }//GEN-LAST:event_txtleavingvalue1FocusGained

    private void txtleavingvalue1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtleavingvalue1FocusLost
        if(txtleavingvalue1.getText().equals("")){
            txtleavingvalue1.setText("0.00");
        }else{
            txtleavingvalue1.getText();
        }
    }//GEN-LAST:event_txtleavingvalue1FocusLost

    private void txtleavingvalue2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtleavingvalue2FocusGained
        if(txtleavingvalue2.getText().equals("0.00")){
            txtleavingvalue2.setText("");
        }else{
            txtleavingvalue2.getText();
        }
    }//GEN-LAST:event_txtleavingvalue2FocusGained

    private void txtleavingvalue2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtleavingvalue2FocusLost
        if(txtleavingvalue2.getText().equals("")){
            txtleavingvalue2.setText("0.00");
        }else{
            txtleavingvalue2.getText();
        }
    }//GEN-LAST:event_txtleavingvalue2FocusLost

    private void txtmultiplejoiningvalue1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtmultiplejoiningvalue1FocusGained
        if(txtmultiplejoiningvalue1.getText().equals("0.00")){
            txtmultiplejoiningvalue1.setText("");
        }else{
            txtmultiplejoiningvalue1.getText();
        }
    }//GEN-LAST:event_txtmultiplejoiningvalue1FocusGained

    private void txtmultiplejoiningvalue1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtmultiplejoiningvalue1FocusLost
        if(txtmultiplejoiningvalue1.getText().equals("")){
            txtmultiplejoiningvalue1.setText("0.00");
        }else{
            txtmultiplejoiningvalue1.getText();
        }
    }//GEN-LAST:event_txtmultiplejoiningvalue1FocusLost

    private void txtmultiplejoiningvalue2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtmultiplejoiningvalue2FocusGained
        if(txtmultiplejoiningvalue2.getText().equals("0.00")){
            txtmultiplejoiningvalue2.setText("");
        }else{
            txtmultiplejoiningvalue2.getText();
        }
    }//GEN-LAST:event_txtmultiplejoiningvalue2FocusGained

    private void txtmultiplejoiningvalue2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtmultiplejoiningvalue2FocusLost
        if(txtmultiplejoiningvalue2.getText().equals("")){
            txtmultiplejoiningvalue2.setText("0.00");
        }else{
            txtmultiplejoiningvalue2.getText();
        }
    }//GEN-LAST:event_txtmultiplejoiningvalue2FocusLost

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        Setup s = new Setup();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Setup s = new Setup();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    
    public void Comparison_Match_Report(){
        
        double joining = Double.parseDouble(lbljoiningvalue.getText());
        double leaving = Double.parseDouble(lblleavingvalue.getText());
        double multiple_Leave = Double.parseDouble(lblmleavingvalue.getText());
        double multiple_Join = Double.parseDouble(lblmjoiningvalue.getText());
        String ownname = lbljoiningname.getText();
        
        double joining_Comp1 = Double.parseDouble(txtjoiningvalue1.getText());
        String joining_name1 = txtjoining1.getText();
        double joining_Comp2 = Double.parseDouble(txtjoiningvalue2.getText());
        String joining_name2 = txtjoining2.getText();
        
        String joining_name3 = txtjoining3.getText();
        
        double leaving_Comp1 = Double.parseDouble(txtleavingvalue1.getText());
        double leaving_Comp2 = Double.parseDouble(txtleavingvalue2.getText());
        
        double m_joining_Comp1 = Double.parseDouble(txtmultiplejoiningvalue1.getText());
        double m_joining_Comp2 = Double.parseDouble(txtmultiplejoiningvalue2.getText());
        
        double m_leaving_Comp1 = Double.parseDouble(txtmultipleleavingvalue1.getText());
        double m_leaving_Comp2 = Double.parseDouble(txtmultipleleavingvalue2.getText());
        
        
        
        DefaultCategoryDataset dcds = new DefaultCategoryDataset();
        
        if(joining != 0){
                dcds.addValue(joining, ownname, "Joining");
            if(joining_Comp1 != 0.00){
                dcds.addValue(joining_Comp1, joining_name1, "Joining");
            }if(joining_Comp2 != 0.00){
                dcds.addValue(joining_Comp2, joining_name2, "Joining");
            }
        }
        if(leaving != 0){
                dcds.setValue(leaving, ownname, "Leaving");
            if(leaving_Comp1 != 0.00){
                dcds.setValue(leaving_Comp1, joining_name1, "Leaving");
            }if(leaving_Comp2 != 0.00){
                dcds.setValue(leaving_Comp2, joining_name3, "Leaving");
            }
        }
        if(multiple_Join != 0){
            dcds.setValue(m_joining_Comp1, joining_name1, "Leave&Join Case-1");
            dcds.setValue(multiple_Join, ownname, "Leave&Join Case-1");
            dcds.setValue(m_joining_Comp2, joining_name2, "Leave&Join Case-1");
            
        }
        if(multiple_Leave != 0){
            dcds.setValue(m_leaving_Comp1, joining_name1, "Leave&Join Case-2");
            dcds.setValue(multiple_Leave, ownname, "Leave&Join Case-2");
            dcds.setValue(m_leaving_Comp2, joining_name2, "Leave&Join Case-2");
            
        }
        
        
        JFreeChart chart = ChartFactory.createBarChart(
                "", "",
                "Duration(s)", dcds,PlotOrientation.VERTICAL,true,true,false);
        
        CategoryPlot plot = chart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.black);
        
        ChartFrame frame = new ChartFrame("",chart,true);
        
        frame.pack();
        frame.setLocationRelativeTo(this);
        frame.setVisible(true);
        frame.setSize(800,600);
        
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Comparison_Match_Report();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtmultipleleavingvalue2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtmultipleleavingvalue2FocusGained
        if(txtmultipleleavingvalue2.getText().equals("0.00")){
            txtmultipleleavingvalue2.setText("");
        }else{
            txtmultipleleavingvalue2.getText();
        }
    }//GEN-LAST:event_txtmultipleleavingvalue2FocusGained

    private void txtmultipleleavingvalue2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtmultipleleavingvalue2FocusLost
        if(txtmultipleleavingvalue2.getText().equals("")){
            txtmultipleleavingvalue2.setText("0.00");
        }else{
            txtmultipleleavingvalue2.getText();
        }
    }//GEN-LAST:event_txtmultipleleavingvalue2FocusLost

    private void txtmultipleleavingvalue2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmultipleleavingvalue2KeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c == KeyEvent.VK_DELETE) || c == KeyEvent.VK_BACKSPACE)){
            getToolkit().beep();
            evt.consume();
        }
        
    }//GEN-LAST:event_txtmultipleleavingvalue2KeyTyped

    private void txtmultipleleavingvalue1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtmultipleleavingvalue1FocusGained
        if(txtmultipleleavingvalue1.getText().equals("0.00")){
            txtmultipleleavingvalue1.setText("");
        }else{
            txtmultipleleavingvalue1.getText();
        }
    }//GEN-LAST:event_txtmultipleleavingvalue1FocusGained

    private void txtmultipleleavingvalue1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtmultipleleavingvalue1FocusLost
        if(txtmultipleleavingvalue1.getText().equals("")){
            txtmultipleleavingvalue1.setText("0.00");
        }else{
            txtmultipleleavingvalue1.getText();
        }
    }//GEN-LAST:event_txtmultipleleavingvalue1FocusLost

    private void txtmultipleleavingvalue1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmultipleleavingvalue1KeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c == KeyEvent.VK_DELETE) || c == KeyEvent.VK_BACKSPACE)){
            getToolkit().beep();
            evt.consume();
        }
        if(txtjoining1.getText().equals("")||txtjoining1.getText()
                .equals("Enter First Comparison Name...?")){
            JOptionPane.showMessageDialog(this, "Please Enter First Comparison Name...?");
            evt.consume();
            txtjoining1.requestFocus();
        }
    }//GEN-LAST:event_txtmultipleleavingvalue1KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Setup s = new Setup();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtjoining3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjoining3FocusGained
        if(txtjoining3.getText().equals("Enter Third Comparison Name...?")){
            txtjoining3.setText("");
        }else{
            txtjoining3.getText();
        }
    }//GEN-LAST:event_txtjoining3FocusGained

    private void txtjoining3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjoining3FocusLost
        if(txtjoining3.getText().equals("")){
            txtjoining3.setText("Enter Third Comparison Name...?");
        }else{
            txtjoining3.getText();
        }
    }//GEN-LAST:event_txtjoining3FocusLost

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
            java.util.logging.Logger.getLogger(Comparison_Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comparison_Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comparison_Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comparison_Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comparison_Graph().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbljoiningname;
    private javax.swing.JLabel lbljoiningvalue;
    private javax.swing.JLabel lblleavingvalue;
    private javax.swing.JLabel lblmjoiningvalue;
    private javax.swing.JLabel lblmleavingvalue;
    private javax.swing.JTextField txtjoining1;
    private javax.swing.JTextField txtjoining2;
    private javax.swing.JTextField txtjoining3;
    private javax.swing.JTextField txtjoiningvalue1;
    private javax.swing.JTextField txtjoiningvalue2;
    private javax.swing.JTextField txtleavingvalue1;
    private javax.swing.JTextField txtleavingvalue2;
    private javax.swing.JTextField txtmultiplejoiningvalue1;
    private javax.swing.JTextField txtmultiplejoiningvalue2;
    private javax.swing.JTextField txtmultipleleavingvalue1;
    private javax.swing.JTextField txtmultipleleavingvalue2;
    // End of variables declaration//GEN-END:variables
}
