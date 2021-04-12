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
public class Sensor_infrared extends Sensors{
    
    
        private boolean occupied;

    Sensor_infrared(float lat,float lon,boolean occ) {
        super(lat,lon);
        occupied=occ;
        
            
  }
    
    
    
    
}
