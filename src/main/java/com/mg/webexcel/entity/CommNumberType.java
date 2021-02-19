package com.mg.webexcel.entity;

/// <summary>
/// 数字类型
/// 0 缺省
/// 1 普通数值
/// 2 货币
/// 3 日期
/// 4 时间
/// 5 百分比%
/// 6 科学计数
/// 7 文本
/// 8 货币大写
/// </summary>
public class CommNumberType
{
    /// <summary>
    /// 数字类型
    /// 0 缺省
    /// 1 普通数值
    /// 2 货币
    /// 3 日期
    /// 4 时间
    /// 5 百分比
    /// 6 科学计数
    /// 7 文本
    /// 8 货币大写
    /// </summary>
    private int CellNumberType;

	public int getCellNumberType() {
		return CellNumberType;
	}

	public void setCellNumberType(int cellNumberType) {
		CellNumberType = cellNumberType;
	}

}
