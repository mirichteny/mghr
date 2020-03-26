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

/* class StarsGUI
 * This class is a GUI version of the Stars text based class which creates buttons
 * for various planets namely Sun, Hypergiants, Supergiants, Giants, Subgiants, Subdwarfs, Dwarfs and Neutron Stars.
 *
 */
public class StarsGUI extends Application {
	
	private Button sunButton;
	private Button hypergiantsButton;
	private Button supergiantsButton;
	private Button giantsButton;
	private Button subgiantsButton;
	private Button subdwarfsButton;
	private Button dwarfsButton;
	private Button neutronstarsButton;
	
	 /****** 
         * Main method of the class
         *
         */
	public static void main(String[] args) {
		launch(args);
	}
	
       /********
        * start(Stage)
   	*
   	* This method sets up a stage and aligns the buttons properly to the center of the screen
   	* Then it creates a scene and displays the stage with the scene
   	*  
   	*
   	* @param primaryStage the stage needed for displaying the scenes
   	* @throws the Exception of any nature that might occur
   	*
   	*/
	public void start(Stage primaryStage) throws Exception {
	
	FlowPane flowPane = new FlowPane();
	HBox root = new HBox(10);  // root of horizontal box
	
	root.getChildren().addAll(new Button("Sun"), new Button("Hypergiants"), new Button("Supergiants"), new Button("Giants"), new Button("Subgiants"), new Button("Subdwarfs"), new Button("Dwarfs"), new Button("Neutron Stars") );
	
	flowPane.getChildren().add(root);
	flowPane.setAlignment(Pos.CENTER);    // aligning the buttons to the center
	
	
	primaryStage.setScene(new Scene(flowPane,500,500) );
	primaryStage.show();
		
			
	}

	
		
		
		
	

}
