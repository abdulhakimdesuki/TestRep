@FunctionalInterface
interface Demo 
{
	int i=8;
	void abc();
	static void  show() {
		System.out.println("hi");
	}
}

class DemoImp implements Demo{

	@Override
	public void abc() {
		
		
	}
	
}
public class InterfaceDemo 
{
	public static void main(String[] args) 
	{
		Demo.show();
        int k = Demo.i;
	}
}