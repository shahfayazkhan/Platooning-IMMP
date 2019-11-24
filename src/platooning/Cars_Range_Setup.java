
package platooning;

import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Cars_Range_Setup {
    
    Thread t;
    
    public void RangeSetup(JLabel leader,JLabel c1){
        //int range = Integer.parseInt(Setup.txtrange.getText());
        double y = leader.getLocation().getY();
            c1.setLocation((int)leader.getLocation().getX(),(int)y);
            leader.setLocation((int)leader.getLocation().getX()+50,(int)y);
    }
    
    public void Others_Cars_Run(JLabel car, int s){
        double x = car.getLocation().getX();
        double y = car.getLocation().getY();
        
        t = new Thread(){
            public void run(){
                for(double i=x; i<= s; i++){
                    try{
                        Thread.sleep(10);
                    }catch(Exception e){
                    JOptionPane.showMessageDialog(null,e);
                    }
                    car.setLocation((int)i,(int)y);
                    if(i==s){
                        i=0;
                    }
                }
            }
        };t.start();
    }
    
    
}
