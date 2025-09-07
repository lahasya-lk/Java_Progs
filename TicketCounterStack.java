package stack;
import java.util.*;

public class TicketCounterStack 
{
	public static void main(String[] args)
	  {
		  Scanner sc = new Scanner(System.in);
		  Stack st = null;
		  
		  System.out.println("Choose initialization :");
		  System.out.println("1. Empty stack with size");
		  System.out.println("2. Stack initialized with array of Persons");
		  int choice = sc.nextInt();
		  if(choice == 1)
		  {
			  System.out.println("Enter size:");
			  int size = sc.nextInt();
			  st = new Stack(size);
		  }
		  else if(choice == 2)
		  {
			  System.out.println("Enter number of Persons:");
			  int n = sc.nextInt();
			  Person arr[] = new Person[n];
			  for(int i=0;i<n;i++)
			  {
				  System.out.println("Enter the name:");
				  String name = sc.next();
				  System.out.println("Enter the age:");
				  int age = sc.nextInt();
				  System.out.println("Enter gender(MALE/FEMALE/OTHER):");
				  Gender g=Gender.valueOf(sc.next().toUpperCase());
				  arr[i] = new Person(name,age,g); 
			  }
			  st = new Stack(arr);
		  }
		  
		  int option;
		  do
		  {
			  System.out.println("\n---Menu---");
			  System.out.println("1.Push one Person");
			  System.out.println("2.Push two Persons");
			  System.out.println("3.Pop one Person");
			  System.out.println("4.Pop multiple Persons");
			  System.out.println("5.Display all Persons");
			  System.out.println("6.Display top n Persons");
			  System.out.println("7.Exit");
			  System.out.println("Enter your choice:");
			  option=sc.nextInt();
			  
			  switch(option)
			  {
			  case 1:System.out.println("Enter the name:");
			         String name_1 = sc.next();
			         System.out.println("Enter the age:");
			         int age_1 = sc.nextInt();
			         System.out.println("Enter gender(MALE/FEMALE/OTHER):");
			         Gender g1=Gender.valueOf(sc.next().toUpperCase());
			         st.push(new Person(name_1,age_1,g1));
				     break;
			  case 2:System.out.println("Enter first Person's name:");
		             String n1 = sc.next();
		             System.out.println("Enter the age:");
		             int a1 = sc.nextInt();
		             System.out.println("Enter gender(MALE/FEMALE/OTHER):");
		             Gender g2=Gender.valueOf(sc.next().toUpperCase());
		             Person p1=new Person(n1,a1,g2);
		             
		             System.out.println("Enter second Person's name:");
		             String n2 = sc.next();
		             System.out.println("Enter the age:");
		             int a2 = sc.nextInt();
		             System.out.println("Enter gender(MALE/FEMALE/OTHER):");
		             Gender g3=Gender.valueOf(sc.next().toUpperCase());
		             Person p2=new Person(n2,a2,g3);
		             st.push(p1,p2);
		             break;
			  case 3:Person popped = st.pop();
			         if(popped!=null)
			        	 popped.displayPerson();
			         break;
			  case 4:System.out.print("Enter number of Persons to pop:");
			         int n = sc.nextInt();
			         st.pop(n);
			         break;
			  case 5:st.display();
			         break;
			  case 6:System.out.print("Enter number of top Persons:");
		             int topN = sc.nextInt();
		             st.display(topN);
		             break;
			  case 7:System.out.println("Exiting...");
			         break;
			  default: System.out.println("Invalid choice!");
			  }
		  }
		  while(option!= 7);
	 }
}
