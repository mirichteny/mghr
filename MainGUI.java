package GUI;
/*
 * MainGUI class corresponds to Main logic class.
 * 
 */


import javafx.application.Application;
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
	private TextField serachBar;
	private int xCoord;
	private int yCoord;
	private Scene introScreen,GalaxyMenu;    // Every scene will have a menu screen that corresponds to each class.
	private Stage window;
	private Image image1;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		
		StackPane group = new StackPane();
		VBox root = new VBox();
		
		
		window = primaryStage;
		window.setTitle("ASTRA 0.0");
		
		
		
		titlePageButton = new Button("START");
		titlePageButton.setLayoutX(Math.floor((1/2)*xCoord));
		
		introScreen = new Scene(group , xCoord,yCoord);
		root.getChildren().add(new Button("Test"));
		
		group.getChildren().add(root);
		
		
		
		
	
		window.setScene(introScreen);
		window.show();
		
		
	}
	
}
