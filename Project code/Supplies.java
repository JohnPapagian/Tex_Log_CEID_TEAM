
package hotail;


public class Supplies {
    
    
    
    private  static int[]  monthly_costs = new int[30];
    private static int cost;
        
        
    public static int get_monthly_costs()
            {   int sum=0;
                for(int i=0; i<30; i++)
                {
                    sum+=monthly_costs[i];
                }
                return sum;
            }
    
      public static void add_cost(int day,int cos)
            {
                cost+=cos;
                monthly_costs[day]+=cos;
  
                
            }
}
