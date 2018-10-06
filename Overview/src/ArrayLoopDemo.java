
public class ArrayLoopDemo {

	public static void main(String[] args) {
//		int a[] = {7,8,9,44};
//		
//		for (int i : a) {
//        System.out.println(i);
//			
//		}
//		
		int b[][] = {{7,8,9,44},{5,5,9,7},{8,7,77},{44,55,55,99}};
		for (int k[] : b) {
			for (int i : k) {
				System.out.print(" "+i);
			}
			System.out.println();
		}

	}

}
