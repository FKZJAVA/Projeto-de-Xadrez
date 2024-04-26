package boardgame;

public class Position {
	private int row;
	private int column;

	// construtor
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}

	// metodos
	public void setValues(int row, int column) {
		this.row = row;
		this.column = column;
	}

	@Override
	public String toString() {
		return row + "," + column;
	}
	
	

}
