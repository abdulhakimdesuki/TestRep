// Encapsulation -> Binding data with methods 
class Student {
	private int rollno;
	private String name;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// Getters and Setters
	
}

public class Encapsulation {

	public static void main(String[] args) 
	{
		Student obj = new Student();
		obj.setRollno(10);
		obj.setName("Abdulhakim Desuki");
		System.out.println(" Roll Number is :"+obj.getRollno() + "==="+obj.getName());
		
		
     
	}

}
