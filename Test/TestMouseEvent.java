package Test;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TestMouseEvent {
	public static void main(String[] args) {
		new MyFrame2();
	}
}
class MyFrame2 extends Frame{
	Frame f = new Frame("2333");
	Button b = new Button("start");
	TextField t = new TextField(10);
	public MyFrame2() {
		f.add(b,"South");f.add(t,"North");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				t.setText(b.getActionCommand());
			}
		});
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0);
			}
		});
		f.setVisible(true);
		f.pack();
	}
}