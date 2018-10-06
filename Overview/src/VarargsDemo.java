class Add {

   public int add (int ... i ) {
	   int sum = 0;
	   for (int j : i) {
		   sum = sum+j ;
	}
	   
	   return sum;
   }
	
}

public class VarargsDemo {

	public static void main(String[] args) {
      Add obj = new Add();
      System.out.println(obj.add(1,2,3,4,5,6,7,8,9,10,11));
	}

}
