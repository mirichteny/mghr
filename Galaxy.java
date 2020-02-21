
public class Galaxy {
	
  	private String galaxyName;
	private String starName;
	
        public Galaxy() {
				}
	public Galaxy( String aGalaxyName, String aStarName) {
		this.galaxyName = aGalaxyName;
	        this.starName = aStarName;}
	
	public String setStarInfo(String aStarName){
		this.starName = aStarName;}
	// need a hashmap here
	
        public String getStarInfo(){
	return starName + info;
	// info is a variable for the info got from hashmap
	}
	
	public String setGalaxyInfo(String aGalaxyName){
		this.galaxyName = aGalaxyName;}
	// need a hashmap here
	
	public String getGalaxyInfo(){
	return galaxyName + info;
	// info is a variable for the info got from hashmap
	}
	
}
