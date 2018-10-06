class Calculator {
    public int add(int i , int j) {
    	return i+j;
    }

  
}

class ClacAdv extends Calculator {
	  public int sub(int i , int j) {
	    	return i-j;
	    }


}

class CalcVeryAdv extends ClacAdv {
    public int mult(int i , int j) {
    	return i*j;
    }
}
public class Inheritance {

	public static void main(String[] args) {
     int res1,res2,res3;
     CalcVeryAdv obj = new CalcVeryAdv();
		res1 = obj.add(2, 1);
		res2 = obj.sub(2, 1);
		res3 = obj.mult(2, 2);
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
     
	}

}

