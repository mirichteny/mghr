import java.util.HashMap;
import java.util.ArrayList;
/* class Earth
 * This class is a Logic version of the Earth text based class which provides user
 * the information of itself
 * 
 * It contains the following instance variables:
 * PLANET_TYPE: type of planet
 * earthProperties: list of Earth properties
 * mass: mass of planet
 * gravity: gravity of planet
 * planetRadius: radius of planet
 * planetsOrder: position in solar system of planets relative to the sun
 * orbitalPeriod: orbital time of Earth 
 * countries: list of countries
 * continents: list of continents
 * age: age of Earth
 */
public class Earth extends Planet {

	
				
	
				private final String PLANET_TYPE = "terrestrial";
				private ArrayList<String> earthProperties = new ArrayList<String>();
				private final double mass = 5.972*Math.pow(10,24);
				private final double gravity = 9.81; // m/s^2
				private final double planetRadius = 6.3*Math.pow(10, 4);
				private int planetsOrder = 3; 
				private double orbitalPeriod = 365.25; // days
				private ArrayList<String> countries;
				private HashMap <String, String> continents = new HashMap<>();
				private double age;
				
				
				public Earth() {
					
				}
				/*Earth(double aPlanetRadius, double aPlanetMass)
				* constructor for the class
				*
				* gets information from the following parameters
				* @param double aPLanetRadius radius of planet
				* @param double aPlanetMass mass of planet
				*/
				public Earth(double aPlanetRadius, double aPlanetMass) {
					super(aPlanetRadius, aPlanetMass);
				}
				
				// get Orbital Period
				public double getOrbitalPeriod() {
					
					return this.orbitalPeriod;
				}
				
				
				// get countries
				public ArrayList<String> getCountries(){
					return this.countries;
				}
				
				
				// display menu
				public String displayMenu() {
					return "";
				}
				
				// set Earth properties
				public void addProperties(String aProperty) {
					
					this.earthProperties.add(aProperty);
					
					
				}
				
				
				
				
				
				
}
