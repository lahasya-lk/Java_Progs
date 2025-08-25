package source;

public class Main
{
	public static void main(String[] args)
	{
		Employee e1=new Employee("Abhijna",101,50000.0d);
		Employee e2=new Employee("Sinchana",122,45000.0d);
		System.out.println("Initial Employee Details:");
		e1.display();
		e2.display();
		e1.increase_salary(0.5);
		e2.increase_salary(0.8);
		System.out.println("Updated Employee Details:");
		e1.display();
		e2.display();
	}
}
