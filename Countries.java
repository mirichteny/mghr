import java.util.HashMap;
import java.util.Scanner;

public class Countries  {

	

	 public static void main(String[] args) {
	
		// Defining a hash map and loading it with countries

		HashMap<String,Integer>  map = new HashMap<String, Integer>();
			map.put("Canada", 500);
			map.put("US", 300000000);
			map.put("England", 700000000);
			map.put("Australia", 250000000);
			map.put("Mexico", 860000000);
			
		 // Asking the user to enter a country
			System.out.println("Enter a country");
			Scanner kb = new Scanner(System.in);
			String name =  kb.nextLine();
			
			// checking the hash map for the country name inputted by the user, if it exists print its population 
			if (map.containsKey(name)) {
				System.out.println("population of " + name + " is " + map.get(name));
			}
			else {
				System.out.println("Invalid country");
			}
		}  
		 
	}

