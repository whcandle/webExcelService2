package com.mg.webexcel.entity;

import java.util.List;

public class CommRow {

	private int index;	//行号
	private List<CommCell> cells;
	
	private CommTable commTable;
	private  int rowIndex;
	private int sheetIndex;
	private int rowHeight;	//行高
	


	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	public List<CommCell> getCells() {
		return cells;
	}

	public void setCells(List<CommCell> cells) {
		this.cells = cells;
	}
	
	public CommTable getCommTable() {
		return commTable;
	}

	public void setCommTable(CommTable commTable) {
		this.commTable = commTable;
	}

	public int getRowIndex() {
		return rowIndex;
	}

	public void setRowIndex(int rowIndex) {
		this.rowIndex = rowIndex;
	}

	public int getSheetIndex() {
		return sheetIndex;
	}

	public void setSheetIndex(int sheetIndex) {
		this.sheetIndex = sheetIndex;
	}

	public int getRowHeight() {
		return rowHeight;
	}

	public void setRowHeight(int rowHeight) {
		this.rowHeight = rowHeight;
	}
}
