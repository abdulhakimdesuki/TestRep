
public class WrapperDemo {

	public static void main(String[] args) {
		int i = 5; // i is primitive variable
		//Integer ii = new Integer(55);  // reference variable (wrapper class)
		Integer ii = new Integer(i);  // bOXING - wRApping
		System.out.println(" i="+i+"   ii="+ii);
		int j = ii.intValue();   // ubboxing - unwrapping
		System.out.println(" j="+j);
        Integer value = i; // Autoboxing
	}

}
