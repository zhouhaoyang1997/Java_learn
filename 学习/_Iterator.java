package ѧϰ;

import java.util.*;

public class _Iterator {
	public static void main(String[] args){
		Collection<String> A =  new HashSet<String>();
		A.add("�ܺ����Ǹ�");
		A.add("233333333333");
		A.add("66666");
		Iterator<String> i =A.iterator();
		while(i.hasNext()){//boolean���� ���ж���һ��
			System.out.println(i.next());//next����������һ����ֵ
		}
		
	}
}
