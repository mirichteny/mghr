package GUI;

import Controllers.Controller;


/*
 * MainGUI class corresponds to Main logic class.
 * 
 */


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;


public class GUIApp extends Application{
	
	
	
	private Button titlePageStartButton;
	private Button titlePageExitButton;
	private Button backButton;
	private Button backButtonGalaxy;
	private Button backButtonMilkyWay;
	private Button backButtonPlanets;
	private Button backButtonEarth;
	private Button backButtonStars;
	private Button backButtonAndromeda;
	private TextField serachBar;
	private	Stage window;
	private Image appBackground;
	private Scene currentScene,previousScene,introMenu,galaxyMenu,milkyWayMenu,andromedaMenu,planetMenu,starsMenu,earthMenu,emptyMenu;
	private String currentSceneName,previousSceneName,introMenuName,galaxyMenuName,milkyWayMenuName,andromedaMenuName,planetMenuName,starsMenuName,earthMenuName,emptyMenuName;
	private final int windowWidth = 700;
	private final int windowHeight = 700;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		window = primaryStage;
		appBackground = new Image("SpaceBackGround.jpg");
		ImageView imageView = new ImageView();
		imageView.setImage(appBackground);
		Color backgroundColor = Color.AQUAMARINE;
		
		backButtonGalaxy = new Button("Back");
		backButtonMilkyWay = new Button("Back");
		backButtonPlanets = new Button("Back");
		backButtonEarth = new Button("Back");
		backButtonStars = new Button("Back");
		backButtonAndromeda = new Button("Back");
		
		
		//Handling  backButton events
	
		
			//For galaxy
		backButtonGalaxy.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				window.setScene(introMenu);
			}
		});
		
		//For milky way
		backButtonMilkyWay.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				window.setScene(galaxyMenu);
			}
		});
				
			//For andromeda
		backButtonAndromeda.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				window.setScene(galaxyMenu);
			}
		});
				
			//For planets
		backButtonPlanets.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				
				window.setScene(milkyWayMenu);
				
				}
		});
		
		
			//For earth
		 backButtonEarth.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					window.setScene(planetMenu);
				}
			});
			
		
			//For stars
		backButtonStars.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				window.setScene(milkyWayMenu);
			}
		});
			
		
		//Instantiating title page buttons
		titlePageStartButton = new Button("START");
		titlePageExitButton = new Button("QUIT");
		
		//Handling button click for title page
		titlePageStartButton.setOnAction(new EventHandler<ActionEvent>(){
			
			public void handle(ActionEvent event) {
				window.setScene(galaxyMenu);
				currentScene = window.getScene();
				previousScene = introMenu;
				
				
				
				
				
			}
			
		});
		
		titlePageExitButton.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				System.out.println("Shutting down.");
				System.exit(0);
			}
			
		});
				
		
		//Making titlePage layout.
		VBox titlePageVBox = new VBox(30);
		HBox titlePageHBox = new HBox(30);
		titlePageVBox.getChildren().addAll(titlePageStartButton,titlePageExitButton);
		titlePageVBox.setAlignment(Pos.CENTER);
		
		StackPane titlePagePane = new StackPane();
		titlePagePane.getChildren().addAll(imageView,titlePageVBox);
		
		introMenu = new Scene(titlePagePane,windowWidth,windowHeight);
		introMenuName = "introMenu";
		
		//Galaxy Menu Buttons
		Button andromedaButton = new Button("Andromeda");
		Button milkyWayButton = new Button("Milky Way");
		
		
		//Handling button click for galaxies page
		
		andromedaButton.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				//window.setScene(andromedaMenu);
				System.out.println("Menu not created yet");
			}
			
		});
		
		milkyWayButton.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				window.setScene(milkyWayMenu);
				currentScene = window.getScene();
				previousScene = galaxyMenu;
			}
			
		});
		
		//layout for galaxyMenu
		
		FlowPane galaxiesLayout = new FlowPane();
		VBox galaxyVBox = new VBox(30);
		galaxyVBox.getChildren().addAll(andromedaButton,milkyWayButton,backButtonGalaxy);
		galaxiesLayout.getChildren().addAll(galaxyVBox);
		galaxiesLayout.setAlignment(Pos.CENTER);
		
		//Instantiating the galaxyMenu scene
		galaxyMenu = new Scene(galaxiesLayout, windowWidth,windowHeight);
		galaxyMenuName = "galaxyMenu";
		
		/*
		 * This would be the code for setting up the Andromeda contents.
		 * Skipped for now.
		 * 
		 */
		
		//Handling MilkyWay layout
		
		Button searchButton = new Button("Search");
		Button galaxyBackButton = new Button("Back");
		galaxyBackButton.setAlignment(Pos.BOTTOM_LEFT);
		TextField userInput = new TextField();
		Label instructions = new Label("What objects in the milky way do you want to know about?" + "\n" + "Keywords are : Planets,Stars:");
		HBox hbox = new HBox(30);
		VBox vbox = new VBox(30);
	
		
		//Layout
		hbox.getChildren().addAll(searchButton,userInput);
		vbox.getChildren().addAll(hbox,instructions);
		
		//Handling milkyWay Events
		
		searchButton.setOnAction(new EventHandler<ActionEvent>() {
			String galaxyUserOutput = userInput.getText();
			
			public void handle(ActionEvent event) {
				String galaxyUserOutput = userInput.getText();
				
				
				
				
				
				
				if( galaxyUserOutput.equalsIgnoreCase("Planets")) {
					window.setScene(planetMenu);
					currentScene = window.getScene();
					previousScene = milkyWayMenu;
					
				}
				else if( galaxyUserOutput.equalsIgnoreCase("Stars")) {
					window.setScene(starsMenu);
					currentScene = window.getScene();
					previousScene = milkyWayMenu;
				}
				else {
					System.out.println("Nothing found");
				}
			}
		});
		
		
		
		
		FlowPane flowPane = new FlowPane();
		flowPane.getChildren().addAll(vbox,backButtonMilkyWay);
		
		flowPane.setAlignment(Pos.CENTER);
		flowPane.setOrientation(Orientation.VERTICAL);
		
		//Defining milkyWay Scene
	
		milkyWayMenu = new Scene(flowPane, windowWidth,windowHeight);
		milkyWayMenuName = "milkyWayMenu";
		
		
		
		//Defining planet widgets
		Button mercuryButton = new Button("Mercury");
		Button venusButton = new Button("Venus");
		Button earthButton = new Button("Earth");
		Button marsButton = new Button("Mars");
		
		Button jupiterButton = new Button("Jupiter");
		Button saturnButton = new Button("Saturn");
		Button uranusButton = new Button("Uranus");
		Button neptuneButton = new Button("Neptune");
		
		earthButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				window.setScene(earthMenu);
			}
		});
		
		venusButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				VenusDisplay.display();
			}
		});
		
		
		
		//Defining planet layout
		FlowPane planetsLayout = new FlowPane();
	    planetsLayout.setVgap(20);
		planetsLayout.setHgap(10);

		planetsLayout.getChildren().addAll(mercuryButton,venusButton,earthButton,marsButton,saturnButton,jupiterButton,uranusButton,neptuneButton,backButtonPlanets);
		
		//Instantiating the planetMenu
	     planetMenu = new Scene(planetsLayout, windowWidth, windowHeight);
	     planetMenuName = "planetMenu";  
	     
	     
	    //For stars menu
	     
	    //Defining star menu widgets
	    
	    Button sunButton = new Button("Sun");
	    Button hyperGiantButton = new Button("Hypergiants");
	    Button superGiantButton = new Button("Supergiants");
	    Button giantButton = new Button("Giants");
	    Button subGiantButton = new Button("Subgiants");
	    Button subDwarfButton = new Button("Subdwarfs");
	    Button dwarfButton = new Button("Dwarfs");
	    Button neutronStarButton = new Button("Neutron Stars");
	    
	    //Defining star menu layout
	    FlowPane starLayout = new FlowPane();
	 	HBox rootStars = new HBox(10);
	 	
	 	rootStars.getChildren().addAll(sunButton,hyperGiantButton, superGiantButton, giantButton, subGiantButton, subDwarfButton, dwarfButton, neutronStarButton);
	 	
	 	starLayout.getChildren().addAll(rootStars,backButtonStars);
	 	starLayout.setAlignment(Pos.CENTER);
	 	
	 	starsMenu = new Scene(starLayout,windowWidth,windowHeight);	     
		
	 	//Defining earth menu layout
	 	
	 	 BorderPane earthBorder = new BorderPane();

		  // FlowPane with a TextField and TextArea
		  FlowPane centerPaneEarth = new FlowPane();
		  centerPaneEarth.setVgap(5);
		  centerPaneEarth.setHgap(5);
		   
		  // Label and textfield for name
		  
		  
		  
		  
		 
		  centerPaneEarth.getChildren().addAll(backButtonEarth,new Label("Description") );
		  TextField txtName = new TextField ("EARTH");
		  txtName.setPrefWidth (100);
		  centerPaneEarth.getChildren().add (txtName);
		   
		  // Label and textarea for description
		  centerPaneEarth.getChildren().add (new Label ("Info"));
		  TextArea txtInfo = new TextArea ("Planet Earth is the only planet in\n our solar system naturally habitable\n by living organisms." + "\n" +" Age: Approx 4.8 Billion Years.");
		  txtInfo.setPrefWidth(200);
		  txtInfo.setPrefRowCount(8);
		  txtInfo.setPrefColumnCount(40);
		  centerPaneEarth.getChildren().add(txtInfo);

		  //HBox with button
		  HBox topPane = new HBox();
		  topPane.getChildren().add(new Button("Countries"));

		  // Adds the FlowPane to the center
		  earthBorder.setCenter(centerPaneEarth);
		  
		  //Instantiating earth menu
	   	  earthMenu = new Scene(earthBorder, windowWidth, windowHeight);
	 	
		//Indicating first menu to pop up when application starts
		window.setScene(introMenu);
		currentScene = window.getScene();
		window.show();
		
		
	}
	
	public void updateCurrentScene(Scene aScene) {
		this.currentScene = aScene;
	}
	
	public void updatePreviousScene(Scene aScene) {
		this.previousScene = aScene;
	}
	
}
