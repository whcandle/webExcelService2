package com.mg.webexcel.entity;

public class CommFont {
	/// <summary>
	/// 各种字体
	/// 1 ···
	/// </summary>
	public  enum cellFont
	{    Default(0),  //默认
		 BIT1(2),     //粗体
         BIT2(4),     //斜体
         BIT3(8);      //下划线
	private int value;
	private cellFont(int v){
		  this.value=v;
	  }
	}
	
    /// <summary>
    /// 字体的序号
    /// </summary>
	private int CellFont;
    /// <summary>
    /// 设置字体风格
    /// </summary>
	private int CellFontStyle;
    /// <summary>
    /// 字体大小
    /// </summary>
	private float CellFontSize;
	public int getCellFont() {
		return CellFont;
	}
	public void setCellFont(int cellFont) {
		CellFont = cellFont;
	}
	public int getCellFontStyle() {
		return CellFontStyle;
	}
	public void setCellFontStyle(int cellFontStyle) {
		CellFontStyle = cellFontStyle;
	}
	public float getCellFontSize() {
		return CellFontSize;
	}
	public void setCellFontSize(float cellFontSize) {
		CellFontSize = cellFontSize;
	}
	
}



