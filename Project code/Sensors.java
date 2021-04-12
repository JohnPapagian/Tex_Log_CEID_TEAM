
package hotail;

/**
 *
 * @author JP
 */
public class Sensors {
    
    private float latitude; // private = restricted access
    private float longitude;

  Sensors(float lat,float lon) {
    latitude = lat;
    longitude = lon;
  }
    
  // Getter
  public float[] getCoordinates() {
    float[] res={latitude,longitude};  
    return res;
  }

  // Setter
 public void setCoordinates(float lat,float lon) {
    
    this.latitude = lat;
    this.longitude = lon;
  }
    
    
    
    
    
}
