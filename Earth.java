import java.util.HashMap;
import java.util.ArrayList;
//subClass of Planet class
public class Earth extends Planet {

	
				
	
				private final String PLANET_TYPE = "terrestrial";
				private ArrayList<String> earthProperties = new ArrayList<String>();
				private final double mass = 5.972*Math.pow(10,24);
				private final double gravity = 9.81; // m/s^2
				private final double planetRadius = 6.3*Math.pow(10, 4);
				private int planetsOrder = 3; //Position in solar system of planets relative to the sun
				private double orbitalPeriod = 365.25; // days
				private ArrayList<String> countries;
				private HashMap <String, String> continents = new HashMap<>();
				private double age;
				
				
				//sets radius and a mass of a planet as parameters of Earth from Planet class
				//@param aPlanetRadius radius of a planet
				//@param aPlanetMass mass of a planet
				public Earth(double aPlanetRadius, double aPlanetMass) {
					super(aPlanetRadius, aPlanetMass);
				}
				
				//returns an orbital period of Earth class
				//@return an orbital period
				public double getOrbitalPeriod() {
					
					return this.orbitalPeriod;
				}
				
				
				//returns countries from a list of this class
				//@return countries
				public ArrayList<String> getCountries(){
					return this.countries;
				}
				
				
				
				public String displayMenu() {
					return "";
				}
				
				//Adds a property to Earth properties of this class
				//@param aProperty property of Earth
				public void addProperties(String aProperty) {
					
					this.earthProperties.add(aProperty);
					
					
				}
				
				
				
				
				
				
}
