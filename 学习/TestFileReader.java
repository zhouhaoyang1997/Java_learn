package ѧϰ;
import java.io.*;
public class TestFileReader {
	public static void main(String[] args){
		FileReader fp = null;
		FileWriter fp1 = null;
		int b =0;
		try{
			fp = new FileReader("C:\\Users\\38410\\Desktop\\list.txt");
			fp1 = new FileWriter("C:\\Users\\38410\\Desktop\\list_copy.txt");
			while((b=fp.read())!=-1){
				fp1.write(b);
				//System.out.println((char)b);
			}
			fp1.write("����ô��ô������");
			fp.close();
			fp1.close();
		}catch(FileNotFoundException e){
			System.out.println("�ļ����Ҳ�����");
		}catch(IOException e1){
			System.out.println("�ļ���ȡ����");
		}
		System.out.println("�ļ�������ɣ�");
	}
}
