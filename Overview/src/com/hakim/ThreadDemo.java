package com.hakim;

public class ThreadDemo {

	public static void main(String[] args) {
// Thread t1
			Thread t1 = new Thread(()->
			{
				for (int i = 0; i < 5 ; i++)
				{
					System.out.println("hi "+Thread.currentThread().getName());
					try {Thread.sleep(1000); } catch(Exception e) {};
				}
			});

// Thread t2
			Thread t2 = new Thread(()->
		     {
				for (int i = 0; i < 5 ; i++)
				{
					System.out.println("Hello "+Thread.currentThread().getName());
					try {Thread.sleep(1000); } catch(Exception e) {};
				}
			});

			t1.setName("Hi Thread");
			t2.setName("Hello Thread");
//			System.out.println(t1.getName());
//			System.out.println(t2.getName());
			t1.setPriority(Thread.MIN_PRIORITY);
			t2.setPriority(Thread.MAX_PRIORITY);
//			System.out.println(t1.getPriority());
//			System.out.println(t2.getPriority());
			t1.start();
			 try {Thread.sleep(10); } catch(Exception e) {};
			t2.start();
			
			System.out.println("Bye Kimo");
	}	
	}
