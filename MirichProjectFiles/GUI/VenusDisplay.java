package GUI;

import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Sphere;
/* class VenusDisplay
 * This class is a GUI version of the Venus text based class which 
 * displays Venus visually
 *
 */
public class VenusDisplay {
		// instance variables of Venus
		private Image venusBackground;
		private ImageView imageView = new ImageView();
		
		public VenusDisplay() {
			venusBackground = new Image("SpaceBackGround.jpg");
			imageView = new ImageView();
		}
		
		static void display() {
		
		
		
		Stage window = new Stage();
		Sphere sphere = new Sphere(100);
		
		window.initModality(Modality.APPLICATION_MODAL);
		
		Button exit = new Button("EXIT VENUS");
		
		exit.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				window.close();
			}
		});
		
		VBox vbox = new VBox(20);
		vbox.getChildren().add(exit);
		vbox.setAlignment(Pos.BOTTOM_CENTER);
		FlowPane flowPane = new FlowPane();
		flowPane.getChildren().addAll(exit,sphere);
	
		Scene scene = new Scene(flowPane,400,400);
	
		window.setScene(scene);
		window.showAndWait();
		}
	
	
}
