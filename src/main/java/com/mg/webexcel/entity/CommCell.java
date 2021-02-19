package com.mg.webexcel.entity;
/**
 * 单元格对象
 * @author xj
 *
 */
public class CommCell {
	private int index;  //在一行当中的索引位置
	private int mergeAcross;  //跨列数量
	private int mergeDown;	//跨行数量
	
	private String formula;  //公式

	private String StyleOId;
	//这三个属性是
	private int colWidth;	//列宽
	private String note;	//注释
	
	private CommStyle commStyle;
	private CommRow commRow;
	private CommData data;

	public CommCell(int index, int mergeAcross, int mergeDown) {
		super();
		this.index = index;
		this.mergeAcross = mergeAcross;
		this.mergeDown = mergeDown;
	}
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getMergeAcross() {
		return mergeAcross;
	}
	public void setMergeAcross(int mergeAcross) {
		this.mergeAcross = mergeAcross;
	}
	public int getMergeDown() {
		return mergeDown;
	}
	public void setMergeDown(int mergeDown) {
		this.mergeDown = mergeDown;
	}
	public String getStyleOId() {
		return StyleOId;
	}

	public void setStyleOId(String styleOId) {
		StyleOId = styleOId;
	}

	public int getColWidth() {
		return colWidth;
	}

	public void setColWidth(int colWidth) {
		this.colWidth = colWidth;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	public String getFormula() {
		return formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public CommStyle getCommStyle() {
		return commStyle;
	}

	public void setCommStyle(CommStyle commStyle) {
		this.commStyle = commStyle;
	}

	public CommRow getCommRow() {
		return commRow;
	}

	public void setCommRow(CommRow commRow) {
		this.commRow = commRow;
	}

	public CommData getData() {
		return data;
	}

	public void setData(CommData data) {
		this.data = data;
	}

	
	
	
	
	

}
