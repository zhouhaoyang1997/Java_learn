package 学习;
//为每一给类型的变量封装了好多方法--封装类
public class 包装类 {
	public static void main(String[] args){
		Integer i = new Integer(100);//int
		Double d = new Double("123.456");//char
		int j = i.intValue()+d.intValue();
		float f = i.floatValue()+d.floatValue();
		System.out.println(j);System.out.println(f);
		
	}
}
