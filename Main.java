import java.lang.reflect.Method;
import java.util.*;
public class Main {

		private Universe myUniverse;    // itemCollection
		private HashMap< String , String > myMenus = new HashMap<>(); // HashMap of Menus
		
		
	
		
		
		/*
		 * Main constructor
		 */
		public Main() {
			
		}
		
	
		
		
		public void titlePage() {
			
			System.out.println(" ___     ________    __________   ______");
			System.out.println("|   \\   |      _|   |__     ___| |      \\");
			System.out.println("|    \\  |     |         |   |    |       |   ");	
			System.out.println("| /\\  |  \\     \\        |   |  |       |");
			System.out.println("| __  |   |     |       |   |     |       |");
			System.out.println("|  _  | __|     |       |   |     |       |");
			System.out.println("|_| |_| |_______|       |___|     |_______|" + "\npress any key to start");
			
			
			
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
		
		public void displayMenu( HashMap< String , String > myMenu , String theKey, int a ) { //Ignore "int a" , will replace after.
			
			
		}
		
		public Method displayMenu(HashMap<String, Class<?>> map, String aKey) {
			
			Method determinedMenuMethod = null;
			Class<?> myClass = map.get(aKey);
			
			for( Method method: myClass.getMethods()) {
				
				
				
				if( method.getName().contentEquals("displayMenu") ) {
					
					System.out.println("Method found.");
					determinedMenuMethod = (Method) method;
					
				}
				
			}
			return determinedMenuMethod;
			
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
			
			
			
			
			
		
			 
			
			}
}
