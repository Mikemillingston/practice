package aravind;

public class Test implements A,B {
	public static void main(String[] args) {
		A a = new Test();
		B b = new Test();
		
		a.m1();
		b.m1();

	}

	@Override
	public void m1() {
		System.out.println("hello from interface"+getClass().getCanonicalName());
		
	}

	
	
}