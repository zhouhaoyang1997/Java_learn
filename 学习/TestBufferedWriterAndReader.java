package ѧϰ;
import java.io.*;
public class TestBufferedWriterAndReader {
	public static void main(String[] args){
		try{
			String b ;
			BufferedReader br = new BufferedReader(new FileReader("D:/U�̱���/����/c��ϰ��/��Ϸ/̰����.cpp"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\38410\\Desktop\\����1.txt"));
			while((b=br.readLine())!=null){
				System.out.println(b);
				bw.write(b);
			}
			br.close();
			bw.close();
		
		}catch(FileNotFoundException e){
			System.out.println("�Ҳ����ļ���");
		}catch(IOException e2){
			System.out.println("��ȡ����");
		}catch(Exception w){};
	}
}
