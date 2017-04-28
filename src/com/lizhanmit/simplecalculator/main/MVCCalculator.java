package com.lizhanmit.simplecalculator.main;

import com.lizhanmit.simplecalculator.controller.CalculatorController;
import com.lizhanmit.simplecalculator.model.CalculatorModel;
import com.lizhanmit.simplecalculator.view.CalculatorView;

public class MVCCalculator {

	public static void main(String[] args) {

		CalculatorView theView = new CalculatorView();
		CalculatorModel theModel = new CalculatorModel();
		CalculatorController theController = new CalculatorController(theView, theModel);
		
		theView.setVisible(true);
	}

}
