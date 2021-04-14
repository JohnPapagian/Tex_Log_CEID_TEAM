
package hotail;


public class Customer extends User {
   
    
      private int order_num;

        
    Customer(String name,String pass,int num) {
       
        super(name,pass);
        order_num=num;
    } 
            
        
        public int get_order_num() { //get customer list method
     
        return order_num;
  }
  

      public void set_order_num(int num) {  //add customer method
     
        this.order_num = num;
        
  }

  }
        
            
  
    
    

