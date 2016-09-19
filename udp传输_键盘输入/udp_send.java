package udp传输_键盘输入;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class udp_send {
	public static void main(String[] args) throws Exception {
		System.out.println("udp 发送端 run!");
		/*
		 * 通过查阅API文档，了解用于udp传输的是DatagramSocket
		 * 
		 * 通过udp协议发送文本数据
		 * 思路：
		 * 1.建立udp的socket,使之具备发送和接受功能
		 * 2.将数据封装到数据包中，数据包对象是DatagramSocket
		 * 3.使用socket的send方法发送出去
		 * 4.关闭资源。
		 */
		//1.建立udp的socket,使之具备发送和接受功能
		DatagramSocket ds = new DatagramSocket();//如果不加特定参数，将自动寻找闲置的端口
		//2.将数据封装到数据包中，数据包对象是DatagramSocket
		String str = "哈哈哈，实验成功！";
		byte[] buf = str.getBytes();//将数据转成字节组
		DatagramPacket dp = new DatagramPacket(buf, buf.length,InetAddress.getLocalHost(),10000);//这里是接收端的ip地址，端口
		// 3.使用socket的send方法发送出去
		ds.send(dp);
		//4.关闭资源。
		ds.close();
	}
}
