package С��Ŀ;
import java.io.*;
public class Filelist {
	 	public static void main(String[] args) {
			new List().list(new File("D:\\BaiduYunDownload"));//��ȡ��
		}
	 	
}
/*
 * ֻ����Ŵ��ھ�̬�ı��� ����ֻ�ܶԾ�̬�����Ĳ��� �����ڷ�������ͼ���徲̬����������Ļ����׳��������
 * ��̬�����ı�����Ϊ�������еĶ������������,����ڷ������涨�徲̬�����Ļ��ʹ����߼�������,Ҳ�ﲻ������ҪĿ��. 
 * ��Ϊ�ڷ����ж��徲̬��������û�������κ�����.
 * �κζ������Լ��ķ���,��ʹ�Ǿ�̬����,�����ڵı���Ҳ���ڷ�������ʱ��ſ�ʼ�����ڴ�,��������ɾ�̬�����߼��ϴ�������
 */
class  List{
		public static int n = 0;
		void list(File f){
			String str = "";
			for(int i=0; i<n; i++){
				str += "\t";
			}
			try {
				FileWriter fw = new FileWriter("C:\\Users\\38410\\Desktop\\����.txt");//д���
				File[] s = f.listFiles();//����һ������·��������
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
				//System.out.println("�ļ�������ɣ�");
			n++;
		}
	
}