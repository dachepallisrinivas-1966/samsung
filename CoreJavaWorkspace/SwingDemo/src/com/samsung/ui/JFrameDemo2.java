package com.samsung.ui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameDemo2 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private JButton btnExit, btnClose;
	
	public JFrameDemo2() {
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		setTitle("JFrame Example");

		btnExit = new JButton("Exit");
		btnClose = new JButton("Close");
		
		btnExit.addActionListener(this);
		container.add(btnExit);
		btnClose.addActionListener(this);
		container.add(btnClose);
		
		
		setSize(600,600);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == btnExit)
			System.exit(0);
	}
	
	public static void main(String[] args) {
		new JFrameDemo2();
	}

}
