package LogicClasses;
/* Venus Is-a Planet. (Inherits methods from planet)
*
*
*/
public class Venus extends Planet {
					// instance variables of Venus
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
