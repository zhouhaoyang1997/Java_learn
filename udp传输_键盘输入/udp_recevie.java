package udp传输_键盘输入;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class udp_recevie {
	public static void main(String[] args) throws Exception {
		System.out.println("udp 接受端 run!");
		//建立socket
		DatagramSocket ds = new DatagramSocket(10000);
		//定义数据包
		byte[] buf = new byte[1024];
		DatagramPacket dp =new DatagramPacket(buf, buf.length);
		//接受数据，将数据储存在数据包中
		ds.receive(dp);//socket作为码头接收到该端口的外来数据，并将其存储到dp数据包中
		//拆包
		String text = new String(dp.getData(), 0, dp.getLength());//读取字节流，从x开始，x结束;
		System.out.println(text);
	}
}
