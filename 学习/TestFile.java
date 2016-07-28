package 学习;
import java.io.*;
public class TestFile {
	public static void main(String[] args){
		String filename = "myfile.txt";
		String directory = "C:\\Users\\38410\\Desktop";//写相对路径，在这个类的包下 用绝对路径在指定位置创建
		File f = new File(directory,filename);
		if(f.exists()){
			System.out.println("文件名:"+f.getName());;
			System.out.println("文件大小"+f.length());
		}
		else{
			f.getParentFile().mkdirs();//如果没有getparentFlie 在jave中flie不仅可以是文件也有可能是路径，用了getparentFlie系统就会以父目录为基准在子文件创建文件，否则就会以最基层创建文件包！
			try{
				f.createNewFile();//
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
