package com.javaex.ex03;

public class Shape {
	
	protected String fillColor;
	protected String lineColor;
	
	public Shape() {
	}
	
	//	생성자 선언하지 않으면 기본생성자를 자동으로 추가
	//	임의로 생성자를 생성하면 기본생성자를 자동으로 추가 x
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
		System.out.println();
	}
	
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
		System.out.println();
	}
	
	
}

