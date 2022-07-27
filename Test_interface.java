interface Constants
{
	double pi=22/7, radius=7.0;
	
}

interface Methods extends Constants
{
	abstract void compute();
}

class Circles implements Methods
{
	public void compute()
	{
		double A=pi*radius*radius;
		double p=2*pi*radius;
		System.out.println("Area of Circle is:"+A);
		System.out.println("Perimeter of Circle is:"+p);
	}
}
public class Test_interface 
{
	public static void main(String[] args)
	{
		Circles c =new Circles();
		c.compute();
	}

}
