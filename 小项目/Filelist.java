package 小项目;
import java.io.*;

public class Filelist {
	public static void main(String[] args) throws Exception {
		File f = new File("G:\\eclipse");//读取的
		new List().list(f);;
	}
	
}
class List{
	int level = 0;
	void list(File f)throws Exception{
		
		FileWriter fw = new FileWriter("C:\\Users\\38410\\Desktop\\111.txt");//写入的
		String preStr = "";
 		for(int i=0; i<level; i++){
			preStr += " ";
		}
		File[] s = f.listFiles();//返回一个抽象路径名数组
		for(int i=0; i<s.length;i++){
			System.out.println(preStr + s[i].getName());
		//	fw.write(preStr + s[i].getName());
			if(s[i].isDirectory()){
				list(s[i]);
				level++;
			}
		}
		fw.flush();
		fw.close();
		
		}
	}
