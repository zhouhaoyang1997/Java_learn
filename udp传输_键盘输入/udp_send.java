package udp����_��������;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class udp_send {
	public static void main(String[] args) throws Exception {
		System.out.println("udp ���Ͷ� run!");
		/*
		 * ͨ������API�ĵ����˽�����udp�������DatagramSocket
		 * 
		 * ͨ��udpЭ�鷢���ı�����
		 * ˼·��
		 * 1.����udp��socket,ʹ֮�߱����ͺͽ��ܹ���
		 * 2.�����ݷ�װ�����ݰ��У����ݰ�������DatagramSocket
		 * 3.ʹ��socket��send�������ͳ�ȥ
		 * 4.�ر���Դ��
		 */
		//1.����udp��socket,ʹ֮�߱����ͺͽ��ܹ���
		DatagramSocket ds = new DatagramSocket();//��������ض����������Զ�Ѱ�����õĶ˿�
		//2.�����ݷ�װ�����ݰ��У����ݰ�������DatagramSocket
		String str = "��������ʵ��ɹ���";
		byte[] buf = str.getBytes();//������ת���ֽ���
		DatagramPacket dp = new DatagramPacket(buf, buf.length,InetAddress.getLocalHost(),10000);//�����ǽ��ն˵�ip��ַ���˿�
		// 3.ʹ��socket��send�������ͳ�ȥ
		ds.send(dp);
		//4.�ر���Դ��
		ds.close();
	}
}
