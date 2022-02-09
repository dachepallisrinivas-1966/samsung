package com.samsung.ui;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/*
<applet	code="App2"		width=300	height=100>
</applet>
*/

public class App2 extends Applet implements Runnable {
	private String msg = "Impulse Software School, Vizag ";
	private Thread t = null;

	private int state;
	private boolean stopflag;

	@Override
	public void init() {
		setBackground(Color.cyan);
		setForeground(Color.red);
	}
	
	@Override
	public void start() // user defined method
	{
		t = new Thread(this);
		stopflag = false;
		t.start(); // call run() method
	}

	@Override
	public void run() // Thread class life cycle method
	{
		char ch;
		for (;;) // infinite loop
		{
			try {
				repaint();
				Thread.sleep(250);
				ch = msg.charAt(0);
				msg = msg.substring(1, msg.length());
				msg += ch;
				if (stopflag)
					break;
			} catch (InterruptedException e) {
			}
		}
	}

	public void stop() {
		stopflag = true;
		t = null;
	}

	public void paint(Graphics g) {
		g.drawString(msg, 50, 30);
	}
}
