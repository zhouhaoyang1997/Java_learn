package ѧϰ;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class TestPaint {
	public static void main(String[] args){
		new PaintFrame().launchFrame();
	}
}
class PaintFrame extends Frame{
	public void launchFrame(){
		setBounds(500, 500, 600, 500);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		//Color c = g.getColor();
		g.setColor(Color.red);
		g.draw3DRect(200, 200, 60, 60,false);
		g.setColor(Color.red);
		g.fillRect(100, 100, 50, 50);
		g.setColor(Color.green);
		g.fillRect(150, 100, 50, 50);
		g.setColor(Color.blue);
		g.fillRect(200, 100, 50, 50);
		//g.setColor(c);
	}
	
	
}
