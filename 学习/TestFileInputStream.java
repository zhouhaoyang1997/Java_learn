package 学习;
import java.io.*;
public class TestFileInputStream {
	public static void main(String[] args){
		int b =0;
		FileInputStream in = null;
		FileOutputStream out = null;
		try{
			in = new FileInputStream("D:/U盘备份/备份/c练习册/游戏/贪吃蛇.cpp");
			out = new FileOutputStream("C:\\Users\\38410\\Desktop\\复制.txt");//没有自己建造
		}catch(FileNotFoundException e){
			System.out.print("找不到该文件！");
			System.exit(1);
		}
		
		try{
			while((b=in.read())!=-1){
				System.out.print((char)b);//println是另起一行的;
				out.write(b);
			}
			in.close();
			out.close();
		}catch(IOException e){
			System.out.print("文件复制错误！");
		}
		System.out.print("文件已复制！");
	}
	
	
	
}
