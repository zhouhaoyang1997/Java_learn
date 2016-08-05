package Test;
//2016Äê7ÔÂ4ÈÕ11:17:08
class Test{
	String s ="zhouhaoyangzhouhaoyang";
	String s_find ="a";
	int index = -1;
	int count = 0;
	void test(){
		while((index = s.indexOf(s_find)) != -1){
			s = s.substring(index+s_find.length());//"unhappy".substring(2) returns "happy"
			count++;							   //	"Harbison".substring(3) returns "bison"
		}
		System.out.println(count);
	}
}

public class String_test {
	public static void main(String[] args){
		Test A = new Test();
		A.test();
	}
}
