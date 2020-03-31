package Controllers;
import GUI.GUIApp;

import GUI.GUIApp;
import LogicClasses.*;
/*
 * Controller class communicates with GUI and textBased logic.
 * 
 */



public class Controller {
			// instance variables of controller
			private GUIApp myGUI;
			private Universe myUniverse;
			
			public Controller() {
				
				GUIApp myGUI = new GUIApp();
				myUniverse = new Universe();
				
				
			}
			
			// gets item requested by user
			public String getUserRequestedSearch(String userInput) {
				return myUniverse.getItemByName(userInput);
			}
			// updates menus
			public void update() {
				myUniverse.updateMenus();
			}
			
			
			
			
			
}
