package logic;




public class Planet {
					
					private int ID;
					private String planetName;
					private double planetMass; // in kilograms
					private double planetRadius; // in meters
					private double planetGravity; // in m/s^2
					private double rotationalSpeed = 25; // This is USED FOR MVC. Controller accesses rotational speed.
					private final double G = 6.6742*Math.pow(10,-11); //Gravitational constant
					
					
					/********
					 * Planet Constructor
					 * 
					 */
					
					public Planet(String aPlanetName, double aPlanetMass, double aPlanetRadius) {
						this.setPlanetName(aPlanetName);
						this.setPlanetMass(aPlanetMass);
						this.setPlanetRadius(aPlanetRadius);
						this.setPlanetGravity();
					}
					
					public Planet(double aPlanetMass, double aPlanetRadius) {
						this.setPlanetName("No name");
						this.setPlanetMass(aPlanetMass);
						this.setPlanetRadius(aPlanetRadius);
						this.setPlanetGravity();
					}
					
					
					/*******
					 * Copy constructor for class Planet
					 * @param toCopy
					 */
					public Planet(Planet toCopy) {
						this(toCopy.planetName,toCopy.planetMass,toCopy.planetRadius);
					}
					
					
					/*******
					 * Mutator for instancevar planetMass
					 * @param aPlanetMass
					 */
					public void setPlanetMass(double aPlanetMass) {
						this.planetMass = aPlanetMass;
					}
					/*******
					 * Getter for instancevar planetMass
					 * @return planetMass
					 */
					
					public double getPlanetMass() {
						return this.planetMass;
					}
					
					/*******
					 * Mutator for instancevar planetRadius
					 * @param aPlanetRadius
					 */
					
					public void setPlanetRadius(double aPlanetRadius) {
						this.planetRadius = aPlanetRadius;
					}
					
					/*******
					 * Getter for instancevar planetRadius
					 * @return planetRadius
					 */
					public double getPlanetRadius() {
						return this.planetRadius;
					}
					/*******
					 * Mutator for instancevar planetGravity. Uses the calculatePlanetGravity method to set the instancevar planetGravity to a value
					 */
					public void setPlanetGravity() {
						double determinedGravity = this.calculatePlanetGravity(this.getPlanetMass(), this.getPlanetRadius());
						this.planetGravity = determinedGravity;
					}
					/*******
					 * public double getPlanetGravity()
					 * Getter for instancevar planetGravity
					 * @return planetGravity
					 */
					public double getPlanetGravity() {
						return this.planetGravity;
					}
					
					/*******
					 * public void setPlanetName()
					 * Mutator for instancevar planetName
					 * @param aPlanetName
					 */
					public void setPlanetName(String aPlanetName) {
						this.planetName = aPlanetName;
					}
					
					/*******
					 * public String getPlanetName()
					 * Getter for instancevar planetName
					 * @return planetName
					 */
					public String getPlanetName() {
						return planetName;
					}
					
					/*******
					 * getRotationalSpeed() is a getter for the instance variable rotational speed
					 * @return rotationalSpeed
					 */
					
					public double getRotationalSpeed() {
						return this.rotationalSpeed;
					}
					
					/*******
					 * setRotationalSpeed() is a mutator for instance variable rotationalSpeed
					 * @param aValue
					 */
					public void setRotationalSpeed(double aValue) {
						this.rotationalSpeed = aValue;
					}
					
					/*******
					 * public void calculatePlanetGravity()
					 * @param aPlanetMass
					 * @param aPlanetRadius
					 * @return theoreticalGravity: theoreticalGravity is the physics calculation for gravity of a planet given mass and radius
					 */
					public double calculatePlanetGravity(double aPlanetMass, double aPlanetRadius) {
					
						double theoreticalGravity = G*aPlanetMass*(1/Math.pow(aPlanetRadius, 2));
						return theoreticalGravity;
					}
					
					/*******
					 * public void drawPlanet()
					 * Displays a text based version of a planet in grid format (utilizes the grid class)
					 */
					
					public void drawPlanet() {
						Grid drawingCanvas = new Grid(20,20, " ");
						drawingCanvas.drawBox(10, 10, 2, 2);
						drawingCanvas.outputGrid();
						
					}
					/*******
					 * public void getPlanetDescription()
					 * 
					 */
					
					public void getPlanetDescription() {
						String desc = "";
					
						desc = "The planet's name is " + getPlanetName() + "\n" + "The planet's mass is: " + getPlanetMass() + " kg" + "\n" + "The planet's gravity is: " + getPlanetGravity() + " m/s^2";
						
						System.out.println(desc);
					}
					
					public static void main(String[] args) {
						System.out.println("Test");
					}
					
}
