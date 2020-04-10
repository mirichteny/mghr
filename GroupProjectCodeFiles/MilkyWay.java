/*
 * MilkyWay Is-a Galaxy. (Inherits methods from galaxy)
 * 
 * 
 */
public class MilkyWay extends Galaxy {
									
						
						/* MilkyWay(String aGalaxyName, String aRadius) constructor
						* inherits the following parameters
						*
						* @param aGalaxyName name of the galaxy
						* @param aRadius radius
						*/
						public MilkyWay(String aGalaxyName, String aRadius) {
							super(aGalaxyName, aRadius);
							
						}
						
						/***
						* MilkyWay()
						* Default constructor
						*/
						public MilkyWay() {
							
						}
						
						/***
						* MilkyWay(MilkyWay)
						* @param m: a MilkyWay input 
						* Copy constructor
						*/
						public MilkyWay(MilkyWay m) {
							this();
						}
	
						/*
						* displayMenu()
						* shows display menu with the message below and returns output
						* @returns output
						*
						*/
						public String displayMenu() {
							
							String output = "THIS IS THE MILKY WAY MENU!";
							
							return output;
						
						}
						/* getGalaxyDesc()
						*
						* gives galaxy description to user
						* @returns desc: the description of the galaxy
						*
						*/
						public String getGalaxyDesc() {
							
							String word1 = "";
							String word2 = "";
							String word3 = "";
							
							String desc = "The milky way galaxy is the galaxy we are in. " + " It contains " + word1  + " . It would take  " + "   lightyears " +
							" just to the center which contains a black hole ";
							
							return desc;
						}
}
