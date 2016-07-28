package Ñ§Ï°;
import java.util.*;
public class TestSet {
	public static void main(String[] args){
		Set A = new HashSet();
		Set B = new HashSet();
		A.add("a");A.add("b");A.add("c");A.add("d");
		B.add("b");B.add("d");
		Set jiao = new HashSet(A);
		Set bing = new HashSet(B);
		jiao.retainAll(B);//£¿£¿£¿
		System.out.println(jiao);
	}
}
