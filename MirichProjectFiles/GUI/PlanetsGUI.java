package GUI;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;

/* class PlanetsGUI
 * This class is a GUI version of the Planets text based class which creates buttons
 * for various planets namely Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus and Neptune.
 *
 */
public class PlanetsGUI extends Application {
	
  /****** 
   * Main method of the class
   *
   */	
  public static void main(String[] args)
   {
      launch(args);
   }

  /********
   * start(Stage)
   *
   * This method sets up a stage and aligns the buttons properly 
   * Then it creates a scene and sets the title as Planets and displays the stage with the scene
   *  
   *
   * @param primaryStage the stage needed for displaying the scenes
   * @throws the Exception of any nature that might occur
   *
   */
   public void start(Stage primaryStage) throws Exception
   {
	FlowPane root = new FlowPane();
        root.setVgap(20);
	root.setHgap(10);

	root.getChildren().add(new Button("Mercury"));
	root.getChildren().add(new Button("Venus"));
	root.getChildren().add(new Button("Earth"));
        root.getChildren().add(new Button("Mars"));
        root.getChildren().add(new Button("Jupiter"));
        root.getChildren().add(new Button("Saturn"));
        root.getChildren().add(new Button("Uranus"));
        root.getChildren().add(new Button("Neptune"));

        Scene scene = new Scene(root, 500, 200);
        primaryStage.setTitle("Planets");
        primaryStage.setScene(scene);
        primaryStage.show();
   }
}


