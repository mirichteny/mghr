
import java.util.ArrayList;

public class Star {
					private final double sunMass = 1.989*Math.pow(10, 28);
					private double luminosity;
					private double surfaceTemperature;
					private String[] acceptedStarTypes;
					private String starName;
					private String starType;
					private double starMass; //In Solar Masses (With respect to the mass of our sun)
					private double starRadius; //In solar radius
					
					
					public Star() {
						this.acceptedStarTypes = new String[8];
					}
					
					
					public String getStarName() {
						return this.starName;
					}
					
					public String getStarType() {
						return this.starType;
					}
					
					public double getStarMass() {
						return this.starMass;
					}
					
					
					
}
