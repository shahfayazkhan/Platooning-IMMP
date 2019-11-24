
package platooning;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Change_Cars_Position {
    
    public Thread c1,t2,t3,c1lea;
    double cl1y,cl2x;
    JLabel l33,leav,lt;
    int tm,rsu,ch;
    String prcs = "Processing...?",Join = "",time,date;
    db_Data dbdata = new db_Data();
    Connection conn = null;
    PreparedStatement pst = null;
    
    public void TimeDate(){
        conn = db.connect();
        GregorianCalendar cldr = new GregorianCalendar();
        int sec = cldr.get(Calendar.SECOND);
        int min = cldr.get(Calendar.MINUTE);
        int hour = cldr.get(Calendar.HOUR);
        
        int day = cldr.get(Calendar.DAY_OF_MONTH);
        int month = cldr.get(Calendar.MONTH);
        month = month+1;
        int year = cldr.get(Calendar.YEAR);
        time = String.format("%02d:%02d:%02d", hour,min,sec);
        date = String.format("%02d/%02d/%02d", day,month,year);
        
    } 
    
    public void speedControl(JLabel l1,JLabel l2,int spd,int s){
        double x = l1.getLocation().getX();
        double y = l1.getLocation().getY();
        t3 = new Thread(){
            public void run(){
                for(double i=x;i<=s;i++){
                    try{
                        Thread.sleep(spd);
                    }catch(Exception e){}
                    if(Setup.Operation.equals("Multiple")){
                    l1.setLocation((int)l2.getLocation().getX()-250,(int)y);
                    }else{
                    l1.setLocation((int)l2.getLocation().getX(),(int)y);
                    }
                    if(i==s){
                        i=0;
                    }
                }
            }
        };t3.start();
    }
    
    
    public void Permission(JLabel l1,JLabel l2,int w,JLabel l3,JLabel l4,int spd,
            JLabel proc,JLabel lv,JLabel light){
        l3.setText("<html><br>RSU Is Processing...?<br>"
                + "Car is Trying To Joining the Platoon<br>"
                + "Vehical_ID : "+l1.getText()+"<br>"
                        + "Please Wait...?</html>");
        
        speedControl(l1,l2,spd,w);
        proc.setText(prcs);
        tm = 0;
        
        t2 = new Thread(){
            public void run(){
                for(;;){
        try{
            Thread.sleep(1000);
            tm++;
            if(tm==1){
            l3.setText("<html><br>RSU : Set Optimal Split<br>"
                + "Split After : 2<br></html>");
            }
            if(tm==2){
                if(Integer.parseInt(l4.getText()) < Integer.parseInt(Setup.txtrange.getText())){
                l3.setText("<html><br>Car Successfully Connected to RSU<br>"
                + "Vehical_ID : "+l1.getText()+"<br>"
                + "Thank you For using Platooning...?<br></html>");
                rsu = Integer.parseInt(l4.getText());
                rsu = rsu+1;
                l4.setText(String.valueOf(rsu));
                proc.setText("Accepted...?");
                C1Position(l1,l2,w,spd,proc,l4,light);
                }else{
                    l3.setText("<html><br>Car Connection Failed to RSU<br>"
                + "Vehical_ID : "+l1.getText()+"<br>The Platooning Length Is Full...?<br>"
                + "Thank you For using Platooning...?<br></html>");
                    proc.setText("Failed...?");
                    
                    TimeDate();
                        Main_Form.model.addRow(new Object[]{l1.getText(),"P",
                        l4.getText(),"2",l1.getText(),l1.getLocation().getX()
                        ,Setup.txtspeed.getText(),Setup.txtspeed.getText(),
                        Setup.txtspeed.getText(),"Joining","Failed",time,date});
                        
                        dbdata.InsertData("Joining", conn, "P", l4.getText(),
                                "2", l1.getText(), l1.getLocation().getX(),
                                Setup.txtspeed.getText(), Setup.txtspeed.getText(),
                                Setup.txtspeed.getText(), "Joining", "Failed", time, date);
                        
                    
                    
                    //Main_Form.C1Run.addC1(l1,l2, w, spd,l4);
                    
                }
                t3.stop();
                t2.stop();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
                }
            }
        };t2.start();
    }
    
    public void C1Position(JLabel l1,JLabel l2,int w,int spd,JLabel proc,JLabel l4,
            JLabel lt){
        
        double cl1x = l1.getLocation().getX();
        cl1y = l1.getLocation().getY();
        double cl2y = l2.getLocation().getY();
        cl2x = l2.getLocation().getX();
        
        c1 = new Thread(){
            public void run(){
                for(;;){
                    try{
                        Thread.sleep(spd);
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null,e);
                    }
                    
                    l1.setLocation((int)cl1x,(int)cl1y--);
                    
                    if(cl2y == l1.getLocation().getY()){
                        
                        TimeDate();
                        Main_Form.model.addRow(new Object[]{l1.getText(),"P",
                        l4.getText(),"2",l1.getText(),l1.getLocation().getX()
                        ,Main_Form.tspeed,Setup.txtspeed.getText(),
                        Setup.txtspeed.getText(),"Joining","Accepted",time,date});
                        
                        dbdata.InsertData("Joining", conn, "P", l4.getText(),
                                "2", l1.getText(), l1.getLocation().getX(),
                                Main_Form.tspeed, Setup.txtspeed.getText(),
                                Setup.txtspeed.getText(), "Joining", "Accepted", time, date);
                        
                        l1.setLocation((int)cl2x,(int)l2.getLocation().getY());
                        
                        //Main_Form.PlatoonArray.add(l1.getText());
                        JoinArray(l1);
                        //Main_Form.C1Run.addC1(l1,l2, w, spd,l4);
                        proc.setText("Waiting...?");
                        lt.setIcon(new ImageIcon("icons//Blue Rsu.png"));
                        //Main_Form.C1Run.t.stop();
                        
                        c1.stop();
                    }
                }
            }
        };c1.start();
    }
    
    public void JoinArray(JLabel l1){
        if(Setup.Operation.equals("Multiple")){
        Main_Form.PlatoonArray.add(4,Integer.parseInt(l1.getText()));
        System.out.println("Platoon Array Entered : "+l1.getText());
        }else{
        Main_Form.PlatoonArray.add(1, Integer.parseInt(l1.getText()));
        }int del = Main_Form.CarsSelectingArray.indexOf(Integer.parseInt(l1.getText()));
        if(del != -1){
        Main_Form.CarsSelectingArray.remove(del);
        System.out.println(del+" Removed");
        }
    }
    
    
    //this is for leaving car 1 after one minute
    public void CarLeaving(JLabel l1,JLabel l2,int w,int spd,JLabel l3,JLabel l4,
            JLabel lv){
        l3.setText("<html><br>RSU Is Processing...?<br>"
                + "Car is Trying To Leaving Platooning<br>"
                + "Vehical_ID : "+l1.getText()+"<br>"
                        + "Please Wait...?</html>");
                lv.setText(prcs);
                rsu = Integer.parseInt(l4.getText());
                rsu = rsu-1;
                l4.setText(String.valueOf(rsu));
                //Main_Form.C1Run.t.stop();
                try{
                    Thread.sleep(2000);
                }catch(Exception e){}
                C1PositionLeaving(l1,l2,w,spd,lv,l3,l4);
        
        
    }
    
    double cl11y;
    public void C1PositionLeaving(JLabel l1,JLabel l2,int w,int spd,JLabel lv,JLabel l3
            ,JLabel l4){
        double cl1x = l1.getLocation().getX();
        cl11y = l1.getLocation().getY();
        lv.setText("Accepted...?");
        c1lea = new Thread(){
            public void run(){
                for(;;){
                    try{
                        Thread.sleep(spd);
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null,e);
                    }
                    
                    l1.setLocation((int)cl1x,(int)cl11y++);
                    if(cl11y > 65.0){
                        //l1.setLocation((int)l1.getLocation().getX(),(int)65.0);
                        cl11y = 60;
                    }if(cl11y == 65.0){
                        
                        TimeDate();
                        Main_Form.model.addRow(new Object[]{l1.getText(),"P",
                        l4.getText(),"2",l1.getText(),l1.getLocation().getX()
                        ,Main_Form.tspeed,Setup.txtspeed.getText(),
                        Setup.txtspeed.getText(),"Leaving","Accepted",time,date});
                        
                        dbdata.InsertData("Joining", conn, "P", l4.getText(),
                                "2", l1.getText(), l1.getLocation().getX(),
                                Main_Form.tspeed, Setup.txtspeed.getText(),
                                Setup.txtspeed.getText(), "Leaving", "Accepted", time, date);
                        
                        l1.setLocation((int)cl1x,(int)65.0);
                        Main_Form.c1r = "";
                        RemovePlatoonArray(l1);
                        Main_Form.C1Run.addC1(l1,l2, w, 10);
                        lv.setText("Waiting...?");
                        l3.setText("<html><br>RSU Processing Done...?<br>"
                        + "Car Successfully Leaved From Platooning<br>"
                        + "Vehical_ID : "+l1.getText()+"<br>"
                        + "Thank You For Using Platoon...?</html>");
                        
                        
                        c1lea.stop();
                    }
                }
            }
        };c1lea.start();
    }
    public void RemovePlatoonArray(JLabel l1){
        int it = Main_Form.PlatoonArray.indexOf(Integer.parseInt(l1.getText()));
        if(it == -1){
            System.out.println("Not Found in PlatoonArray : "+l1.getText());
            
        }else{
            Main_Form.PlatoonArray.remove(it);
            System.out.println("Removed From Platoon Array : "+l1.getText());
        }
        Main_Form.CarsSelectingArray.add(Integer.parseInt(l1.getText()));
    }
    
}
