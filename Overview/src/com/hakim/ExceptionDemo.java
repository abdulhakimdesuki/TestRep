package com.hakim;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			
			Integer x = 10;
			int i = 7;
			int j=8;
			int k = i/j;
			if (k==0)
				throw new HakimException(" This is not possible value ");
			System.out.println(k);
		} catch (HakimException e) {
			System.err.println("Error K is Equal to : zero Error Hakim zeroo :"+ e.getMessage() );
		}
		
		finally {
			 System.out.println("Bye");
		}			
	}

}
