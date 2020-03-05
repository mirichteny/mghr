import java.io.File;
import java.util.Scanner;

public class FileHandler {
	
		private Scanner myScanner;
		
		
		
		public void readFiles(String theTextFile) {
				
			while(myScanner.hasNext()) {
				
				String word1 = myScanner.next();
				String word2 = myScanner.next();
				String word3 = myScanner.next();
			}	
			
			
		}
		
		
		public Scanner getScanner() {
			return this.myScanner;
		}
		
		public void openFiles(String theTextFile) {
			
			try {
			
			myScanner = new Scanner(new File(theTextFile));
			
			}
		
			catch(Exception e) {
				
				System.out.println("File not found");
				
			}
		
		}

}
