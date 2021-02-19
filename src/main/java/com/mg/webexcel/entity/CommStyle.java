package com.mg.webexcel.entity;
/**
 * 样式
 * @author xj
 *
 */
public class CommStyle {

	   /// <summary>
	    /// 判断是否是一样的样式
	   /// </summary>
	   /// <param name="styleObj"></param>
	   /// <returns></returns>
	    public Boolean isSameStyle(CommStyle styleObj){
	    	return null;
	    }


	     /// <summary>
	     /// 样式的标识
	     /// </summary>
	     private String ID;
	     private CommBorders borders;

	   /// <summary>
	   /// 字体
	   /// </summary>
	     private CommFont font;
	   /// <summary>
	     /// 是否存在这个样式
	     /// true 存在这个样式
	   /// </summary>
	     public Boolean isaExistence(){
	    	 return null;
	     }
	   
	   /// <summary>
	   /// 是不是标准样式
	   /// true  是标准的
	   /// false 非标准
	   /// </summary>
	     private Boolean isStandard;

	   /// <summary>
	   /// 对齐方式
	   /// 1   左对齐
	   /// 2   右对齐
	   /// 4   水平居中
	   /// 8   上对齐
	   /// 16  下对齐
	   /// 32  垂直居中
	   /// </summary>
	     private CommAlignMent alignMent;

	     /// <summary>
	     /// 单元格的输入方式
	     /// 0 缺省
	     /// 1 无控制
	     /// 2 数值
	     /// 3 整数
	     /// 4 电话号码
	     /// 5 只读
	     /// </summary>
	     private CommCellInput cellInput;
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
	     private CommNumberType numberType;
;
	   /// <summary>
	   /// 背景
	   /// </summary>
	     private CommInterior interior;
		public String getID() {
			return ID;
		}
		public void setID(String iD) {
			ID = iD;
		}
		public CommBorders getBorders() {
			return borders;
		}
		public void setBorders(CommBorders borders) {
			this.borders = borders;
		}
		public CommFont getFont() {
			return font;
		}
		public void setFont(CommFont font) {
			this.font = font;
		}
		public Boolean getIsStandard() {
			return isStandard;
		}
		public void setIsStandard(Boolean isStandard) {
			this.isStandard = isStandard;
		}
		public CommAlignMent getAlignMent() {
			return alignMent;
		}
		public void setAlignMent(CommAlignMent alignMent) {
			this.alignMent = alignMent;
		}
		public CommCellInput getCellInput() {
			return cellInput;
		}
		public void setCellInput(CommCellInput cellInput) {
			this.cellInput = cellInput;
		}
		public CommNumberType getNumberType() {
			return numberType;
		}
		public void setNumberType(CommNumberType numberType) {
			this.numberType = numberType;
		}
		public CommInterior getInterior() {
			return interior;
		}
		public void setInterior(CommInterior interior) {
			this.interior = interior;
		}




}



