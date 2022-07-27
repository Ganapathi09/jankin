
public class StaticBinding 
{
	public void display(){
		System.out.println("Welcome to Java");
	}
	
	public void display(int x){
		System.out.println("Integer value is:"+x);

	}

	public void display(double d){
		System.out.println("Double  value is:"+d);

	}

	public void display(float f){
		System.out.println("Floating  value is:"+f);

	}

	public void display(char c){
		System.out.println("Character  value is:"+c);

	}
	
	public static void main(String[] args) {
		StaticBinding sb= new StaticBinding();
		sb.display();
		sb.display(10);
		sb.display(4.5);
		sb.display(8.2);
		sb.display('*');
	}
}
