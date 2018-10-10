class A1 {
	public void show() {
		System.out.println("show A");
	}
}
public class AnonymousExample {

	public static void main(String[] args) {
		A1 obj = new A1() {
			public void show() {
				System.out.println("show Anonymous class");
			}			
		};
		
		obj.show();

	}

}
