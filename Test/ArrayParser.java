package Test;

public class ArrayParser {
	public static void main(String[] args){
		String s ="1,2,3;4,5;7,8,9,10,11";
		String[] s1 = s.split(";");//Ĭ�ϵķ�Ϊs1[3]
		for(int i=0; i<s1.length; i++){
			String[] s2 = s1[i].split(",");//��s1[i]��ÿһ�����зָ�
			Integer[][] a = new Integer[s1.length][s2.length];//ֻ�з�װ����ܵ��÷���
			System.out.println("\n");
			for(int j=0; j<s2.length; j++){
				a[i][j] = Integer.parseInt(s2[j]);//����ֱ�ӵ��� 
				System.out.println(a[i][j]);
			}
		}
	}
}
