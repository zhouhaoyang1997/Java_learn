package 学习;

import java.util.*;

public class _Iterator {
	public static void main(String[] args){
		Collection<String> A =  new HashSet<String>();
		A.add("周浩洋那个");
		A.add("233333333333");
		A.add("66666");
		Iterator<String> i =A.iterator();
		while(i.hasNext()){//boolean类型 ，判断下一个
			System.out.println(i.next());//next（）返回下一个的值
		}
		
	}
}
