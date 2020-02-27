
public class Planet {
	/*
	 * The planet class is a blueprint for all the planets in the solar system including earth.
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
		// Defining global variables	
		private String[] materials;
		private double age;
	        private final double G = 6.6742*Math.pow(10,-11 ); //Gravitational constant
		private double gravity; // m/s^2
		private double planetMass;
		private double planetRadius;
			
	               // This is a default constructor defining the formula for gravity and planet mass of planets
			public Planet() {
				this.gravity = G*planetMass*(1/Math.pow(planetRadius, 2)); // Equation for gravity of a planet
				this.planetMass = 5.683*Math.pow(10,26); //Average planet mass
			}
			
			/* Getter method for the gravity of the planets
			Returns gravity */
			public double getGravity() {
				
				return gravity;
				
			}
			
			/* Getter method for the planet mass
			Returns planet mass */
			public double getPlanetMass() {
				return planetMass;
			}
			
	               /* Getter method for the materials of the planets
			Returns materials */
			public String[] getMaterials() {
				return materials;
			}
			
			/* Getter method for the planet radius
			Returns planet radius */
			public double getPlanetRadius() {
				return planetRadius;
			}
			
			/*
			 * This method returns a description of the planet such as surface material, age,
			 * number of moons, etc.
			 * 
			 * 
			 */
			public String getPlanetDescription() {
				String description = "This is a description";
				return description;
			}
			
					
					
}
