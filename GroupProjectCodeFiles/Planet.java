
public class Planet {
	/*
	 * The planet class is a blueprint for all the planets in the solar system including earth.
	 * 
	 * It contains the following instance variables:
	 * materials: a String type array containing the list of materials
	 * G: a double type gravitational constant 
	 * gravity: a double type variable which stores the gravity of the planets
	 * planetMass: a double type variable which stores the mass of the planets 
	 * planetRadius: a double type variable which stores the radius of the planets 
	 * ID: a String type constant 
	 * 
	 */
					
					private String[] materials;
					private final double G = 6.6742*Math.pow(10,-11 ); //Gravitational constant
					private double gravity; // m/s^2
					private double planetMass;
					private double planetRadius;
					private final String ID = "0003";
			
			/****
			 * a default constructor of the class Planet() which sets the gravity
			 * and the mass of the planets 
			 *
			 */
			public Planet() {
				this.gravity = G*planetMass*(1/Math.pow(planetRadius, 2)); // Equation for gravity of a planet
				this.planetMass = 5.683*Math.pow(10,26); //Average planet mass
			}
			
			/****
			 * Planet(double, double)
			 * a constructor of the class Planet() which sets the gravity
			 * and the mass of the planets 
			 *
			 */
			public Planet(double aPlanetRadius, double aPlanetMass) {
				this.gravity = G*planetMass*(1/Math.pow(planetRadius, 2)); // Equation for gravity of a planet
				this.planetMass = 5.683*Math.pow(10,26); //Average planet mass
			}
			
			/***
			 * getGravity()
			 * getter method for gravity of the planet
			 * @return gravity returns gravity
			 *
			 */
			public double getGravity() {
				
				return gravity;
				
			}
			
			/***
			 * getPlanetMass()
			 * getter method for mass of the planet
			 * @return planetMass returns mass of the planet
			 *
			 */
			public double getPlanetMass() {
				return planetMass;
			}
			
			/***
			 * getMaterials()
			 * getter method for materials of the planet
			 * @return materials returns materials
			 *
			 */
			public String[] getMaterials() {
				return materials;
			}
			
			/***
			 * getPlanetRadius()
			 * getter method for radius of the planet
			 * @return planetRadius returns radius of the planet 
			 *
			 */
			public double getPlanetRadius() {
				return planetRadius;
			}
			
			/* getPlanetDescription()
			 * This method returns a description of the planet such as surface material,age
			 * number of moons, etc.
			 * 
			 * @return description returns the description of the planet
			 */
			public String getPlanetDescription() {
				
				String word1 = "terrestrial"; 
				String word2 = "estimated 4.5 billion years old";
				String word3 = "N/A";
				String description = "The planet type is " + word1 + "\n" +  " The planet age is "  + word2 + "\n" + " Planet was discovered in " + word3;

				return description;
			}
			
			/***
			 * displayMenu()
			 * This method displays the planet menu on the screen
			 * @return output returns output
			 *
			 */
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
