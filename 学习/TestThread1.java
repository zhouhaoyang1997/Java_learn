package 学习;

class runner1 implements Runnable{//第一种方法;
	public void run(){
		for(int i=0;i<50;i++){
			System.out.println("a:"+i);
		}
	}
}
class runner2 extends Thread{//第二种
	public void run(){
		for(int i=0;i<50;i++){
			System.out.println("a:"+i);
		}
	}
}
public class TestThread1 {
	public static void main(String[] args){
		runner1 A = new runner1();
		//A.run(); 这是调用方法 并不是多线程
		Thread B = new Thread(A);
		runner2 C = new runner2();
		//B.start();//这个是多线程 执行到此 时，程序分两路执行。所谓的多线程就是CPU快速交替执行每个线程;
		//C.setPriority(9); 
		C.start();
		try{
			C.join();//回归主线程，先执行完C在执行后边
		}catch(InterruptedException e){}
		for(int i=0;i<50;i++){
			System.out.println("b:"+i);
		}
	}
}
