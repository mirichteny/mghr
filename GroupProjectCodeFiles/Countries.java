import java.util.HashMap;
import java.util.Scanner;

public class Countries  {

	
	
	 public static void main(String[] args) {
	
		// Hash map

		HashMap<String,Integer>  map = new HashMap<String, Integer>();
			map.put("Canada", 500);
			map.put("US", 300000000);
			map.put("England", 700000000);
			map.put("Australia", 250000000);
			map.put("Mexico", 860000000);
			
			System.out.println("Enter a country");
			Scanner kb = new Scanner(System.in);
			String name =  kb.nextLine();
			
			
			if (map.containsKey(name)) {
				System.out.println("population of " + name + " is " + map.get(name));
			}
			else {
				System.out.println("Invalid country");
			}
		}  
		
	}

