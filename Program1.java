package week2.day1;

public class Program1 {
	int a= 20;
	int b = 80;
	
	int temp;
	
	public void withSwap() {
		
		temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);
		System.out.println("----------------------");
	}
	
	public void withoutSwap() {
		a = a+b; //100
		b = a-b; //80
		b = a-b; // 20
		a=  a-b; //80
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program1 pg = new Program1();
		pg.withSwap();
		pg.withoutSwap();
		
		

	}

}
