package stack;

class Stack
{
    private Person arr[];
    private int top;
    private int capacity;
    
	Stack(int size)
	{
		capacity=size;
		top=-1;
		arr = new Person[capacity];
	}
	
	Stack(Person[] inputArr)
	{
		capacity= inputArr.length;
		arr = new Person[capacity];
		top=-1;
		for(int i=0;i<inputArr.length;i++)
		{
			arr[++top]=inputArr[i];
		}
	}
	
	void push(Person p)
	{
		if(top==capacity-1)
		{
		  System.out.println("Stack overflow");
		  return;
		}
		    arr[++top] = p;
	}

	void push(Person p1,Person p2)
	{
		push(p1);
		push(p2);
	}
	
	Person pop()
	{
		if(top == -1)
		{
		   System.out.println("Stack underflow");
		   return null;
	    }
		   return arr[top--];
	}
	
	void pop(int n)
	{
		for(int i=0;i<n;i++)
		{
			if(top==-1)
			{
				System.out.println("Stack underflow");
				break;
			}
			Person p = pop();
			if(p!=null)
				p.displayPerson();
		}
	}
	
	void display()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
			return;
		}
		for(int i=top;i>=0;i--)
		{
			arr[i].displayPerson();
		}
	}
	
	void display(int n)
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
			return;
		}
		for(int i=top;i>top-n && i>=0;i--)
		{
			arr[i].displayPerson();
		}
		
	}
}
