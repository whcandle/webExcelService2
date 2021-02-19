package com.mg.webexcel.entity;

import java.util.List;
/// <summary>
/// 边框集合
/// </summary>
public class CommBorders {
	private List<CommBoder>  commBorders;

	public List<CommBoder> getCommBorders() {
		return commBorders;
	}

	public void setCommBorders(List<CommBoder> commBorders) {
		this.commBorders = commBorders;
	}
	
	 public void addbordersList(CommBoder border){
		 this.commBorders.add(border);
	 }

}
