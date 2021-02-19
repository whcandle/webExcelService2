package com.mg.webexcel.entity;

import java.util.List;

public class CommCellContents {
	 List<CommCellContent> CellContenttxts;

	public List<CommCellContent> getCellContenttxts() {
		return CellContenttxts;
	}

	public void setCellContenttxts(List<CommCellContent> cellContents) {
		CellContenttxts = cellContents;
	}
	
	public void add(CommCellContent content){
		this.CellContenttxts.add(content);
	}
}



