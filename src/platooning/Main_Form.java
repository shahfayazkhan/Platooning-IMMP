
package platooning;

import java.awt.GraphicsEnvironment;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Main_Form extends javax.swing.JFrame {

    //with related to Database
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    public static DefaultTableModel model = new DefaultTableModel();
    
    //inside the related database
    
    Thread t,t2,t3;
    double c1L,c2L,c3L,c4L,c5L,c6L,c7L,c8L,c9L,c10L,c11L,c12L;
    double pL1;
    String header[] = {"ID","P_Name","P_Range","P_Depth","V_ID","V_GPS","V_Speed","V_Acceleration"
    ,"V_Max_Dece","Requests","Approval","Time","Date"};
    
    //Local Cars Array
    public static ArrayList<Integer> CarsSelectingArray;
    
    //Local Cars Array Inside The body
    
    //Cars Running Classes Imported
    public static C1_Running C1Run = new C1_Running();
    public static C2_Running C2Run = new C2_Running();
    //public static C3_Running C3Run = new C3_Running();
    //public static C4_Running C4Run = new C4_Running();
    
    //Cars Running Inside this Body
    
    //Cars Changing Position Classes Imported
    public static Change_Cars_Position ccp1 = new Change_Cars_Position();
    public static Change_Cars_Position_2 ccp2 = new Change_Cars_Position_2();
    //public static Change_Cars_Position_3 ccp3 = new Change_Cars_Position_3();
    //public static Change_Cars_Position_4 ccp4 = new Change_Cars_Position_4();
    
    //Cars Changing Position Classes inside this body
    
    
    public Main_Form() {
        super("Platooning");
        initComponents();
        conn = db.connect();
        
        Main_Form.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Main_Form.this.setMaximizedBounds(env.getMaximumWindowBounds());
        if(!Setup.Operation.equals("Multiple")){
            c7.setVisible(false);
        }
        
        model.setColumnIdentifiers(header);
        jTable1.setModel(model);
        //db_Data dbdata = new db_Data();
        //dbdata.joining(conn, rs, pst, jTable1);
        
        CarsRunning();
        
        lblresult.setText("<html><br>THIS IS RSU ROUTER<br>"
                + "Showing Connecting Result<br></html>");
        SetRsuValues stv = new SetRsuValues(lblrsu,Setup.Operation);
        
    }
    int setCarsRunningThread = 0;
    public void CarsRunning(){
        
        t2 = new Thread(){
            public void run(){
                for(;;){
                    setCarsRunningThread++;
                    try{
                        Thread.sleep(500);
                    }catch(Exception e){}
                    if(setCarsRunningThread == 2){
                    getPlatoonCarsRange();
                    MultiCarsRunning();
                    t2.stop();
                    }
                }
            }
        };t2.start();
    }
    
    public void getPlatoonCarsRange(){
        Cars_Range_Setup crs = new Cars_Range_Setup();
        if(Setup.Operation.equals("Joining")){
        crs.RangeSetup(pl1, c1);
        crs.RangeSetup(pl1, c2);
        crs.RangeSetup(pl1, c3);
        crs.RangeSetup(pl1, c4);
        //lblrsu.setText("5");
        }else if(Setup.Operation.equals("Leaving")){
        crs.RangeSetup(pl1, c1);
        crs.RangeSetup(pl1, c2);
        crs.RangeSetup(pl1, c3);
        crs.RangeSetup(pl1, c4);
        crs.RangeSetup(pl1, c5);
        crs.RangeSetup(pl1, c6);
        //lblrsu.setText("7");
        }else if(Setup.Operation.equals("Multiple")){
        crs.RangeSetup(pl1, c1);
        crs.RangeSetup(pl1, c2);
        crs.RangeSetup(pl1, c3);
        crs.RangeSetup(pl1, c4);
        crs.RangeSetup(pl1, c5);
        crs.RangeSetup(pl1, c6);    
        //lblrsu.setText("7");
        }
        crs.Others_Cars_Run(c8, this.getWidth());
        crs.Others_Cars_Run(c9, this.getWidth());
    }
    
    String tc1="",tc2="",tc3="",tc4="",tc5="",tc6="",tc7="",tc8="",tc9="",tc10="",tc11=""
            ,tc12="";
    int MultiCarsRunningSpeed = 10;
    
    int w;
    
    public void MultiCarsRunning(){
        CarsSelectingArray = new <Integer>ArrayList();
        w = this.getWidth();
        if(tc1.equals("")){
            tc1 = "set";
            pressPlayButton();
            if(Setup.Operation.equals("Joining")){
            C1Run.addC1(c5, pl1, w, MultiCarsRunningSpeed);
            C2Run.addC1(c6, pl1, w, MultiCarsRunningSpeed);
            CarsSelectingArray.add(Integer.parseInt(c5.getText()));
            CarsSelectingArray.add(Integer.parseInt(c6.getText()));
            }else if(Setup.Operation.equals("Multiple")){
            C1Run.addC1(c7, pl1, w, MultiCarsRunningSpeed);
            CarsSelectingArray.add(Integer.parseInt(c7.getText()));
            }
        }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        c1 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        c6 = new javax.swing.JLabel();
        c5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pl1 = new javax.swing.JLabel();
        c7 = new javax.swing.JLabel();
        c8 = new javax.swing.JLabel();
        c9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblplay = new javax.swing.JLabel();
        lblstop = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lbltime = new javax.swing.JLabel();
        lblsecond = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblrsu = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lbljoining = new javax.swing.JLabel();
        lblleaving = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblresult = new javax.swing.JLabel();
        lbllight = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Platooning Route", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(153, 102, 0))); // NOI18N

        c1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        c1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/platooning/icons/Car-2-icon 4.png"))); // NOI18N
        c1.setText("1");

        c2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        c2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/platooning/icons/Car-2-icon 4.png"))); // NOI18N
        c2.setText("2");

        c3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        c3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/platooning/icons/Car-2-icon 4.png"))); // NOI18N
        c3.setText("3");

        c4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        c4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/platooning/icons/Car-2-icon 4.png"))); // NOI18N
        c4.setText("4");

        c6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        c6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/platooning/icons/Car-2-icon 4.png"))); // NOI18N
        c6.setText("6");

        c5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        c5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/platooning/icons/Car-2-icon 4.png"))); // NOI18N
        c5.setText("5");

        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 72)); // NOI18N

        pl1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/platooning/icons/Car-2-icon 4.png"))); // NOI18N
        pl1.setText("L1");

        c7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        c7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/platooning/icons/Car-2-icon 4.png"))); // NOI18N
        c7.setText("7");

        c8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        c8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/platooning/icons/Car-2-icon 4.png"))); // NOI18N
        c8.setText("11");

        c9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        c9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/platooning/icons/Car-2-icon 4.png"))); // NOI18N
        c9.setText("10");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setText("Lane 1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setText("Lane 2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(c4)
                .addGap(18, 18, 18)
                .addComponent(c3)
                .addGap(18, 18, 18)
                .addComponent(c2)
                .addGap(18, 18, 18)
                .addComponent(c1)
                .addGap(56, 56, 56)
                .addComponent(c5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 293, Short.MAX_VALUE)
                .addComponent(c6)
                .addGap(28, 28, 28)
                .addComponent(c7)
                .addGap(18, 18, 18)
                .addComponent(c9)
                .addGap(28, 28, 28)
                .addComponent(c8)
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addGap(102, 102, 102))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pl1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(104, 104, 104))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pl1)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(c2)
                        .addComponent(c3)
                        .addComponent(c4))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(c5)
                        .addComponent(c6)
                        .addComponent(c7)
                        .addComponent(c9)
                        .addComponent(c8)
                        .addComponent(jLabel2)))
                .addGap(2, 2, 2))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/platooning/icons/Play-1-Normal-icon.png"))); // NOI18N
        lblplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblplayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblplayMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblplayMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblplayMouseReleased(evt);
            }
        });

        lblstop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/platooning/icons/Stop-Normal-icon.png"))); // NOI18N
        lblstop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblstopMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblstopMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblstopMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblstopMouseReleased(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/platooning/icons/rsu.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblplay)
                .addGap(18, 18, 18)
                .addComponent(lblstop)
                .addGap(48, 48, 48)
                .addComponent(jLabel16)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblstop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblplay))
                .addContainerGap())
        );

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Maneuver Running Time :");

        lbltime.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltime.setText("0");

        lblsecond.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblsecond.setText("0");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Platooning Running Time Second :");

        lblrsu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblrsu.setText("1");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("RSU Connectivity :");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Joining :");

        lbljoining.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbljoining.setText("Waiting...?");

        lblleaving.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblleaving.setText("Waiting...?");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("Leaving :");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "P_Name", "P_Size", "P_Depth", "V_ID", "V_Position_GPS", "V_Speed", "V_Acceleration", "Max_Deceleration", "Time", "Date"
            }
        ));
        jTable1.setRowHeight(25);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblresult.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblresult.setText("Platooning Root");

        lbllight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/platooning/icons/Blue Rsu.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbllight, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbltime, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblsecond, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblresult, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblrsu, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbljoining, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblleaving, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltime, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblsecond, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblrsu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbljoining, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblleaving, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblresult, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbllight, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    boolean play = false;
    
    private void lblplayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblplayMouseEntered
        if(play == false){
        ImageIcon icon = new ImageIcon("icons\\Play-1-Hot-icon.png");
        lblplay.setIcon(icon);
        }else{
        ImageIcon icon = new ImageIcon("icons\\Pause-Hot-icon.png");
        lblplay.setIcon(icon);
        }
        
    }//GEN-LAST:event_lblplayMouseEntered

    private void lblplayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblplayMouseExited
        if(play == false){
        ImageIcon icon = new ImageIcon("icons\\Play-1-Normal-icon.png");
        lblplay.setIcon(icon);
        }else{
        ImageIcon icon = new ImageIcon("icons\\Pause-Normal-icon.png");
        lblplay.setIcon(icon);
        }
    }//GEN-LAST:event_lblplayMouseExited

    private void lblplayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblplayMousePressed
        if(play == false){
        if(evt.getButton() == RIGHT_ALIGNMENT){
        ImageIcon icon = new ImageIcon("icons\\Play-1-Pressed-icon.png");
        lblplay.setIcon(icon);
        }
        }else{
            if(evt.getButton() == RIGHT_ALIGNMENT){
            ImageIcon icon = new ImageIcon("icons\\Pause-Pressed-icon.png");
            lblplay.setIcon(icon);
            }
        }
    }//GEN-LAST:event_lblplayMousePressed

    int time;
    public void timeCounting(){
       time = Integer.parseInt(lblsecond.getText());
        t3 = new Thread(){
            public void run(){
                for(;;){
                    try{
                        Thread.sleep(1000);
                    }catch(Exception e){}
                    time++;
                    lblsecond.setText(String.valueOf(time));
                }
            }
        };t3.start();
        
    }
    
    int speed;
    
    public void SpeedSet(){
        int[] sparray = {1000,900,800,700,600,500,400,300,200,100,97,95,93,90,86,84,83,82,80
        ,78,75,72,70,68,66,62,60,58,55,53,50,48,45,44,42,40,39,38,37,36,35,34,33,32,31,30,
        29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,75
        -1000,-950,-900,-880,-860,-840,-800,-780,-760,-720,-700,-690,-670,-730,-600,-500,
        -400,-300,-200,-100,-50,-40,-30,-20,-10,-9,-8,-7,-5};
        if(Setup.txtspeed.getText().equals("")){
            Setup.txtspeed.setText("0");
        }
        int sp = Integer.parseInt(Setup.txtspeed.getText());
        
        for(int i=0; i<sp; i++){
            speed = sparray[i];
        }
    }
    
    public static ArrayList<Integer> PlatoonArray = new <Integer>ArrayList();
    public static String tspeed = "";
    
    Thread closed;int clsd =0;
    public void close(){
        for(int i=0; i<PlatoonArray.size(); i++){
            PlatoonArray.remove(i);
        }for(int i=0; i<CarsSelectingArray.size(); i++){
            CarsSelectingArray.remove(i);
        }
        this.dispose();
    }
    public void closedPage(){
        clsd = 0;
        closed = new Thread(){
            public void run(){
                for(;;){
                    try{
                        Thread.sleep(1000);
                    }catch(Exception e){}
                    clsd++;
                    
                    if(clsd==1){
                        tmc.t3.stop();
                        if(Setup.Operation.equals("Joining")){
                        JOptionPane.showMessageDialog(null,"Cars Successfully Joined\nIn Platoon...?",
                                "Simulator Finish...?",JOptionPane.INFORMATION_MESSAGE);
                        Setup.joining = Double.parseDouble(lbltime.getText());
                        }else if(Setup.Operation.equals("Leaving")){
                        JOptionPane.showMessageDialog(null,"Cars Successfully Leaved\nFrom Platoon...?",
                                "Simulator Finish...?",JOptionPane.INFORMATION_MESSAGE);
                        Setup.leaving = Double.parseDouble(lbltime.getText());
                        }else if(Setup.Operation.equals("Multiple")){
                        JOptionPane.showMessageDialog(null,"Cars Successfully Joined And Leaved\n From Platoon...?",
                                "Simulator Finish...?",JOptionPane.INFORMATION_MESSAGE);
                        double fx = Double.parseDouble(lbltime.getText());
                        Setup.m_leaving = fx/2;
                        Setup.m_joining = fx/2;
                        }
                        
                        MultipleisDone = "";
                        c1r = "";
                        c2r = "";
                        Setup stp = new Setup();
                        stp.setVisible(true);
                        close();
                        closed.stop();
                    }
                }
            }
        };closed.start();
    }
    String SecondValue = "";
    
    public void divideArrayList(){
        if(lbljoining.getText().equals("Processing...?")||lblleaving.getText()
                .equals("Processing...?")){
        if(Setup.Operation.equals("Joining")){
            if(PlatoonArray.size() == 4){
                PlatoonArray.add(1,0);
                PlatoonArray.add(3,0);
            }
        }else if(Setup.Operation.equals("Leaving")){
            if(PlatoonArray.size() == 6){
                PlatoonArray.add(1,0);
                PlatoonArray.add(6,0);
            }
            
        }else if(Setup.Operation.equals("Multiple")){
            if(PlatoonArray.size() == 6){
                if(c7.getLocation().getY()==
                        pl1.getLocation().getY()){
                PlatoonArray.add(2,0);
                PlatoonArray.add(6,0);
                }else{
                PlatoonArray.add(2,0);
                PlatoonArray.add(5,0);
                }
            }
        }
        }
        
        if(Setup.Operation.equals("Joining")){
            if(CarsSelectingArray.size() == 0 && PlatoonArray.size()==8){
                PlatoonArray.remove(5);
                PlatoonArray.remove(2);
                closedPage();
            }
        }else if(Setup.Operation.equals("Leaving")){
            if(CarsSelectingArray.size()==2 && PlatoonArray.size() == 6){
                PlatoonArray.remove(4);
                PlatoonArray.remove(0);
                closedPage();
            }
        }else if(Setup.Operation.equals("Multiple")){
            if(CarsSelectingArray.size() == 1 && PlatoonArray.size() == 8){
                if(c2.getLocation().getY() == 65.0 && MultipleisDone.equals("")){
                    PlatoonArray.remove(5);
                    PlatoonArray.remove(1);
                }else if(MultipleisDone.equals("Finish")){
                    PlatoonArray.remove(6);
                    PlatoonArray.remove(3);
                    closedPage();
                }
            }
        }
    }
    
    //Maneuver Running Time Count Class
    TimeCount tmc = new TimeCount();
    //End of Maneuver Running Time Count Class
    
    //Light on off class
    Light_Processing lp = new Light_Processing();
    //Light on off class
    
    public void PlatoonSpeedControl(){
        if(lbljoining.getText().equals("Processing...?")||lbljoining.getText()
                .equals("Accepted...?")||lblleaving.getText().equals("Processing...?")||
                lblleaving.getText().equals("Accepted...?")){
            pl1location = pl1location-50;
            if(tspeed.equals("")){
                if(lbltime.getText().equals("0")){
                    tmc.timeCounting(lbltime);
                    tmc.t3.start();
                }
                tspeed = Setup.txtspeed.getText();
                lp.lightOn(lbllight);
            }
            Setup.txtspeed.setText("40");
        }else{
            if(!tspeed.equals("")){
                Setup.txtspeed.setText(tspeed);
                //tmc.t3.stop();
                tspeed = "";
                lp.ton.stop();
            }
        }
    }
    
    public void DataLocations(int d,double yy){
        
        if(d == 1){
            c1.setLocation((int)pl1location,(int)yy);
        }else if(d==2){
            c2.setLocation((int)pl1location,(int)yy);
        }else if(d==3){
            c3.setLocation((int)pl1location,(int)yy);
        }else if(d==4){
            c4.setLocation((int)pl1location,(int)yy);
        }else if(d==5){
            c5.setLocation((int)pl1location,(int)yy);
        }else if(d==6){
            c6.setLocation((int)pl1location,(int)yy);
        }else if(d==7){
            c7.setLocation((int)pl1location,(int)yy);
        }else if(d==0){
            pl1location = pl1location-50;
        }
    }
    
    double pl1location = 0.0;
    int setprocess = 0;
    
    public void RunPlatooning(){
        double x = pl1.getLocation().getX();
        double y = pl1.getLocation().getY();
        
        int s = this.getWidth();
        t = new Thread(){
            public void run(){
                for(double i=x; i<= s; i++){
                    SpeedSet();
                    try{
                        Thread.sleep(speed);
                        w = s;
                    }catch(Exception e){
                    System.out.println(e);
                    }
                    pl1.setLocation((int)i,(int)y);
                    PlatoonSpeedControl();
                    Iterator it = PlatoonArray.iterator();
                    pl1location = i;
                    while(it.hasNext()){
                        pl1location = pl1location-50;
                        int data = Integer.parseInt(it.next()+"");
                        DataLocations(data,y);
                    }divideArrayList();
                    
                    //PlatoonArrayData();
                    if(i == s){
                        i =0;
                    }
                }
            }
        };
        t.start();
    }
    
    public void JoiningPlay(){
        if(play == false){
            ImageIcon icon = new ImageIcon("icons\\Pause-Hot-icon.png");
            lblplay.setIcon(icon);
            this.RunPlatooning();
            timeCounting();
            SelectCars();
            
            play = true;
            }else{
            ImageIcon icon = new ImageIcon("icons\\Play-1-Hot-icon.png");
            lblplay.setIcon(icon);
            
            play = false;
            
        }
    }
    
    public void LeavingPlay(){
        if(play == false){
            ImageIcon icon = new ImageIcon("icons\\Pause-Hot-icon.png");
            lblplay.setIcon(icon);
            this.RunPlatooning();
            timeCounting();
            SelectCars();
            
            play = true;
            }else{
            ImageIcon icon = new ImageIcon("icons\\Play-1-Hot-icon.png");
            lblplay.setIcon(icon);
            
            play = false;
            
        }
    }
    
    public void MultiplePlay(){
        if(play == false){
            ImageIcon icon = new ImageIcon("icons\\Pause-Hot-icon.png");
            lblplay.setIcon(icon);
            this.RunPlatooning();
            timeCounting();
            SelectCars();
            
            play = true;
            }else{
            ImageIcon icon = new ImageIcon("icons\\Play-1-Hot-icon.png");
            lblplay.setIcon(icon);
            
            play = false;
            
        }
    }
    
    private void lblplayMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblplayMouseReleased
        if(evt.getButton() == RIGHT_ALIGNMENT){
        if(Setup.Operation.equals("Joining")){
            JoiningPlay();
        }else if(Setup.Operation.equals("Leaving")){
            LeavingPlay();
        }else if(Setup.Operation.equals("Multiple")){
            MultiplePlay();
        }
        }
    }//GEN-LAST:event_lblplayMouseReleased

    private void lblstopMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblstopMouseEntered
        ImageIcon icon = new ImageIcon("icons\\Stop-Hot-icon.png");
        lblstop.setIcon(icon);
    }//GEN-LAST:event_lblstopMouseEntered

    private void lblstopMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblstopMouseExited
        ImageIcon icon = new ImageIcon("icons\\Stop-Normal-icon.png");
        lblstop.setIcon(icon);
    }//GEN-LAST:event_lblstopMouseExited

    private void lblstopMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblstopMousePressed
        if(evt.getButton() == RIGHT_ALIGNMENT){
            ImageIcon icon = new ImageIcon("icons\\Stop-Pressed-icon.png");
            lblstop.setIcon(icon);
        }
    }//GEN-LAST:event_lblstopMousePressed

    
    public void setTiming(){
        int sec = Integer.parseInt(lblsecond.getText());
        int hour = sec / 3600;
        int min = (sec % 3600) / 60;
        int second = sec % 60;
        lbltime.setText(String.format("%02d : %02d : %02d", hour,min,second));
     
    }
    
    private void lblstopMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblstopMouseReleased
        if(evt.getButton() == RIGHT_ALIGNMENT){
            ImageIcon icon = new ImageIcon("icons\\Stop-Hot-icon.png");
            lblstop.setIcon(icon);
            /*t.stop();
            t3.stop();
            setTiming();
            play = false;
            ImageIcon iconplay = new ImageIcon("icons\\Play-1-Hot-icon.png");
            lblplay.setIcon(iconplay);
            double y = pl1.getLocation().getY();
            pl1.setLocation(10,(int)y);
            pressStopButton();
            PlatoonArray.clear();*/
            if(t != null){
            t.stop();
            }if(t3 != null){
            t3.stop();
            }if(t4 != null){
            t4.stop();
            }
            PlatoonArray.clear();
            CarsSelectingArray.clear();
            Setup.Operation = "";
            Setup s = new Setup();
            s.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_lblstopMouseReleased

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        if(t != null){
        t.stop();
        }if(t3 != null){
        t3.stop();
        }if(t4 != null){
        t4.stop();
        }
        PlatoonArray.clear();
        CarsSelectingArray.clear();
        Setup.Operation = "";
        
        System.out.println("Window is closed");
        
    }//GEN-LAST:event_formWindowClosed

    
    String strt = "";
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
            java.util.logging.Logger.getLogger(Main_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel c1;
    public static javax.swing.JLabel c2;
    public static javax.swing.JLabel c3;
    public static javax.swing.JLabel c4;
    public static javax.swing.JLabel c5;
    public static javax.swing.JLabel c6;
    public static javax.swing.JLabel c7;
    public static javax.swing.JLabel c8;
    public static javax.swing.JLabel c9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbljoining;
    private javax.swing.JLabel lblleaving;
    private javax.swing.JLabel lbllight;
    private javax.swing.JLabel lblplay;
    private javax.swing.JLabel lblresult;
    private javax.swing.JLabel lblrsu;
    private javax.swing.JLabel lblsecond;
    private javax.swing.JLabel lblstop;
    private javax.swing.JLabel lbltime;
    private javax.swing.JLabel pl1;
    // End of variables declaration//GEN-END:variables

    Thread t4;
    int sds = 0,set;
    public static int first = 5;
    public static int second = 6;
    public static String MultipleisDone = "";
    
    public void SelectCars(){
        sds = 0;c1r="";c2r="";
        first = 5;second = 6;
        t4 = new Thread(){
            public void run(){
                for(int i=0; i<18; i++){
                    try{
                        Thread.sleep(1000);
                    }catch(Exception e){
                    System.out.println(e);
                    }
                    if(i==3){
                            if(first > second){
                                    changeLocation(second);
                                    try{if(Setup.Operation.equals("Multiple")){
                                        Thread.sleep(10000);
                                    }else{
                                        Thread.sleep(1000);
                                    }
                                    }catch(Exception e){}
                                    changeLocation(first);
                                }else{
                                    changeLocation(first);
                                    try{
                                        if(Setup.Operation.equals("Multiple")){
                                        Thread.sleep(10000);
                                    }else{
                                        Thread.sleep(1000);
                                    }
                                    }catch(Exception e){}
                                    changeLocation(second);
                                }
                            jTable1.setModel(model);
                        i=0;
                        t4.stop();
                    }
                }
            }
        };t4.start();
    }
    
    
    Thread ct1;
    public static String c1r = "",c2r = "",c3r = "",c4r="";
    public static String joinProcessNo = "";
    
    public void changeLocation(int x){
            
        if(x == Integer.parseInt(c5.getText()) && c1r.equals("")){
            
            c1r = "set";
            if(Setup.Operation.equals("Joining")){
                C1Run.t.stop();
            ccp1.Permission(c5, pl1, this.getWidth(), lblresult,lblrsu ,speed,
                    lbljoining,lblleaving,lbllight);
            }else if(Setup.Operation.equals("Leaving")){
                ccp1.CarLeaving(c1, pl1, this.getWidth(), speed, lblresult, lblrsu, lblleaving);
            }else if(Setup.Operation.equals("Multiple")){
                ccp1.CarLeaving(c2, pl1, this.getWidth(), speed, lblresult, lblrsu, lblleaving);
                C1Run.t.stop();
            ccp1.Permission(c7, pl1, this.getWidth(), lblresult,lblrsu ,speed,
                    lbljoining,lblleaving,lbllight);
            }
            
        }else if(x == Integer.parseInt(c6.getText()) && c2r.equals("")){
            
            c2r = "set";
            if(Setup.Operation.equals("Joining")){
            C2Run.t.stop();
            ccp2.Permission(c6, pl1,this.getWidth(),lblresult, lblrsu, speed,
                    lbljoining, lblleaving,lbllight);
            }else if(Setup.Operation.equals("Leaving")){
                ccp2.CarLeaving(c5, pl1, this.getWidth(), speed, lblresult, lblrsu, lblleaving);
            }else if(Setup.Operation.equals("Multiple")){
               MultipleisDone = "Second";
               FirstJoin();
            }
            
        }
    }
    
    Thread fj;
    public void FirstJoin(){
        int w = this.getWidth();
        fj = new Thread(){
            public void run(){
                for(int j=0; j<10; j++){
                    try{
                        Thread.sleep(1000);
                    }catch(Exception e){}
                    if(j==2){
                        C1Run.t.stop();
                        ccp2.Permission(c2, pl1, w, lblresult,lblrsu ,speed,
                        lbljoining,lblleaving,lbllight);
                    }else if(j==3){
                        ccp2.CarLeaving(c5, pl1, w, speed, lblresult, lblrsu, lblleaving);
                        fj.stop();
                    }
                }
            }
        };fj.start();
    }
    
    public void pressPlayButton(){
        if(PlatoonArray.size() == 0){
            if(Setup.Operation.equals("Joining")){
            for(int i=1; i<Integer.parseInt(Setup.txtrange.getText())-2; i++){
                PlatoonArray.add(i);
            }
            }else if(Setup.Operation.equals("Leaving")){
            for(int i=1; i<Integer.parseInt(Setup.txtrange.getText()); i++){
                PlatoonArray.add(i);
            }
            }else if(Setup.Operation.equals("Multiple")){
                for(int i=1; i<Integer.parseInt(Setup.txtrange.getText()); i++){
                    PlatoonArray.add(i);
                }
            }
        }
    }
    
    
    public void pressStopButton(){
        c1r = "";
        tc1 = "";
        t4.stop();
        sds = 1;
        MultiCarsRunning();
    }
    
    
}
