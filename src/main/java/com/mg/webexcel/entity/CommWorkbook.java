package com.mg.webexcel.entity;

import java.util.List;

public class CommWorkbook {

    /// <summary>
    /// 样式集合
    /// </summary>
    private CommStyles styles;
    /// <summary>
    /// 页集合
    /// </summary>
    private List<CommWorksheet> workSheets;
    /// <summary>
    /// 0  简易报表 
    /// 1  分组报表
    /// 2  交叉报表
    /// </summary>
    private String WorkBookType;


 

    /// <summary>
    /// 添加页
    /// </summary>
    /// <param name="workSheet">页</param>
    public void addWorkSheet(CommWorksheet sheet){
    	this.workSheets.add(sheet);
    };

    private void removeSheet(int index){
    	
    };

}
