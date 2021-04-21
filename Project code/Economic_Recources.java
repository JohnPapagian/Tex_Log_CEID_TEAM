
package hotail;


public class Economic_Recources {
    
    private int monthly_cost;
    
    
    
    public static int get_montly_profits()
            
            
    {
        int salary=Staff.get_salary(); //STAFF
        
        int restaurant_income=Restaurant.get_monthly_income(); //RESTAURANT
        
        int supplie_costs=Supplies.get_monthly_costs(); //COST OF SUPPLIES
        
        
        
        int monthly_profits=salary+restaurant_income-supplie_costs;
        
        
        return monthly_profits;
        
        
    }
    
    
    
    
    
    
}
