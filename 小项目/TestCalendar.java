/*
 *名字:周浩洋
 *时间: 2016年7月24日17:57:28
 *目的:用Calendar类来做一个日历小项目
 */
package 小项目;
import java.text.*;
import java.util.*;
public class TestCalendar {
	public static void main(String[] args){
		Scanner scnner = new Scanner(System.in);
		Date time = null ;
		System.out.println("请输入日期,格式如下\nXXXX-XX-XX");
		String str = scnner.next(); // 接受日期
		System.out.println("一\t二\t三\t四\t五\t六\t日");
		DateFormat date = new SimpleDateFormat("yyyy-MM-dd");//设定时间格式
		try {
			 time = date.parse(str);//返回date类 
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();s
		}
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(time); 
		int day = calendar.get(Calendar.DATE);
		calendar.set(Calendar.DATE, 1);
		//calendar.setFirstDayOfWeek(Calendar.MONDAY);
		//System.out.println(Calendar.SUNDAY);
		for(int i=1; i<calendar.get(Calendar.DAY_OF_WEEK)-1;i++){//减一是因为在这里 星期日属于第一天
			System.out.printf("\t");
		}
		for(int i=1; i<calendar.getActualMaximum(Calendar.DATE);i++){
			if(day == i){
				System.out.print('*');
			}
			System.out.print(i+"\t");
			if(calendar.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY){
				System.out.printf("\n");
			}
			calendar.add(Calendar.DATE, 1);
		}
	}
}
