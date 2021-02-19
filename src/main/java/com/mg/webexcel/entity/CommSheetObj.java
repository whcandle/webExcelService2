package com.mg.webexcel.entity;

/// <summary>
/// 对于页对象而言 
/// 要有自身第几页
/// 本页的最大行
/// </summary>
public class CommSheetObj
{
    /// <summary>
    /// 自身所在第几页
    /// </summary>
    private int pageIndex;

    /// <summary>
    /// 本页行数
    /// 具体做什么不确定
    /// </summary>
    private int pageRows;
    /// <summary>
    /// cell页对象
    /// </summary>
    CommWorksheet workSheet;
    
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getPageRows() {
		return pageRows;
	}
	public void setPageRows(int pageRows) {
		this.pageRows = pageRows;
	}
	public CommWorksheet getWorkSheet() {
		return workSheet;
	}
	public void setWorkSheet(CommWorksheet workSheet) {
		this.workSheet = workSheet;
	}

}