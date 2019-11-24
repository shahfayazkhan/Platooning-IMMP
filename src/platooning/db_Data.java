
package platooning;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

public class db_Data {
    
    public void joining(Connection conn,ResultSet rs,PreparedStatement pst,JTable table){
        try{
            String sql = "select * from Joining";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
            rs.close();
            pst.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){}
        }
    }
    
    public void InsertData(String tbl,Connection conn,
            String pname,String prange,String pdepth,String vid,double vgps,String vspeed,
            String vaccele,String vmaxdece,String req,String approv,String time,String date){
            PreparedStatement pst = null;
        try{
            String sql = "insert into "+tbl+" (P_Name,P_Range,P_Depth,V_ID,V_GPS,V_Speed,"
                    + "V_Acceleration,V_Max_Dece,Requests,Approval,Time,Date)"
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, pname);
            pst.setString(2, prange);
            pst.setString(3, pdepth);
            pst.setString(4, vid);
            pst.setString(5, String.valueOf(vgps));
            pst.setString(6, vspeed);
            pst.setString(7, vaccele);
            pst.setString(8, vmaxdece);
            pst.setString(9, req);
            pst.setString(10, approv);
            pst.setString(11, time);
            pst.setString(12, date);
            pst.execute();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
}
