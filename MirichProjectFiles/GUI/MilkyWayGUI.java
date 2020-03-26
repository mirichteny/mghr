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

/* class MilkyWayGUI
 * This class is a GUI version of the MilkyWay text based class which creates buttons namely
 * Search and Back which lets the user search by putting the keywords and to go back to the 
 * previous menu. It also creates a label asking the user a question and giving him the 
 * possible keywords that can be entered in the search bar
 * 
 */
public class MilkyWayGUI extends Application {

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
   	* This method sets up a stage and aligns the buttons properly 
   	* and a text field to display the label asking the user to input the proper 
	* keywords in the search bar.
   	*
   	* @param primaryStage the stage needed for displaying the scenes
   	* @throws the Exception of any nature that might occur
   	*
   	*/
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
