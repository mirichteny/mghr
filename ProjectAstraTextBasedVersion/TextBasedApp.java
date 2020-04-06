

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
public class TextBasedApp {
							
							private String currentMenu;
							private String previousMenu;
							private ArrayList<String> specialKeywords;
							private HashMap<String , String> createdMenus;
							private String menuOption;
							private Universe myUniverse;
							private Scanner myScanner;
							
							
							/**********
							 * Constructor for TextBasedApp()
							 * Initializes the instance variables neccessary for launching the text based application properly.
							 * 
							 */
							
							public TextBasedApp() {
								myScanner = new Scanner(System.in);
								specialKeywords = new ArrayList<String>();
								instantiateKeywords();
								createdMenus = new HashMap<>();
								myUniverse = new Universe();
								//this.instantiateMenuOptions();
								this.storeMenus();
								
							}
							/****************
							 * public void start
							 * the method that boots up the text based application
							 * 
							 */
							public void start() {
								
								this.displayTitlePage();
								String pauser = this.getScanner().nextLine();
								String reader = "Galaxy";
								while( !reader.equalsIgnoreCase("quit") )
								{
									boolean menuOptionFound = checkForKeywordInKeywords(reader);
									System.out.println(menuOptionFound);
									
									if ( menuOptionFound == true) {
										myUniverse.getPlanet(reader).getPlanetDescription();
										reader = this.getScanner().nextLine();
										
									}
									else {
										//this.setCurrentMenu(reader);
										System.out.println(this.getMenus().get(reader));
										reader = this.getScanner().nextLine();
										//this.setPreviousMenu(reader);
									}
									
								}
							}
							
							public void instantiateKeywords() {
								
								specialKeywords.add("Mercury");
								specialKeywords.add("Venus");
								specialKeywords.add("Earth");
								specialKeywords.add("Mars");
								specialKeywords.add("Jupiter");
								specialKeywords.add("Saturn");
								specialKeywords.add("Uranus");
								specialKeywords.add("Neptune");
							}
							
							public boolean checkForKeywordInKeywords(String aKeyword) {
									boolean keywordFound = false;
										for(String keyword: getSpecialKeywords() ) {
											if (keyword.contentEquals(aKeyword)) {
												keywordFound = true;
											}
										}
									return keywordFound;
							}
							
							/*****
							 * getKeywords()
							 * @return ArrayList<String>
							 */
							public ArrayList<String> getSpecialKeywords(){
								return specialKeywords;
							}
							
							/********
							 * Mutator for 
							 * @Param aCurrentMenu : sets the instance variable "currentMenu" to aCurrentMenu
							 */
							
							public void setCurrentMenu(String aCurrentMenu) {
								this.currentMenu = aCurrentMenu;
							}
							
							/********
							 * 
							 * @return currentMenu :returns instancevar currentMenu
							 */
							public String getCurrentMenu() {
								return this.currentMenu;
							}
							/******
							 * Mutator for 
							 * @param aPreviousMenu : sets the instance variable "previousMenu" to aPreviousMenu
							 */
							
							public void setPreviousMenu(String aPreviousMenu) {
								this.previousMenu = aPreviousMenu;
							}
							/*******
							 * 
							 * @returns instancevar previousMenu
							 */
							
							public String getPreviousMenu() {
								return this.previousMenu;
							}
	
							
							
							/********
							 * public HashMap<String , String> getMenus() returns a hashmap of menus.
							 * @returns "createdMenus". 
							 */
							public HashMap<String , String> getMenus(){
								return this.createdMenus;
								
							}
							
							/*******
							 *public void putMenuInMenus() Takes a hashmap of menus and stores new keys/values
							 * @param Menus: Is the hashmap to store keys/values in
							 * @param aKey:  Is the key that is stored in Menus
							 * @param aMenu: Is the value that is stored in Menus
							 */
							public void putMenuInMenus( HashMap<String, String> Menus  , String aKey, String aMenu) {
								
								Menus.put( aKey, aMenu );
								
							}
							
