package GUI;
/*******
 * This class is referenced when wanting to view a celestial object in a popup window.
 */

import javafx.stage.Modality;
import javafx.stage.Stage;
import controller.PlanetListener;
import javafx.animation.AnimationTimer;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Camera;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Transform;

public class VenusDisplay {
		

		
		private double deltaAngleRate = 1;
		private final int WIDTH = 800;
		private final int HEIGHT = 400;
		private double anchorX, anchorY;
		private double anchorAngleX = 0;
		private double anchorAngleY = 0;
		private final DoubleProperty ANGLE_X = new SimpleDoubleProperty(0);
		private final DoubleProperty ANGLE_Y = new SimpleDoubleProperty(0);
		private CustomGroup group = new CustomGroup();
		
		
		/*******
		 * Getter for instance var deltaAngleRate
		 * @return deltaAngleRate
		 */
		
		public double getAngleRate() {
			return this.deltaAngleRate;
		}
		
		/*******
		 * Mutator for instance var deltaAngleRate, sets it to anAngleRate
		 * @param anAngleRate
		 */
		public void setAngleRate(double anAngleRate) {
			this.deltaAngleRate = anAngleRate;
		}
		
		/*******
		 * createPlanet()
		 * creates a sphere with a specific material and size and returns the created sphere.
		 * @return Sphere
		 */
		private Sphere createPlanet() {
			PhongMaterial material = new PhongMaterial();
			material.setDiffuseMap(new Image("images/VenusAtmosphereTexture.png"));
			Sphere sphere = new Sphere(200);
			
			sphere.setMaterial(material);
			
			return sphere;
		}
		
		/*******
		 * activateScrollMouse()
		 * This method allows you to be able to hover over a planet being displayed and scroll back and forwards to bring the 
		 * planet forward or backwards. This is possible using the mouse scroll event handler.
		 * @param group , the group is usually contians the sphere made from method createPlanet()
		 * @param aScene, scene where the sphere resides.
		 */
		public void activateScrollMouse(CustomGroup group, Scene aScene){
			Rotate xRotate = new Rotate(0, Rotate.X_AXIS);
			Rotate yRotate = new Rotate(0, Rotate.Y_AXIS);
			
			group.getTransforms().addAll(xRotate, yRotate);
			xRotate.angleProperty().bind(ANGLE_X); //Binds two angles together, if one changes so does the other.
			yRotate.angleProperty().bind(ANGLE_Y);
			
			/*******
			 * setOnMousePressedEvent 
			 * stores x and y cooordinates of mouse.
			 */
		
			PlanetListener p = new PlanetListener(this);
			group.setOnMouseClicked(p);
			
			group.addEventHandler(ScrollEvent.SCROLL, new EventHandler<ScrollEvent>() {

				@Override
				public void handle(ScrollEvent event) {
					double movement = event.getDeltaY(); // <-- Gets how much mouse was scrolled.
					group.translateZProperty().set(group.getTranslateZ() + movement);
					
				}
				
			});
		}
		
		/*******
		 * givePlanetLife()
		 * allows the sphere to be able to rotate by a certain angle each frame during an animtion.
		 * This animation happens as long as the popup window is not closed.
		 * rotateByY() has the parameter deltaAngleRate that is determined from the controller class(which is how
		 * MVC is implemented for us)
		 */
		public void givePlanetLife() {
			
			AnimationTimer timer = new AnimationTimer() {

				@Override
				public void handle(long current) {
					group.rotateByY(deltaAngleRate);
					
				}
				
			};
			
			timer.start();
		}
		
		/*******
		 * display()
		 * This method is called from the GUIApp class and is the reason how the popup windows work.
		 * They use a method called initModality. This defines a modal window that does not allow you to go to the main window
		 * without closing the popup window first.
		 * This method is also where the camera is set up with bounds between 1 pixel and 1 thousand pixels. 
		 * WARNING: When using the application, scrolling past 10000 or more than
		 * 1 pixel backwards will cause the sphere to dissapear from view, ultimately
		 * making you have to close the popup window and open it again.
		 */
		
		 public void display() {
		
			
		
		
		Stage window = new Stage();
		
		
		window.initModality(Modality.APPLICATION_MODAL);
		
		
		
		Camera camera = new PerspectiveCamera(true);
		/**
		 * Bounds of camera (between 1 and 1000 pixels) Any more and object dissapears
		 */
		camera.setNearClip(1);
		camera.setFarClip(10000);
		camera.translateZProperty().set(-1000);
		
		
		group.getChildren().addAll(createPlanet());
		Scene scene = new Scene(group, WIDTH , HEIGHT,true);
		scene.setFill(Color.BLACK);
		
		scene.setCamera(camera);
		
		activateScrollMouse(group,scene);
		givePlanetLife();
		window.setScene(scene);
		window.showAndWait();
		}
		
		 /*******
			 * This is a class inside of a class. 
			 * This class is an extension of the final class group. So when creating a new
			 * CustomGroup, the custom group has access to everything Group has, but adds a new method called
			 *RotateByY()
			 *Important Note: Idea of creating a custom class to handle rotation and how it works is not our groups idea,
			 *all  credit goes to @GenuineCoder. Source: https://www.genuinecoder.com/javafx-3d-transform-objects-with-keyboard-input/
			 */
		 
		class CustomGroup extends Group {
			Rotate myRotation;
			Transform myTransform = new Rotate();
			
		/*******
		 * rotateByY()
		 * Takes a sphere and uses transformations to rotate the sphere by anAngle about the Y AXIS.
		 * @param anAngle
		 */
			
			public void rotateByY(double anAngle) {
				myRotation = new Rotate(anAngle, Rotate.Y_AXIS); //Rotate.Y_AXIS is a constant value.
				myTransform = myTransform.createConcatenation(myRotation);
				this.getTransforms().clear();
				this.getTransforms().addAll(myTransform);
			}
			
		
		}
	}
	

