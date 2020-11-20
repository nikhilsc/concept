package o1com.callbyValue;

public class Demo2 {
	
	int num = 100;
	
	void disp() {
		System.out.println(num);
	}
	
	void fun(Demo2 ref) {
		
		ref.num = 400;
		System.out.println("In fun(): "+num);
		
	}

	public static void main(String[] args) {
		
		Demo2 d2 = new Demo2();
		
		d2.disp();
		
		d2.fun(d2);
		
		d2.disp();
		
		
	}
}