							/*******
							 * public void storeMenus()
							 * Uses method "public void putMenuInMenus()" to store Menu Screens to instance var createdMenus.
							 */
							public void storeMenus() {
								String galaxyMenu = "+ + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+				 ___________						    +\r\n" + 
										"+				|	    |						    +\r\n" + 
										"+				| Andromeda | 						    +\r\n" + 
										"+				|___________|					            +\r\n" + 
										"+				 ___________						    +\r\n" + 
										"+				|	    |						    +\r\n" + 
										"+				| Milky Way | 						    +\r\n" + 
										"+				|___________|					            +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+ + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + +";
								
								String milkyWayMenu = "+ + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+				 ___________						    +\r\n" + 
										"+				|	    |						    +\r\n" + 
										"+				|  Planets  | 						    +\r\n" + 
										"+				|___________|					            +\r\n" + 
										"+				 ___________						    +\r\n" + 
										"+				|	    |						    +\r\n" + 
										"+				|   Stars   | 						    +\r\n" + 
										"+				|___________|					            +\r\n" + 
										"+				          					            +\r\n" + 
										"+											    +\r\n" + 
										"+			Pick objects in milky way!					    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+ + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + +";
								String planetsMenu = "+ + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+	 ___________	  ___________      __________      __________          		    +\r\n" + 
										"+	|	    |    |           |    |          |    |          |        		    +\r\n" + 
										"+	|  Mercury  | 	 |   Venus   |	  |  Earth   |	  |   Mars   |                      +\r\n" + 
										"+	|___________|	 |___________|	  |__________|	  |__________| 	                    +\r\n" + 
										"+	 ___________	  ___________      __________      __________          		    +\r\n" + 
										"+	|	    |    |           |    |          |    |          |        		    +\r\n" + 
										"+	|  Jupiter  | 	 |   Saturn  |	  |  Uranus  |	  | Neptune  |                      +\r\n" + 
										"+	|___________|	 |___________|	  |__________|	  |__________| 	                    +\r\n" + 
										"+				          					            +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+ + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + +";
								String starsMenu = "+ + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+	 ___________	  ___________      __________      __________          		    +\r\n" + 
										"+	|	    |    |           |    |          |    |          |        		    +\r\n" + 
										"+	|White Dwarf| 	 | Low Mass  |	  |High Mass |	  |Red Giants|                      +\r\n" + 
										"+	|___________|	 |___________|	  |__________|	  |__________| 	                    +\r\n" + 
										"+	 ___________	  ___________      __________      __________          		    +\r\n" + 
										"+	|	    |    |           |    |          |    |          |        		    +\r\n" + 
										"+	|NeutronStar| 	 |           |	  |          |	  |          |                      +\r\n" + 
										"+	|___________|	 |___________|	  |__________|	  |__________| 	                    +\r\n" + 
										"+				          					            +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+											    +\r\n" + 
										"+ + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + +";
								this.putMenuInMenus(this.getMenus(), "Galaxy", galaxyMenu);
								this.putMenuInMenus(this.getMenus(), "Milky Way", milkyWayMenu);
								this.putMenuInMenus(this.getMenus(), "Planets", planetsMenu);
								this.putMenuInMenus(this.getMenus(), "Stars", starsMenu);
							}
							
							public void displayTitlePage() {
								String titlePage = "+ + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + +\r\n" + 
										"+											    +\r\n" + 
										"+					x						    +\r\n" + 
										"+											    +\r\n" + 
										"+		x							x		    +\r\n" + 
										"+	x										    +\r\n" + 
										"+					PROJECT						    +\r\n" + 
										"+											    +\r\n" + 
										"+			 _______	_______	 _________  ______      _______  	    +\r\n" + 
										"+			|   ___  \\     /     __||___   ___||      \\    |   ___  \\      x    +\r\n" + 
										"+			|  |___\\  |   |	     \\      | |    |  	   |   |  |___\\  |	    +\r\n" + 
										"+			|         |    \\      |	    | |    |       /   |         |	    +\r\n" + 
										"+			|   ___   |   _/      /     | |    |   __  \\   |   ___   |          +\r\n" + 
										"+			|__|	\\_|  |_______/      |_|    |__/  \\_|   |__|    \\_|	    +\r\n" + 
										"+	x	                        						    +\r\n" + 
										"+				        					x	    +\r\n" + 
										"+				          					            +\r\n" + 
										"+											    +\r\n" + 
										"+			Press any key to start						    +\r\n" + 
										"+		x							x		    +\r\n" + 
										"+											    +\r\n" + 
										"+	x									x	    +\r\n" + 
										"+											    +\r\n" + 
										"+					x						    +\r\n" + 
										"+											    +\r\n" + 
										"+ + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + +";
								System.out.println(titlePage);
							}
							
							
							/*******
							 * Getter for instance var menuOption
							 * @return menuOption
							 */
							
							public String getMenuOption() {
								return this.menuOption;
							}
							
							/*******
							 * public String getUserOutput()
							 * @return output: output is scanners next line of type String
							 */
							
							public String getUserOutput() {
								String output = myScanner.nextLine();
								return output;
							}
							
					
							/*******
							 * public Scanner getScanner()
							 * @returns instancevar myScanner which is of type Scanner.
							 */
							public Scanner getScanner() {
								return this.myScanner;
							}
							/*********
							 * public static void main()
							 * @param args
							 * This is the class that you need to run in order to start the text based version of our application
							 */
							
							public static void main(String[] args) {
								
								
								
								TextBasedApp T = new TextBasedApp();
								T.start();
								
								
							}
							
							
							
								
	}
							

