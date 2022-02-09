package com.samsung.ui;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
	<applet code="App1" width="300" height="300">
	</applet>
*/
public class App1 extends Applet implements ActionListener {
	private Label lblName;
	private TextField txtName;
	private Button btnSignIn;

	public void init() {
		lblName = new Label("User Name : ");
		txtName = new TextField(10);
		btnSignIn = new Button("Sign In");
		btnSignIn.addActionListener(this);
		add(lblName);
		add(txtName);
		add(btnSignIn);
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == btnSignIn) {
			Graphics g = getGraphics();
			if (!txtName.getText().equals("IMPULSE"))
				g.drawString("Sorry!", 100, 100);
			else
				g.drawString("Welcome!", 100, 100);
		}
	}
}
