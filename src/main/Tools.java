package main;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Tools
{
	protected static final String TITLE = "CubeTrainer";
	protected static int[] sizes = new Tools().evaluateScreenSize();
	protected static final int WIDTH = sizes[0];
	protected static final int HEIGHT = sizes[1];

	public int[] evaluateScreenSize()
	{
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = (width * 2) / 3;
		if (height > screenSize.getHeight())
		{
			height = screenSize.getHeight() * .9;
			width = (height * 3) / 2;
		}
		
		return new int[]
		{ (int) width, (int) height };
	}

	public static String getTitle()
	{
		return TITLE;
	}

	public static int getWidth()
	{
		return WIDTH;
	}

	public static int getHeight()
	{
		return HEIGHT;
	}
}
