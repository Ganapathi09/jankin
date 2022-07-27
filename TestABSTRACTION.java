
abstract class Human
{
	public abstract void person();
}
class Employee extends Human
{
	public void person()
	{
		System.out.println("Person is an Employee");
	}
}
public class TestABSTRACTION 
{
	public static void main(String[] args) 
	{
		Employee e = new Employee();
		e.person();
	}

}
