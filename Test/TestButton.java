package Test;
/*
 *ʱ��:2016��7��26��19:41:07 
 *Ŀ��:�˽�button
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestButton {
	public static void main(String[] args) {
		Frame frame = new Frame("��ť");
		Button A = new Button("AA");
		Monitor M = new Monitor();
		A.addActionListener(M);//Ϊ��ť��Ӽ����¼�
		frame.add(A);
		frame.setBounds(300, 300, 100, 100);
		frame.setVisible(true);
		
	}
}
class Monitor implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("�Ǻ��գ�");
		
	}
	
}