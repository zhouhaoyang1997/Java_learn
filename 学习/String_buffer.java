package 学习;
public class String_buffer {
	public static void main(String[] args){
		String s = "周浩洋";
		String s1 ="男";
		StringBuffer sb1 = new StringBuffer(s);//不能直接定义 传递string类型！StringBuffer类中的方法主要偏重于对于字符串的变化，例如追加、插入和删除等，这个也是StringBuffer和String类的主要区别。
		sb1.append("\n"+s1);
		System.out.println(sb1);
	}
}
