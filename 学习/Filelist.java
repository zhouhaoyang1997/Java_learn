package ѧϰ;
import java.io.*;

public class Filelist {
	public static void main(String[] args) throws Exception{
		File f = new File("D:\\BaiduYunDownload");//��ȡ��
		list(f,0);
	}
	public static void list(File f,int level)throws Exception{
		FileWriter fw = new FileWriter("C:\\Users\\38410\\Desktop\\111.txt");//д���
		String preStr = "";
		for(int i=0; i<level; i++){
			preStr += "    ";
		}
		File[] s = f.listFiles();//����һ������·��������
		for(int i=0; i<s.length;i++){
			System.out.println(preStr + s[i].getName());
			fw.write(preStr + s[i].getName()+"\r\n");
			if(s[i].isDirectory()){
				list(s[i],level+1);
				System.out.println("");
			}
		}
		fw.flush();
		fw.close();
	}
}
