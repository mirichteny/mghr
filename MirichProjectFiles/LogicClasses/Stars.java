package LogicClasses;
/*Another object class. Anyone who works on this class should implement properties of stars, ( luminisity,
	 * star type: (dwarf star or super giant? ) , etc.
	 * 
	 * 
	 * 
	 */
import java.util.ArrayList;
public class Stars {
	
	/*Another object class. Anyone who works on this class should implement properties of stars, ( luminosity, color, mass, surface temperature,
	 * star type: (dwarf star or super giant? ) , etc. 
	 * ( 3 maximum from the properties AND star type)
	 * 
	 * 
	 */

	

	
	
	
			
	
			


			private final String ID = "0005";
			private ArrayList<String> starTypes;
			private String starType;
			private double luminosity;
			private ArrayList<String> starColors;
			private String starColor;
			private double radius;
			private double mass;
			
			public Stars() { 
				
				this.starTypes = new ArrayList<String>();
				this.starType = "";
				this.luminosity = 0;
				this.starColors = new ArrayList<String>();
				this.addAll();
				
				
				
				
				
				
			}
			
			//Checks whether method setStarType contatins star and assigns instance variable to it
			//@param aStarType type of a star
			
			public void setStarType(String aStarType) {
					for( String star: this.getStarTypes()) {
						if( aStarType.contentEquals(star)) {
							this.starType = aStarType;
						}
						
					}
			}
			
			//@param aLuminosity luminosity of a star
			
			public void setLuminosity(double aLuminosity) {
				this.luminosity = aLuminosity;
			}
			
			//@param aColor color of a star
			
			public void setStarColor(String aColor) {
				this.starColor = aColor;
			}
			
			// adds star types
			public String getStarType() {
				return this.starType;
			}
			
			public void addAll() {
				
				this.getStarTypes().add("hypergiants");
				this.getStarTypes().add("supergiants");
				this.getStarTypes().add("giants");
				this.getStarTypes().add("subgiants");
				this.getStarTypes().add("subdwarfs");
				this.getStarTypes().add("dwarfs");
				this.getStarTypes().add("neutronstars");
			}
			//@return luminosity of a star
			
			public double getLuminosity() {
				
				return this.luminosity;
				
			}
			//Returns a list of star types by adding them to it 
			//@return a list of star types
			public ArrayList<String> getStarTypes(){
				ArrayList<String> copyStarTypes = new ArrayList<String>();
				
				for( String starType : this.starTypes) {
					copyStarTypes.add(starType);
					
				}
				
				return copyStarTypes;
			}
	
			public String displayMenu() {
				
				
				String output = "";
				
				String out1 = "   ---------        -------------  ";
				String out2 = "  | the Sun |      | Other Stars |";
				String out3 = "   --------         -------------";
				
				output = out1 + "\n" + out2 + "\n" + out3;
				return output;
			}
	
	
	
	
	
	
}
