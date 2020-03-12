package javaFX;

// importing necessary packages for javaFX
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/* This class is a GUI version of the countries text based class which creates five buttons 
namely Canada, USA, England, Australia and Mexico and aligns them to the center of the stage */
public class Countries extends Application {
	// creating buttons for some countries
	private Button canadaButton;
	private Button usaButton;
	private Button englandButton;
	private Button australiaButton;
	private Button mexicoButton;

	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception {
	// creating a flow pane and a root of horizontal box
	FlowPane flowPane = new FlowPane();
	HBox root = new HBox(20);
	
	root.getChildren().addAll(new Button("Canada"), new Button("USA"), new Button("England"), new Button("Australia"), new Button("Mexico") );
	
	flowPane.getChildren().add(root);
	// aligning the buttons to the center of the stage
	flowPane.setAlignment(Pos.CENTER);
	
	
	primaryStage.setScene(new Scene(flowPane));
	primaryStage.show();
		
			
	}}
