package controller;

import java.util.EventListener;

import GUI.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import logic.*;

/*******
 * This is our application to MVC example for our application.
 * It involves communicating with the Universe and Venus Display Class(Which is part of our GUIApp).
 *
 */

public class Controller {
		
		/*******
		 * Instance variables:
		 * @param view - This is the venus display which the controller listens for in another class called planet listener.
		 * @param model - That being the planet class which the controller asks for certain data from.
		 * @param on - unused boolean method that was supposed to be used as a switch.
		 */
	
		private VenusDisplay view;
		private Planet model;
		private boolean on;
	
		
		/*******
		 * Controller constructor, takes the view(That being VenusDisplay), and the model or logic (That being the Planet class) so
		 * the controller can do the communication between the logic and the gui code.
		 * @param v - VenusDisplay, part of the gui classes.
		 * @param p - Planet logic class
		 */
		public Controller(VenusDisplay v, Planet p) {
					
			this.view = v;
			this.model = p;
			this.on = true;
			
		}
		
		/*******
		 * Controller toCopy constructor.
		 * @param p
		 */
		public Controller(Controller p) {
			this(p.view,p.model);
		}
		
		public VenusDisplay getView() {
			return this.view;
			
		}
		
		public Planet getModel() {
			return this.model;
		}
		
		/*******
		 * Unused method, but the idea was as follows,
		 * After the controller updates the information to the GUI about rotational speed, if the user clicks again, the instance var
		 * on switches to off and the rotational speed of the planet venus goes back to normal. And when switched back to on, it goes back
		 * to its fast state.
		 * @return on - boolean
		 */
		
		public boolean isSwitchOn() {
			
			return on;
		}
		
		public void setSwitchOff() {
			this.on = false;
		}
		
		public void setSwitchOn() {
			this.on = true;
		}

		
	
					
		
	
}
