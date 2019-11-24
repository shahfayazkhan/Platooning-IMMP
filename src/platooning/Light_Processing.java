package platooning;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Light_Processing{
    public Thread ton;
    int x;
        public void lightOn(JLabel img){
            x=0;
            ton = new Thread(){
                public void run(){
                    for(;;){
                    try{
                        x++;
                        if(x%2 == 0){
                    ImageIcon icon = new ImageIcon("icons//Red Rsu.png");
                    img.setIcon(icon);
                    }else{
                    ImageIcon icon = new ImageIcon("icons//Blue Rsu.png");
                    img.setIcon(icon);    
                    }
                        Thread.sleep(200);
                    }catch(Exception e){
                    System.out.println(e);
                    }
                    
                    }
                }
            };ton.start();
        }
    
}
