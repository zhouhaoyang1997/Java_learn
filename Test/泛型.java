package Test;
import java.util.*;
public class 泛型 {
	public static void main(String[] args){
		List<String> A = new LinkedList<String>();
		Set<String> B = new HashSet<String>();
		A.add("111");A.add("222");A.add("333");//泛型就是规定容器里面的元素的统一类型
		B.add("11");B.add("22");B.add("33");
		System.out.println(A);
		for(int i=0; i<A.size(); i++){
			System.out.println(A.get(i));
			}
		///////////////////////////////////////////
		Iterator<String> i = B.iterator();
		while(i.hasNext()){
			System.out.println("B:"+i.next());
		}
	}
}
//Creates a collection and later an iterator to loop through.
//创建了一个集合和一个用于遍历的迭代器。
