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
 	/* Grid(int aRowSize, int aColumnSize, String aSymbol)
	* constructor that creates a grid with the following parameters:
	*
	* @param aRowSize size of row
	* @param aColumnSize size of column
	* @param aSymbol marking
	*/
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
	// sets parameters for grid
	public Grid(Grid g) {
		this(g.rowSize,g.columnSize,g.symbol);
	}
	// get row size
	public int getRowSize() {
		return rowSize;
	}
	// get column size
	public int getColumnSize() {
		return columnSize;
	}
	// get grid
	public String[][] getGrid(){
			String[][] newGrid = new String[this.getRowSize()][this.getColumnSize()];
			for(int i = 0; i < this.getRowSize(); i++) {
				for(int j = 0; j < this.getColumnSize(); j++) {
					newGrid[i][j] = symbol;
				}
					
			}
			return newGrid;
	}
	// get symbol
	public String getSymbol() {
		return symbol;
	}
	// set symbol
	public void setSymbol(String aSymbol) {
		this.symbol = aSymbol;
	}
	// set row size
	public void setRowSize(int aRowSize) {
		this.rowSize = aRowSize;
	}
	// set column size
	public void setColumnSize(int aColumnSize) {
		this.columnSize = aColumnSize;
	}
	/* drawLine(Grid g, String rowOrColumn, int startPoint, int endPoint, String aSymbol)
	* constructor that draws line for the grid with parameters:
	*
	* @param g grid
	* @param rowOrColumn row or columm
	* @param startPoint start of the point
	* @param endPoint end of the point
	* @param aSymbol symbol for grid
	*/
	public void drawLine(Grid g, String rowOrColumn, int startPoint, int endPoint, String aSymbol) {
		
		if(rowOrColumn.equalsIgnoreCase("row")) {
			
			
			
			for(int i = 0; i < g.getRowSize(); i++) {
				if(i >= startPoint && i <= endPoint) {
					g.grid[0][i] = aSymbol;
				}
			}
		}
		if(rowOrColumn.equalsIgnoreCase("column")) {
			
			
			for(int i = 0; i < g.getColumnSize(); i++) {
				if(i >= startPoint && i <= endPoint) {
					g.grid[i][0] = aSymbol;
				}
			}
		}
		
		
		
		
	}
	/* drawDiag(Grid g, int startPoint, int endPoint, String aSymbol) 
	* constructor that draws diagonal for grid with parameters:
	*
	*@param g grid
	* @param startPoint start of the point
	* @param endPoint end of the point
	* @param aSymbol symbol for grid
	*/
	public void drawDiag(Grid g, int startPoint, int endPoint, String aSymbol) {
		
		
			for(int i = 0; i < g.getColumnSize(); i++) {
				if(i >= startPoint && i <= endPoint) {
					g.grid[i][i] = aSymbol;
				}
			}		
		
	}
	/* drawBox(Grid g, int width, int height, int xCoord, int yCoord)
	* constructor which draws box for the grid with parameters:
	*
	* @param g grid
	* @param width width of the Box
	* @param height height of the Box
	* @param xCoord x coordinate
	* @param yCoord y coordinate
	*/
	public void drawBox(Grid g, int width, int height, int xCoord, int yCoord) {
		String verticalLine = "|";
		String horizontalLine = "-";
		g.drawLine(g, "row", xCoord, width, horizontalLine);                            //Need to fix this. Take a break.
		g.drawLine(g, "row", xCoord + width, width, horizontalLine);
		g.drawLine(g, "column", xCoord , height, verticalLine);
		g.drawLine(g, "column", xCoord + height, height, verticalLine);
	}
	/* outputGrid()
	* constructor that returns result which 
	* allows user to see the grid
	*
	* @return result result that outputs final look of the grid
	*/
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


	
