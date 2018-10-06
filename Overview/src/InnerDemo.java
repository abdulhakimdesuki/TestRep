class Outer 
{
static int a;

public static void show() {
	System.out.println("Outer Show method");
}

static class Inner {
	int b;
	public void Displayed() {
		System.out.println("Inner displayed method");

	}
}
}

public class InnerDemo
{
	
	public static void main(String[] args) 
	{
		Outer obj = new Outer();
		obj.show();
		Outer.Inner obj1 = new Outer.Inner();
		obj1.Displayed();

	}

}
