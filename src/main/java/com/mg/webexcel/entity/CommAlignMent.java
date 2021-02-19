package com.mg.webexcel.entity;
/**
 * 对齐方式
 * @author xj
 *  /// <summary>
    /// 对齐方式
    /// 垂直方向
    /// 水平方向
    /// </summary>
 *
 */
public class CommAlignMent {
    /// <summary>
    /// 水平方向上的对齐方式
    /// 1   左对齐
    /// 2   右对齐
    /// 4   水平居中
    /// 8   上对齐
    /// 16  下对齐
    /// 32  垂直居中
    /// 64  水平分散对齐
    /// 128 垂直分散对齐
    /// </summary>
	private int  HorizontalAlign;
    /// <summary>
    /// 垂直方向上的对齐方式
    /// 1   左对齐
    /// 2   右对齐
    /// 4   水平居中
    /// 8   上对齐
    /// 16  下对齐
    /// 32  垂直居中
    /// 64  水平分散对齐
    /// 128 垂直分散对齐
    /// </summary>
	private int  VerticalAlign;
	
	
	private int cellAlign;
	
	
	public int getCellAlign() {
		return cellAlign;
	}
	public void setCellAlign(int cellAlign) {
		this.cellAlign = cellAlign;
	}
	public int getHorizontalAlign() {
		return HorizontalAlign;
	}
	public void setHorizontalAlign(int horizontalAlign) {
		HorizontalAlign = horizontalAlign;
	}
	public int getVerticalAlign() {
		return VerticalAlign;
	}
	public void setVerticalAlign(int verticalAlign) {
		VerticalAlign = verticalAlign;
	}
	
	

}
