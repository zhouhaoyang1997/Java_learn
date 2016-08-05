package Test;

public class TestSync2 implements Runnable {
	int b = 100;
	public synchronized void m1(){
		b = 1000;
		try{
			Thread.sleep(5000);
		}catch(Exception e){};
		System.out.println("b="+b);
	}
	public synchronized void m2(){
		try{
			Thread.sleep(2500);
		}catch(Exception e){};
		b = 2000; 
	}
	public void run(){
		try{
			m1();
		}catch(Exception e){};
	}
	public static void main(String[] args){
		TestSync2 tt = new TestSync2();
		Thread t = new Thread(tt);
		t.start();
		
		tt.m2();
		System.out.println(tt.b);
	}
	
}
	
