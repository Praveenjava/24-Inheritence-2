package in.praveenit.Inhertence;

//import org.springframework.boot.SpringApplication;

public class C extends B{
	int c = 30;
	void m3 () {
		System.out.println("we are in m3");
	}
	public static void main(String[] args) {
		C obj = new C();
		System.out.println(obj.a);
		obj.m1();
		
		System.out.println(obj.b);
		obj.m2();
		
		System.out.println(obj.c);
		obj.m3();
		
		
	}
	

}
