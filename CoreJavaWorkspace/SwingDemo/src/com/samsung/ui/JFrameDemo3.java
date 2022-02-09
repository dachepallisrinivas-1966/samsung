package com.samsung.ui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JFrameDemo3 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private JLabel lblFirstNumber, lblSecondNumber, lblResult;
	private JTextField txtFirstNumber, txtSecondNumber, txtResult;
	
	private JButton btnExit, btnSum;
	
	public JFrameDemo3() {
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		setTitle("JFrame Example");
		
		lblFirstNumber = new JLabel("First Number : ");
		lblSecondNumber = new JLabel("Second Number : ");
		lblResult = new JLabel("Result : ");

		txtFirstNumber = new JTextField(10);
		txtSecondNumber = new JTextField(10);
		txtResult = new JTextField(10);
		
		btnSum = new JButton("Sum");
		btnExit = new JButton("Exit");

		
		container.add(lblFirstNumber); container.add(txtFirstNumber);
		container.add(lblSecondNumber); container.add(txtSecondNumber);
		container.add(lblResult); container.add(txtResult);
		txtResult.setEnabled(false);

		btnSum.addActionListener(this);
		container.add(btnSum);
		btnExit.addActionListener(this);
		container.add(btnExit);

		setSize(600,600);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == btnSum) {
			int firstNumber = Integer.parseInt(txtFirstNumber.getText());
			int secondNumber = Integer.parseInt(txtSecondNumber.getText());
			int result = firstNumber + secondNumber;
			txtResult.setText(String.valueOf(result));
		} else if (event.getSource() == btnExit)
			System.exit(0);
	}
	
	public static void main(String[] args) {
		new JFrameDemo3();
	}

}
