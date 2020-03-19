package LogicClasses;
import java.lang.reflect.Method;
import java.util.*;
/*
 * 
 * The Main class is in charge of all the menu option handling and transitions between classes.
 * 			Methods:
 * 					displayMenu()
 *					getMenuOption()
 *					getUniverse()
 *					getCurrentMenuOption()
 * 
 */
public class Main {
	
	
		
		private Universe myUniverse;    // itemCollection
		private HashMap< String , String > myMenus = new HashMap<>(); // HashMap of Menus
		private String currentMenuOption;
		private ArrayList<String> menuOptions = new ArrayList<String>();
		private String currentMenu;
		private String previousMenu;
		
	
		
		
		/*
		 * Main constructor
		 */
		public Main() {
			Galaxy galaxy = new Galaxy();
			MilkyWay milky = new MilkyWay();
			Planet pl = new Planet();
			Earth earth = new Earth();
			Stars stars = new Stars();
			
			String GalaxyMenuOutput = "THIS IS THE UNIVERSE MENU";
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
			GalaxyMenuOutput = output0 + "\n" + output1 + "\n" + output2 + "\n" + output3 + "\n" + output4 + "\n" + output5;
			
			this.menuOptions.add("Galaxy");
			this.menuOptions.add("Milky Way");
			this.menuOptions.add("Andromeda");
			this.menuOptions.add("Planets");
			this.menuOptions.add("Stars");
			this.menuOptions.add("Earth");
			this.menuOptions.add("Mercury");
			this.menuOptions.add("Venus");
			this.menuOptions.add("Mars");
			this.menuOptions.add("Jupiter");
			this.menuOptions.add("Saturn");
			
			this.getMenus().put("Milky Way", milky.displayMenu());
			this.getMenus().put("Stars" , stars.displayMenu());
			this.getMenus().put("Earth " , earth.getPlanetDescription());
			this.getMenus().put("Planets" , pl.displayMenu());
			
			this.getMenus().put("Planets", GalaxyMenuOutput);
			
		
		}
		
		public String displayMenu(String aKeyWord) {
			String desiredMenu = "";
			
			for( String menuOption: this.menuOptions ) {
				
				if(  menuOption.equalsIgnoreCase(aKeyWord) ) {
					desiredMenu = this.getMenus().get(menuOption);
				}
				else {
					return null;
				}
			}
			
			return desiredMenu;
		}
		
		
	
		
		public Universe getUniverse() {
			return this.myUniverse;
		}
		
		public HashMap<String , String> getMenus(){
			
			return this.myMenus;
		}
		
		public String getCurrentMenuOption() {
			
			return this.currentMenuOption;
		}
		
		public void updateCurrentMenuOption(String aMenuOption) {
			this.currentMenuOption = aMenuOption;
		}
	
		public String goToPreviousMenu() {
			String prevMenu = "";
			
			return prevMenu;
		}
		
		public void titlePage() {
			String star = "+";
			System.out.println("+ + + + + + + + + + + + + + + + + + + + + + + + + ");
			System.out.println(star + " ___     ________    __________   ______  " + star);
			System.out.println(star +"|   \\   |      _|   |__     ___| |      \\  "+ star);
			System.out.println(star+"|    \\  |     |         |   |    |       |    " + star);	
			System.out.println(star +"| /\\  |  \\     \\        |   |    |       |  " + star);
			System.out.println(star + "| __  |   |     |       |   |     |       |"+ star);
			System.out.println(star + "|  _  | __|     |       |   |     |       |"+ star);
			System.out.println(star +"|_| |_| |_______|       |___|     |_______|" + star +  "\npress any key to start");
			
			
			
		}
		
		public String createScanner(String scannerTopic) {
		
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the  " + scannerTopic);
			String  output = input.nextLine();
			
			return output;
		}
		
		public void putClassInMap( HashMap<String, String> aMap  , String aKey, String aMenu) {
			
			aMap.put( aKey, aMenu );
			
		}
		
		
		
		public void drawSquares(Grid g) {
			
			for(int i = 0 ; i < g.getRowSize(); i++) {
				
				for(int j = 0; j < g.getColumnSize(); j++) {
					
					g.getGrid()[i][i] = g.getSymbol();
					
				}
			}
			
		}
		
		public String displayGridMenu() {
			Grid g = new Grid(50,50, "*");
			return g.outputGrid();
		}
		
		
		
		
		public void searchForMethod(HashMap<String, Class<?>> map, String aKey) {
			
			Method determinedMenuMethod = null;
			Class<?> myClass = map.get(aKey);
			
			for( Method method: myClass.getMethods()) {
				
				
				
				if( method.getName().contentEquals("displayMenu") ) {
					
					System.out.println("Method found.");
					
					
				}
				
			}
			
			
		}
		
		
		
		
		
		
		public String getMenuOption() {
			return "";
		}
		
		
		
		public static void main(String[] args) {
			
			
			Main textBasedApp = new Main();
			Scanner waitForButton = new Scanner(System.in);
			textBasedApp.titlePage();
			String keyPressed = waitForButton.nextLine();
			
		
			textBasedApp.myUniverse = new Universe();
			
			
			
			textBasedApp.myUniverse.displayMenu();
			Scanner userInput = new Scanner(System.in);
			System.out.println("What galaxy would you like to visit? : ");
			String userAnswer = userInput.nextLine();
			
			while( textBasedApp.myUniverse.getGalaxies().containsKey(userAnswer) == false ) { //Checks if userAnswer is in HashMap of classes.
				
				System.out.println("Does not exist, try again ");
				userAnswer = userInput.nextLine();
			}
			
			
			if( textBasedApp.myUniverse.getGalaxies().containsKey(userAnswer) ) {
				System.out.println("Class found!");
				Class<?> currentClass = textBasedApp.myUniverse.getGalaxies().get(userAnswer);
				
				
				if ( currentClass == MilkyWay.class) {
					MilkyWay milky = new MilkyWay();  // Cannot make an instance of a generic class since Java is statically typed. Open to other solutions.
					milky.displayMenu();
					Scanner reader = new Scanner(System.in);
					System.out.println("Search for any object in the Milky Way");
					String userIn = reader.nextLine();
					
					
					
					while( textBasedApp.myUniverse.getClasses().containsKey(userIn) == false ) {
						System.out.println("Null, try again");
						userIn = reader.nextLine();
					}
					Class<?> nextClass = textBasedApp.myUniverse.getClasses().get(userIn);
					if ( nextClass == Planet.class ) {
						Planet p = new Planet();
						System.out.println(p.getPlanetDescription());
						System.out.println(p.displayMenu());
						Scanner planetReader = new Scanner(System.in);
						System.out.println("What planet would you like to know about? :");
						String planetUserInput = planetReader.nextLine();
						
						if (planetUserInput.equalsIgnoreCase("Earth")) {
							Earth e = new Earth();
							System.out.println(e.getPlanetDescription());
						}
						else {
							System.out.println("Planet does not exist in the database");
						}
					}
					
					else if ( nextClass == Stars.class)  {
						Stars s = new Stars();
						System.out.println(s.displayMenu());
					}
					else {
						System.out.println(" Null ");
					}
					
				}
				
				else {
					System.out.println("Doesn't exist");
				}
				
			}
			else {
				
				System.out.println("That class doesn't exist. Try again.");
				
				
			}
		
			
			
			
			 
			}
}
