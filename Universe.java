/*
 * ItemCollection Class 
 * 
 * 
 * 
 */
import java.lang.reflect.Method;
import java.util.HashMap;

public class Universe {
	
		
				
			
				
				private HashMap<String, Class<?>> myClasses = new HashMap<>(); // HashMap of classes with named Keys
				private HashMap<Integer, Class<?>> myClassesByID = new HashMap<>(); //HashMap of classes with ID Keys
				
				
				
				/*
				 * ItemCollection constructor
				 */
				public Universe() {
					
					this.putClassInMap(myClasses, "Planets", Planet.class);
					this.putClassInMap(myClasses, "Stars" , Stars.class);
					this.putClassInMap(myClasses, "Galaxies", Galaxy.class);
					
					this.putClassInMap(myClassesByID, 0001, Planet.class);
					this.putClassInMap(myClassesByID, 0002 , Stars.class);
					this.putClassInMap(myClassesByID, 0003, Galaxy.class);
					
				}
	
	
				public void putClassInMap( HashMap<String, Class<?>> aMap  , String aKey, Class<?> aClass) {
					
					aMap.put( aKey, aClass );
					
				}
				
				public void putClassInMap( HashMap<Integer, Class<?>> aMap  , Integer anID, Class<?> aClass) {
					
					aMap.put( anID, aClass );
					
				}
	
				
				
				
				public HashMap< String, Class<?> > getClasses(){
					return this.myClasses;
				}
				
				public Class<?> getItemByID(String ID) {
					Class<?> item = Universe.class;
					return item;
				}
				
				public Class<?> getItemByName(String name) {
					
					Class<?> item = this.getClasses().get(name);
					return item;
					
				}
				
				public Class<?> search(String keyword) {
					Class<?> searchedClass = this.getClasses().get(keyword);
					return searchedClass;
				}
				
				public void updateAll() {
					
				}
				
				public void add() {
					
				}
				
				public String displayMenu() {
					String menuOutput = "THIS IS THE UNIVERSE MENU";
					
					return menuOutput;
				}

}
