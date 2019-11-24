
package platooning;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class C1_Running {
    
    Thread t;
    double l2d,cl2x,cl1xx,i;
    
    public void addC1(JLabel l1,JLabel l2,int s,int spd){
        double x = l1.getLocation().getX();
        double y = l1.getLocation().getY();
        
        t = new Thread(){
            public void run(){
                for(i=x; i<= s; i++){
                    try{
                        Thread.sleep(spd);
                    }catch(Exception e){
                    JOptionPane.showMessageDialog(null,e);
                    }
                    l1.setLocation((int)i,(int)y);
                    if(i==s){
                        i=0;
                    }if(l1.getLocation().getY() == l2.getLocation().getY()){
                        
                        cl2x = l2.getLocation().getX()-50;
                        cl1xx = l1.getLocation().getX();
                       
                    }
                }
            }
        };t.start();
    }
    
    public void PC2(JLabel l2,JLabel l4){
        if(Integer.parseInt(l4.getText()) == 2){
            if(cl1xx >= cl2x && cl1xx < l2.getLocation().getX()){
                i = i-5;
                }else if(cl1xx <= cl2x-10){
                i = cl2x;
                }
            }else if(Integer.parseInt(l4.getText()) == 3){
                cl2x = cl2x-50;
                if(cl1xx >= cl2x && cl1xx < l2.getLocation().getX()){
                i = i-5;
                }else if(cl1xx <= cl2x-10){
                i = cl2x;
                }
            }else if(Integer.parseInt(l4.getText()) == 4){
                cl2x = l2.getLocation().getX()-150;
                if(cl1xx >= cl2x && cl1xx < l2.getLocation().getX()){
                i = i-5;
                }else if(cl1xx <= cl2x-10){
                i = cl2x;
                }
            }else if(Integer.parseInt(l4.getText()) == 5){
                cl2x = l2.getLocation().getX()-200;
                if(cl1xx >= cl2x && cl1xx < l2.getLocation().getX()){
                i = i-5;
                }else if(cl1xx <= cl2x-10){
                i = cl2x;
                }
            }else if(Integer.parseInt(l4.getText())== 6){
                cl2x = l2.getLocation().getX()-250;
                if(cl1xx >= cl2x && cl1xx < l2.getLocation().getX()){
                i = i-5;
                }else if(cl1xx <= cl2x-10){
                i = cl2x;
                }
            }else if(Integer.parseInt(l4.getText()) == 7){
                cl2x = l2.getLocation().getX()-300;
                if(cl1xx >= cl2x && cl1xx < l2.getLocation().getX()){
                i = i-5;
                }else if(cl1xx <= cl2x-10){
                i = cl2x;
                }
            }
    }
    
    public void PC3(JLabel l2,JLabel l4){
        if(Integer.parseInt(l4.getText()) == 3 || Integer.parseInt(l4.getText()) == 2){
            if(cl1xx >= cl2x && cl1xx < l2.getLocation().getX()){
                i = i-5;
                }else if(cl1xx <= cl2x-10){
                i = cl2x;
                }
            }else if(Integer.parseInt(l4.getText()) == 4){
                cl2x = cl2x-50;
                if(cl1xx >= cl2x && cl1xx < l2.getLocation().getX()){
                i = i-5;
                }else if(cl1xx <= cl2x-10){
                i = cl2x;
                }
            }
    }
    
    public void PC4(JLabel l2,JLabel l4){
        if(Integer.parseInt(l4.getText()) == 3 ||
                Integer.parseInt(l4.getText()) == 2 || Integer.parseInt(l4.getText())==4){
            if(cl1xx >= cl2x && cl1xx < l2.getLocation().getX()){
                i = i-5;
                }else if(cl1xx <= cl2x-10){
                i = cl2x;
                }
            }
    }
    
    public void PC5(JLabel l2,JLabel l4){
        if(Integer.parseInt(l4.getText()) == 2 || Integer.parseInt(l4.getText())==3){
            if(cl1xx >= cl2x && cl1xx < l2.getLocation().getX()){
                i = i-5;
                }else if(cl1xx <= cl2x-10){
                i = cl2x;
                }
            }else if(Integer.parseInt(l4.getText()) == 4){
                cl2x = l2.getLocation().getX()-150;
                if(cl1xx >= cl2x && cl1xx < l2.getLocation().getX()){
                i = i-5;
                }else if(cl1xx <= cl2x-10){
                i = cl2x;
                }
            }else if(Integer.parseInt(l4.getText()) == 5){
                cl2x = l2.getLocation().getX()-200;
                if(cl1xx >= cl2x && cl1xx < l2.getLocation().getX()){
                i = i-5;
                }else if(cl1xx <= cl2x-10){
                i = cl2x;
                }
            }else if(Integer.parseInt(l4.getText()) == 6){
                cl2x = l2.getLocation().getX()-250;
                if(cl1xx >= cl2x && cl1xx < l2.getLocation().getX()){
                i = i-5;
                }else if(cl1xx <= cl2x-10){
                i = cl2x;
                }
            }
    }
    
    public void PC6(JLabel l2,JLabel l4){
        if(Integer.parseInt(l4.getText()) == 2 || Integer.parseInt(l4.getText())==3){
            if(cl1xx >= cl2x && cl1xx < l2.getLocation().getX()){
                i = i-5;
                }else if(cl1xx <= cl2x-10){
                i = cl2x;
                }
            }else if(Integer.parseInt(l4.getText()) == 4){
                cl2x = l2.getLocation().getX()-100;
                if(cl1xx >= cl2x && cl1xx < l2.getLocation().getX()){
                i = i-5;
                }else if(cl1xx <= cl2x-10){
                i = cl2x;
                }
            }else if(Integer.parseInt(l4.getText()) == 5){
                cl2x = l2.getLocation().getX()-150;
                if(cl1xx >= cl2x && cl1xx < l2.getLocation().getX()){
                i = i-5;
                }else if(cl1xx <= cl2x-10){
                i = cl2x;
                }
            }else if(Integer.parseInt(l4.getText()) == 6){
                cl2x = l2.getLocation().getX()-200;
                if(cl1xx >= cl2x && cl1xx < l2.getLocation().getX()){
                i = i-5;
                }else if(cl1xx <= cl2x-10){
                i = cl2x;
                }
            }
    }
    
    public void PC7(JLabel l2,JLabel l4){
        if(Integer.parseInt(l4.getText()) == 2 || Integer.parseInt(l4.getText())==3){
            if(cl1xx >= cl2x && cl1xx < l2.getLocation().getX()){
                i = i-5;
                }else if(cl1xx <= cl2x-10){
                i = cl2x;
                }
            }else if(Integer.parseInt(l4.getText()) == 4){
                cl2x = l2.getLocation().getX()-100;
                if(cl1xx >= cl2x && cl1xx < l2.getLocation().getX()){
                i = i-5;
                }else if(cl1xx <= cl2x-10){
                i = cl2x;
                }
            }else if(Integer.parseInt(l4.getText()) == 5){
                cl2x = l2.getLocation().getX()-150;
                if(cl1xx >= cl2x && cl1xx < l2.getLocation().getX()){
                i = i-5;
                }else if(cl1xx <= cl2x-10){
                i = cl2x;
                }
            }else if(Integer.parseInt(l4.getText()) == 6){
                cl2x = l2.getLocation().getX()-200;
                if(cl1xx >= cl2x && cl1xx < l2.getLocation().getX()){
                i = i-5;
                }else if(cl1xx <= cl2x-10){
                i = cl2x;
                }
            }else if(Integer.parseInt(l4.getText()) == 7){
                cl2x = l2.getLocation().getX()-250;
                if(cl1xx >= cl2x && cl1xx < l2.getLocation().getX()){
                i = i-5;
                }else if(cl1xx <= cl2x-10){
                i = cl2x;
                }
            }
    }
    
}
