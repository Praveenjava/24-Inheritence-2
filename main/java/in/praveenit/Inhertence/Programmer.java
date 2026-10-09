package in.praveenit.Inhertence;

public class Programmer extends Employee {
	double bonus = 5000;
	public static void main(String[] args) {
		Programmer programmer = new Programmer();
		System.out.println("Programmer Salary :"+ programmer.salary);
		System.out.println("Programmer Bonus :"+ programmer.bonus);
	}

}
