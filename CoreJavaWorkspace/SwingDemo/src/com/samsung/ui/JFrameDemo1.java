package com.samsung.ui;

// Program : digitalclock.java
// swings - [Timer]
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

public class JFrameDemo1 extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JLabel l1 = new JLabel();
	private Timer t;

	public JFrameDemo1() {
		super("Swing Clock");
		l1.setFont(new Font("Verdana", Font.BOLD, 30));
		l1.setHorizontalAlignment(JLabel.CENTER);
		l1.setText(new Date().toString().substring(11, 19));
		l1.setText(new Date().toString());
		t = new Timer(1000, this);
		t.start();
		getContentPane().add(l1);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(200, 200);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		l1.setText(new Date().toString().substring(11, 19));
	}

	public static void main(String[] args) {
		new JFrameDemo1();
	}
}
