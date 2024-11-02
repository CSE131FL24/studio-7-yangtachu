package studio7;

public class Die
{
	private int x;
	private int [] arr;
	
	public Die(int sides)
	{
		x= sides;
		
				
	}
	public int toss()
	{
		return (int) (Math.random()*x+1);
	}
	public static void main(String[] args) 
	{
		Die d = new Die(8);
		System.out.println(d.toss());

	}
}
