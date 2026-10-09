package in.praveenit.Inhertence;

public class B extends A {
	int b = 20;
	void m2() {
		System.out.println("we are in m2");
	}
	
	public static void main(String[] args) {
		B obj = new B();
		
		System.out.println(obj.a);
		obj.m1();
		
		System.out.println(obj.b);
		obj.m2();
		
	}

}
