/*
 * Grid class makes a 2-D array of strings that could potentially display a grid on the console.
 *
 * It has the following instances:
 * rowSize: size of row
 * columnSize: column size
 * grid: grid
 * symbol: symbol
 */
public class Grid {

	
				private int rowSize; 
				private int columnSize;
				private String[][] grid;
				private String symbol;
				
	/*Grid constructor.
	 * 
	 *
	 * 
	 */
 	
	public Grid(int aRowSize, int aColumnSize, String aSymbol) {
		String marking = aSymbol;
		this.setRowSize(aRowSize);
		this.setColumnSize(aColumnSize);
		
		this.grid = new String[aRowSize][aColumnSize];
		
		for(int i = 0; i < this.rowSize; i++) {
			for(int j = 0; j < this.columnSize; j++) {
				this.grid[i][j] = marking;
			}
				
		}
	}
	
	
	//To Copy
	
	public Grid(Grid g) {
		this(g.rowSize,g.columnSize,g.symbol);
	}
	
	/*******
	 * getRowSize()
	 * getter for instance var rowSize
	 * @return rowSize
	 */
	
	public int getRowSize() {
		return rowSize;
	}
	
	/*******
	 * getColumnSize()
	 * getter for instance var columnSize
	 * @return columnSize
	 */
	public int getColumnSize() {
		return columnSize;
	}
	
	/*******
	 * getGrid()
	 * @return newGrid (returns a copy to prevent privacy leaks)
	 */
	
	public String[][] getGrid(){
			String[][] newGrid = new String[this.getRowSize()][this.getColumnSize()];
			for(int i = 0; i < this.getRowSize(); i++) {
				for(int j = 0; j < this.getColumnSize(); j++) {
					newGrid[i][j] = symbol;
				}
					
			}
			return newGrid;
	}
	/*******
	 * getSymbol()
	 * getter for instance var symbol
	 * @return symbol
	 */
	
	public String getSymbol() {
		return symbol;
	}
	
	/*******
	 * setSymbol()
	 * mutator for instnace var symbol
	 * @param aSymbol
	 */
	public void setSymbol(String aSymbol) {
		this.symbol = aSymbol;
	}
	
	/*******
	 * setRowSize()
	 * mutator for instance var rowSize
	 * @param aRowSize
	 */
	public void setRowSize(int aRowSize) {
		this.rowSize = aRowSize;
	}
	
	
	/*******
	 * 
	 * @param aColumnSize
	 */
	public void setColumnSize(int aColumnSize) {
		this.columnSize = aColumnSize;
	}
	
	/*******
	 * drawLine()
	 * Effectively takes a grid and draws a line from startPoint to endPoint with a marking of aSymbol
	 * @param rowOrColumn
	 * @param startPoint
	 * @param endPoint
	 * @param aSymbol
	 */
	
	public void drawLine( String rowOrColumn, int startPoint, int endPoint, String aSymbol) {
		
		if(rowOrColumn.equalsIgnoreCase("row")) {
			
			
			
			for(int i = 0; i < this.getRowSize(); i++) {
				if(i >= startPoint && i <= endPoint) {
					this.grid[0][i] = aSymbol;
				}
			}
		}
		if(rowOrColumn.equalsIgnoreCase("column")) {
			
			
			for(int i = 0; i < this.getColumnSize(); i++) {
				if(i >= startPoint && i <= endPoint) {
					this.grid[i][0] = aSymbol;
				}
			}
		}
		
		
		
		
	}
	
	/*******
	 * drawDiag() makes use of a grid and draws a diagonal line in 2d space.
	 * @param startPoint
	 * @param endPoint
	 * @param aSymbol
	 */
	
	public void drawDiag(int startPoint, int endPoint, String aSymbol) {
		
		
			for(int i = 0; i < this.getColumnSize(); i++) {
				if(i >= startPoint && i <= endPoint) {
					this.grid[i][i] = aSymbol;
				}
			}		
		
	}
	
	/*******
	 * reverseDrawDiag() Is the same as drawDiag() method but draws in reverse.
	 * @param startPoint
	 * @param endPoint
	 * @param aSymbol
	 */
	public void reverseDrawDiag(int startPoint, int endPoint, String aSymbol) {
		
		for(int i = endPoint; i > this.getColumnSize(); i--) {
			if(i >= endPoint && i <= startPoint) {
				this.grid[i][i] = aSymbol;
			}
		}
	}
	
	/*******
	 * Uses drawDiag, drawLine methods to draw a box in 2d space.
	 * @param width
	 * @param height
	 * @param xCoord
	 * @param yCoord
	 */
	
	public void drawBox(int width, int height, int xCoord, int yCoord) {
		String verticalLine = "|";
		String horizontalLine = "-";
		this.drawLine("row", xCoord, width, horizontalLine);                           
		this.drawLine("row", xCoord + width, width, horizontalLine);
		this.drawLine("column", xCoord , height, verticalLine);
		this.drawLine("column", xCoord + height, height, verticalLine);
	}
	
	/*******
	 * outputGrid() outputs the final product of the 2D array of Strings to the console.
	 */
	
	public void outputGrid() {
		String result = "";
		for(int i = 0; i < rowSize; i++) { // Prints a grid.
			
			for(int j = 0; j < columnSize; j++) {
				result += grid[i][j].toString();
				
			}
			
			result += "\n";
		}
		System.out.println(result);
	}
}


	
