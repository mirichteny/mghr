package logic;

import java.util.ArrayList;

        /*
	 * The Stars class gives the different characteristics of the star like its
	 * luminosity, mass, radius and also tells you the star type, for eg. hypergiants, giants, dwarfs, etc.
	 * 
	 * It contains the following instance variables:
	 * ID: a String type constant
	 * starTypes: an ArrayList of String type containing the list of different star types
	 * starType: a String type variable which stores the type of the stars
	 * luminosity: a double type variable which stores the luminosity of the stars 
	 * starColors: an ArrayList of String type containing the list of different star colors
	 * starColor: a String type variable which stores the color of the stars
	 * radius: a double type variable which stores the radius of the stars
	 * mass: a double type variable which stores the mass of the stars
	 * 
	 */
public class Star {
	
			private final String ID = "0005";
			private ArrayList<String> starTypes;
			private String starType;
			private double luminosity;
			private ArrayList<String> starColors;
			private String starColor;
			private double radius;
			private double mass;
			
			/****
			 * a default constructor of the class Stars() which sets the type, luminosity
			 * and the colors of the stars 
			 *
			 */
			public Star() { 
				
				this.starTypes = new ArrayList<String>();
				this.starType = "";
				this.luminosity = 0;
				this.starColors = new ArrayList<String>();
				this.addAll();
				
				
				
				
				
			}
			
			/* setStarType(String)
			 * Checks whether method setStarType contatins star and assigns instance variable to it
			 * @param aStarType type of a star
			 *
			 */
			
			public void setStarType(String aStarType) {
					for( String star: this.getStarTypes()) {
						if( aStarType.contentEquals(star)) {
							this.starType = aStarType;
						}
						
					}
			}
			
			
			/* setLuminosity(double)
			 * Setter method for luminosity of the star
			 * @param aLuminosity luminosity of a star
			 *
			 */
			
			public void setLuminosity(double aLuminosity) {
				this.luminosity = aLuminosity;
			}
			
			
			/* setStarColor(String)
			 * Setter method for color of the star
			 * @param aColor color of a star
			 *
			 */
			public void setStarColor(String aColor) {
				this.starColor = aColor;
			}
			
			/* getStarType()
			 * Getter method for type of the star
			 * @return type of the star
			 *
			 */
			public String getStarType() {
				return this.starType;
			}
			
			/* addAll()
			 * Adds all the star types 
			 *
			 */
			public void addAll() {
				
				this.getStarTypes().add("hypergiants");
				this.getStarTypes().add("supergiants");
				this.getStarTypes().add("giants");
				this.getStarTypes().add("subgiants");
				this.getStarTypes().add("subdwarfs");
				this.getStarTypes().add("dwarfs");
				this.getStarTypes().add("neutronstars");
			}
			
			/* getLuminosity()
			 * Getter method for luminosity of the star
			 * @return luminosity of a star
			 *
			 */
			public double getLuminosity() {
				
				return this.luminosity;
				
			}
	
			
			
			/* getStarTypes()
			 * Getter method for types of the star
			 * Returns a list of star types by adding them to it
			 * @return copyStarTypes returns ArrayList of star types
			 *
			 */
			public ArrayList<String> getStarTypes(){
				ArrayList<String> copyStarTypes = new ArrayList<String>();
				
				for( String starType : this.starTypes) {
					copyStarTypes.add(starType);
					
				}
				
				return copyStarTypes;
			}
			
			/***
			 * displayMenu()
			 * This method displays the planet menu on the screen
			 * @return output returns output of sun and other stars options
			 *
			 */
			public String displayMenu() {
				
				
				String output = "";
				
				String out1 = "   ---------        -------------  ";
				String out2 = "  | the Sun |      | Other Stars |";
				String out3 = "   --------         -------------";
				
				output = out1 + "\n" + out2 + "\n" + out3;
				return output;
			}
	
	
	
	
	
	
}
