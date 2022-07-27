abstract class Shape{
	public  abstract void Draw();
}
class Square extends Shape{
	public void Draw(){
		System.out.println("Drawing Square shape");
	}
}
class Rectangle extends Shape{
	public void Draw(){
		System.out.println("Drawing Rectangle shape");
	}
}

public class TestAbstract {
	public static void main(String[] args) {
		Square s=new Square();
		s.Draw();
		Rectangle r=new Rectangle();
		r.Draw();

	}

}
