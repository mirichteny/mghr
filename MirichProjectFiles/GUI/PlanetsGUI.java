package GUI;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
public class PlanetsGUI extends Application {
  public static void main(String[] args)
   {
      launch(args);
   }

   
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


