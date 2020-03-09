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

/* a GUI version of the galaxy text based class which creates two buttons 
namely Andromeda and Milky Way and aligns them to the center of the stage */
public class GalaxyMenuGUI extends Application {
	
	// creating buttons for the galaxy
	private Button andromedaButton;
	private Button milkyWayButton;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception {
	
	FlowPane flowPane = new FlowPane();    // creating a flowpane
	VBox root = new VBox(10);              // creating a root of vertical box
	
	root.getChildren().addAll( new Button("Andromeda"), new Button("Milky Way"));
	
	flowPane.getChildren().add(root);
	flowPane.setAlignment(Pos.CENTER);    // aligning the buttons to the center of the stage
	
	
	primaryStage.setScene(new Scene(flowPane));
	primaryStage.show();
		
			
	}

	
}
