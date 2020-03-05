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

public class Stars extends Application {
	
	private Button sunButton;
	private Button hypergiantsButton;
	private Button supergiantsButton;
	private Button giantsButton;
	private Button subgiantsButton;
	private Button subdwarfsButton;
	private Button dwarfsButton;
	private Button neutronstarsButton;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception {
	
	FlowPane flowPane = new FlowPane();
	HBox root = new HBox(10);
	
	root.getChildren().addAll(new Button("Sun"), new Button("Hypergiants"), new Button("Supergiants"), new Button("Giants"), new Button("Subgiants"), new Button("Subdwarfs"), new Button("Dwarfs"), new Button("Neutron Stars") );
	
	flowPane.getChildren().add(root);
	flowPane.setAlignment(Pos.CENTER);
	
	
	primaryStage.setScene(new Scene(flowPane));
	primaryStage.show();
		
			
	}

	
		
		
		
	

}
