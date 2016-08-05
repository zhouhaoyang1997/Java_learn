package Test;
import java.util.*;
public class TestMap {
	public static void main(String[] args){
		Map<String,Integer> A1 = new HashMap<String,Integer>();
		Map<String,Integer> A2 = new TreeMap<String,Integer>();
		A1.put("one", 1);
		A1.put("two", 2);
		A1.put("three", 3);
		A2.put("A", 1);
		A2.put("B", 2);
		System.out.println(A1.size());
		System.out.println(A1.containsKey("1"));
		System.out.println(A1.containsKey("one"));
		System.out.println(A1.get("two"));
		A1.put("two", 23333);
		System.out.println(A1.get("two"));
	}
}
