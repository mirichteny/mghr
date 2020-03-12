
import GUI.MainGUI;
import LogicClasses.*;
/*
 * Controller class communicates with GUI and textBased logic.
 * 
 */



public class MainController {
	
			private MainGUI myGUI;
			private Universe myUniverse;
			
			public MainController() {
				myGUI = new MainGUI();
				myUniverse = new Universe();
				
				
			}
			
			
			public String getUserRequestedSearch(String userInput) {
				return myUniverse.getItemByName(userInput);
			}
			
			public void update() {
				myUniverse.updateScenes();
			}
			
			
			
			
			
}
