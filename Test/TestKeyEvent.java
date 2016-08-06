package Test;
/*
 *ʱ��:2016��8��5��16:56:08 
 *Ŀ��:�Լ���API�ĵ���д����keyevent�¼�������֮ǰ��c����д��̰���ߣ�����ɹ�����������~
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