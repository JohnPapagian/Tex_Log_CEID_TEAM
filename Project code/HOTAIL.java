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
public class HOTAIL {


    public static void main(String[] args) {
        
         HOTAIL test=new HOTAIL();
         
         Supplies.add_cost(5,340);
         
         
         int res=Economic_Recources.get_montly_profits();
         
         System.out.println("Profits for this month are : " + res +" euros ");
        
        
    }
    
}
