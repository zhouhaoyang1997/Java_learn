/*
 *����:�ܺ���
 *ʱ��: 2016��7��24��17:57:28
 *Ŀ��:��Calendar������һ������С��Ŀ
 */
package С��Ŀ;
import java.text.*;
import java.util.*;
public class TestCalendar {
	public static void main(String[] args){
		Scanner scnner = new Scanner(System.in);
		Date time = null ;
		System.out.println("����������,��ʽ����\nXXXX-XX-XX");
		String str = scnner.next(); // ��������
		System.out.println("һ\t��\t��\t��\t��\t��\t��");
		DateFormat date = new SimpleDateFormat("yyyy-MM-dd");//�趨ʱ���ʽ
		try {
			 time = date.parse(str);//����date�� 
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
		for(int i=1; i<calendar.get(Calendar.DAY_OF_WEEK)-1;i++){//��һ����Ϊ������ ���������ڵ�һ��
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
