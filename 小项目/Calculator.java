package 小项目;
/*
 *时间:2016年7月28日22:08:12 
 *目的:通过一些小程序来更好地理解
 */
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.math.*;
public class Calculator {
	public static void main(String[] args) {
		MyFrame A = new MyFrame("计算器");
		A.launch();
		A.setLocation(500, 500);
	}
}
class MyFrame extends Frame{
	TextField num1,num2,num3;
	public MyFrame(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public void launch(){
		/*
		 * 初始化文本框等。。。
		 */
		num1 = new TextField(10);
		num2 = new TextField(10);
		num3 = new TextField(15);
		Label plus = new Label("+");
		Button sum = new Button("=");
		setLayout(new FlowLayout());
		sum.addActionListener(new MyMonitor(this));//xx.addActionListener() 里面传递的是监听器类->Object 这个只是相当于含参类
		add(num1);add(plus); add(num2);add(sum);add(num3);//按顺序加载这几个
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
				super.windowClosing(e);
			}
		});
		pack();
		setVisible(true);
	}
}
class MyMonitor implements ActionListener{

	MyFrame frame = null;
	public MyMonitor(MyFrame frame) {
		this.frame = frame;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		BigInteger  n1 = new BigInteger(frame.num1.getText());
		BigInteger  n2 = new BigInteger(frame.num2.getText());
		BigInteger  end = n1.add(n2);
		frame.num3.setText(end.toString());
	}
	
}
