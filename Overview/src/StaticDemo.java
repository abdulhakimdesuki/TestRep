class Emp {
	
	int eid ;
	double salary;
	static String ceo ;
	
	static {
		ceo ="Kimoo";
	}
	
	Emp(){
		eid=1;
		salary = 3000;
	}
	public void show(){
		System.out.println(eid+" : "+salary+" : "+ceo);
	}
}

public class StaticDemo {
    static int gnum;
	public static void main(String[] args) {
		 gnum = 9;
		Emp hakim =new Emp();
		Emp ali =new Emp();
	   hakim.show();
	   ali.show();

	}

}
