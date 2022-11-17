class Shape
{
	void draw()
	{
		System.out.println("Drawing Shape");
	}
	void erase()
	{
		System.out.println("Erasing Shape");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Shape Circle");
	}
	void erase()
	{
		System.out.println("Erasing Shape Circle");
	}
}
class Triangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Shape Triangle");
	}
	void erase()
	{
		System.out.println("Erasing Shape Triangle");
	}
}
class Square extends Shape
{
	void draw()
	{
		System.out.println("Drawing Shape Square");
	}
	void erase()
	{
		System.out.println("Erasing Shape Square");
	}
}
public class demo3
{
	public static void main(String args[])
	{
		Shape c = new Circle();
		Shape t = new Triangle();
		Shape s = new Square();
		
		c.draw(); c.erase();
		t.draw(); t.erase();
		s.draw(); s.erase();
	}
}