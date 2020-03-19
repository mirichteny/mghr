package LogicClasses;

public class Galaxy {
	
  	private String galaxyName;
	private String starName;
	public double galaxyRadius; // In lightyears
	private final String ID = "0004";
	
    public Galaxy() {
    	this.galaxyName = "";
        this.starName = "";
        
        
    }
       
    
	public Galaxy( String aGalaxyName, String aStarName) {
		this.galaxyName = aGalaxyName;
	        this.starName = aStarName;
	        ;}
	
	public String displayMenu() {
		String displayedMenu = "THIS IS THE MILKY WAY MENU! ";
		return displayedMenu;
	}
	
	public void setStarInfo(String aStarName){
		this.starName = aStarName;}
	// need a hashmap here
	
	public  String getGalaxyName() {
		return this.galaxyName;
	}
	
	public double getGalaxyRadius() {
		return this.galaxyRadius;
	}
	
        public String getStarInfo(){
	return starName;
	
	// info is a variable for the info got from hashmap
	}
	
	public void setGalaxyInfo(String aGalaxyName){
		this.galaxyName = aGalaxyName;
		}
	// need a hashmap here
	
	public String getGalaxyInfo(){
	return galaxyName;
	// info is a variable for the info got from hashmap
	}
	
}
