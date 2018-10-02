class Calc {
	int num1;
	int num2 ;
	int result ;
	
	public Calc(){
		num1=1 ;
		num2=1;
	}
	
	public Calc(int num1,int num2){
		this.num1=num1 ;
		this.num2=num2;
	}
	
	public void perform(){
		result = num1 + num2;
	}
}

public class ObjectDemo {

	public static void main(String[] args) {
		Calc obj; // this is not object it is a reference to object
		obj=new Calc(5,6);  // This is an Object which a clocate the memory  - Object knows something and does something
    
	//	obj.num1 = 3;
	//	obj.num2 = 15;
		obj.perform();
       System.out.println(" Num1 = "+obj.num1+" Num2= "+ obj.num2 +" ="+obj.result);
	}

}
