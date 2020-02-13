/*
 * Grid class makes a 2-D array of strings that could potentially display a grid on the console.
 */
public class Grid {

	
				private int rowSize; 
				private int columnSize;
				private String[][] grid;
				private String symbol;
 	
	public Grid(int aRowSize, int aColumnSize, String aSymbol) {
		String marking = aSymbol;
		this.rowSize = aRowSize;
		this.columnSize = aColumnSize;
		this.grid = new String[aRowSize][aColumnSize];
		
		for(int i = 0; i < this.rowSize; i++) {
			for(int j = 0; j < this.columnSize; j++) {
				this.grid[i][j] = marking;
			}
				
		}
	}
	public Grid(Grid g) {
		this(g.rowSize,g.columnSize,g.symbol);
	}
	
	public int getRowSize() {
		return rowSize;
	}
	public int getColumnSize() {
		return columnSize;
	}
	
	public String[][] getGrid(){
			return grid;
	}
	
	public void setRowSize(int aRowSize) {
		this.rowSize = aRowSize;
	}
	
	public void setColumnSize(int aColumnSize) {
		this.columnSize = aColumnSize;
	}
	
	
	public String outputGrid() {
		String result = "";
		for(int i = 0; i < rowSize; i++) { // Prints a grid.
			
			for(int j = 0; j < columnSize; j++) {
				result += grid[i][j].toString();
				
			}
			
			result += "\n";
		}
		return result;
	}
}


	
