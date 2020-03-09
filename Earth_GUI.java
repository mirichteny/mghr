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

public class Earth_GUI extends Application{
      public static void main (String[] args)
   {
      launch (args);
   }
   
   public void start(Stage primaryStage) throws Exception
   {
	  BorderPane root = new BorderPane();

	  // FlowPane with a TextField and TextArea
	  FlowPane centerPane = new FlowPane();
	  centerPane.setVgap(5);
	  centerPane.setHgap(5);
	   
	  // Label and textfield for name
	  centerPane.getChildren().add (new Label("Description"));
	  TextField txtName = new TextField ("Enter description.");
	  txtName.setPrefWidth (100);
	  centerPane.getChildren().add (txtName);
	   
	  // Label and textarea for description
	  centerPane.getChildren().add (new Label ("Info"));
	  TextArea txtInfo = new TextArea ("Earth description");
	  txtInfo.setPrefWidth(200);
	  txtInfo.setPrefRowCount(8);
	  txtInfo.setPrefColumnCount(40);
	  centerPane.getChildren().add(txtInfo);

	  //HBox with button
	  HBox topPane = new HBox();
	  topPane.getChildren().add(new Button("Countries"));

	  // Adds the FlowPane to the center
	  root.setCenter(centerPane);

   	  Scene scene = new Scene(root, 450, 250);
          primaryStage.setTitle("Earth");
      	  primaryStage.setScene(scene);
     	  primaryStage.show();
    }
}



