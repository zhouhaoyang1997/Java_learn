package ѧϰ;
/*
 *ʱ��:2016��7��26��20:10:09 
 *Ŀ��:�ı�����
 */
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestTextField {
	public static void main(String[] args) {
		 new MyFrame();
	}
}
class MyFrame extends Frame{
		MyFrame(){
		setBounds(500, 500, 100, 100);
		TextField tf = new TextField();
		add(tf);
		tf.addActionListener(new Monitor2());//Ϊ�ı�������Ӽ����¼�
		
		setVisible(true);
	}
}
class Monitor2 implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		TextField tf = (TextField)e.getSource();//���ϱߵ�û�й�ϵ  �ϱߵ��Ǵ�����һ���ı���  ��������ڽ���getsource���ص�ԭ�¼�����
		System.out.println(tf.getText());
		tf.setText("");
	}
}