/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotail;

/**
 *
 * @author JP
 */
public class Employee  extends User{
          
    private String job_role;

    Employee(String name,String pass,String role) {
        super(name,pass);
        job_role=role;
        
            
  }
}
