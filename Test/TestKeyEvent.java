package Test;
/*
 *时间:2016年8月5日16:56:08 
 *目的:自己看API文档，写出来keyevent事件，由于之前用c语言写过贪吃蛇，还算成功！！！哈哈~
 */
import java.awt.*; 
import java.awt.event.*;
public class TestKeyEvent {
	public static void main(String[] args) {
		new Key("233333333");
	}
}
class Key extends Frame{
	Image img = GameUtil.GetImage("image/img.jpeg");
	int x=50,y=50;
	public Key(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				super.keyPressed(e);
				if(e.getKeyCode() == KeyEvent.VK_UP){
					y-=10;
					repaint();
				}
				if(e.getKeyCode() == KeyEvent.VK_DOWN){
					y+=10;
					repaint();
				}
				if(e.getKeyCode() == KeyEvent.VK_LEFT){
					x-=10;
					repaint();
				}
				if(e.getKeyCode() == KeyEvent.VK_RIGHT){
					x+=10;
					repaint();
				}
			}
		});
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0);
			}
		});
		setVisible(true);
		setBounds(500, 500, 600, 500);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.setColor(Color.red);
		g.drawImage(img, x, y, null);
	}
	 
	
}