package Transport;

public class Bicycle extends Vehicle
{
   public Bicycle(String id) 
   {
	   super(id);
	   System.out.println("Bicycle() constructor is called");
   }
   
   @Override
   public void deliver(String item,String place)
   {
	   System.out.println("Delivering" + item + "to" + place + "by Bicycle.");
   }
}
