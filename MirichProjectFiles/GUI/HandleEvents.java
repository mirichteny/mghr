package GUI;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HandleEvents implements EventHandler<ActionEvent> {
	
	private Scene currentScene,previousScene;
	private Stage primaryStage;

	public HandleEvents() {
		
	}
	
	public HandleEvents(Stage aStage, Scene aCurrentScene, Scene aPreviousScene) {
		this.currentScene = aCurrentScene;
		this.previousScene = aPreviousScene;
		this.primaryStage = aStage;
	}
	
	public HandleEvents(Scene aPreviousScene) {
		this.previousScene = aPreviousScene;
	}
	
	
	
	public Scene getCurrentScene() {
		return currentScene;
	}
	
	public Scene getPreviousScene() {
		return previousScene;
	}
	
	@Override
	public void handle(ActionEvent event) {
		
		
	}

}
