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
public class Restaurant {
    
    private static int[] monthly_income = new int[30];
    private int income;
        
        
    public static int get_monthly_income()
            {   int sum=0;
                for(int i=0; i<30; i++)
                {
                    sum+=monthly_income[i];
                }
                return sum;
        
            }
      public void add_income(int day,int inc)
            {
                this.income+=inc;
                this.monthly_income[day]+=inc;
  
                
            }
    
    
    
    
}
