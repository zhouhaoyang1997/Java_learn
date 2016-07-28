package —ßœ∞;
class testString{
	String str = "12345678998745632489988956";
	String s = "9";
	int count =  0 ;
	int index = -1;
	testString(){
		while((index = str.indexOf(s)) != -1)
		{
			str = str.substring(index+s.length());
			count++;
		}
		System.out.print(count);
	}
}
public class ¿‡ {

	public static void main(String[] args){
		testString one1 = new testString();
		testString one2 = new testString();
		System.out.print(one1.equals(one2));
	}
}
