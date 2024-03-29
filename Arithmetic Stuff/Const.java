//this class holds a static number that is to be used in the other classes
public class Const extends Node 
{
	private double value;//holds a value that will be used in other classes
	
	//sets value to something
	public Const(double d) 
	{
		value = d; 
	}

	//sends value to a different class
	public double eval() { return value; }
	
	//returns the current value
	public String toString()
	{
		return Double.toString(value);

	}
}
