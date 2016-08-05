package Test;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

/*
 *时间:2016年7月26日18:08:08 
 *目的:Panel的练习
 *理解:Panel就相当于写了一个小配件，然后在用Frame时可以加上 这个
 */
public class TestPanel {
	public static void main(String[] args) {
		Frame A = new Frame("AA");
		Panel B = new Panel(null);
		A.setLayout(null);
		A.setBackground(Color.yellow);
		A.setBounds(50, 50, 400, 400);
		B.setBounds(50, 50, 300, 300);
		B.setBackground(Color.BLUE);
		A.add(B);
		A.setVisible(true);
	}
}
