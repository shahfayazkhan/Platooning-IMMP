
package platooning;

import javax.swing.JLabel;

public class TimeCount {
    
    JLabel second;
    int time;
    public Thread t3;
    
    public void timeCounting(JLabel lblsecond){
        second = lblsecond;
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
        };
    }
    
}
