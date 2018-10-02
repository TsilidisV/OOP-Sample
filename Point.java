
public class Point 
{
	private double x, y;
	public Point(double a, double b)
	{
		this.x=a; this.y=b;
	}
	public double calcDist(Point z)
	{
		return Math.sqrt((z.x-x)*(z.x-x)+(z.y-y)*(z.y-y));
	}
	public boolean isEqual(Point z)
	{
		if (z.x==x && z.y==y)
	    	return true;
		else
			return false;
	}
	public String toString()
	{
		return "(" + x + "," + y + ")";
	}
}