package Test;

public class ArrayParser {
	public static void main(String[] args){
		String s ="1,2,3;4,5;7,8,9,10,11";
		String[] s1 = s.split(";");//默认的分为s1[3]
		for(int i=0; i<s1.length; i++){
			String[] s2 = s1[i].split(",");//对s1[i]的每一个进行分割
			Integer[][] a = new Integer[s1.length][s2.length];//只有封装类才能调用方法
			System.out.println("\n");
			for(int j=0; j<s2.length; j++){
				a[i][j] = Integer.parseInt(s2[j]);//可以直接调用 
				System.out.println(a[i][j]);
			}
		}
	}
}
