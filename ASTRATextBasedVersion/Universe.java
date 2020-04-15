
/*
 * ItemCollection Class 
 * The following class is in charge of accessing different classes and accessing the information
 * 
 * 
 * 
 */

import java.util.ArrayList;
import java.util.HashMap;

public class Universe {
	
		
				
				/*******************************
				 * Instance variables of hashmaps. 
				 * 
				 */
		
				private HashMap<String, Class<?>> myClasses = new HashMap<>(); // HashMap of classes with named Keys
				private HashMap<String, Class<?> > myGalaxies = new HashMap<>(); //The galaxies.
				private HashMap<String , String > myMenus = new HashMap<>();
				private ArrayList<Planet> planets;
				private Planet mercury;
				private Planet venus;
				private Planet earth;
				private Planet mars;
				private Planet jupiter;
				private Planet saturn;
				private Planet uranus;
				private Planet neptune;
				private String currentMenu; 
				private String previousMenu;
				
				/****************************
				 * Universe constructor
				 * 
				 */
				public Universe() {
					
					planets = new ArrayList<Planet>();
					instantiatePlanets();
					addAllPlanets();
					
					
					
				
				
					
				}
				
				/*******
				 * instantiatePlanets()
				 * method that is used in universe constructor to set up all the planets and store all their information.
				 */
				
				public void instantiatePlanets() {
					
						   mercury = new Planet("Mercury",0.33*Math.pow(10, 24),2.4395*Math.pow(10, 6));
					       venus = new Planet("Venus",4.867*Math.pow(10, 24),6.0518*Math.pow(10, 6));
					       earth = new Planet("Earth",5.972*Math.pow(10, 24),6.371*Math.pow(10, 6));
					       mars = new Planet("Mars",0.642*Math.pow(10, 24),3.38956*Math.pow(10, 6));
					       jupiter = new Planet("Jupiter",1898*Math.pow(10, 24), 71.492*Math.pow(10, 6));
					       saturn = new Planet("Saturn",568*Math.pow(10, 24), 58.232*Math.pow(10, 6));
					       uranus = new Planet("Uranus",86.8*Math.pow(10, 24), 25.559*Math.pow(10, 6));
					       neptune = new Planet("Neptune",102*Math.pow(10, 24), 24.764*Math.pow(10, 6));
					
				}
	
				
				
				/*******
				 * addAllPlanets()
				 * method that takes every planet that exists in our program and puts them into the instance var planets
				 */
				
				public void addAllPlanets() {
					
					getPlanets().add(mercury);
					getPlanets().add(venus);
					getPlanets().add(earth);
					getPlanets().add(mars);
					getPlanets().add(jupiter);
					getPlanets().add(saturn);
					getPlanets().add(uranus);
					getPlanets().add(neptune);
				}
				
	
				/* *******************
				 *  Getters and setters
				 * 
				 * 
				 */
				
				public ArrayList<Planet> getPlanets() {
					return planets;
				}
				
				/*******
				 * public Planet getPlanet(): returns the planet in the list with name "aPlanetName".
				 * @param aPlanetName
				 * @return : returns a copy of the planet found (to prevent privacy leaks)
				 */
				
				public Planet getPlanet(String aPlanetName) {
						Planet dummyP = null;
						
					for(Planet p: getPlanets()) {
						if(p.getPlanetName().contentEquals(aPlanetName)) {
							System.out.println("FOUND!");
							return new Planet(p);
						}
					}
					
					return dummyP;
						
				}
				/*******
				 * getClasses()
				 * returns every class that exists in the hashmap of myClasses
				 * @return myClasses
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
				
				/********
				 * search()
				 * Searches through the file with all ID's stored, instead of trying to access the class.
				 * @param keyword
				 * @param aClass
				 * @param className
				 * @return either true or false (boolean value)
				 */
				

				public boolean search(String keyword , Class<?> aClass , String className) {
					
					if ( this.getClasses().containsKey(className) ) {
						return true;
					}
					
					
					return false;
				}
				
				
				
			
				
				
			
				
				
				
				
}
