
public class ArrayMultiplyElements {

	public static void main(String[] args) {
		int values[]={6,5,1,7,8};
//		class Mythread extends Thread
//		{
//		   public void run() 
//		   {
//			   for (int i = 0; i < 5; i++) 
//			   {
//				   values[i]=values[i]*2;
//				   System.out.println(values[i]);
//			   }
//		    }
//		}
		
		class Mythread implements Runnable	
		{
		   public void run() 
		   {
			   for (int i = 0; i < 5; i++) 
			   {
				   values[i]=values[i]*2;
				   System.out.println(values[i]);
			   }
		    }
		}
		
//		Thread t1=new Mythread();
//		Thread t2=new Mythread();
//		t1.start();
//		t1.start();
//		System.out.println("============================");
//		t2.start();
		
		
		Runnable t1 = new Mythread();
		t1.run();

 		
//      int arr[] = new int[4];
//      
//      int q = 10 ;
//      for (int i = 0; i < arr.length; i++) {
//		arr[i] = q+i;
//	}
//      
//      for (int i = 0; i < arr.length; i++) {
//		System.out.println("arr["+arr[i]+"]*2="+arr[i]*2);
//	}


	}

}
