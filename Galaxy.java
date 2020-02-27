
public class Galaxy {
	/* The galaxy class is a blueprint for the different galaxies in the
	solar system and its components like the stars and gives out the info for the stars
	and the galaxy itself */
	
  	private String galaxyName;
	private String starName;
	
	// Default constructor 
        public Galaxy() {
				}
	// Copy constructor for galaxy name and star name
	public Galaxy( String aGalaxyName, String aStarName) {
		this.galaxyName = aGalaxyName;
	        this.starName = aStarName;}
	
	// Setter method for the star info 
	public void setStarInfo(String aStarName){
		this.starName = aStarName;}
	// need a hashmap here
	
	 /* Getter method for the star info
	Returns the star name and star info */
        public String getStarInfo(){
	return starName + info;
	// info is a variable for the info got from hashmap
	}
	
	// Setter method for the galaxy info
	public void setGalaxyInfo(String aGalaxyName){
		this.galaxyName = aGalaxyName;}
	// need a hashmap here
	
	/* Getter method for the galaxy info
	Returns the galaxy name and galaxy info */
	public String getGalaxyInfo(){
	return galaxyName + info;
	// info is a variable for the info got from hashmap
	}
	
}         
