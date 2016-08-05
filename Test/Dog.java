package Test;
 class Mouse{
	void scream(){
		System.out.print("֨֨֨��");
	}
}
public class Dog {

	void catchMouse(Mouse m){
		m.scream();
	}
	public static void main(String[] args){
		Dog dog = new Dog();
		Mouse m = new Mouse();
		dog.catchMouse(m);
	}
}
