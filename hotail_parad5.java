
package hotail;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HOTAIL {




    
    public static void main(String[] args) {
        
        String dburl="jdbc:derby://localhost:1527/HOTAIL";
        String username="Owner";
        String pass="password5";
        Boolean is_employee=null; //gt vazeis timi mesa sto try-catch
        Statement stmt=null;
        ResultSet result=null;
        Connection con=null;
        int i=0;
        try
{
	con=DriverManager.getConnection(dburl,username,pass);

	System.out.println("Connected to the database");
        
        stmt=con.createStatement();
        
        
        
        //opote thes na kaneis allages, kane stmt.executeUpdate("oti thes");
        //int ins1=stmt.executeUpdate("Insert into Owner.RECOURCES values 1000");
       // String ins2="Insert into Owner.USERS values ('name1','pass1',true)";
       // int insert2=stmt.executeUpdate(ins2);
        //int ins3=stmt.executeUpdate("Insert into Owner.USER values name2,pass2,0");
        
        //opote thes query, kane stmt.executeQuery("oti thes");
        result=stmt.executeQuery("Select * from Owner.RECOURCES");

        //Paradeigma gia diavasma apotelesmatwn apo select
        while(result.next()) {
            
            int money=result.getInt("MONTHLY_INCOME");
            System.out.println(money);
        }  
              
}
        
        
	catch(SQLException ex) {
		ex.printStackTrace();
}
        
        
        
        
        
        
	 System.out.println("1.Hotel	2.Company\n");
	 String user_input;
	 Scanner scan1 = new Scanner(System.in);
         int user_input1 = scan1.nextInt();
               
         if(user_input1==1){                        /////////////////////////
                                                    /////// USE CASE 1 //////
                                                    /////////////////////////  
           
           int flag=0;
           System.out.println("1.Log in 	2.Sign up\n");
           Scanner scan2 = new Scanner(System.in);
           int user_input2 = scan2.nextInt();
           
           
           if(user_input2==2)
           {   System.out.println("Sign up doesn't exist");
               user_input2=1;
           }
           
           
           
           
           
           
           
           if(user_input2==1){
             
        try //CHECK IF CREDENTIAL ARE OK, AND IF USER IS EMPLOYEE
        {   
             con=DriverManager.getConnection(dburl,username,pass);
             System.out.println("Connected to the database");
            
             
            while (flag==0)
            {      
             
             System.out.println("\nEnter your name:");            
             Scanner scan3 = new Scanner(System.in);
             String name = scan3.nextLine();
             
             System.out.println("\nEnter your password:");             
             Scanner scan4 = new Scanner(System.in);
             String password = scan4.nextLine();
             
             String queryStr="SELECT * FROM Owner.USERS where NAME=?";
           
             PreparedStatement pstmt = con.prepareStatement(queryStr);
             pstmt.setString(1, name);
           
             result=pstmt.executeQuery();
            

             if(result.next())
             {
                System.out.println("All good,username exists");
                String password1=result.getString("PASSWORD");
                System.out.println(password1+"\n");
                 
                 
                 while(true)
                 {
                 if(password1.equals(password))
                     {    is_employee=result.getBoolean("IS_EMPLOYEE");
                          System.out.println("All good,user exists");
                          flag=1;
                          break; 
                     }
                     else
                     {
                     System.out.println("wrong password");
                     }
                 }  
             }
             else
             {
                 
                 System.out.println("Username does not exist in database");

             }
             
             result.close();
             pstmt.close();
              }
            
            
   }    
        catch(SQLException ex) {
		ex.printStackTrace();
}                    
        
        
        
            //START OF EMPLOYEE MENU
            
            if (is_employee==true)
            {   
              Employee temp=new Employee("NAME","PASSWORD","GUEST SERVICE AGENT");
               
              System.out.println("Connected to the database"); 
              System.out.println("Welcome to the employee menu\n"
                        + "1:Add Order \n2:Add Reservation\n");
                //EMPLOYEE USE CASES
              Scanner scan9 = new Scanner(System.in);
              int user_input9 = scan9.nextInt();
                
                                                        
              if(user_input9==1){
                
                
                                                        /////////////////////////
                                                        /////// USE CASE 9 //////
                                                        ///////////////////////// 
                temp.USE_CASE_9();
                //USE CASE 9
                
                
                }
                  
                                                      /////////////////////////
                                                      /////// USE CASE 10 //////
                                                      ///////////////////////// 
               if(user_input9==2){
                   
                   
                   temp.USE_CASE_10();
                   
                   
               }
               }
           //END OF EMPLOYEE MENU
               


          else{ //DLD AN DEN EINAI YPALLILOS PIGAINE STO MENU TOU ADMIN
             System.out.println("MENU \n 1.Connection with companies \n 2."
                    + "Information Collection\n 3.financial resource management"
                    + "\n 4.Staff\n 5.Sensors\n 6.Notepad\n");
             Scanner scan6 = new Scanner(System.in);
             int menu = scan6.nextInt();
            
             Administrator temp2=new Administrator("NAME","PASSWORD",2);
             
             
             if(menu==1){                       /////////////////////////
                                                /////// USE CASE 2 //////
                                                /////////////////////////
                 
                    
               System.out.println("1.Connected Companies\n2.Add Company\n");
               Scanner scan7 = new Scanner(System.in);
               int user_input7 = scan7.nextInt();
               if(user_input7==1){
               String queryStr2="SELECT NAME FROM COMPANIES";
               
               Scanner scan7 = new Scanner(System.in);
               String company_ch = company_ch.nextLine();
               
               String queryStr2="SELECT NAME FROM COMPANIES"; //thelei ki alla info? apo poion pinaka?
               
               

               }else if(user_input7==2){       
                
               System.out.println("Enter name of company\n");
               Scanner scan7 = new Scanner(System.in);
               String newcompany = newcompany_ch.nextLine();
               
               System.out.println("Enter password\n");
               Scanner scan7 = new Scanner(System.in);
               String company_pass = company_pass.nextLine();
               
               System.out.println("1.Share Password\n2.Enter e-mail\n");
               Scanner scan7 = new Scanner(System.in);
               int user_input_ = user_input_.nextInt();
               
               if(user_input_==1)
               {
                  //++
               
               }else if(user_input_==2)
               {
                  System.out.println("Enter email\n");
                  Scanner scan7 = new Scanner(System.in);
                  String company_email = company_email.nextLine();
               
               }
               
               INSERT INTO COMPANIES
               VALUES (newcompany, company_pass); //pws???????
            
                       
               }
               
               
           }
           else if(menu==2)
           {                    
                                                 /////////////////////////
                                                 /////// USE CASE 3 //////
                                                 /////////////////////////
               
               
               
            System.out.println("1.Accommodation statistics\n2.Registered orders"
                    + "\n3.Search\n");
            Scanner scan11 = new Scanner(System.in);
            int user_input11 = scan11.nextInt();
            if(user_input8==3){
             System.out.println("Enter customer's fullname and phone number\n");
             
             Scanner scan9 = new Scanner(System.in);
             String customer_name = customer_name.nextLine();
             
             Scanner scan9 = new Scanner(System.in);
             String customer_phone = customer_phone.nextLine();
             
             
             /*
             String queryStr2="SELECT * FROM CUSTOMERS WHERE NAME= ... AND PHONE= ...";
             
             query gia ton customer
             */

             
             }
                                           
           }                                /////////////////////////
           else if(menu==3){                /////// USE CASE 4 //////
                                            /////////////////////////
                                            
             System.out.println("1.Profits\n2.Expenses\n");
             Scanner scan10 = new Scanner(System.in);
             int user_input10= scan10.nextInt();
             
             if(user_input10==1)
             {
             
             }
             else if(user_input10==2)
             {
                System.out.println("1.Staff expenses\n2.Supplies expenses\n");
                Scanner scan12 = new Scanner(System.in);
                int user_input12= scan12.nextInt();
                
                if(user_input12==1)
                {
                //select name(?) from staff(?)
                System.out.println("Search\n");
                Scanner scan9 = new Scanner(System.in);
                String user_input10 = user_input10.nextLine();
                //String queryStr3="SELECT * FROM ?? WHERE NAME=user_input10";
                //pws ypologizontai ta synolika eksoda?
                
                }
                else if(user_input12==2)
                {
                   String queryStr4="SELECT * FROM SUPPLIES"; //oi times den yparxoun ston pinaka
                }
             }
                                            
           }                                /////////////////////////
           else if(menu==4){                /////// USE CASE 5 //////
                                            /////////////////////////
                                            
                //staff stuff               
             
                                            
           }                                    
            else if(menu==5){
                                                    /////////DONE////////////
                                                    /////// USE CASE 6 //////
                                                    /////////////////////////
                Sensors temp=new Sensors(3,5);
                temp.USE_CASE_6();
            
            } 
                                                    /////////DONE////////////
           else if(menu==6){                        /////// USE CASE 7 //////
                                                    /////////////////////////
                                            
                 temp2.USE_CASE_7();             
      
           }
             
            }//END OF ADMIN MENU  
            
         }
           
         }//END OF HOTEL MENU
    
           
         
         
          else if(user_input1==2){       //COMPANY CONNECT
           
              
           Scanner scan11 = new Scanner(System.in);   
           int flag=0;

            try //CHECK IF CREDENTIAL ARE OK, AND IF USER IS EMPLOYEE
        {   
             con=DriverManager.getConnection(dburl,username,pass);
             System.out.println("Connected to the database");
             
           while (flag==0)
            {      
             
             System.out.println("\nEnter your name:");            
             
             String name = scan11.nextLine();
             
             System.out.println("\nEnter your password:");             

             String password = scan11.nextLine();
             
             String queryStr11="SELECT * FROM Owner.COMPANIES where NAME=?";
           
             PreparedStatement pstmt11 = con.prepareStatement(queryStr11);
             pstmt11.setString(1, name);
           
             result=pstmt11.executeQuery();
            

             if(result.next())
             {
                System.out.println("All good,username exists in Companies");
                String password1=result.getString("PASSWORD");
                System.out.println(password1+"\n");
                 
                 if(password1.equals(password))
                     {   
                          System.out.println("All good,user exists");
                          flag=1;
                     }
                     else
                     {
                     System.out.println("wrong password");
                     
                     }  
             }
             else
             {
                 
                 System.out.println("Username does not exist in database");

             }
             
             result.close();
             pstmt11.close();
              }
            
            
   }    
        catch(SQLException ex) {
		ex.printStackTrace();
}       
           
           Customer temp=new Customer("NAME","PASSWORD",4);
           System.out.println(" 1:Orders \n2:Supplies \n"); 
           int user_input11=scan11.nextInt();
           
            if(user_input11==1){
                
                
                                                        /////////////////////////
                                                        /////// USE CASE 11 //////
                                                        ///////////////////////// 
                temp.USE_CASE_11();                               
                //USE CASE 11
                
                
                }
                  
                                                      /////////////////////////
                                                      /////// USE CASE 12 //////
                                                      ///////////////////////// 
               if(user_input11==2){
                   
                   
  
                   
                   
               }
           
           
           
          }
          
 
         }

    }
    
