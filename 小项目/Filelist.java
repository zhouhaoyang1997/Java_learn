package С��Ŀ;
import java.io.*;

public class Filelist {
	public static void main(String[] args) throws Exception {
		File f = new File("G:\\eclipse");//��ȡ��
		new List().list(f);;
	}
	
}
class List{
	int level = 0;
	void list(File f)throws Exception{
		
		FileWriter fw = new FileWriter("C:\\Users\\38410\\Desktop\\111.txt");//д���
		String preStr = "";
 		for(int i=0; i<level; i++){
			preStr += " ";
		}
		File[] s = f.listFiles();//����һ������·��������
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
