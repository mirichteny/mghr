Welcome to Project Astra, a user-friendly information tool about our universe.

(For GUI)(Updated as of 04/15/2020) To effectively compile and run this program, the following packages/code files are needed on your computer 
	

	-controller/Controller.java
	-controller/PlanetListener.java

	-GUI/GUIApp.java <-- The file you must run for later in eclipse
	-GUI/JupiterDisplay.java
	-GUI/SunDisplay.java
	-GUI/VenusDisplay.java
	
	-logic/Galaxy.java
	-logic/Grid.java
	-logic/MilkyWay.java
	-logic/Planet.java
	-logic/Star.java
	-logic/TextBasedApp.java
	-logic/Universe.java
	-logic/Venus.java

	You also need the following images to be in the images folder

	-images/GalaxyBackground.jpg
	-images/JupiterTexture.jpg
	-images/SpaceBackGround.jpg
	-images/SunTexture.jpg
	-images/VenusAtmosphereTexture.jpg
	
** You must use eclipse for java developers and have your packages (controller,GUI,logic) in the right directory or you will face compilation errors.

(For Eclipse)
Make sure you create a new java project, you can name it whatever you want. Then import all the files/packages to your src code.
To run the program, right click on the "GUIApp.java" class and follow this directory : Run as -> Java Application. 
If you face compilation errors, you are missing files, refer to the above to make sure you have all the files.



Using the GUI app:
      When using our app, the following buttons may not be functional (Nothing happens when you click on them): 
       Andromeda, Mercury, Mars, Saturn, Neptune and all the buttons from the Stars menu except for Sun.
    
  That aside: To use our program navigate through by clicking on specific buttons (such as Milky Way).
  When you click on the Milky Way button, you will be prompted with a search bar. This is where you search for certain objects in that specific galaxy.
  The text you put into that search bar will depend on the label and what it tells what you can or cannot search. 
  Follow the instructions on the label below the search bar and you will come across different scenes depending on what you search. 
  If you search "Planets", a collection of buttons that have some planets as labels will show up. Depending on what you click, pop up menus may appear. 
 And if those pop up menus appear, you may be stuck and cannot exit out of it (because you are in a special window), simply close the pop up menu if you want to access the main app again.

SPECIAL WINDOWS:
	These windows are pop up windows that display realistic images of planets and have animations to them (They rotate with a certain speed in a certain direction).
	The user can interact with the Venus Special Window if they click on it. Once they hover over the planet with their mouse and click on it, the planet will proceed
	to rotate rapidly. Warning that you CANNOT make the planet go to normal speed once clicked. You have to close the window and open it up again by click X on the top right portion 
	of the special window. Another way the user can interact with any of the special windows is when they use the scroller on their mouse, they can bring the planet or star
	closer to them or further away, but WARNING: If you scroll too the planet or sun too far away or too close (below 1 or to over 10000 pixels range), the planet or sun
	will dissapear from view and you will have to close the special window and bring it back up again. 

If you want to go back to a previous scene, click on the back button on that scene. To quit, either click X on the top right or go back to the title page and click "QUIT".
 
       





