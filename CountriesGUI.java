package javaFX;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Countries extends Application {
	
	private Button canadaButton;
	private Button usaButton;
	private Button englandButton;
	private Button australiaButton;
	private Button mexicoButton;

	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception {
	
	FlowPane flowPane = new FlowPane();
	HBox root = new HBox(20);
	
	root.getChildren().addAll(new Button("Canada"), new Button("USA"), new Button("England"), new Button("Australia"), new Button("Mexico") );
	
	flowPane.getChildren().add(root);
	flowPane.setAlignment(Pos.CENTER);
	
	
	primaryStage.setScene(new Scene(flowPane));
	primaryStage.show();
		
			
	}}
