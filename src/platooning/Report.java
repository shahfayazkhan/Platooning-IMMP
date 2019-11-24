
package platooning;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Report {
    
    double joining = 0.00;
    double leaving = 0.00;
    double multiple_Leave = 0.00;
    double multiple_Join = 0.00;
    
    public void getReport(double join, double leave, double mjoin, double mleave,JTextField name){
        joining = join;
        leaving = leave;
        multiple_Leave = mleave;
        multiple_Join = mjoin;
        
        DefaultCategoryDataset dcds = new DefaultCategoryDataset();
        
        if(joining != 0){
        dcds.setValue(joining, name.getText(), "Joining");
        }
        if(leaving != 0){
            dcds.setValue(leaving, name.getText(), "Leaving");
        }
        if(multiple_Leave != 0){
            dcds.setValue(multiple_Leave, name.getText(), "Leave&Join Case-1");
        }
        if(multiple_Join != 0){
            dcds.setValue(multiple_Join, name.getText(), "Leave&Join Case-2");
        }
        
        JFreeChart chart = ChartFactory.createBarChart(
                "", "",
                "Duration(s)", dcds,PlotOrientation.VERTICAL,true,true,false);
        
        CategoryPlot plot = chart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.black);
        
        ChartFrame frame = new ChartFrame("",chart,true);
        
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setSize(800,600);
        
        
    }
    
}
