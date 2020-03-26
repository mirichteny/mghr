package GUI;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**********
	 * class HandleEvents
	 *
	 * The HandleEvents class is just a handler for the other classes
	 *  
	 * It contains the following instance variables:
	 * currentScene: a Scene which is running currently
	 * previousScene: a Scene which was used before the current scene
	 * primaryStage: a Stage where different scenes are displayed
	 *
	 */
public class HandleEvents implements EventHandler<ActionEvent> {
	
	private Scene currentScene,previousScene;
	private Stage primaryStage;

	/***
	 * A default constructor of the class
	 *
	 */
	public HandleEvents() {
		
	}
	
	/***
	 * HandleEvents(Stage, Scene, Scene)
	 *
	 * @param aStage the stage to be set for the class
	 * @param aCurrentScene the current scene on the stage
	 * @param aPreviousScene the scene displayed on the stage before the current scene
	 * This is a constructor for the HandleEvents class 
	 *
	 */
	public HandleEvents(Stage aStage, Scene aCurrentScene, Scene aPreviousScene) {
		this.currentScene = aCurrentScene;
		this.previousScene = aPreviousScene;
		this.primaryStage = aStage;
	}
	
	/***
	 * HandleEvents(Scene)
	 *
	 * @param aPreviousScene the scene displayed on the stage before the current scene
	 * This is a constructor for the HandleEvents class 
	 *
	 */
	public HandleEvents(Scene aPreviousScene) {
		this.previousScene = aPreviousScene;
	}
	
	
	/***
	 * getCurrentScene() 
	 *
	 * @return currentScene the current scene being displayed on the stage
	 * This is a getter method used to return the current scene
	 *
	 */
	public Scene getCurrentScene() {
		return currentScene;
	}
	
	
	/***
	 * getPreviousScene() 
	 *
	 * @return previousScene the previous scene displayed on the stage before the current scene
	 * This is a getter method used to return the previous scene
	 *
	 */
	public Scene getPreviousScene() {
		return previousScene;
	}
	
	/***
	 * handle(ActionEvent)
	 *
	 * @param event the event used by the handle method
	 * This method is a override method 
	 *
	 */
	@Override
	public void handle(ActionEvent event) {
		
		
	}

}
