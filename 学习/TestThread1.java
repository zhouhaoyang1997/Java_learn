package ѧϰ;

class runner1 implements Runnable{//��һ�ַ���;
	public void run(){
		for(int i=0;i<50;i++){
			System.out.println("a:"+i);
		}
	}
}
class runner2 extends Thread{//�ڶ���
	public void run(){
		for(int i=0;i<50;i++){
			System.out.println("a:"+i);
		}
	}
}
public class TestThread1 {
	public static void main(String[] args){
		runner1 A = new runner1();
		//A.run(); ���ǵ��÷��� �����Ƕ��߳�
		Thread B = new Thread(A);
		runner2 C = new runner2();
		//B.start();//����Ƕ��߳� ִ�е��� ʱ���������·ִ�С���ν�Ķ��߳̾���CPU���ٽ���ִ��ÿ���߳�;
		//C.setPriority(9); 
		C.start();
		try{
			C.join();//�ع����̣߳���ִ����C��ִ�к��
		}catch(InterruptedException e){}
		for(int i=0;i<50;i++){
			System.out.println("b:"+i);
		}
	}
}
