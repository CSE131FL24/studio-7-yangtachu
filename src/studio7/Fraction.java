package studio7;

public class Fraction {
	private double num;
	private double demo;
	
	public Fraction(double a, double b)
	{
		num= a;
		demo= b;
	}
	
	 public double getNum() {
	        return num;
	    }

	    // Getter method for width
	    public double getDenom() {
	        return demo;
	    }
	    
	    
	public Fraction add(Fraction k)
	{
		Fraction added = new Fraction(k.getNum() * demo + num * k.getDenom(), demo*k.getDenom());
		return added;
		
	}
	
	public String ToString() {
		return num + "/" + demo;
	}
	
	public static void main(String[] args) 
	{
		Fraction r = new Fraction(7.0,7.0);
		Fraction s = new Fraction(5.0,6.0);
		System.out.println(ToString(r.add(s)));

	}
}
