package com.lizhanmit.simplecalculator.view;

import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorView extends JFrame {
	
	private JTextField firstNumber = new JTextField(10);
	private JLabel additionLable = new JLabel("+");
	private JTextField secondNumber = new JTextField(10);
	private JButton addButton = new JButton("Calculate");
	private JTextField calcSolution = new JTextField(10);
	
	// constructor
	public CalculatorView() {
		JPanel calcPanel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		
		calcPanel.add(firstNumber);
		calcPanel.add(additionLable);
		calcPanel.add(secondNumber);
		calcPanel.add(addButton);
		calcPanel.add(calcSolution);
		
		this.add(calcPanel);
	}
	
	public int getFirstNumber() {
		return Integer.parseInt(firstNumber.getText());
		
	}

	public int getSecondNumber() {
		return Integer.parseInt(secondNumber.getText());
		
	}

	public void setCalcSolution(int solution) {
		calcSolution.setText(Integer.toString(solution));
	}
	
	public void addCalculationListener(ActionListener listenerForCalcButton) {
		addButton.addActionListener(listenerForCalcButton);
	}
	
	public void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}
}
