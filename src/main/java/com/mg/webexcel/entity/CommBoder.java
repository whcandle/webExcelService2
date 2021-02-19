package com.mg.webexcel.entity;
/**
 * 通过边线的位置 和 线形描述一个边
 * @author xj
 *
 */
public class CommBoder {

	 public enum EnumBorderPosition{
		  Top(4),Right(3),Bottom(5),Left(2);
		  private int value;

		private EnumBorderPosition(int v){
			  this.value=v;
		  }
		  public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
	 }
	    /// <summary>
	    /// 划线
	    /// 0、1 无线
	    /// 2    细线
	    /// 3    中线
	    /// 4    粗线
	    /// 5    划线
	    /// 6    点线
	    /// 7    点划线
	    /// 8    点点划线
	    /// 9    粗划线
	    /// 10   粗点线
	    /// 11   粗点划线
	    /// 12   粗点点划线
	    /// </summary>
	 public enum EnumBorderLineStyle{
	                defaultLine(0),
	                noneLine(1),
	                slimline(2),
	                midline(3),
	                bigline(4),
	                Dash(5),
	                Dot(6),
	                DashDot(7),
	                DotDot(8),
	                broadContinuous(9),
	                broadDot(10),
	                broadDoadDash(11),
	                broadDotDot(12);
	                private int value;
	        		private EnumBorderLineStyle(int v){
	        			  this.value=v;
	        		  }
	        		  public int getValue() {
	        			return value;
	        		}
	        		public void setValue(int value) {
	        			this.value = value;
	        		}
	 }
	 
	 
	 private EnumBorderPosition enumBorderPosition;
	 private EnumBorderLineStyle enumBorderLineStyle;
     /// <summary>
     /// 边框的集合
     /// 存储四个边框
     /// </summary>
	 private  CommBorders commBorders;   
	 
	public CommBorders getCommBorders() {
		return commBorders;
	}
	public void setCommBorders(CommBorders commBorders) {
		this.commBorders = commBorders;
	}
	public EnumBorderPosition getEnumBorderPosition() {
		return enumBorderPosition;
	}
	public void setEnumBorderPosition(EnumBorderPosition enumBorderPosition) {
		this.enumBorderPosition = enumBorderPosition;
	}
	public EnumBorderLineStyle getEnumBorderLineStyle() {
		return enumBorderLineStyle;
	}
	public void setEnumBorderLineStyle(EnumBorderLineStyle enumBorderLineStyle) {
		this.enumBorderLineStyle = enumBorderLineStyle;
	}

}
