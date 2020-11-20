package o1com.callbyValue;

public class CallByValue {
	
	int num = 100;
	
	void disp() {
		System.out.println(num);
	}
	
	void fun(int k) {
		
		k = 500;
		System.out.println("In fun() k: "+k);	// 500
		System.out.println("In fun() num: "+num); //100
	}
	
	public static void main(String[] args) {
		
		CallByValue c1 = new CallByValue();
		
		c1.disp();	//100
		
		c1.fun(c1.num);	// (passing 100)
		
		c1.disp(); //100
		
	}

}
