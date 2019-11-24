
package platooning;

import javax.swing.JLabel;

public class SetRsuValues {
    
    JLabel rsu;
    public SetRsuValues(JLabel rsu, String o){
        this.rsu = rsu;
        
        if(o.equals("Joining")){
            rsu.setText("5");
        }else if(o.equals("Leaving")){
            rsu.setText("7");
        }else if(o.equals("Multiple")){
            rsu.setText("7");
        }
    }
    
}
