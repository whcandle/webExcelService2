package com.mg.webexcel.entity;

import java.util.List;

public class CommTable {
	 private int beginRow;
	 private int endRow;
	 private int beginCol;
	 private int endCol;
	    /// <summary>
	    /// 包含行的集合
	    /// </summary>
	 private List<CommRow> rowsList;
	 public int getBeginRow() {
		return beginRow;
	}
	public void setBeginRow(int beginRow) {
		this.beginRow = beginRow;
	}
	public int getEndRow() {
		return endRow;
	}
	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}
	public int getBeginCol() {
		return beginCol;
	}
	public void setBeginCol(int beginCol) {
		this.beginCol = beginCol;
	}
	public int getEndCol() {
		return endCol;
	}
	public void setEndCol(int endCol) {
		this.endCol = endCol;
	}
	public List<CommRow> getRowsList() {
		return rowsList;
	}
	public void setRowsList(List<CommRow> rowsList) {
		this.rowsList = rowsList;
	}
	private void addRow(CommRow row){
		 this.rowsList.add(row);
	 };
}

