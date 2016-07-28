package 学习;
//这就是出现死锁了，两个线程都想要去锁某个对象，就会出现僵持状态，卡在那里了;
public class TestDeadLock implements Runnable{
	public int flag = 1;
	static Object a = new Object(),b = new Object();
	public static void main(String[] args){
		TestDeadLock a1 = new TestDeadLock();
		TestDeadLock a2 = new TestDeadLock();
		a1.flag = 1;
		a2.flag = 2;
		Thread A1 = new Thread(a1);
		Thread A2 = new Thread(a2);
		A1.start();
		A2.start();
	}	
	public void run(){
		System.out.println("flag="+flag);
		if(flag == 1){
			synchronized(a){
				try{
					Thread.sleep(1);
				}catch(Exception e){
					e.printStackTrace();
				}
				synchronized(b){
					System.out.println("one");
				}
			}
		}
		if(flag == 2){
			synchronized(b){
				try{
					Thread.sleep(1);
				}catch(Exception e){
					e.printStackTrace();
				}
			synchronized(a){
				System.out.println("two");
			}
			}
		}
	}
}
