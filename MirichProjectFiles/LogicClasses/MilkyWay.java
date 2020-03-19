package LogicClasses;
/*
 * MilkyWay Is-a Galaxy. (Inherits methods from galaxy)
 * 
 * 
 */
public class MilkyWay extends Galaxy {
									
						
						
						
						public MilkyWay(String aGalaxyName, String aRadius) {
							super(aGalaxyName, aRadius);
							
						}
						
						public MilkyWay() {
							
						}
						
						public MilkyWay(MilkyWay m) {
							this();
						}
					
						public String displayMenu() {
							
							String output = "THIS IS THE MILKY WAY MENU!";
							
							return output;
						
						}
						
						public String getGalaxyDesc() {
							
							String word1 = "";
							String word2 = "";
							String word3 = "";
							
							String desc = "The milky way galaxy is the galaxy we are in. " + " It contains " + word1  + " . It would take  " + "   lightyears " +
							" just to the center which contains a black hole ";
							
							return desc;
						}
}
