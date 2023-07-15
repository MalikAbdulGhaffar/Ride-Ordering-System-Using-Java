package vehler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Ride {
    DbConnection conn = new DbConnection();
    PreparedStatement pst = null;
    ResultSet rst = null;
    public void updateRideStatus(String username,String rideStatus)
    {
        String matching=null;
        int mat=0;
        try{
            conn.OpenConnection();
            String sql="Select MAX(ID) AS ID FROM DriverCarRT where Username = '" + username + "'";
            
            rst= conn.GetData(sql);
            while(rst.next())
            {
                mat=rst.getInt("ID");
           
                }
       
        

        
        
            conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e+"\nCouldn't Select Last DriverCarId");  
        }
        String j=matching;
        try
        {
        DbConnection comm = new DbConnection();
        conn.OpenConnection();
        String sql = "UPDATE RideRealtime SET RideStatus = '"+ rideStatus +"' where ID = '"+mat+"'";
         int flagg=comm.InsertUpdateDelete(sql);
                 
           if(flagg==1){
               JOptionPane.showMessageDialog(null, "Ride Status Updated");
           }
      
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
                try
        {
        DbConnection comm = new DbConnection();
        conn.OpenConnection();
        String sql = "UPDATE DriverCarRT SET RideStatus = '"+ rideStatus +"' where ID = '"+mat+"'";
         int flagg=comm.InsertUpdateDelete(sql);
                 
           if(flagg==1){
              
           }
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
         
            
        }
        
    
    
    ////////////////////////////////////////////////////////////////////////////////////////////////
     public void updateRideStatusAC(String username,String rideStatus)
    {
        String matching=null;
        int mat=0;
        try{
            conn.OpenConnection();
            String sql="Select MAX(ID) AS ID FROM DriverCarACRT where Username = '" + username + "'";
            
            rst= conn.GetData(sql);
            while(rst.next())
            {
                mat=rst.getInt("ID");
//           matching=rst.getString("RideStatus");
           
                }
       
        

        
        
            conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e+"\nCouldn't Select Last DriverCarId");  
        }
        String j=matching;
//        if(matching.equals("Built")||matching.equals("AtPickup")||matching.equals("Running"))
//        {
           
             try
        {
        DbConnection comm = new DbConnection();
        conn.OpenConnection();
        String sql = "UPDATE RideRealtime SET RideStatus = '"+ rideStatus +"' where ID = '"+mat+"'";
         int flagg=comm.InsertUpdateDelete(sql);
                 
           if(flagg==1){
               JOptionPane.showMessageDialog(null, "Ride Status Updated");
           }
           else{
               JOptionPane.showMessageDialog(null, "a: Insertion Failed");
           }
      
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
                try
        {
        DbConnection comm = new DbConnection();
        conn.OpenConnection();
        String sql = "UPDATE DriverCarACRT SET RideStatus = '"+ rideStatus +"' where ID = '"+mat+"'";
         int flagg=comm.InsertUpdateDelete(sql);
                 
           if(flagg==1){
              
           }
      
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
         
            
        }
    //////////////////////////////////////////////////////////////////////////////////////////////
    
    
    
     ///////////////////////////////////////////////////////////////////////////////////////////////
      public void updateRideStatusPr(String username,String rideStatus)
    {
        String matching=null;
        int mat=0;
        try{
            conn.OpenConnection();
            String sql="Select MAX(ID) AS ID FROM DriverCarPremiumRT where Username = '" + username + "'";
            
            rst= conn.GetData(sql);
            while(rst.next())
            {
                mat=rst.getInt("ID");
//           matching=rst.getString("RideStatus");
           
                }
       
        

        
        
            conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e+"\nCouldn't Select Last DriverCarId");  
        }
        String j=matching;
//        if(matching.equals("Built")||matching.equals("AtPickup")||matching.equals("Running"))
//        {
           
             try
        {
        DbConnection comm = new DbConnection();
        conn.OpenConnection();
        String sql = "UPDATE RideRealtime SET RideStatus = '"+ rideStatus +"' where ID = '"+mat+"'";
         int flagg=comm.InsertUpdateDelete(sql);
                 
           if(flagg==1){
               JOptionPane.showMessageDialog(null, "Ride Status Updated");
           }
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
                try
        {
        DbConnection comm = new DbConnection();
        conn.OpenConnection();
        String sql = "UPDATE DriverCarPremiumRT SET RideStatus = '"+ rideStatus +"' where ID = '"+mat+"'";
         int flagg=comm.InsertUpdateDelete(sql);
                 
           if(flagg==1){
              
           }
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
         
            
        }
     /////////////////////////////////////////////////////////////////////////////////////////////
      
      
      /////////////////////////////////////////////////////////////////////////////////////////////////
      public void updateRideStatusBike(String username,String rideStatus)
    {
        String matching=null;
        int mat=0;
        try{
            conn.OpenConnection();
            String sql="Select MAX(ID) AS ID FROM DriverBikeRT where Username = '" + username + "'";
            
            rst= conn.GetData(sql);
            while(rst.next())
            {
                mat=rst.getInt("ID");
//           matching=rst.getString("RideStatus");
           
                }
       
        

        
        
            conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e+"\nCouldn't Select Last DriverCarId");  
        }
        String j=matching;
//        if(matching.equals("Built")||matching.equals("AtPickup")||matching.equals("Running"))
//        {
           
             try
        {
        DbConnection comm = new DbConnection();
        conn.OpenConnection();
        String sql = "UPDATE RideRealtime SET RideStatus = '"+ rideStatus +"' where ID = '"+mat+"'";
         int flagg=comm.InsertUpdateDelete(sql);
                 
           if(flagg==1){
               JOptionPane.showMessageDialog(null, "Ride Status Updated");
           }
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
                try
        {
        DbConnection comm = new DbConnection();
        conn.OpenConnection();
        String sql = "UPDATE DriverBikeRT SET RideStatus = '"+ rideStatus +"' where ID = '"+mat+"'";
         int flagg=comm.InsertUpdateDelete(sql);
                 
           if(flagg==1){
              
           }
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
         
            
        }
      ///////////////////////////////////////////////////////////////////////////////////////////////////
        
public void updateRideStatusRickshaw(String username,String rideStatus)
    {
        String matching=null;
        int mat=0;
        try{
            conn.OpenConnection();
            String sql="Select MAX(ID) AS ID FROM DriverRickshawRT where Username = '" + username + "'";
            
            rst= conn.GetData(sql);
            while(rst.next())
            {
                mat=rst.getInt("ID");

           
                }
       
        

        
        
            conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e+"\nCouldn't Select Last DriverCarId");  
        }
        String j=matching;
//        if(matching.equals("Built")||matching.equals("AtPickup")||matching.equals("Running"))
//        {
          
             try
        {
        DbConnection comm = new DbConnection();
        conn.OpenConnection();
        String sql = "UPDATE RideRealtime SET RideStatus = '"+ rideStatus +"' where ID = '"+mat+"'";
         int flagg=comm.InsertUpdateDelete(sql);
                 
           if(flagg==1){
               JOptionPane.showMessageDialog(null, "Ride Status Updated");
           }
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
                try
        {
        DbConnection comm = new DbConnection();
        conn.OpenConnection();
        String sql = "UPDATE DriverRickshawRT SET RideStatus = '"+ rideStatus +"' where ID = '"+mat+"'";
         int flagg=comm.InsertUpdateDelete(sql);
                 
           if(flagg==1){
             
           }
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
        
    }

public void updateStartTimeDateCar(String username,String date,String time)
{
     String matching=null;
        int mat=0;
        try{
            conn.OpenConnection();
            String sql="Select MAX(ID) AS ID FROM DriverCarRT where Username = '" + username + "'";
            
            rst= conn.GetData(sql);
            while(rst.next())
            {
                mat=rst.getInt("ID");
//           matching=rst.getString("RideStatus");
           
                }
       
        

        
        
            conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e+"\nCouldn't Select Last DriverCarId");  
        }
        String j=matching;
//        if(matching.equals("Built")||matching.equals("AtPickup")||matching.equals("Running"))
//        {
            
           
             try
        {
        DbConnection comm = new DbConnection();
        conn.OpenConnection();
        String sql = "UPDATE RideRealtime SET StartTime = '"+ time +"',Datee='"+date+"' where ID = '"+mat+"'";
         int flagg=comm.InsertUpdateDelete(sql);
                 
           if(flagg==1){
               JOptionPane.showMessageDialog(null, "Start Time/Date Updated");
           }
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
   try
        {
        DbConnection comm = new DbConnection();
        conn.OpenConnection();
        String sql = "UPDATE DriverCarRT SET StartTime = '"+ time +"',Datee='"+date+"' where ID = '"+mat+"'";
         int flagg=comm.InsertUpdateDelete(sql);
                 
           if(flagg==1){
               
           }
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
        
}

///////////////////////////////////////////////////////////////////////////////////////////
public void updateStartTimeDateCarAC(String username,String date,String time)
{
     String matching=null;
        int mat=0;
        try{
            conn.OpenConnection();
            String sql="Select MAX(ID) AS ID FROM DriverCarACRT where Username = '" + username + "'";
            
            rst= conn.GetData(sql);
            while(rst.next())
            {
                mat=rst.getInt("ID");
//           matching=rst.getString("RideStatus");
           
                }
       
        

        
        
            conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e+"\nCouldn't Select Last DriverCarId");  
        }
        String j=matching;
//        if(matching.equals("Built")||matching.equals("AtPickup")||matching.equals("Running"))
//        {
            
           
             try
        {
        DbConnection comm = new DbConnection();
        conn.OpenConnection();
        String sql = "UPDATE RideRealtime SET StartTime = '"+ time +"',Datee='"+date+"' where ID = '"+mat+"'";
         int flagg=comm.InsertUpdateDelete(sql);
                 
           if(flagg==1){
               JOptionPane.showMessageDialog(null, "Start Time/Date Updated");
           }
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
   try
        {
        DbConnection comm = new DbConnection();
        conn.OpenConnection();
        String sql = "UPDATE DriverCarACRT SET StartTime = '"+ time +"',Datee='"+date+"' where ID = '"+mat+"'";
         int flagg=comm.InsertUpdateDelete(sql);
                 
           if(flagg==1){
               
           }
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
        
}
///////////////////////////////////////////////////////////////////////////////////////////////
public void updateStartTimeDateCarPr(String username,String date,String time)
{
     String matching=null;
        int mat=0;
        try{
            conn.OpenConnection();
            String sql="Select MAX(ID) AS ID FROM DriverCarPremiumRT where Username = '" + username + "'";
            
            rst= conn.GetData(sql);
            while(rst.next())
            {
                mat=rst.getInt("ID");
//           matching=rst.getString("RideStatus");
           
                }
       
        

        
        
            conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e+"\nCouldn't Select Last DriverCarId");  
        }
        String j=matching;
//        if(matching.equals("Built")||matching.equals("AtPickup")||matching.equals("Running"))
//        {
            
           
             try
        {
        DbConnection comm = new DbConnection();
        conn.OpenConnection();
        String sql = "UPDATE RideRealtime SET StartTime = '"+ time +"',Datee='"+date+"' where ID = '"+mat+"'";
         int flagg=comm.InsertUpdateDelete(sql);
                 
           if(flagg==1){
               JOptionPane.showMessageDialog(null, "Start Time/Date Updated");
           }
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
   try
        {
        DbConnection comm = new DbConnection();
        conn.OpenConnection();
        String sql = "UPDATE DriverCarPremiumRT SET StartTime = '"+ time +"',Datee='"+date+"' where ID = '"+mat+"'";
         int flagg=comm.InsertUpdateDelete(sql);
                 
           if(flagg==1){
               
           }
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
        
}
////////////////////////////////////////////////////////////////////////////////////////////////
public void updateStartTimeDateBike(String username,String date,String time)
{
     String matching=null;
        int mat=0;
        try{
            conn.OpenConnection();
            String sql="Select MAX(ID) AS ID FROM DriverBikeRT where Username = '" + username + "'";
            
            rst= conn.GetData(sql);
            while(rst.next())
            {
                mat=rst.getInt("ID");
//           matching=rst.getString("RideStatus");
           
                }
       
        

        
        
            conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e+"\nCouldn't Select Last DriverCarId");  
        }
        String j=matching;
//        if(matching.equals("Built")||matching.equals("AtPickup")||matching.equals("Running"))
//        {
            
           
             try
        {
        DbConnection comm = new DbConnection();
        conn.OpenConnection();
        String sql = "UPDATE RideRealtime SET StartTime = '"+ time +"',Datee='"+date+"' where ID = '"+mat+"'";
         int flagg=comm.InsertUpdateDelete(sql);
                 
           if(flagg==1){
               JOptionPane.showMessageDialog(null, "Start Time/Date Updated");
           }
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
   try
        {
        DbConnection comm = new DbConnection();
        conn.OpenConnection();
        String sql = "UPDATE DriverBikeRT SET StartTime = '"+ time +"',Datee='"+date+"' where ID = '"+mat+"'";
         int flagg=comm.InsertUpdateDelete(sql);
                 
           if(flagg==1){
               
           }
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
        
}
/////////////////////////////////////////////////////////////////////////////////////////////
public void updateStartTimeDateRickshaw(String username,String date,String time)
{
     String matching=null;
        int mat=0;
        try{
            conn.OpenConnection();
            String sql="Select MAX(ID) AS ID FROM DriverRickshawRT where Username = '" + username + "'";
            
            rst= conn.GetData(sql);
            while(rst.next())
            {
                mat=rst.getInt("ID");
//           matching=rst.getString("RideStatus");
           
                }
       
        

        
        
            conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e+"\nCouldn't Select Last DriverCarId");  
        }
        String j=matching;
//        if(matching.equals("Built")||matching.equals("AtPickup")||matching.equals("Running"))
//        {
            
             try
        {
        DbConnection comm = new DbConnection();
        conn.OpenConnection();
        String sql = "UPDATE RideRealtime SET StartTime = '"+ time +"',Datee='"+date+"' where ID = '"+mat+"'";
         int flagg=comm.InsertUpdateDelete(sql);
                 
           if(flagg==1){
               JOptionPane.showMessageDialog(null, "Start Time/Date Updated");
           }
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
   try
        {
        DbConnection comm = new DbConnection();
        conn.OpenConnection();
        String sql = "UPDATE DriverRickshawRT SET StartTime = '"+ time +"',Datee='"+date+"' where ID = '"+mat+"'";
         int flagg=comm.InsertUpdateDelete(sql);
                 
           if(flagg==1){
         
           }
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
        
}

public void updateEndTimeDateCar(String username,String time)
{
     String matching=null;
        int mat=0;
        try{
            conn.OpenConnection();
            String sql="Select MAX(ID) AS ID FROM DriverCarRT where Username = '" + username + "'";
            
            rst= conn.GetData(sql);
            while(rst.next())
            {
                mat=rst.getInt("ID");
//           matching=rst.getString("RideStatus");
           
                }
       
        

        
        
            conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e+"\nCouldn't Select Last DriverCarId");  
        }
        String j=matching;
//        if(matching.equals("Built")||matching.equals("AtPickup")||matching.equals("Running"))
//        {
            
           
             try
        {
        DbConnection comm = new DbConnection();
        conn.OpenConnection();
        String sql = "UPDATE RideRealtime SET EndTime = '"+ time +"' where ID = '"+mat+"'";
         int flagg=comm.InsertUpdateDelete(sql);
                 
           if(flagg==1){
               JOptionPane.showMessageDialog(null, "End Time Updated ");
           }
      
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
   try
        {
        DbConnection comm = new DbConnection();
        conn.OpenConnection();
        String sql = "UPDATE DriverCarRT SET EndTime = '"+ time +"' where ID = '"+mat+"'";
         int flagg=comm.InsertUpdateDelete(sql);
                 
           if(flagg==1){
              
           }
      
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
        
}
public void updateEndTimeDateBus(String username,String time)
{

            
             try
        {
        DbConnection comm = new DbConnection();
        conn.OpenConnection();
        String sql = "UPDATE RideRealtime SET EndTime = '"+ time +"' where Username = '"+username+"'";
         int flagg=comm.InsertUpdateDelete(sql);
                 
           if(flagg==1){
               JOptionPane.showMessageDialog(null, "End Time Updated");
           }
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
          
}
public void updateEndTimeDateRickshaw(String username,String time)
{
     String matching=null;
        int mat=0;
        try{
            conn.OpenConnection();
            String sql="Select MAX(ID) AS ID FROM DriverRickshawRT where Username = '" + username + "'";
            
            rst= conn.GetData(sql);
            while(rst.next())
            {
                mat=rst.getInt("ID");
//           matching=rst.getString("RideStatus");
           
                }
       
        

        
        
            conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e+"\nCouldn't Select Last DriverCarId");  
        }
        String j=matching;
//        if(matching.equals("Built")||matching.equals("AtPickup")||matching.equals("Running"))
//        {
            
            
             try
        {
        DbConnection comm = new DbConnection();
        conn.OpenConnection();
        String sql = "UPDATE RideRealtime SET EndTime = '"+ time +"' where ID = '"+mat+"'";
         int flagg=comm.InsertUpdateDelete(sql);
                 
           if(flagg==1){
               JOptionPane.showMessageDialog(null, "End Time Updated ");
           }
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
   try
        {
        DbConnection comm = new DbConnection();
        conn.OpenConnection();
        String sql = "UPDATE DriverRickshawRT SET EndTime = '"+ time +"' where ID = '"+mat+"'";
         int flagg=comm.InsertUpdateDelete(sql);
                 
           if(flagg==1){
               
           }
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
        
}
 public void updateBillStatusCar(String username,String billStatus,int billCar)
    {
        String matching=null;
        int mat=0;
        try{
            conn.OpenConnection();
            String sql="Select MAX(ID) AS ID FROM DriverCarRT where Username = '" + username + "'";
            
            rst= conn.GetData(sql);
            while(rst.next())
            {
                mat=rst.getInt("ID");
//           matching=rst.getString("RideStatus");
           
                }
       
        

        
        
            conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e+"\nCouldn't Select Last DriverCarId");  
        }
        String j=matching;
//        if(matching.equals("Built")||matching.equals("AtPickup")||matching.equals("Running"))
//        {
            
           
             try
        {
        DbConnection comm = new DbConnection();
        conn.OpenConnection();
        String sql = "UPDATE RideRealtime SET BillStatus = '"+ billStatus +"',Bill = '"+billCar+"' where ID = '"+mat+"'";
         int flagg=comm.InsertUpdateDelete(sql);
                 
           if(flagg==1){
               JOptionPane.showMessageDialog(null, "Bill Status Updated ");
           }
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
                try
        {
        DbConnection comm = new DbConnection();
        conn.OpenConnection();
        String sql = "UPDATE DriverCarRT SET BillStatus = '"+ billStatus +"',Bill = '"+billCar+"' where ID = '"+mat+"'";
         int flagg=comm.InsertUpdateDelete(sql);
                 
           if(flagg==1){
             
           }
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
             
        }
 /////////////////////////////////////////////////////////////////////////////////////////////////////
 public void updateBillStatusCarAC(String username,String billStatus,int billCar)
    {
        String matching=null;
        int mat=0;
        try{
            conn.OpenConnection();
            String sql="Select MAX(ID) AS ID FROM DriverCarACRT where Username = '" + username + "'";
            
            rst= conn.GetData(sql);
            while(rst.next())
            {
                mat=rst.getInt("ID");
//           matching=rst.getString("RideStatus");
           
                }
       
        

        
        
            conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e+"\nCouldn't Select Last DriverCarId");  
        }
        String j=matching;
//        if(matching.equals("Built")||matching.equals("AtPickup")||matching.equals("Running"))
//        {
            
           
             try
        {
        DbConnection comm = new DbConnection();
        conn.OpenConnection();
        String sql = "UPDATE RideRealtime SET BillStatus = '"+ billStatus +"',Bill = '"+billCar+"' where ID = '"+mat+"'";
         int flagg=comm.InsertUpdateDelete(sql);
                 
           if(flagg==1){
               JOptionPane.showMessageDialog(null, "Bill Status Updated ");
           }
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
                try
        {
        DbConnection comm = new DbConnection();
        conn.OpenConnection();
        String sql = "UPDATE DriverCarACRT SET BillStatus = '"+ billStatus +"',Bill = '"+billCar+"' where ID = '"+mat+"'";
         int flagg=comm.InsertUpdateDelete(sql);
                 
           if(flagg==1){
             
           }
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
             
        }
 ////////////////////////////////////////////////////////////////////////////////////////////////////
 public void updateBillStatusCarPr(String username,String billStatus,int billCar)
    {
        String matching=null;
        int mat=0;
        try{
            conn.OpenConnection();
            String sql="Select MAX(ID) AS ID FROM DriverCarPremiumRT where Username = '" + username + "'";
            
            rst= conn.GetData(sql);
            while(rst.next())
            {
                mat=rst.getInt("ID");
//           matching=rst.getString("RideStatus");
           
                }
       
        

        
        
            conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e+"\nCouldn't Select Last DriverCarId");  
        }
        String j=matching;
//        if(matching.equals("Built")||matching.equals("AtPickup")||matching.equals("Running"))
//        {
            
           
             try
        {
        DbConnection comm = new DbConnection();
        conn.OpenConnection();
        String sql = "UPDATE RideRealtime SET BillStatus = '"+ billStatus +"',Bill = '"+billCar+"' where ID = '"+mat+"'";
         int flagg=comm.InsertUpdateDelete(sql);
                 
           if(flagg==1){
               JOptionPane.showMessageDialog(null, "Bill Status Updated ");
           }
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
                try
        {
        DbConnection comm = new DbConnection();
        conn.OpenConnection();
        String sql = "UPDATE DriverCarPremiumRT SET BillStatus = '"+ billStatus +"',Bill = '"+billCar+"' where ID = '"+mat+"'";
         int flagg=comm.InsertUpdateDelete(sql);
                 
           if(flagg==1){
             
           }
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
             
        }
 ///////////////////////////////////////////////////////////////////////////////////////////////////////
 
 public void updateBillStatusRickshaw(String username,String billStatus,int billRickshaw)
    {
        String matching=null;
        int mat=0;
        try{
            conn.OpenConnection();
            String sql="Select MAX(ID) AS ID FROM DriverRickshawRT where Username = '" + username + "'";
            
            rst= conn.GetData(sql);
            while(rst.next())
            {
                mat=rst.getInt("ID");
//           matching=rst.getString("RideStatus");
           
                }
       
        

        
        
            conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e+"\nCouldn't Select Last DriverCarId");  
        }
        String j=matching;
//        if(matching.equals("Built")||matching.equals("AtPickup")||matching.equals("Running"))
//        {
            
          
             try
        {
        DbConnection comm = new DbConnection();
        conn.OpenConnection();
        String sql = "UPDATE RideRealtime SET BillStatus = '"+ billStatus +"',Bill = '"+billRickshaw+"' where ID = '"+mat+"'";
         int flagg=comm.InsertUpdateDelete(sql);
                 
           if(flagg==1){
               JOptionPane.showMessageDialog(null, "Bill Status Updated ");
           }
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
                try
        {
        DbConnection comm = new DbConnection();
        conn.OpenConnection();
        String sql = "UPDATE DriverRickshawRT SET BillStatus = '"+ billStatus +"',Bill = '"+billRickshaw+"' where ID = '"+mat+"'";
         int flagg=comm.InsertUpdateDelete(sql);
                 
           if(flagg==1){
               
           }
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
             
        }
 //////////////////////////////////////////////////////////////////////////////////////////
 public void updateBillStatusBike(String username,String billStatus,int billCar)
    {
        String matching=null;
        int mat=0;
        try{
            conn.OpenConnection();
            String sql="Select MAX(ID) AS ID FROM DriverBikeRT where Username = '" + username + "'";
            
            rst= conn.GetData(sql);
            while(rst.next())
            {
                mat=rst.getInt("ID");
//           matching=rst.getString("RideStatus");
           
                }
       
        

        
        
            conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e+"\nCouldn't Select Last DriverCarId");  
        }
        String j=matching;
//        if(matching.equals("Built")||matching.equals("AtPickup")||matching.equals("Running"))
//        {
            
           
             try
        {
        DbConnection comm = new DbConnection();
        conn.OpenConnection();
        String sql = "UPDATE RideRealtime SET BillStatus = '"+ billStatus +"',Bill = '"+billCar+"' where ID = '"+mat+"'";
         int flagg=comm.InsertUpdateDelete(sql);
                 
           if(flagg==1){
               JOptionPane.showMessageDialog(null, "Bill Status Updated ");
           }
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
                try
        {
        DbConnection comm = new DbConnection();
        conn.OpenConnection();
        String sql = "UPDATE DriverBikeRT SET BillStatus = '"+ billStatus +"',Bill = '"+billCar+"' where ID = '"+mat+"'";
         int flagg=comm.InsertUpdateDelete(sql);
                 
           if(flagg==1){
             
           }
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
             
        }
 /////////////////////////////////////////////////////////////////////////////////////////
 public void updateBillStatusBus(String username,String billStatus,int billBus)
    {
         
            
            
             try
        {
        DbConnection comm = new DbConnection();
        conn.OpenConnection();
        String sql = "UPDATE RideRealtime SET BillStatus = '"+ billStatus +"',Bill = '"+billBus+"' where Username = '"+username+"'";
         int flagg=comm.InsertUpdateDelete(sql);
                 
           if(flagg==1){
               JOptionPane.showMessageDialog(null, "Bll Status UPDATED");
           }
           conn.CloseConnection();
          }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);  
        }
         
             
        }
 public ResultSet DriverRide(String username)
    {
        ResultSet rst1=null;
    
        
        try{
            conn.OpenConnection();
            String sql = "Select Datee,Username,VehiclePlate,PUsername,PassengerContactNo,Fromm,Too,StartTime,EndTime,RideStatus,BillStatus,Bill,NoOfPassengers from RideRealtime where Username ='"+username+"'";
            rst1= conn.GetData(sql);
                   do{
                return rst1;
            } 
            while(rst1.next());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e+"\nSelect DriverCarRT Error");
        }
          
        conn.CloseConnection();
        return null;
    }
 
}
