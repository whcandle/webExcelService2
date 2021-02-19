package com.mg.webexcel.entity;

public class CommWorksheet
{
     private String sheetLable;
    /// <summary>
    /// 设置表页
    /// </summary>
     private CommWorkbook workBook;
     private int sheetIndex;
	public String getSheetLable() {
		return sheetLable;
	}
	public void setSheetLable(String sheetLable) {
		this.sheetLable = sheetLable;
	}
	public CommWorkbook getWorkBook() {
		return workBook;
	}
	public void setWorkBook(CommWorkbook workBook) {
		this.workBook = workBook;
	}
	public int getSheetIndex() {
		return sheetIndex;
	}
	public void setSheetIndex(int sheetIndex) {
		this.sheetIndex = sheetIndex;
	}
}
