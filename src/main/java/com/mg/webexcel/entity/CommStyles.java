package com.mg.webexcel.entity;

import java.util.List;

public class CommStyles {
	private  List<CommStyle> StyleList;

	public List<CommStyle> getStyleList() {
		return StyleList;
	}

	public void setStyleList(List<CommStyle> styleList) {
		StyleList = styleList;
	}

	public  void addStyleList(CommStyle style){
		this.StyleList.add(style);
	}

}
