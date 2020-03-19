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

public class GalaxyMenuGUI extends Application {
	
	private Button andromedaButton;
	private Button milkyWayButton;
	
	public static void main(String[] args) {
		launch(args);
	}
	
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
