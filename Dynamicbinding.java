class Bank
{

}
class SBI extends Bank
{
	public double getrateofinterest()
	{
		return 8.4;
	}
}

public class Dynamicbinding 
{
	public static void main(String[] args)
	{
		SBI b=new SBI();
		System.out.println("Sbi rate of interest is:"+b.getrateofinterest()+"%");
	}
}
