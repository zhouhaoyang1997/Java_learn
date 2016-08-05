/*
 *时间:2016年7月24日23:09:46 
 *目的:GUI 关于frame的练习
 */
package Test;
import java.awt.*;
public class TestFrrame {
	public static void main(String[] args) {
		Frame f = new Frame("框架");
		f.setSize(600,500);
		f.setVisible(true);
		f.setLocation(50, 50);
		f.setBackground(Color.black);
	}
}
