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
public class Economic_Recources {
    
    private int monthly_cost;
    
    
    
    public static int get_montly_profits()
            
            
    {
        int salary=Staff.get_salary();
        int restaurant_income=Restaurant.get_monthly_income();
        int supplie_costs=Supplies.get_monthly_costs();
        
        
        int monthly_profits=salary+restaurant_income-supplie_costs;
        
        
        return monthly_profits;
        
        
    }
    
    
    
    
    
    
}
