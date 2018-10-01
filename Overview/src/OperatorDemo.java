import javax.swing.text.html.parser.Parser;

public class OperatorDemo {
	public static void main(String[] args) {
    for (int i=1;i<=6;++i){
  	    for  (int j=1;j<=i;j++ ) {
			System.out.print(j + " ");
		 }
	     System.out.println();
   }

      System.out.println("--------------------");
     for (int i=65;i<=67;++i){
	      for  (int j=65;j<=i;j++ ) {
	  		System.out.print((char)j + " ");
	    	}
	      System.out.println();
     }
		
     System.out.println("--------------------");
     for (int i = 0; i < 10; i++) {
    	 if (i==7) {
		  continue;	
		}
   		System.out.println(i);
   	}
     
   }
  }
