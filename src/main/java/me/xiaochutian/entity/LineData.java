package me.xiaochutian.entity;

public class LineData {
	String lineCode;
	String lineName;
	
	public LineData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public LineData(String lineCode, String lineName) {
		super();
		this.lineCode = lineCode;
		this.lineName = lineName;
	}

	public String getLineCode() {
		return lineCode;
	}
	public void setLineCode(String lineCode) {
		this.lineCode = lineCode;
	}
	public String getLineName() {
		return lineName;
	}
	public void setLineName(String lineName) {
		this.lineName = lineName;
	}
	
}
