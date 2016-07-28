package 学习;
import java.io.*;

public class Filelist {
	public static void main(String[] args){
		File f = new File("C:\\Users\\38410\\Desktop");
		list(f,0);
	}
	public static void list(File f,int level){
		String preStr = "";
		for(int i=0; i<level; i++){
			preStr += "    ";
		}
		File[] s = f.listFiles();//返回一个抽象路径名数组
		for(int i=0; i<s.length;i++){
			System.out.println(preStr + s[i].getName());
			if(s[i].isDirectory()){
				list(s[i],level+1);
				System.out.println("");
			}
		}
	}
}
