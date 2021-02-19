package com.mg.webexcel.entity;
/// <summary>
/// 设置cell内容
/// 
/// </summary>
public class CommCellContent {

	   /// <summary>
    /// 内容的id
    /// </summary>
    private String CellContentId;


    /// <summary>
    /// 带区的类型
    /// </summary>
    //private String StripType;




    /// <summary>
    /// cell内容的col值
    /// </summary>
    private int CellColIndex;

    /// <summary>
    /// cell内容的row值
    /// </summary>
    private int CellRowIndex;

    /// <summary>
    /// cell内容的row值(相对所属坐标的相对行数)
    /// </summary>
    private int XcellRowIndex;



    /// <summary>
    /// cell内容的sheet值
    /// </summary>
    private int CellSheetIndex;

    /// <summary>
    /// cell的统计字段
    /// </summary>
    private String CellContenttxt;

    /// <summary>
    /// cell的统计方式
    /// </summary>
    private String CellContentStatManner;

    /// <summary>
    /// cell的统计范围
    /// </summary>
    private String CellContentStatArea;

    /// <summary>
    /// cell的sql语句
    /// </summary>
    private String CellContentSqlStr;

    /// <summary>
    /// cell的内容公式
    /// </summary>
    private String CellFormula;

    /// <summary>
    /// cell的动态文本
    /// </summary>
    private String CellDynamicText;


    private String CellDeptCode;

    private int CellDeptGrade;
    /// <summary>
    /// 设置sql对象查询
    /// </summary>
    //ILittleSqlMap LittleSqlMap;

    /// <summary>
    /// 设置内容类型
    /// 0 字段统计
    /// 1 sql语句
    /// 2 动态文本
    /// 3 部门级别
    /// </summary>
    private String CellContentType;

	public String getCellContentId() {
		return CellContentId;
	}

	public void setCellContentId(String cellContentId) {
		CellContentId = cellContentId;
	}

	public int getCellColIndex() {
		return CellColIndex;
	}

	public void setCellColIndex(int cellColIndex) {
		CellColIndex = cellColIndex;
	}

	public int getCellRowIndex() {
		return CellRowIndex;
	}

	public void setCellRowIndex(int cellRowIndex) {
		CellRowIndex = cellRowIndex;
	}

	public int getXcellRowIndex() {
		return XcellRowIndex;
	}

	public void setXcellRowIndex(int xcellRowIndex) {
		XcellRowIndex = xcellRowIndex;
	}

	public int getCellSheetIndex() {
		return CellSheetIndex;
	}

	public void setCellSheetIndex(int cellSheetIndex) {
		CellSheetIndex = cellSheetIndex;
	}

	public String getCellContenttxt() {
		return CellContenttxt;
	}

	public void setCellContenttxt(String cellContenttxt) {
		CellContenttxt = cellContenttxt;
	}

	public String getCellContentStatManner() {
		return CellContentStatManner;
	}

	public void setCellContentStatManner(String cellContentStatManner) {
		CellContentStatManner = cellContentStatManner;
	}

	public String getCellContentStatArea() {
		return CellContentStatArea;
	}

	public void setCellContentStatArea(String cellContentStatArea) {
		CellContentStatArea = cellContentStatArea;
	}

	public String getCellContentSqlStr() {
		return CellContentSqlStr;
	}

	public void setCellContentSqlStr(String cellContentSqlStr) {
		CellContentSqlStr = cellContentSqlStr;
	}

	public String getCellFormula() {
		return CellFormula;
	}

	public void setCellFormula(String cellFormula) {
		CellFormula = cellFormula;
	}

	public String getCellDynamicText() {
		return CellDynamicText;
	}

	public void setCellDynamicText(String cellDynamicText) {
		CellDynamicText = cellDynamicText;
	}

	public String getCellDeptCode() {
		return CellDeptCode;
	}

	public void setCellDeptCode(String cellDeptCode) {
		CellDeptCode = cellDeptCode;
	}

	public int getCellDeptGrade() {
		return CellDeptGrade;
	}

	public void setCellDeptGrade(int cellDeptGrade) {
		CellDeptGrade = cellDeptGrade;
	}

	public String getCellContentType() {
		return CellContentType;
	}

	public void setCellContentType(String cellContentType) {
		CellContentType = cellContentType;
	}



	
	
}
