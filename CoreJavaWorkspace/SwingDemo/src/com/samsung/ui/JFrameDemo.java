package com.samsung.ui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameDemo extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;

	public JFrameDemo() {
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		setTitle("JFrame Example");

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(this);
		container.add(btnExit);
		
		setSize(600,600);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
	
	public static void main(String[] args) {
		new JFrameDemo();

	}

}
