
/*
 * ItemCollection Class 
 * The following class is in charge of accessing different classes and accessing the information
 * 
 * 
 * 
 */
import java.lang.reflect.Method;
import java.util.HashMap;

public class Universe {
	
		
				
				/*
				 * Instance variables of hashmaps. 
				 * 
				 */
				private FileHandler fileHandler; //Unused variable, will end up implementing to update textbased later.
				private HashMap<String, Class<?>> myClasses = new HashMap<>(); // HashMap of classes with named Keys
				private HashMap<String, Class<?> > myGalaxies = new HashMap<>(); //The galaxies.
				private HashMap<String , String > myMenus = new HashMap<>();
				private HashMap< String,  HashMap<String, Class<?> > > allHashMaps = new HashMap<>();
				private String currentMenu;
				private String previousMenu;
				
				/*
				 * ItemCollection constructor
				 * Instantiates classes (hard coding approach)
				 */
				public Universe() {
					/*
					 * Fills the hashmap "myClasses" with every class that exists in our program
					 *
					 */
					
					this.updateAll();
					
				}
	
				/*
				 * The method putClassInMap adds a key and a value to a hashmap specific in the arugments.
				 * 
				 * 
				 */
				public void putClassInMap( HashMap<String, Class<?>> aMap  , String aKey, Class<?> aClass) {
					
					aMap.put( aKey, aClass );
					
				}
				
				public void putClassInMap( HashMap<String, String> aMap, String aKey, String aMenu){
					aMap.put(aKey, aMenu);
				}
				
				
	
				/*  Getters and setters
				 * 
				 * 
				 */
				
				
				public HashMap< String, Class<?> > getClasses(){
					return this.myClasses;
				}
				
				
				
				public HashMap<String, Class<?> > getGalaxies(){
					return this.myGalaxies;
				}
			
				/*
				 * Loops through a hashmap and searches if the key is equivalent to the parameter "aName".
				 * If key found, returns the class, else it will return null.
				 * 
				 */
				public String getItemByName(String aName ) {
					
					Class<?> determinedClass = Universe.class;
					
						
						if( this.getClasses().containsKey(aName) ) {
							
							determinedClass = this.getClasses().get(aName);
							System.out.println(determinedClass);
						}
						else {
							System.out.println("Name not found.");
							return null;
						}
					
					
					
					return determinedClass.toString();
					
					
				}
				
				/*
				 * Searches through the file with all ID's stored, instead of trying to access the class.
				 * 
				 * 
				 */
				
			
					
			
				
					
				
				/*
				 * 
				 * 
				 * Unused method
				 */
				
				public boolean search(String keyword , Class<?> aClass , String className) {
					
					if ( this.getClasses().containsKey(className) ) {
						return true;
					}
					
					
					return false;
				}
				
				/*
				 * 
				 * 
				 * Unused method
				 */
				public void updateAll() {
					this.putClassInMap(myClasses, "Planets", Planets.class);
					this.putClassInMap(myMenus,"Planets" , "planetMenu");
					
					this.putClassInMap(myClasses, "Stars" , Stars.class);
					this.putClassInMap(myMenus , "Stars" , "starMenu");
					
					this.putClassInMap(myClasses, "Galaxies", Galaxy.class);
					this.putClassInMap(myMenus, "Galaxies", "galaxyMenu");
					
					this.putClassInMap(myGalaxies, "Milky Way" , MilkyWay.class);
					this.putClassInMap(myMenus, "Milky Way", "milkyWayMenu");
					
					this.putClassInMap(myClasses, "Earth" , Earth.class);
					this.putClassInMap(myMenus, "Earth", "earthMenu");
				}
				
				public void updateMenus() {
					
				}
				
				
				
				public void add() {
					
				}
				
				/*
				 * 
				 * Display menu method, different or each class currently
				 * 
				 */
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
