
public class Planet {
	/*
	 * The planet class is a blueprint for all the planets in the solar system including earth.
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
					
			public Planet() {
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
				String description = "This is a description";
				return description;
			}
			
					
					
}
