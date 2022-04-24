package com.gl.javafsd.ds3.generics;

public class StringPair {

	private String num1;
	private String num2;
	
	public StringPair(String num1, String num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public String getNum1() {
		return num1;
	}
	public void setNum1(String num1) {
		this.num1 = num1;
	}
	public String getNum2() {
		return num2;
	}
	public void setNum2(String num2) {
		this.num2 = num2;
	}
	
	public String toString() {
		return "Num1 -> " + num1 + ", Num2 -> " + num2;
	}
	
}
