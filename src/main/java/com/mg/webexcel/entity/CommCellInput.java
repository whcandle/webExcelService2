package com.mg.webexcel.entity;

/// <summary>
/// 单元格的输入方式
/// 0 缺省
/// 1 无控制
/// 2 数值
/// 3 整数
/// 4 电话号码
/// 5 只读
/// </summary>
public class CommCellInput
{
    private int cellInput;

	public int getCellInput() {
		return cellInput;
	}

	public void setCellInput(int cellInput) {
		this.cellInput = cellInput;
	}
 
}