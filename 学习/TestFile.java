package ѧϰ;
import java.io.*;
public class TestFile {
	public static void main(String[] args){
		String filename = "myfile.txt";
		String directory = "C:\\Users\\38410\\Desktop";//д���·�����������İ��� �þ���·����ָ��λ�ô���
		File f = new File(directory,filename);
		if(f.exists()){
			System.out.println("�ļ���:"+f.getName());;
			System.out.println("�ļ���С"+f.length());
		}
		else{
			f.getParentFile().mkdirs();//���û��getparentFlie ��jave��flie�����������ļ�Ҳ�п�����·��������getparentFlieϵͳ�ͻ��Ը�Ŀ¼Ϊ��׼�����ļ������ļ�������ͻ�������㴴���ļ�����
			try{
				f.createNewFile();//
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
