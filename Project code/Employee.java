
package hotail;


public class Employee  extends User{
          
    private String job_role;

    Employee(String name,String pass,String role) {
        super(name,pass);
        job_role=role;
            
  }
    
    public int add_reservation(int code)
    {
        Reservations res=new Reservations(code);
         int k=res.get_reservation_code();
        return k;
//res.name=name;
        
        
    }
}
