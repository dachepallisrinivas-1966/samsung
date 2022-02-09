package com.samsung.ui;

import java.applet.Applet;
import java.awt.Graphics;

/*
	<applet	code="App3"	height=400	width=400>
		<param	name="message" 	value="Impulse">
	</applet>
*/

public class App3 extends Applet {
	private String str;

	@Override
	public void init() {
		str = getParameter("message");
		if (str == null)
			str = "Java";
		str = "Hello, " + str;
	}

	@Override
	public void paint(Graphics g) {
		g.drawString(str, 10, 100);
	}
}
