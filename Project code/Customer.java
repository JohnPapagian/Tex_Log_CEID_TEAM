
package hotail;


public class Customer extends User {
   
    
      private int room_num;

        
    Customer(String name,String pass,int num) {
       
        super(name,pass);
        room_num=num;
    } 
            
        
        public int get_room_num() { //get customer list method
     
        return room_num;
  }
  

      public void set_room_num(int num) {  //add customer method
     
        this.room_num = num;
        
  }

  }
        
            
  
    
    

