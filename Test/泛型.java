package Test;
import java.util.*;
public class ���� {
	public static void main(String[] args){
		List<String> A = new LinkedList<String>();
		Set<String> B = new HashSet<String>();
		A.add("111");A.add("222");A.add("333");//���;��ǹ涨���������Ԫ�ص�ͳһ����
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
//������һ�����Ϻ�һ�����ڱ����ĵ�������
