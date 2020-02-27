/*
 * ItemCollection Class 
 * 
 * 
 * 
 */
import java.lang.reflect.Method;
import java.util.HashMap;

public class Universe {
	
		
				
	// Creating different hashmaps for different classes 		
	private HashMap<String, Class<?>> myClasses = new HashMap<>(); // HashMap of classes with named Keys
	private HashMap<String, Class<?>> myIDs = new HashMap<>();
	private HashMap<String, Class<?> > myGalaxies = new HashMap<>(); //The galaxies.
	private HashMap<String , String > myMenus = new HashMap<>();
	private HashMap< String,  HashMap<String, Class<?> > > allHashMaps = new HashMap<>();
							
				
				/*
				 * ItemCollection constructor
				 */
				public Universe() {
					
					this.putClassInMap(myClasses, "Planets", Planet.class);
					this.putClassInMap(myIDs, "0003", Planet.class);
					
					this.putClassInMap(myClasses, "Stars" , Stars.class);
					this.putClassInMap(myIDs , "0005" , Stars.class);
					
					this.putClassInMap(myClasses, "Galaxies", Galaxy.class);
					this.putClassInMap(myIDs, "0004", Galaxy.class);
					
					this.putClassInMap(myGalaxies, "Milky Way" , MilkyWay.class);
					this.putClassInMap(myClasses, "Earth" , Earth.class);
					
					
				}
	
				// This method loads different classes in the hashmap at different IDs
				public void putClassInMap( HashMap<String, Class<?>> aMap  , String aKey, Class<?> aClass) {
					
					aMap.put( aKey, aClass );
					
				}
				
				// This method returns a list of classes in the hashmap
				public HashMap< String, Class<?> > getClasses(){
					return this.myClasses;
				}
				
	                       // This method returns a list of IDs for classes in the hashmap
				public HashMap< String, Class<?> > getIDs(){
					return this.myIDs;
				}
	
				// This method returns a list of galaxies
				public HashMap<String, Class<?> > getGalaxies(){
					return this.myGalaxies;
				}
			
				public Class<?> getItemByName(String aName) {
					
					Class<?> determinedClass = Universe.class;
					for( String s: this.getClasses().keySet() ) {
						
						if( this.getClasses().containsKey(aName) ) {
							determinedClass = this.getClasses().get(s);
							
						}
						else {
							System.out.println("Name not found.");
							return null;
						}
					
					}
					
					return determinedClass;
					
					
				}
				
				public Class<?> getItemByID(String ID) {
					
					Class<?> determinedClass = Universe.class;
					for( String s: this.getIDs().keySet() ) {
						
						if (this.getIDs().containsKey(ID) ) {
						          determinedClass = this.getIDs().get(s);
						}
						else {
							System.out.println("ID not found. ");
							return null;
						}
						
						
					}
					
					return determinedClass;
				
					
				}
				
				public boolean search(String keyword , Class<?> aClass , String className) {
					
					if ( this.getClasses().containsKey(className) ) {
						return true;
					}
					
					
					return false;
				}
				
				
				public void updateAll() {
					
				}
				
				public void add() {
					
				}
				
				public void displayMenu() {
					
					String menuOutput = "THIS IS THE UNIVERSE MENU";
					String output0 = " + + + + + + + + + + + + + + + + + + + + + + + + + + + + +";
					String output1 = " +  -----------         -----------                      +";
					String output2 = " + | Milky Way  |      | Andromeda |                     + " ;
					String output3 = " +  -----------         -----------                      +";
					String outputa = " +                                                       +";
					String outputb = " +                                                       +";
					String outputc = " +                                                       +";
					String outputd = " +                                                       +";
					String outpute = " +                                                       +";
					String outputf = " +                                                       +";
					String outputg = " +                                                       +";
					String output4 = " + + + + + + + + + + + + + + + + + + + + + + + + + + + + + ";
					String output5 = " Which galaxy would you like to visit? ";
					
					menuOutput = output0 + "\n" + output1 + "\n" + output2 + "\n" + output3 + "\n" + output4 + "\n" + output5;
					System.out.println(menuOutput);
					
					
				}

}
