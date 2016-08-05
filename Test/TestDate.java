package Test;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class TestDate {
	public static void main(String[] args){
		while(true){
			Date A = new Date();
			try{Thread.sleep(1000);}catch(Exception e){};
			DateFormat A1 = new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println(A1.format(A));
		}
		
	}
}
