package com.mg.webexcel.entity;

public class CommData {
    /// <summary>
    /// 数据属于哪个cell
    /// </summary>
	private CommCell Cell;

    /// <summary>
    /// 所包含的文本
    /// </summary>
	private String text;


	private String DataType;


	private String Note;


	private String CrossType;


	public CommCell getCell() {
		return Cell;
	}


	public void setCell(CommCell cell) {
		Cell = cell;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		text = text;
	}


	public String getDataType() {
		return DataType;
	}


	public void setDataType(String dataType) {
		DataType = dataType;
	}


	public String getNote() {
		return Note;
	}


	public void setNote(String note) {
		Note = note;
	}


	public String getCrossType() {
		return CrossType;
	}


	public void setCrossType(String crossType) {
		CrossType = crossType;
	}

}


