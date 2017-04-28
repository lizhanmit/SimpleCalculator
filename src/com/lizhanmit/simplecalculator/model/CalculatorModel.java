package com.lizhanmit.simplecalculator.model;

public class CalculatorModel {

	private int calculationValue; 
	
	public void addition(int firstNum, int secondNum) {
		calculationValue = firstNum + secondNum;
	}
	
	public int getCalculationValue() {
		return calculationValue;
	}
}
