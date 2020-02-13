import java.util.*;
public class Main {

		private Universe astralObjects;
		
		public void printLetters() {
			
			System.out.println(" ___     ________    __________");
			System.out.println("|   \\   |      _|   |__     ___|");
			System.out.println("|    \\  |     |         |   |");	
			System.out.println("| /\\  |  \\     \\        |   |");
			System.out.println("| __  |   |     |       |   |");
			System.out.println("|  _  | __|     |       |   |");
			System.out.println("|_| |_| |_______|       |___|" + "\npress any key to start");
			
			
		}
		
		
		
		public static void main(String[] args) {
			Main A = new Main();
			
			A.printLetters();
			Scanner x = new Scanner(System.in);
			String reader = x.nextLine();
			System.out.println("Starting");
			
			Earth earth = new Earth();
			System.out.println("");
		}
}
