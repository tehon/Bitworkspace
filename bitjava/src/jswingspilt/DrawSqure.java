package jswingspilt;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class DrawSqure extends JPanel
{
	//GamePannel gamepannel = new GamePannel();

	/*@Override
	public void paint(Graphics g)
	{
		System.out.println("paint 호출");
		//super.paint(g);
		Graphics2D g2d = (Graphics2D)g;
		g2d.fillRect(410, 150, 250, 250);
		g2d.setColor(Color.black);
		 g.fillRect(100, 10, 60, 50);
	}*/
	public DrawSqure(){
		System.out.println("DrawSqure 호출");
	}
	  @Override
	    public void paint(Graphics g) {//Component
		  System.out.println("paint 호출"); 
		  //rectangle originates at 10,10 and ends at 240,240
	        g.drawRect(10, 10, 240, 240);
	        //filled Rectangle with rounded corners.    
	        g.fillRoundRect(50, 50, 100, 100, 80, 80);
	    }
}
/*
 * Graphics2D g2d = (Graphics2D) this.getGraphics();//Graphics2D g = this.getGraphics();
 * 
 * g2d.setColor(Color.black );
 * 
 * 
 * g2d.fillRect(410, 150, 250, 250);
 * g2d.dispose();
 */