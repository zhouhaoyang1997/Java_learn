package Test;
import java.util.*;
public class TestSanner {
	public static void main (String[] args){
		int a,b;
		Scanner A = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		a = A.nextInt();
		System.out.println("请输入第二个数：");
		b = A.nextInt();
		System.out.println("两数之和为："+(a+b));
	}
}
