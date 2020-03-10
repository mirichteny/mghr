
public class Planets {
	/*
	 * The planets class is a blueprint for all the planets in the solar system including earth.
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
					
					private String[] materials;
					private double age;
					private final double G = 6.6742*Math.pow(10,-11 ); //Gravitational constant
					private double gravity; // m/s^2
					private double planetMass;
					private double planetRadius;
					private final String ID = "0003";
					
			public Planets() {
				this.gravity = G*planetMass*(1/Math.pow(planetRadius, 2)); // Equation for gravity of a planet
				this.planetMass = 5.683*Math.pow(10,26); //Average planet mass
			}
			
			public Planets(double aPlanetRadius, double aPlanetMass) {
				this.gravity = G*planetMass*(1/Math.pow(planetRadius, 2)); // Equation for gravity of a planet
				this.planetMass = 5.683*Math.pow(10,26); //Average planet mass
			}
			
			public double getGravity() {
				
				return gravity;
				
			}
			
			public double getPlanetMass() {
				return planetMass;
			}
			
			public String[] getMaterials() {
				return materials;
			}
			
			public double getPlanetRadius() {
				return planetRadius;
			}
			
			/*
			 * This method returns a description of the planet such as surface material,age
			 * number of moons, etc.
			 * 
			 * 
			 */
			public String getPlanetDescription() {
				
				String word1 = "terrestrial"; 
				String word2 = "estimated 4.5 billion years old";
				String word3 = "N/A";
				String description = "The planet type is " + word1 + "\n" +  " The planet age is "  + word2 + "\n" + " Planet was discovered in " + word3;

				return description;
			}
			
			public String displayMenu() {
				Grid g = new Grid(5, 60,"X");
				String output =  "THIS IS THE PLANET MENU ";
				
				String out1 = "   ---------       --------       --------        --------";
				String out2 = "  | Mercury |     | Venus  |     |  Earth |      |   Mars  |";
				String out3 = "   --------        --------       -------         --------";
				String out7 = g.outputGrid() + "< -- Asteroid Belt";
				String out4 = "   ---------       --------       --------     --------";
				String out5 = "  | Jupiter |     | Saturn  |     |Uranus|    |Neptune |";
				String out6 = "   --------        --------       -------      --------";
				output = out1 + "\n" + out2 + "\n" + out3 + "\n" + out7 + "\n" + out4 + "\n" + out5 + "\n" + out6;
				return output;
			}

			
					
					
}
