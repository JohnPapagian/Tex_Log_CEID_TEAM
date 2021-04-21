
package hotail;


public class HOTAIL {


    public static void main(String[] args) {
        
         HOTAIL test=new HOTAIL();
         Restaurant.add_income(5,290);
         Restaurant.add_income(7,310);
         int res_cost=Restaurant.get_monthly_income();
         
         Supplies.add_cost(5,340);
         
         
         int res=Economic_Recources.get_montly_profits();
         System.out.println("The restaurant made : " + res_cost +" euros ");
         System.out.println("Profits for this month are : " + res +" euros ");
        
         
          Employee temp=new Employee("NAME","PASSWORD","GUEST SERVICE AGENT");
          int k=temp.add_reservation(5000);
          System.out.println("Made reservation with code : " + k);
    }
    
}
