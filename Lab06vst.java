// Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;


public class Lab06vst extends Applet
{

	public void paint(Graphics g)
	{
		// Draw Grid
		g.drawRect(10,10,780,580);
		g.drawLine(400,10,400,590);
		g.drawLine(10,300,790,300);



		// Draw Random Lines





		// Draw Random Squares
//AKA => a beautiful shiny silky seventy passing the taste test, but not persona.
		Random rndInt = new Random(12345);
				for (int k = 1; k <= 1000; k++)
				{
					int x = rndInt.nextInt(340)+10;
					int y = rndInt.nextInt(240)+10;
					int red = rndInt.nextInt(256);
					int green = rndInt.nextInt(256);
					int blue = rndInt.nextInt(256);
					g.setColor(new Color(red,green,blue));
					g.fillRect(x,y,50,50);
				}




		// Draw Random Circles





		// Draw 3-D Box





	}

}




 
