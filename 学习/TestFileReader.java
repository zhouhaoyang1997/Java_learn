package 学习;
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
			fp1.write("我怎么这么聪明！");
			fp.close();
			fp1.close();
		}catch(FileNotFoundException e){
			System.out.println("文件找找不到！");
		}catch(IOException e1){
			System.out.println("文件读取错误！");
		}
		System.out.println("文件复制完成！");
	}
}
