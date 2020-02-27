/*
 * Grid class makes a 2-D array of strings that could potentially display a grid on the console.
 */
public class Grid {

	
				private int rowSize; 
				private int columnSize;
				private String[][] grid;
				private String symbol;
	
 	// A copy constructor for symbol, row size and column size and creating a grid of that size
	public Grid(int aRowSize, int aColumnSize, String aSymbol) {
		this.symbol = aSymbol;
		this.rowSize = aRowSize;
		this.columnSize = aColumnSize;
		this.grid = new String[aRowSize][aColumnSize];
		
		// Running two nested for loops to create a grid of symbols
		for(int i = 0; i < this.rowSize; i++) {
			for(int j = 0; j < this.columnSize; j++) {
				this.grid[i][j] = symbol;
			}
				
		}
	}
	// A copy constructor for copying an old grid to a new grid with the same row size, column size and symbol
	public Grid(Grid g) {
		this(g.rowSize,g.columnSize,g.symbol);
	}
	
	/* Setter method for the row size
	Returns nothing */
	public void setRowSize(int aRowSize) {
		this.rowSize = aRowSize;
	}
	
	/* Getter method for the row size
	Returns the row size got from the setter method for row size */
	public int getRowSize() {
		return rowSize;
	}
	
	/* Setter method for the column size
	Returns nothing */
	public void setColumnSize(int aColumnSize) {
		this.columnSize = aColumnSize;
	}
	
	/* Getter method for the column size
	Returns the column size got from the setter method for column size */
	public int getColumnSize() {
		return columnSize;
	}
	
	/* Getter method for the grid
	Returns the grid created earlier with symbols */
	public String[][] getGrid(){
		return grid;
	}
	
	//  This method prints a grid, after converting it to a string, in different lines
	public String outputGrid() {
		String result = "";
		for(int i = 0; i < rowSize; i++) {
			for(int j = 0; j < columnSize; j++) {
				result += grid[i][j].toString();
				
			}
			
			result += "\n";
		}
		return result;
	}
}


	
