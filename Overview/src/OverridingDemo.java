class A{
	public void show(){
		System.out.println("In method A");
	}
}

class B extends A{
	
	public void show(){
		System.out.println("In method B");
	}

}

class C extends A{
	
	public void show(){
		System.out.println("In method C");
	}

}

public class OverridingDemo {

	public static void main(String[] args) {
		A obj1 = new B();  // runtime polymorphism
		//obj1.show();
		obj1 = new C();
		obj1.show();  // Dynamic method dispatch
	}

}
