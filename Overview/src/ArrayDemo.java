
class Students {
	int rollno;
	String name;
}

public class ArrayDemo {

	public static void main(String[] args) {
		Students st[] =  new Students[4];
	////	st[0].name = "st01";
	//	st[1].name = "st02";
	//	st[2].name = "st03";
	//	st[3].name = "st04";
	//	String x =st[0].name; 
		//for (int i = 0; i < st.length; i++) {
		//   System.out.println( x);	
		//}
		
 
		int nums[] = {7,8,9,11};//new int[4];

		for (int i = 0; i < nums.length; i++) {
			nums[i]=i+1;
			
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		int a[][] = {
						{1,2,3,77},   // index 0
						{4,5,6},   // index 1 
						{7,8,9,66,44}    // index 2
		 		
		             };
		System.out.println("========================================================");
	    for (int i = 0; i < a.length; i++) {
	    	for (int j = 0; j < a[i].length; j++) {
	    		System.out.print(" "+a[i][j]);
			}
	    	System.out.println();
		}
	    
	}

}
