package 学习;
/*
 *时间:2016年7月26日20:10:09 
 *目的:文本输入
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
		tf.addActionListener(new Monitor2());//为文本输入添加监听事件
		
		setVisible(true);
	}
}
class Monitor2 implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		TextField tf = (TextField)e.getSource();//和上边的没有关系  上边的是创建了一个文本框  这个是用于接收getsource返回的原事件类型
		System.out.println(tf.getText());
		tf.setText("");
	}
}