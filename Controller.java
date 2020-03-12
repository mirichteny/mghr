package Controllers;
import GUI.GUIApp;

import GUI.GUIApp;
import LogicClasses.*;
/*
 * Controller class communicates with GUI and textBased logic.
 * 
 */



public class Controller {
	
			private GUIApp myGUI;
			private Universe myUniverse;
			
			public Controller() {
				
				GUIApp myGUI = new GUIApp();
				myUniverse = new Universe();
				
				
			}
			
			
			public String getUserRequestedSearch(String userInput) {
				return myUniverse.getItemByName(userInput);
			}
			
			public void update() {
				myUniverse.updateMenus();
			}
			
			
			
			
			
}
