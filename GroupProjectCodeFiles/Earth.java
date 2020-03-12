import java.util.HashMap;
import java.util.ArrayList;
public class Earth extends Planets {

	
				
	
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
				
				
				public Earth() {
					
				}
				
				public Earth(double aPlanetRadius, double aPlanetMass) {
					super(aPlanetRadius, aPlanetMass);
				}
				
				
				public double getOrbitalPeriod() {
					
					return this.orbitalPeriod;
				}
				
				
				
				public ArrayList<String> getCountries(){
					return this.countries;
				}
				
				
				
				public String displayMenu() {
					return "";
				}
				
				
				public void addProperties(String aProperty) {
					
					this.earthProperties.add(aProperty);
					
					
				}
				
				
				
				
				
				
}
