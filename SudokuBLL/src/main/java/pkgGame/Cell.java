package pkgGame;

import java.util.Objects;

public class Cell {
	private int iRow;
	private int iCol;
	private java.util.ArrayList<java.lang.Integer> lstRemainingValidValues;

	public Cell(int iRow, int iCol) {
		super();
		this.iRow = iRow;
		this.iCol = iCol;
	}

	public int getiRow() {
		return iRow;
	}

	public int getiCol() {
		return iCol;
	}
	
	public java.util.ArrayList<Integer> getLstRemainingValidValues(){
		return lstRemainingValidValues;
	}
	
	public void setlstRemainingValidValues
	(java.util.HashSet<java.lang.Integer> hsRemainingValues) {
		
		lstRemainingValidValues = new java.util.ArrayList<>(hsRemainingValues);
	}

	@Override
	public int hashCode() {
		return Objects.hash(iRow, iCol);
	}

}
