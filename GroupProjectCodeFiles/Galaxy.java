
/**********
	 * class Galaxy
	 *
	 * The galaxy class is a blueprint for the different galaxies in the
	 * solar system and its components like the stars and some of their names
	 *  
	 * It contains the following instance variables:
	 * galaxyName: a String which identifies the galaxy
	 * starName: a String which identifies the some of the stars in the galaxy
	 * galaxyRadius: a double which gives the radius of the galaxy in lightyears
	 * ID: a String type constant 
	 *
	 */
public class Galaxy {
	
  	private String galaxyName;
	private String starName;
	public double galaxyRadius; // In lightyears
//	private final String ID = "0004";
	
       /* Galaxy(String, String, double)
	* Constructor for the class
	*
	* @param aGalaxyName The name of the galaxy
	* @param aStarName The name of the star in the galaxy
	* @param aGalaxyRadius The radius of the galaxy given 
	*
	*/    
	public Galaxy( String aGalaxyName, String aStarName, double aGalaxyRadius) {
		this.setGalaxyName(aGalaxyName);
	        this.setStarName(aStarName);
		this.setGalaxyRadius(aGalaxyRadius);
	        }
	
	/*************
	 * displayMenu()
	 *
	 * @return the displayed menu for the application 
	 *
	 */
	public String displayMenu() {
		String displayedMenu = "THIS IS THE MILKY WAY MENU! ";
		return displayedMenu;
	}
	
	/*************
	 * setStarName() 
	 * setter method for the star name
	 * @param aStarName the star name to be set
	 *
	 */
	public void setStarName(String aStarName){
		this.starName = aStarName;
	}
	
	/*************
	 * getGalaxyName() 
	 * getter method for the galaxy name
	 * @return the galaxy name 
	 *
	 */
	public  String getGalaxyName() {
		return this.galaxyName;
	}
	
	/*************
	 * getGalaxyRadius() 
	 * getter method for the galaxy radius
	 * @return the galaxy radius
	 *
	 */
	public double getGalaxyRadius() {
		return this.galaxyRadius;
	}
	
	/*************
	 * getStarName() 
	 * getter method for the star name
	 * @return the star name
	 *
	 */
        public String getStarName(){
	return starName;
	}
	
	/*************
	 * setStarName() 
	 * setter method for the star name
	 * @param aStarName the star name to be set
	 *
	 */
	/*************
	 * setGalaxyName() 
	 * setter method for the galaxy name
	 * @param aGalaxyName the galaxy name to be set
	 *
	 */
	public void setGalaxyName(String aGalaxyName){
		this.galaxyName = aGalaxyName;
		}
	
	/*************
	 * setGalaxyRadius() 
	 * setter method for the galaxy radius
	 * @param aGalaxyRadius the galaxy radius to be set
	 *
	 */
	public void setGalaxyRadius(double aGalaxyRadius) {
		this.galaxyRadius= aGalaxyRadius;
	}
	
	
}
