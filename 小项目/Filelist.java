package 小项目;
import java.io.*;
public class Filelist {
	 	public static void main(String[] args) {
			new List().list(new File("D:\\BaiduYunDownload"));//读取的
		}
	 	
}
/*
 * 只有类才存在静态的变量 方法只能对静态变量的操作 不能在方法内试图定义静态变量，否则的话会抛出编译错误。
 * 静态变量的本意是为了让所有的对象共享这个变量,如果在方法里面定义静态变量的话就存在逻辑错误了,也达不到你想要目的. 
 * 因为在方法中定义静态变量根本没有他的任何意义.
 * 任何对象都有自己的方法,即使是静态方法,方法内的变量也是在方法调用时候才开始分配内存,所以想给成静态的在逻辑上存在问题
 */
class  List{
		public static int n = 0;
		void list(File f){
			String str = "";
			for(int i=0; i<n; i++){
				str += "\t";
			}
			try {
				FileWriter fw = new FileWriter("C:\\Users\\38410\\Desktop\\复制.txt");//写入的
				File[] s = f.listFiles();//返回一个抽象路径名数组
				for(int i=0; i<s.length;i++){
					System.out.println(str+s[i].getName());
					fw.write(str+s[i].getName()+"\r\n");
					if(s[i].isDirectory()){
						list(s[i]);
						fw.write("\r\n");
					}
				}
				fw.flush();
				fw.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
				//System.out.println("文件复制完成！");
			n++;
		}
	
}