package GUI;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/* class GalaxyMenuGUI
 * This class is a GUI version of the Galaxy text based class which creates two buttons 
 * Andromeda and Milky Way
 * 
 * It contains the following instance variables:
 * andromedaButton: a Button for Andromeda galaxy
 * milkyWayButton: a Button for Milky Way galaxy
 */
public class GalaxyMenuGUI extends Application {
	
	private Button andromedaButton;
	private Button milkyWayButton;
	
	/*****
	 * Main method of the GalaxyMenuGUI class
	 *
	 */
	public static void main(String[] args) {
		launch(args);
	}
	
	/*******
	 * start(Stage)
	 *
	 * @param primaryStage the main stage for the method
	 * This method sets a stage and creates buttons namely
	 * Andromeda and Milky Way, aligns them to the center of the screen then
	 * creates a scene 
	 */
	public void start(Stage primaryStage) throws Exception {
	
	andromedaButton = new Button("Andromeda");
	milkyWayButton = new Button("Milky Way");
	FlowPane flowPane = new FlowPane();
	VBox root = new VBox(10);
	
	root.getChildren().addAll( andromedaButton, milkyWayButton);
	
	flowPane.getChildren().add(root);
	flowPane.setAlignment(Pos.CENTER);
	
	Scene galaxyMenu = new Scene(flowPane, 500,500);
	
	primaryStage.setScene(galaxyMenu);
	primaryStage.show();
		
			
	}

	
}
