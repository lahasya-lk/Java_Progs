package source;

public class Employee
{
  String name;
  int id;
  double salary;
  
  public Employee(String n,int Id,double s)
  {
	  name=n;
	  id=Id;
	  salary=s;
  }
  
  void display()
  {
	  System.out.println("Employee details are");
	  System.out.println("Name is "+name);
	  System.out.println("ID is "+id);
	  System.out.println("Salary is Rs "+salary);
  }
  
  void increase_salary(double percentage)
  {
	  double increment=(salary+percentage)/100;
	  salary=salary+increment;
	  System.out.println("Employee's salary increased by "+salary);
  }
}
  
