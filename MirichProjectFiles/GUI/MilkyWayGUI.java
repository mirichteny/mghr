package GUI;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MilkyWayGUI extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception {
		
		Button searchButton = new Button("Search");
		Button galaxyBackButton = new Button("Back");
		galaxyBackButton.setAlignment(Pos.BOTTOM_LEFT);
		TextField userInput = new TextField();
		Label instructions = new Label("What objects in the milky way do you want to know about?" + "\n" + "Keywords are : Planets,Stars:");
		HBox hbox = new HBox(30);
		VBox vbox = new VBox(30);
	
		
		//Layout
		hbox.getChildren().addAll(searchButton,userInput);
		vbox.getChildren().addAll(hbox,instructions);
		
		
		FlowPane flowPane = new FlowPane();
		flowPane.getChildren().addAll(vbox,galaxyBackButton);
		
		flowPane.setAlignment(Pos.BOTTOM_CENTER);
		flowPane.setOrientation(Orientation.VERTICAL);
		
		
		primaryStage.setScene(new Scene(flowPane, 500,300));
		
		primaryStage.show();
	}

}
