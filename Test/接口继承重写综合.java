package Test;
interface Sing{
	public void singing();
};
class Person{
	public int ID;
	public String name;
	Person(int ID,String name){
		this.ID = ID;
		this.name = name;
	}
	void getInfo(){
		System.out.print(this.name);
	}
}

class Student extends Person implements Sing{
	private int score;
	Student(int ID, String name,int score){
		super(ID,name);
		this.score =score;
	}
	void getInfo(){
		System.out.println(super.ID);
		System.out.println(super.name);
		System.out.println(this.score);
		
	}
	public void singing(){
		System.out.print("��������");
	}
}
public class �ӿڼ̳���д�ۺ� {
	public static void main(String[] args){
		Student A = new Student(2,"����",10);
		A.getInfo();
		A.singing();
	}

}
