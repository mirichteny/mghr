import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.scene.control.Button;

/* This class is a GUI version of the Planets text based class which creates eight buttons 
namely Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus and Neptune and aligns them to the center of the stage */
public class PlanetsGUI extends Application {
  public static void main(String[] args)
   {
      launch(args);
   }

   
   public void start(Stage primaryStage) throws Exception
   {
	   FlowPane flowPane = new FlowPane();
	   HBox root = new HBox(20);         // creating a root of horizontal box

	   
	   // adding all the buttons created
	   root.getChildren().add(new Button("Mercury"));
	   root.getChildren().add(new Button("Venus"));
	   root.getChildren().add(new Button("Earth"));
	   root.getChildren().add(new Button("Mars"));
	   root.getChildren().add(new Button("Jupiter"));
	   root.getChildren().add(new Button("Saturn"));
	   root.getChildren().add(new Button("Uranus"));
	   root.getChildren().add(new Button("Neptune"));

	   flowPane.getChildren().add(root);
	   flowPane.setAlignment(Pos.CENTER);           // aligning the planet buttons to the center
	   primaryStage.setTitle("Planets");
	   primaryStage.setScene(new Scene(flowPane));
	   primaryStage.show();
   }
}

