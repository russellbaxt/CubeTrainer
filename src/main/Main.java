package main;

import javax.swing.JFrame;

public class Main
{
	JFrame frame;

	public static void main(String[] args)
	{
		new Main().start();
	}

	protected void start()
	{
		System.out.println("Width: " + Tools.getWidth() + "  Height: " + Tools.getHeight());
		frame = new JFrame(Tools.getTitle());
		frame.setSize(Tools.getWidth(), Tools.getHeight());
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
	}
}
