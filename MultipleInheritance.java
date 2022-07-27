
interface Constant{
	final static double pi=3.14;
	double radius=5.0;
}
interface Method{
	public abstract void compute();
}

class Circle implements Constant,Method{
	public void compute(){
		double area;
		area=pi*radius*radius;
		System.out.println("Area of Circle is:"+area);
	}
}

public class MultipleInheritance {
	public static void main(String[] args) {
		Circle c=new  Circle();
		c.compute();
	}

}
