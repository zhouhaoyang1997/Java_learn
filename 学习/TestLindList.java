package 学习;
import java.util.*;
public class TestLindList {
	public static void main(String[] args){
		List<String> A = new LinkedList<String>();
		for(int i=0; i<5; i++){
			A.add("a"+i);
		}
		Collections.reverse(A);//Collections.shuffle();随机排序 Collections.sort();排序；Collections.binarySearch();折半查找   提供的方法 来自~~~java.util.Collections
		System.out.println(A);
		A.remove(3);
		System.out.println(A);
		A.add(0, "666");
		System.out.println(A);
		A.set(0, "55");
		System.out.println(A);
		try{
		System.out.println(A.get(6));//异常处理~~~
		}catch(Exception e){
			System.out.println("hhahahhaha");
		}
	}	
}
