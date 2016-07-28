//2016年7月10日18:57:43 处理流 buffered可以读一行
package 学习;
import java.io.*;
public class TestBufferedInputStream {
	public static void main(String[] args){
		try{
			int b = 0;
			FileInputStream p = new FileInputStream("C:\\Users\\38410\\Desktop\\复制.txt");
			BufferedInputStream fp = new BufferedInputStream(p);
			System.out.println((char)fp.read());
			System.out.println( (char)fp.read());
			fp.mark(10);
			while((b=fp.read())!=-1){
				System.out.print((char)b);
			}
			
			fp.close();
		}catch(FileNotFoundException e){
			System.out.println("找不到文件！");
		}catch(IOException e1){
			System.out.println("读取错误！");
		}
	}
}
