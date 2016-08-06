package Test;

public class TestSync implements Runnable{
	Timer timer = new Timer();
	public static void main(String[] args){
		TestSync test = new TestSync();
		Thread a = new Thread(test);
		Thread b = new Thread(test);
		a.setName("a1");
		b.setName("b1");
		a.start();
		b.start();
	}
	public void run(){
		timer.add(Thread.currentThread().getName());
	}
}
class Timer{
	private static int num = 0;
	public synchronized void add(String name){//锁定当前对象 防止多个线程同时对操作
		num ++;
		try{Thread.sleep(1);}
		catch(Exception e){}
		System.out.println(name+",你是第"+num+"个使用timer的线程。");
	}
}