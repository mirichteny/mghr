package logic;

/*******
 * Venus class
 * is a personalized version of the planet class specifically for the planet venus.
 *
 */
public class Venus extends Planet {
					
					private double venusMass = 4.867*Math.pow(10, 24); //kg
					private double venusRadius = 6051800; //m/s
					private double distanceFromSun = 0.723; //in Astronomical Units (AU) 
					
					public Venus(double aPlanetMass, double aPlanetRadius) {
						super(aPlanetMass, aPlanetRadius);
						
					}
					
					public Venus(Venus toCopy) {
						super(toCopy);
					}
}
