
  
package hotail;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Administrator extends User {
    
     private List<String> customers = new ArrayList<>();
     private float latitude; // private = restricted access
    
      Administrator(String name,String pass,int num) {
       
        super(name,pass);
        this.customers=new ArrayList<String>();  //each new admin get a new list
        
            
  }
       public List getCustomers() { //get customer list method
     
        return customers;
  }
  
        // element to be added
      String x = "Markopoulos"; //test string-ignore
      public void addCustomers(String x) {  //add customer method
     
        customers.add(x);
        
  }

  

    }

    

