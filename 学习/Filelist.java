package 学习;

import java.io.*;

public class Filelist {
    public static void main(String[] args) throws Exception{
        File f = new File("D:\\迅雷下载");//读取的
      //  list(f,0);
        rewriter();
    }
    public static void list(File f,int level)throws Exception{
    	// BufferedReader br=new BufferedReader(new FileReader(f));
        FileWriter fw = new FileWriter("C:\\Users\\38410\\Desktop\\111.txt",true);//写入的
        String preStr = "";
//        int b = 0;
        for(int i=0; i<level; i++){
            preStr += "\t";
        }
        File[] s = f.listFiles();//返回一个抽象路径名数组
        for(int i=0; i<s.length;i++){
        	System.out.println(preStr + s[i].getName());
            fw.write(preStr + s[i].getName()+"\r\n");
        	if(s[i].isDirectory()){
                list(s[i],level+1);
                fw.write("\r\n");
                fw.flush();
            }
//            else{
//            	while((b=fr.read())!=-1){
//            	//	fw.write(b);
//            		System.out.println("");
//            	}
//            }
        }
        fw.close();
     //   fr.close();
    }
    public static void rewriter() throws Exception{
    	FileReader A = new FileReader("C:\\Users\\38410\\Desktop\\111.txt") ;
    	FileWriter B = new FileWriter("C:\\Users\\38410\\Desktop\\111.txt");
    	int b = 0;
    	while((b=A.read())!=-1){
    		
    	}
    	A.close();
    	B.close();
    }
}
