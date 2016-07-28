package ѧϰ;
import java.util.*;
public class API_collection_1 {
	public static void main(String[] args){
		Collection c = new ArrayList();
		c.add("hello,world!");
		c.add(new Integer(100));
		System.out.println(c.size());
		System.out.println(c);
		c.add("hello,world!");
		System.out.println(c.size());
		System.out.println(c);
		/*2
		[hello,world!, 100]
		3
		[hello,world!, 100, hello,world!]
		 */
		c.remove("hello,world!");
		System.out.println(c.size());
		System.out.println(c);
	}
}
