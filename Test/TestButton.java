package Test;
/*
 *时间:2016年7月26日19:41:07 
 *目的:了解button
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestButton {
	public static void main(String[] args) {
		Frame frame = new Frame("按钮");
		Button A = new Button("AA");
		Monitor M = new Monitor();
		A.addActionListener(M);//为按钮添加监听事件
		frame.add(A);
		frame.setBounds(300, 300, 100, 100);
		frame.setVisible(true);
		
	}
}
class Monitor implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("呵呵哒！");
		
	}
	
}