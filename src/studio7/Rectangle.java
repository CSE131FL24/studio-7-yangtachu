package studio7;

public class Rectangle
{
	private double x;
	private double y;
	private double x2;
	private double y2;
	
	public Rectangle(double length, double width,double length2, double width2)
	{
		x= length;
		y= width;
		x2= length2;
		y2= width2;
	}
	public double getArea()
	{
		return x*y;
	}
	
	public double getPerimeter()
	{
		return (2*x)+(2*y);
	}
	public boolean getSquare()
	{
		if(x==y) {
			return true;
		}
		else {
			return false;
		}
	}
	public String getSize()
	{
		if(x*y>x2*y2)
		{
			return "first rectangle is bigger";
		}
		else if (x*y==x2*y2)
		{
			return "rectangle equal";
		}
		return "second rectangle is bigger";
	}
	
	
public static void main(String[] args) 
{
	Rectangle r = new Rectangle(7.0,7.0,6.0,6.0);
	System.out.println(r.getArea());
	System.out.println(r.getPerimeter());
	System.out.println(r.getSquare());
	System.out.println(r.getSize());

}
}





