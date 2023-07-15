/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehler;

/**
 *
 * @author user
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class CarAC extends Vehicle{
    private String carName;
    private int totalCars;
    PreparedStatement pst = null;
    ResultSet rst = null;
    CarAC()
    {
        
    }
    CarAC(String Model,String Version,String Color,String plateNo,String registrationDate,String expirationDate, String carName)
    {
        super(Model,Version,Color,plateNo,registrationDate,expirationDate);
        this.carName=carName;
        
    }
    CarAC(int totalCars)
    {
        this.totalCars=totalCars;
    }
    public void addCar()
    {
        
        try
        {
        DbConnection conn = new DbConnection();
        conn.OpenConnection();
        String sql="Insert into CarACT (Model,Version,Color,PlateNo,RegistrationDate,ExpirationDate,CarName) values ' "
                    + super.getModel()+ "','"
                    + super.getVersion()+ "','"
                    + super.getColor()+ "','"
                    + super.getPlateNo()+ "','"
                    + super.getregistrationDate()+ "','"
                    + super.getExpirationDate()+ "','"
                    + getCarName()+ "'"; 
        int flag=conn.InsertUpdateDelete(sql);
                 
           if(flag==1){
               JOptionPane.showMessageDialog(null, "You Have Successfully Added "+getCarName()+" "+super.getModel());
           }
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
    }
    public int assignCar()
    {
        
        
        int newAss=1;
        int ass=5;
        int i=1;
        int total=0;
               try
        {
        DbConnection conn = new DbConnection();
        conn.OpenConnection();
        String sql="SELECT TOP 1 CarId FROM CarACT ORDER BY CarId DESC"; 
        rst= conn.GetData(sql);      
          
         while(rst.next()){
           total=rst.getInt("CarId");
           
                }
       
        
//           conn.CloseConnection();
        
        
            conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e+"\nCouldn't Select Last CarId");  
        }
        total=total+1;
        while(i<total)
        { 
            
               try
        {
        DbConnection conn = new DbConnection();
        conn.OpenConnection();
        String sql="Select Assigned from CarACT where CarId = '"+ i + "'"; 
        rst= conn.GetData(sql);      
          
         while(rst.next()){
           ass=rst.getInt("Assigned");
           
                }
       
        
//           conn.CloseConnection();
        
        
            conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e+"\nCheck Car ID Error");  
        }
    
               
        
               
               
               if(ass==0)
               {
                   break;
               }
           
               i++;
        }
        DbConnection conn = new DbConnection();
        int flag;
        try{
        conn.OpenConnection();
        String sql = "UPDATE CarACT SET Assigned = '"+ newAss +"' where CarId = '"+i+ "'";
       
        flag = conn.InsertUpdateDelete(sql);
           if(flag == 1){
               JOptionPane.showMessageDialog(null, "Car's Availablity Updated ");
           }
           else{
                JOptionPane.showMessageDialog(null, "Car's Availability COuldn't Be Updated " );
           }
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null, "UpdateBill Query Failed");
        }
        return i;
               
    }
    
    public String getCarName()
    {
        return carName;
    }
    public String getRModel(int id)
    {
        String ass=null;
        try
        {
        DbConnection conn = new DbConnection();
        conn.OpenConnection();
        String sql="Select Model from CarACT where CarId = '"+ id + "'";
        rst= conn.GetData(sql);      
          
         while(rst.next()){
            ass=rst.getString("Model");
           
                }
       
        
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e+"\nCheck Car ID Error");  
        }
        return ass;
    }
    public String getRVersion(int id)
    {
        String ass=null;
        try
        {
        DbConnection conn = new DbConnection();
        conn.OpenConnection();
        String sql="Select Version from CarACT where CarId = '"+ id + "'";
        rst= conn.GetData(sql);      
          
         while(rst.next()){
            ass=rst.getString("Version");
           
                }
       
        
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e+"\nCheck Car ID Error");  
        }
        return ass;
    }
    public String getRColor(int id)
    {
        String ass=null;
        try
        {
        DbConnection conn = new DbConnection();
        conn.OpenConnection();
        String sql="Select Color from CarACT where CarId = '"+ id + "'";
        rst= conn.GetData(sql);      
          
         while(rst.next()){
            ass=rst.getString("Color");
           
                }
       
        
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e+"\nCheck Car ID Error");  
        }
        return ass;
    }
    public String getRPlateNo(int id)
    {
        String ass=null;
        try
        {
        DbConnection conn = new DbConnection();
        conn.OpenConnection();
        String sql="Select PlateNo from CarACT where CarId = '"+ id + "'";
        rst= conn.GetData(sql);      
          
         while(rst.next()){
            ass=rst.getString("PlateNo");
           
                }
       
        
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e+"\nCheck Car ID Error");  
        }
        return ass;
    }
    public String getRRDate(int id)
    {
        String ass=null;
        try
        {
        DbConnection conn = new DbConnection();
        conn.OpenConnection();
        String sql="Select RegistrationDate from CarACT where CarId = '"+ id + "'";
        rst= conn.GetData(sql);      
          
         while(rst.next()){
            ass=rst.getString("RegistrationDate");
           
                }
       
        
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e+"\nCheck Car ID Error");  
        }
        return ass;
    }
    public String getEDate(int id)
    {
        String ass=null;
        try
        {
        DbConnection conn = new DbConnection();
        conn.OpenConnection();
        String sql="Select ExpirationDate from CarACT where CarId = '"+ id + "'";
        rst= conn.GetData(sql);      
          
         while(rst.next()){
            ass=rst.getString("ExpirationDate");
           
                }
       
        
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e+"\nCheck Car ID Error");  
        }
        return ass;
    }
    public String getCarName(int id)
    {
        String ass=null;
        try
        {
        DbConnection conn = new DbConnection();
        conn.OpenConnection();
        String sql="Select CarName from CarACT where CarId = '"+ id + "'";
        rst= conn.GetData(sql);      
          
         while(rst.next()){
            ass=rst.getString("CarName");
           
                }
       
        
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e+"\nCheck Car ID Error");  
        }
        return ass;
    }
    public void deleteCar(int id )
     {
     
    
     
     try
        {
        DbConnection con = new DbConnection();
        con.OpenConnection();
        String sql = "DELETE from CarACT WHERE CarId = '"+id+"'";
        
         
        int flagg=con.InsertUpdateDelete(sql);
                 
           if(flagg==1){
               JOptionPane.showMessageDialog(null, "Car Deleted");
           }
           else{
               JOptionPane.showMessageDialog(null, "Please Enter A Valid CarId");
           }
           con.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
     }
     public ResultSet getCarsData()
     {
         DbConnection conn = new DbConnection();
        try{
            conn.OpenConnection();
            String select_sql = "Select CarId,Model,PlateNo,CarName from CarACT ";
            rst=conn.GetData(select_sql);
            do{
                return rst;
            } while(rst.next());
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "GetCarData Query Failed");
        }
        conn.CloseConnection();
        return null;
         
     }
}
