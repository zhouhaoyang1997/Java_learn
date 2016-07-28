package 学习;
import java.io.*;
public class TestBufferedWriterAndReader {
	public static void main(String[] args){
		try{
			String b ;
			BufferedReader br = new BufferedReader(new FileReader("D:/U盘备份/备份/c练习册/游戏/贪吃蛇.cpp"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\38410\\Desktop\\复制1.txt"));
			while((b=br.readLine())!=null){
				System.out.println(b);
				bw.write(b);
			}
			br.close();
			bw.close();
		
		}catch(FileNotFoundException e){
			System.out.println("找不到文件！");
		}catch(IOException e2){
			System.out.println("读取错误！");
		}catch(Exception w){};
	}
}
