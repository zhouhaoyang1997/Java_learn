package С��Ŀ;
import java.io.*;
public class Lookfor {
	 	public static void main(String[] args) {
			Lookfor A = new Lookfor();
			A.look("D:\\java��ϰ\\ѧϰ\\src");
		}
	 	public void look(String s){
	 		FileReader fr = null;
	 		FileWriter fw = null;
	 		//int b = 0;
	 		try {
	 			//read = new FileReader(s);
				fw = new FileWriter("C:\\Users\\38410\\Desktop\\����.txt");
				File f = new File(s);
				//System.out.println(f.getName());
				File[] files = f.listFiles();//����һ������·��������
				for(int i=0;i<files.length;i++){
					System.out.println(files[i].getName());
				}
//				while((b=read.read())!=-1){
					for(int i=0; i<files.length;i++){
						//if(files[i].isDirectory()){
							String str = files[i].getName();
							fw.write(str);
							System.out.println(files[i].getName());
					//	}
					//	else{
					//	write.write(files[i].getName());
					//	}
					}
				//}
				fr.close();
				fw.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
	 		System.out.println("�ļ�������ɣ�");
	 	}
}
