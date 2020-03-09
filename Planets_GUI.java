import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Pos;
import javafx.scene.control.Button;

/* This class is a GUI version of the Planets text based class which creates eight buttons 
namely Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus and Neptune and aligns them to the center of the stage */
public class Planets_GUI extends Application {
  public static void main(String[] args)
   {
      launch(args);
   }

   
   public void start(Stage primaryStage) throws Exception
   {
	   FlowPane root = new FlowPane();
	   root.setVgap(20);
	   root.setHgap(10);
	   
	   // adding all the buttons created
	   root.getChildren().add(new Button("Mercury"));
	   root.getChildren().add(new Button("Venus"));
	   root.getChildren().add(new Button("Earth"));
	   root.getChildren().add(new Button("Mars"));
	   root.getChildren().add(new Button("Jupiter"));
	   root.getChildren().add(new Button("Saturn"));
	   root.getChildren().add(new Button("Uranus"));
	   root.getChildren().add(new Button("Neptune"));

	   Scene scene = new Scene(root, 500, 200);
	   FlowPane.setAlignment(Pos.CENTER);
	   primaryStage.setTitle("Planets");
	   primaryStage.setScene(scene);
	   primaryStage.show();
   }
}

}
