package ѧϰ;
import java.util.*;
public class TestLindList {
	public static void main(String[] args){
		List<String> A = new LinkedList<String>();
		for(int i=0; i<5; i++){
			A.add("a"+i);
		}
		Collections.reverse(A);//Collections.shuffle();������� Collections.sort();����Collections.binarySearch();�۰����   �ṩ�ķ��� ����~~~java.util.Collections
		System.out.println(A);
		A.remove(3);
		System.out.println(A);
		A.add(0, "666");
		System.out.println(A);
		A.set(0, "55");
		System.out.println(A);
		try{
		System.out.println(A.get(6));//�쳣����~~~
		}catch(Exception e){
			System.out.println("hhahahhaha");
		}
	}	
}
