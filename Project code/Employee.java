
package hotail;


public class Employee  extends User{
          
    private String job_role;

    Employee(String name,String pass,String role) {
        super(name,pass);
        job_role=role;
        
            
  }
}
