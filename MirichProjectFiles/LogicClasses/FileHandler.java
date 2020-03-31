package LogicClasses;
import java.io.File;
import java.util.Scanner;
/*class FileHandler
 * This class is a Logic version of the FileHandler text based class which 
 * handles the files and if not found displays that the file is not found
 * 
 * Instance variable:
 * myScanner: for input
 */
public class FileHandler {
	
		private Scanner myScanner;		
		
		/* readFiles(String theTextFile)
		* constructor that reads files
		* @param String theTextFile text file
		*/
		public void readFiles(String theTextFile) {
				
			while(myScanner.hasNext()) {
				
				String word1 = myScanner.next();
				String word2 = myScanner.next();
				String word3 = myScanner.next();
			}	
			
			
		}
		
		// get Scanner
		public Scanner getScanner() {
			return this.myScanner;
		}
		/* openFiles(String theTextFile)
		* constructor that opens and checks files 
		* @param theTextFile text file
		* when file not found displays the message below
		*/
		public void openFiles(String theTextFile) {
			
			try {
			
			myScanner = new Scanner(new File(theTextFile));
			
			}
		
			catch(Exception e) {
				// display of message
				System.out.println("File not found");
				
			}
		
		}

}
