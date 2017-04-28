package com.lizhanmit.simplecalculator.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.lizhanmit.simplecalculator.model.CalculatorModel;
import com.lizhanmit.simplecalculator.view.CalculatorView;

public class CalculatorController {

	private CalculatorView theView;
	private CalculatorModel theModel;
	
	public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
		
		this.theView.addCalculationListener(new CalculateListener());
	}
	
	class CalculateListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			int firstNumber, secondNumber = 0;
			
			try {
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();
				
				theModel.addition(firstNumber, secondNumber);
				
				theView.setCalcSolution(theModel.getCalculationValue());
			} 
			catch (NumberFormatException e) {
				theView.displayErrorMessage("Enter 2 integers.");
			}
		}
		
	}
}
