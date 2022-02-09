package com.samsung.ui;

import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

// swings - [JComboBox, JCheckBox]
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;


public class JFrameDemo4 extends JFrame implements ActionListener, ItemListener {
	private static final long serialVersionUID = 1L;
	private JComboBox<String> cbv;
	private JRadioButton rb1, rb2, rb3;
	private JCheckBox cbMetalic;
	private JLabel lblTotal;

	public JFrameDemo4() {
		super("Price Calculator");
		cbv = new JComboBox<>();
		cbv.addItem("Hero Honda Passion");
		cbv.addItem("Bajaj Pulsor");
		cbv.addItem("TVS vector");

		rb1 = new JRadioButton("1 year", true);
		rb2 = new JRadioButton("3 year");
		rb3 = new JRadioButton("5 year");

		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);

		cbMetalic = new JCheckBox("Metalic");

		lblTotal = new JLabel("47250");
		Font f = new Font("Arial", Font.BOLD, 16);
		lblTotal.setFont(f);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel l1 = new JLabel("Vehicle");
		add(c, l1, 10, 10, 70, 20);
		add(c, cbv, 100, 10, 150, 20);

		JLabel l2 = new JLabel("Loan Period : ");
		add(c, l2, 10, 45, 70, 20);
		add(c, rb1, 100, 40, 75, 20);
		add(c, rb2, 175, 40, 75, 20);
		add(c, rb3, 250, 40, 75, 20);

		add(c, cbMetalic, 10, 70, 100, 20);
		add(c, new JLabel("Total Amount"), 10, 100, 100, 20);
		add(c, lblTotal, 100, 100, 100, 20);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(350, 200);
		setVisible(true);

		rb1.addActionListener(this);
		rb2.addActionListener(this);
		rb3.addActionListener(this);
		cbMetalic.addItemListener(this);
		cbv.addItemListener(this);
	}

	public void actionPerformed(ActionEvent ae) {
		displayprice();
	}

	public void itemStateChanged(ItemEvent ie) {
		displayprice();
	}

	private void displayprice() {
		int prices[] = { 45000, 55000, 48000 };
		int price;
		price = prices[cbv.getSelectedIndex()];
		if (rb1.isSelected())
			price += 1.05;
		else if (rb2.isSelected())
			price += (price * 0.65) * 3;
		else
			price += price * 0.08 * 5;
		if (cbMetalic.isSelected())
			price += 500;
		lblTotal.setText(String.valueOf(price));
	}

	private void add(Container c, Component comp, int x, int y, int w, int h) {
		comp.setBounds(x, y, w, h);
		c.add(comp);
	}

	public static void main(String[] args) {
		new JFrameDemo4();
	}
}
