package ѧϰ;
public class String_buffer {
	public static void main(String[] args){
		String s = "�ܺ���";
		String s1 ="��";
		StringBuffer sb1 = new StringBuffer(s);//����ֱ�Ӷ��� ����string���ͣ�StringBuffer���еķ�����Ҫƫ���ڶ����ַ����ı仯������׷�ӡ������ɾ���ȣ����Ҳ��StringBuffer��String�����Ҫ����
		sb1.append("\n"+s1);
		System.out.println(sb1);
	}
}
