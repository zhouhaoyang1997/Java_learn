//2016��7��10��18:57:43 ������ buffered���Զ�һ��
package ѧϰ;
import java.io.*;
public class TestBufferedInputStream {
	public static void main(String[] args){
		try{
			int b = 0;
			FileInputStream p = new FileInputStream("C:\\Users\\38410\\Desktop\\����.txt");
			BufferedInputStream fp = new BufferedInputStream(p);
			System.out.println((char)fp.read());
			System.out.println( (char)fp.read());
			fp.mark(10);
			while((b=fp.read())!=-1){
				System.out.print((char)b);
			}
			
			fp.close();
		}catch(FileNotFoundException e){
			System.out.println("�Ҳ����ļ���");
		}catch(IOException e1){
			System.out.println("��ȡ����");
		}
	}
}
