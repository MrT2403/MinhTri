
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A.TUAN
 */
public class DoctorModify {
    public static List<Doctor> findAll(){
        DBconnect db = new DBconnect();
        List<Doctor> doctors = new ArrayList<>();
        Connection  conn = null;
        Statement state = null;
     
       
        try {
            conn =  db.getConnection();
            String sql = "Select*from Doctor";
            state = conn.createStatement();
            ResultSet resultSet = state.executeQuery(sql);
            while(resultSet.next()){
                Doctor dr = new Doctor(resultSet.getString("DoctorID"), 
                        resultSet.getString("Name"), resultSet.getString("Department"),
                        resultSet.getString("VisitTiming"), resultSet.getString("Days"));
                doctors.add(dr);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(viewDoctor.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(state != null)
                try {
                    state.close();
            } catch (SQLException ex) {
                Logger.getLogger(viewDoctor.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(conn!= null){
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(viewDoctor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
           
        
    }
        return doctors;
 }
}
    

