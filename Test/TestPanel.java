package Test;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

/*
 *ʱ��:2016��7��26��18:08:08 
 *Ŀ��:Panel����ϰ
 *���:Panel���൱��д��һ��С�����Ȼ������Frameʱ���Լ��� ���
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
