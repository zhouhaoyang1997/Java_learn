package Ñ§Ï°;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Iterator;
public class TestMouseAdapter {
 public static void main(String[] args) {
	new PointFrame("»­µã~~~");
}
}
class PointFrame extends Frame{
	ArrayList<Point> points = null;
	public PointFrame(String title) throws HeadlessException {
		super(title);
		points = new ArrayList<Point>();
		setLayout(null);
		setBounds(500, 300, 500, 400);
		this.addMouseListener(new MyMonitor());
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
				System.exit(0);
			}
		});
		setVisible(true);
		// TODO Auto-generated constructor stub
	}
	public void paint(Graphics g){
		Iterator<Point> i = points.iterator();
		while(i.hasNext()){
			Point p = (Point)i.next();
			g.setColor(Color.red);
			g.fillOval(p.x,p.y, 10, 10);
		}
	}
	public void addpoint(Point p){
		points.add(p);
	}
	
}
class MyMonitor extends MouseAdapter {
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		PointFrame A = (PointFrame)e.getSource();
		A.addpoint(new Point(e.getX(),e.getY()));
		A.repaint();
	}
}


