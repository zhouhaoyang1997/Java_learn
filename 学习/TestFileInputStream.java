package ѧϰ;
import java.io.*;
public class TestFileInputStream {
	public static void main(String[] args){
		int b =0;
		FileInputStream in = null;
		FileOutputStream out = null;
		try{
			in = new FileInputStream("D:/U�̱���/����/c��ϰ��/��Ϸ/̰����.cpp");
			out = new FileOutputStream("C:\\Users\\38410\\Desktop\\����.txt");//û���Լ�����
		}catch(FileNotFoundException e){
			System.out.print("�Ҳ������ļ���");
			System.exit(1);
		}
		
		try{
			while((b=in.read())!=-1){
				System.out.print((char)b);//println������һ�е�;
				out.write(b);
			}
			in.close();
			out.close();
		}catch(IOException e){
			System.out.print("�ļ����ƴ���");
		}
		System.out.print("�ļ��Ѹ��ƣ�");
	}
	
	
	
}
