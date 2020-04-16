package controller;
import logic.*;

import GUI.*;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

/*******
 * Class PlanetListener is the seperate event handler class that listens for certain GUI actions so that the 
 * controller class can act accordingly.
 * 
 *
 */

public class PlanetListener implements EventHandler<MouseEvent>{
			
			private VenusDisplay view;
			private Controller c;
			
			public PlanetListener(VenusDisplay v) {
				this.view = v;
				
			}
			
			/*******
			 * This is where the listener brings up the controller to allow the GUI to access the logic classes to get
			 * data on a certain property of a planet. That being its rotational speed. So when a user clicks on the sphere,(that being venus),
			 * the listener asks the controller to ask the planet class for venus's rotational speed. It then returns that value back 
			 * to the GUI and adjusts the animation and rotationalSpeed of the planet itself. Keep in mind that this is a one time action.
			 * When you click once, the planet goes as fast as the logic code says and it cannot be modified unless you close the window and 
			 * try again.
			 */
			@Override
			public void handle(MouseEvent event) {
				
				
				Controller c = new Controller(view, new Planet("Venus",4.867*Math.pow(10, 24),6.0518*Math.pow(10, 6)));
				System.out.println("Before: "+ c.getView().getAngleRate());
				double oldRotationalSpeed = c.getView().getAngleRate();
				
				
				
				double rotationalSpeed = c.getModel().getRotationalSpeed();
			
					c.getView().setAngleRate(rotationalSpeed);
				}
			
					
				
				
				
				
			}
			
		