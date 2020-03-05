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
			String[][] newGrid = new String[this.getRowSize()][this.getColumnSize()];
			for(int i = 0; i < this.getRowSize(); i++) {
				for(int j = 0; j < this.getColumnSize(); j++) {
					newGrid[i][j] = symbol;
				}
					
			}
			return newGrid;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public void setSymbol(String aSymbol) {
		this.symbol = aSymbol;
	}
	
	public void setRowSize(int aRowSize) {
		this.rowSize = aRowSize;
	}
	
	public void setColumnSize(int aColumnSize) {
		this.columnSize = aColumnSize;
	}
	
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
	
	public void drawDiag(Grid g, int startPoint, int endPoint, String aSymbol) {
		
		
			for(int i = 0; i < g.getColumnSize(); i++) {
				if(i >= startPoint && i <= endPoint) {
					g.grid[i][i] = aSymbol;
				}
			}		
		
	}
	
	public void drawBox(Grid g, int width, int height, int xCoord, int yCoord) {
		String verticalLine = "|";
		String horizontalLine = "-";
		g.drawLine(g, "row", xCoord, width, horizontalLine);                            //Need to fix this. Take a break.
		g.drawLine(g, "row", xCoord + width, width, horizontalLine);
		g.drawLine(g, "column", xCoord , height, verticalLine);
		g.drawLine(g, "column", xCoord + height, height, verticalLine);
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


	
