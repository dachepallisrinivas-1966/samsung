package com.samsung.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SwingCalculator implements ActionListener {
	JFrame frame;
	JTextField txtInput;
	JButton btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero, btnDivision,
			btnMultiplication, btnSubtraction, btnAdd, btnDecimalPoint, btnEqualTo, btnDelete, btnClear;

	static double a = 0, b = 0, result = 0;
	static int operator = 0;

	SwingCalculator() {
		frame = new JFrame("Calculator");
		txtInput = new JTextField();
		btnOne = new JButton("1");
		btnTwo = new JButton("2");
		btnThree = new JButton("3");
		btnFour = new JButton("4");
		btnFive = new JButton("5");
		btnSix = new JButton("6");
		btnSeven = new JButton("7");
		btnEight = new JButton("8");
		btnNine = new JButton("9");
		btnZero = new JButton("0");
		btnDivision = new JButton("/");
		btnMultiplication = new JButton("*");
		btnSubtraction = new JButton("-");
		btnAdd = new JButton("+");
		btnDecimalPoint = new JButton(".");
		btnEqualTo = new JButton("=");
		btnDelete = new JButton("Delete");
		btnClear = new JButton("Clear");
		txtInput.setBounds(30, 40, 280, 30);
		btnSeven.setBounds(40, 100, 50, 40);
		btnEight.setBounds(110, 100, 50, 40);
		btnNine.setBounds(180, 100, 50, 40);
		btnDivision.setBounds(250, 100, 50, 40);
		btnFour.setBounds(40, 170, 50, 40);
		btnFive.setBounds(110, 170, 50, 40);
		btnSix.setBounds(180, 170, 50, 40);
		btnMultiplication.setBounds(250, 170, 50, 40);
		btnOne.setBounds(40, 240, 50, 40);
		btnTwo.setBounds(110, 240, 50, 40);
		btnThree.setBounds(180, 240, 50, 40);
		btnSubtraction.setBounds(250, 240, 50, 40);
		btnDecimalPoint.setBounds(40, 310, 50, 40);
		btnZero.setBounds(110, 310, 50, 40);
		btnEqualTo.setBounds(180, 310, 50, 40);
		btnAdd.setBounds(250, 310, 50, 40);
		btnDelete.setBounds(60, 380, 100, 40);
		btnClear.setBounds(180, 380, 100, 40);
		frame.add(txtInput);
		frame.add(btnSeven);
		frame.add(btnEight);
		frame.add(btnNine);
		frame.add(btnDivision);
		frame.add(btnFour);
		frame.add(btnFive);
		frame.add(btnSix);
		frame.add(btnMultiplication);
		frame.add(btnOne);
		frame.add(btnTwo);
		frame.add(btnThree);
		frame.add(btnSubtraction);
		frame.add(btnDecimalPoint);
		frame.add(btnZero);
		frame.add(btnEqualTo);
		frame.add(btnAdd);
		frame.add(btnDelete);
		frame.add(btnClear);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(350, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		btnOne.addActionListener(this);
		btnTwo.addActionListener(this);
		btnThree.addActionListener(this);
		btnFour.addActionListener(this);
		btnFive.addActionListener(this);
		btnSix.addActionListener(this);
		btnSeven.addActionListener(this);
		btnEight.addActionListener(this);
		btnNine.addActionListener(this);
		btnZero.addActionListener(this);
		btnAdd.addActionListener(this);
		btnDivision.addActionListener(this);
		btnMultiplication.addActionListener(this);
		btnSubtraction.addActionListener(this);
		btnDecimalPoint.addActionListener(this);
		btnEqualTo.addActionListener(this);
		btnDelete.addActionListener(this);
		btnClear.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOne)
			txtInput.setText(txtInput.getText().concat("1"));
		if (e.getSource() == btnTwo)
			txtInput.setText(txtInput.getText().concat("2"));
		if (e.getSource() == btnThree)
			txtInput.setText(txtInput.getText().concat("3"));
		if (e.getSource() == btnFour)
			txtInput.setText(txtInput.getText().concat("4"));
		if (e.getSource() == btnFive)
			txtInput.setText(txtInput.getText().concat("5"));
		if (e.getSource() == btnSix)
			txtInput.setText(txtInput.getText().concat("6"));
		if (e.getSource() == btnSeven)
			txtInput.setText(txtInput.getText().concat("7"));
		if (e.getSource() == btnEight)
			txtInput.setText(txtInput.getText().concat("8"));
		if (e.getSource() == btnNine)
			txtInput.setText(txtInput.getText().concat("9"));
		if (e.getSource() == btnZero)
			txtInput.setText(txtInput.getText().concat("0"));
		if (e.getSource() == btnDecimalPoint)
			txtInput.setText(txtInput.getText().concat("."));
		if (e.getSource() == btnAdd) {
			a = Double.parseDouble(txtInput.getText());
			operator = 1;
			txtInput.setText("");
		}
		if (e.getSource() == btnSubtraction) {
			a = Double.parseDouble(txtInput.getText());
			operator = 2;
			txtInput.setText("");
		}
		if (e.getSource() == btnMultiplication) {
			a = Double.parseDouble(txtInput.getText());
			operator = 3;
			txtInput.setText("");
		}
		if (e.getSource() == btnDivision) {
			a = Double.parseDouble(txtInput.getText());
			operator = 4;
			txtInput.setText("");
		}
		if (e.getSource() == btnEqualTo) {
			b = Double.parseDouble(txtInput.getText());
			switch (operator) {
			case 1:
				result = a + b;
				break;
			case 2:
				result = a - b;
				break;
			case 3:
				result = a * b;
				break;
			case 4:
				result = a / b;
				break;
			default:
				result = 0;
			}
			txtInput.setText("" + result);
		}
		if (e.getSource() == btnClear)
			txtInput.setText("");
		if (e.getSource() == btnDelete) {
			String s = txtInput.getText();
			txtInput.setText("");
			for (int i = 0; i < s.length() - 1; i++)
				txtInput.setText(txtInput.getText() + s.charAt(i));
		}
	}

	public static void main(String[] args) {
		new SwingCalculator();
	}
}