package com.anna.app;

import java.applet.*;
import java.awt.*;
public class CircleRecLine extends Applet
{
	public void paint(Graphics Grph)
	{
	
		Grph.setColor(Color.BLACK);
		Grph.drawLine(20, 20, 500, 20);
		
		Grph.setColor(Color.RED);
		Grph.fillRect(20, 40, 200, 40);
		
		Grph.setColor(Color.GREEN);
		Grph.fillOval(20, 100, 200, 200);
		
		

	}
}