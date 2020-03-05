package GUI;
/*
 * MainGUI class corresponds to Main logic class.
 * 
 */


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;


public class MainGUI extends Application{
	
	private Button titlePageButton;
	private Button andromedaButton;
	private Button milkyWayButton;
	private TextField serachBar;
	private int xCoord;
	private int yCoord;
	private Stage window;
	private Image image1;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		Scene introScreen;
		Scene galaxyMenu;
		Scene defaultScene = new Scene(new VBox(10), 200,200);
		
		
		
		titlePageButton = new Button("START");
		
		
		//layout1 
		
		StackPane group = new StackPane();
		VBox root = new VBox();
		
		
		
		
		 introScreen = new Scene(group , xCoord,yCoord);
		
		root.getChildren().add(titlePageButton);
		
		group.getChildren().add(root);
		group.setAlignment(Pos.CENTER);
		
		
		
		
		
		
	
		window.setScene(introScreen);
		
		// Buttons for galaxy menu
		andromedaButton = new Button("Andromeda");
		milkyWayButton = new Button("Milky Way");
		
		//layout for galaxyMenu
		FlowPane flowPane = new FlowPane();
		VBox galaxyVBox = new VBox(10);
		
		galaxyVBox.getChildren().addAll( andromedaButton, milkyWayButton);
		
		flowPane.getChildren().add(galaxyVBox);
		flowPane.setAlignment(Pos.CENTER);
		
		
		andromedaButton.setOnAction(e -> 
		{ 	
			window.setScene(defaultScene);
			System.out.println("Testing menu switch.");
		}
		);
		milkyWayButton.setOnAction(e -> {
			window.setScene(defaultScene);
			System.out.println("Clicked the milky way!");
		});
		
		galaxyMenu = new Scene(flowPane, 500,500);
		titlePageButton.setOnAction(e ->{ 
			window.setScene(galaxyMenu);
			System.out.println("Menu changed!");
			
			});
		
		window.show();
		
		
	}
	
}
