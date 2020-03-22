package GUI;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

/* class Earth_GUI
 * This class is a GUI version of the Earth text based class which creates a button 
 * Countries and creates a text area saying "Earth description"
 *
 */
public class Earth_GUI extends Application{
	
      /****** 
       * Main method of the class
       *
       */
      public static void main (String[] args)
   {
      launch (args);
   }
   
   /********
   * start(Stage)
   *
   * This method sets up a stage and aligns the button "Countries" properly 
   * and a text field to display the Earth description. Then it creates a scene 
   * and sets the title "Earth" and displays the stage 
   *
   * @param primaryStage the stage needed for displaying the scenes
   * @throws the Exception of any nature that might occur
   *
   */
   public void start(Stage primaryStage) throws Exception
   {
	  BorderPane earthBorder = new BorderPane();

	  // FlowPane with a TextField and TextArea
	  FlowPane centerPaneEarth = new FlowPane();
	  centerPaneEarth.setVgap(5);
	  centerPaneEarth.setHgap(5);
	   
	  // Label and textfield for name
	  centerPaneEarth.getChildren().add (new Label("Description"));
	  TextField txtName = new TextField ("Enter description.");
	  txtName.setPrefWidth (100);
	  centerPaneEarth.getChildren().add (txtName);
	   
	  // Label and textarea for description
	  centerPaneEarth.getChildren().add (new Label ("Info"));
	  TextArea txtInfo = new TextArea ("Earth description");
	  txtInfo.setPrefWidth(200);
	  txtInfo.setPrefRowCount(8);
	  txtInfo.setPrefColumnCount(40);
	  centerPaneEarth.getChildren().add(txtInfo);

	  //HBox with button
	  HBox topPane = new HBox();
	  topPane.getChildren().add(new Button("Countries"));

	  // Adds the FlowPane to the center
	  earthBorder.setCenter(centerPaneEarth);

   	  Scene scene = new Scene(earthBorder, 450, 250);
          primaryStage.setTitle("Earth");
      	  primaryStage.setScene(scene);
     	  primaryStage.show();
    }
}



