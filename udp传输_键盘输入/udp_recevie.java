package udp����_��������;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class udp_recevie {
	public static void main(String[] args) throws Exception {
		System.out.println("udp ���ܶ� run!");
		//����socket
		DatagramSocket ds = new DatagramSocket(10000);
		//�������ݰ�
		byte[] buf = new byte[1024];
		DatagramPacket dp =new DatagramPacket(buf, buf.length);
		//�������ݣ������ݴ��������ݰ���
		ds.receive(dp);//socket��Ϊ��ͷ���յ��ö˿ڵ��������ݣ�������洢��dp���ݰ���
		//���
		String text = new String(dp.getData(), 0, dp.getLength());//��ȡ�ֽ�������x��ʼ��x����;
		System.out.println(text);
	}
}
